package com.sudeep.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import com.mchange.v2.c3p0.ComboPooledDataSource;
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.sudeep")
@PropertySource(value= {"classpath:application.properties"})
public class WebMvcAppConfig extends WebMvcConfigurerAdapter{
	@Autowired
	private Environment env;
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
    configurer.enable();
	}
	
	@Bean
	public ViewResolver getViewResolver() {
		InternalResourceViewResolver vr=new InternalResourceViewResolver();
		vr.setPrefix("/WEB-INF/views/");
		vr.setSuffix(".jsp");
		return vr;
	}
	@Bean
	public LocalSessionFactoryBean sessionFactory() throws Exception{
		LocalSessionFactoryBean sessionfactory=new LocalSessionFactoryBean();
		sessionfactory.setDataSource(dataSource());
		sessionfactory.setPackagesToScan(new String[] {"com.sudeep.model"});
		sessionfactory.setHibernateProperties(hibernateProperties());
		return sessionfactory;
	}
	@Bean
    public Properties hibernateProperties() {
     Properties props=new Properties();
     props.put("hibernate.dialect", env.getProperty("hibernate.dialect"));
     props.put("hibernate.show_sql", env.getProperty("hibernate.show_sql"));
     props.put("hibernate.format_sql", env.getProperty("hibernate.format_sql"));
 props.put("hibernate.hbm2ddlauto", env.getProperty("hibernate.hbm2ddlauto"));
		return props;
	}

	@Bean
	public DataSource dataSource() throws Exception  {
		ComboPooledDataSource ds=new ComboPooledDataSource();
		ds.setDriverClass("com.mysql.jdbc.Driver");
		ds.setJdbcUrl("jdbc:mysql://localhost:3306/employeedata");
		ds.setUser("root");
		ds.setPassword("root");
		return ds;
	}
//	@Bean
//    @Autowired
//    public HibernateTransactionManager transactionManager(SessionFactory s) {
//       HibernateTransactionManager txManager = new HibernateTransactionManager();
//       txManager.setSessionFactory(s);
//       return txManager;
//    }

}
