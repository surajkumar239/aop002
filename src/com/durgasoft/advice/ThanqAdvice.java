package com.durgasoft.advice;

import java.lang.reflect.Method;

import org.springframework.aop.AfterAdvice;
import org.springframework.aop.AfterReturningAdvice;

import com.durgasoft.bean.Student;

public class ThanqAdvice implements AfterReturningAdvice {

	
	//Object[] params->Enquiry have two parameter
	@Override
	public void afterReturning(Object returnValue, Method method, Object[] params, Object target) throws Throwable {
		//Object[] params
Student std=(Student)params[0];
String courseName=(String)params[1];
System.out.println("******************************************************************");
System.out.println("thanku  "+std.getSname()+"  for your Course "+method.getName()+" on "+courseName+" course ");
		System.out.println("Durgasoft Team will contact with for the  course Schedule");
		System.out.println("***********************************************************");
		System.out.println();
	}

}
