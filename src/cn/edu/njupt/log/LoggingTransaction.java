package cn.edu.njupt.log;

import java.sql.Timestamp;
import java.util.Date;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.stereotype.Component;

import cn.edu.njupt.model.Log;

@Component("LoggingTransaction")
public class LoggingTransaction {

	//private static final Exception Exception = null;@Resource(name="sessionFactory_oracle")
    SessionFactory sessionfactory;
	
	

    
	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}



	@Resource(name="sessionFactory")
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}




	public void log(Log logs){
		
		/*ApplicationContext ac=new  FileSystemXmlApplicationContext("/WebContent/WEB-INF/beans.xml");
		SessionFactory ss1= (SessionFactory) ac.getBean("sessionFactory_oracle");*/
		
		System.out.println("sessionfactoryss1: "+sessionfactory);
		Session s=sessionfactory.openSession();
		
		s.beginTransaction();
		//s.beginTransaction();
		
		s.save(logs);
		//System.out.println();
		s.getTransaction().commit();
		s.close();
		System.out.println("adfwe");
		//throw new RuntimeException("err");
	}

}
