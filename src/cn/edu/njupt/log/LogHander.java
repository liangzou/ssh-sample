package cn.edu.njupt.log;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;




//@Aspect
@Component
public class LogHander {
//	@Before("execution(public void cn.edu.njupt.daoimpl.StudentDAOImpl.addStudent(cn.edu.njupt.model.Student))")
	//Log LOG=LogFactory.getLog(LogHander.class);
	public void log(){
     System.out.println("log start");
	}
	
	
}
