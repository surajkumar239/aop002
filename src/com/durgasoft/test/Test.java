package com.durgasoft.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.bean.Student;
import com.durgasoft.services.InstituteService;
import com.durgasoft.services.InstituteServiceImpl;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context=new ClassPathXmlApplicationContext("com/durgasoft/resources/ApplicationContext.xml");
		InstituteService istitutebean =(InstituteService) context.getBean("proxy");
		Student std=(Student)context.getBean("stdBean");
		istitutebean.Enquiry(std, "Core Java");
		istitutebean.registration(std, "python");
		
	}

}
