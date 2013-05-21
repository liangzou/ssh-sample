package cn.edu.njupt.service;

import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Resource;

import cn.edu.njupt.dao.StudentDAO;
import cn.edu.njupt.log.LoggingTransaction;
import cn.edu.njupt.model.Log;
import cn.edu.njupt.model.Student;
//import org.aspectj.lang.ProceedingJoinPoint;


//@Component(value="StudentService")
public class StudentService {
	
    private LoggingTransaction loggingtransaction;
	public LoggingTransaction getLoggingtransaction() {
		return loggingtransaction;
	}
	@Resource(name="LoggingTransaction")
	public void setLoggingtransaction(LoggingTransaction loggingtransaction) {
		this.loggingtransaction = loggingtransaction;
	}

	private StudentDAO stdao ;
	  public StudentDAO getStdao() {
		return stdao;
	}
	@Resource(name="StudentDAOImpl")
	public void setStdao(StudentDAO stdao) {
		this.stdao = stdao;
	}
	
	//@Transactional
	public int add(Student st){
		if(!exist(st)){
		  stdao.addStudent(st);
		 Log logs=new Log();
		  Date date=new Date();
		  System.out.println("sessionfactory: "+123);
		 // LoggingTransaction lt=new LoggingTransaction();
		  /*String logss="Sutdent" +st.getName()+" have been stored in database";
		  logs.setDates(new Timestamp(date.getTime()));
		  logs.setLogs(logss);
		  System.out.println("sessionfactory: "+logs);
		  loggingtransaction.log(logs);*/
		  return 1;
		} 
		//LoggingTransaction lt=new LoggingTransaction();
		//  lt.log(st.getName());
		
			throw new RuntimeException();
		
		  
		  //return 0;
		 // throw new RuntimeException();		  
       }
	
	public void delete(){
		System.out.println("delete");
	}
	public void deletes(){
		System.out.println("deletes");
	}
	
	public boolean exist(Student st){
		
		int id=st.getId();
		System.out.println("ids"+id+" "+stdao);
		
		boolean flag=stdao.checkwithid( id);
		System.out.println("falg"+flag);
		return flag;
	}
	
	
       
}
