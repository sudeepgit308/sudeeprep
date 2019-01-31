package com.sudeep.service;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sudeep.bean.EmployeeBean;
import com.sudeep.dao.EmployeeDao;
import com.sudeep.model.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	@Autowired
	private EmployeeDao empDao;

	public EmployeeBean save(EmployeeBean e) {
		Employee emp = new Employee();
		BeanUtils.copyProperties(e, emp);
		emp = empDao.saveEmployee(emp);
		BeanUtils.copyProperties(emp, e);
		return e;
	}

}
