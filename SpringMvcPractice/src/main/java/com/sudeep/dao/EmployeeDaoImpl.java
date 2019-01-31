package com.sudeep.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sudeep.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	@Autowired
	private SessionFactory sf;

	public Employee saveEmployee(Employee emp) {
		Session ses = sf.openSession();
		Transaction tx = ses.beginTransaction();
		 ses.save(emp);
		tx.commit();
		return emp;
	}

	/*public List<Employee> getAllEmployees() {
		session ses=sf.openSession();
		return null;
	}
*/
}
