package com.durgasoft.services;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.NameMatchMethodPointcut;

import com.durgasoft.bean.Student;

public class InstituteServiceImpl implements InstituteService {

	//NameMatchMethodPointcut
	//DefaultPointcutAdvisor
	//ProxyFactoryBean
	@Override
	public void Enquiry(Student std, String course_name) {
      System.out.println("Enquiry Student Details");
      System.out.println("----------------------------");
		System.out.println("Student Name  :             "+std.getSname());
		System.out.println("Student Qualification :      "+std.getSqual());
		System.out.println("Student EmailId        :      "+std.getSemail());
		System.out.println("Student Mobile         :       "+std.getSmobile());
		System.out.println("Student Course        :        "+course_name);
	}

	@Override
	public void registration(Student std, String course_name) {

	    System.out.println("Register Student Details");
	      System.out.println("----------------------------");
			System.out.println("Student Name  :             "+std.getSname());
			System.out.println("Student Qualification :      "+std.getSqual());
			System.out.println("Student EmailId        :      "+std.getSemail());
			System.out.println("Student Mobile         :       "+std.getSmobile());
			System.out.println("Student Course        :        "+course_name);
	}

}
