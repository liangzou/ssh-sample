package cn.edu.njupt.service.test;

import java.sql.Timestamp;
import java.util.Locale;

import org.hibernate.SessionFactory;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.MessageSource;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.edu.njupt.log.LoggingTransaction;
import cn.edu.njupt.model.Log;
import cn.edu.njupt.model.Student;
import cn.edu.njupt.service.StudentService;

public class StudentServiceTest {
	@Test
	public void aesisttest(){
		ApplicationContext ac=new  FileSystemXmlApplicationContext("/WebContent/WEB-INF/beans.xml");
		
		   StudentService ss=(StudentService) ac.getBean("StudentService");	 
		  Student s=new Student();
		  s.setId(1);
		  boolean f=ss.exist(s);
		  System.out.println("f :"+f);		  		
	}
	
	@Test
	public void addexitest(){
		ApplicationContext ac=new  FileSystemXmlApplicationContext("/WebContent/WEB-INF/beans.xml");
		   StudentService ss=(StudentService) ac.getBean("StudentService");	 
		  // SessionFactory ss1= (SessionFactory) ac.getBean("sessionFactory_oracle");	
		  // System.out.println("ss1: "+ss1);
		   Student s=new Student();
		  // TransactionProxyFactoryBean
		  // FactoryBean
		 // JdkDynamicAopProxy
		//  DefaultPointcutAdvisor
		 //  Advisor 
		 //  MethodMatcher
		  // BatchedStatement
		 //  PlatformTransactionManager 
		   
		///   Joinpoint
		//   Advice
		 //  ProxyFactoryBean
		  s.setId(101);
		  s.setAge(24);
		  s.setName("li");
		  ss.add(s);					
		
	}
	
	@Test
	public void injectTest(){
		ApplicationContext ac=new  FileSystemXmlApplicationContext("/WebContent/WEB-INF/beans.xml");
		MessageSource  ss=(MessageSource ) ac.getBean("messageSource");
		String a=ss.getMessage("message", new Object [] {"大"}, "你好",Locale.CHINA);
		System.out.println(a);				   		  				
	}
	
	@Test
	public void logtest(){
		ApplicationContext ac=new  FileSystemXmlApplicationContext("/WebContent/WEB-INF/beans.xml");
		LoggingTransaction ss=(LoggingTransaction) ac.getBean("LoggingTransaction");	 
		  // SessionFactory ss1= (SessionFactory) ac.getBean("sessionFactory_oracle");	
		  // System.out.println("ss1: "+ss1);
		  Log log=new Log();
		  log.setId(6);
		  log.setLogs("hello log");
		  log.setDates(new Timestamp(new java.util.Date().getTime()));
		  System.out.println(log.getDates());
		  ss.log(log);					
		
	}
	

}
