package cn.edu.njupt.service.test;

import static org.junit.Assert.*;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

import cn.edu.njupt.model.Teacher;
import cn.edu.njupt.service.TeacherService;

public class TacherServiceTest {
	private static Validator validator;
	@BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }
	
   @Test
   public void addTest(){
	   ApplicationContext ac=new  FileSystemXmlApplicationContext("/WebContent/WEB-INF/beans.xml");
	   TeacherService ss=(TeacherService) ac.getBean("TeacherService");	 
	   
	   Teacher t=new Teacher();
	   t.setId(1);
	   t.setName("wang");
	   t.setCourse("Computer2");
	   //Set<ConstraintViolation<Teacher>> constraintViolations =validator.validate(t);
	   //assertEquals(1, constraintViolations.size());
	   //System.out.println(constraintViolations.iterator().next().getMessage());
	   ss.add(t);
	   
   }
   
   
   @Test
   public void logEventTest(){
	   ApplicationContext ac=new  FileSystemXmlApplicationContext("/WebContent/WEB-INF/beans.xml");
	   TeacherService ss=(TeacherService) ac.getBean("TeacherService");	 
	   
	   Teacher t=new Teacher();
	   t.setId(1);
	   t.setName("wang");
	   t.setCourse("Computer2");
	   //Set<ConstraintViolation<Teacher>> constraintViolations =validator.validate(t);
	   //assertEquals(1, constraintViolations.size());
	   //System.out.println(constraintViolations.iterator().next().getMessage());
	   ss.logEvent(t);
	   
   }
}
