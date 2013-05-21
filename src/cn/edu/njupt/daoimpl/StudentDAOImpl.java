package cn.edu.njupt.daoimpl;

import java.util.ArrayList;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Component;

import cn.edu.njupt.dao.StudentDAO;
import cn.edu.njupt.model.Student;

@Component(value="StudentDAOImpl")
@Scope(value="prototype")
public class StudentDAOImpl implements StudentDAO{
	
	 SessionFactory sessionfactory;
	public SessionFactory getSessionfactiry() {
		return sessionfactory;
	}
	@Resource(name="sessionFactory")
	public void setSessionfactiry(SessionFactory sessionfactiry) {
		this.sessionfactory = sessionfactiry;
	}
	@Override	
	public void addStudent(Student st) {
		// TODO Auto-generated method stub
		//System.out.println("addStudent start");
		//SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
		
		Session s=sessionfactory.getCurrentSession();
		//s.beginTransaction();
		s.save(st);
		//s.getTransaction().commit();
		//sf.close();
		
	}
	@Override
	public boolean checkwithid(int ids) {
		// TODO Auto-generated method stub
		//
		Session session=sessionfactory.getCurrentSession();
		//session.beginTransaction();
		System.out.println("here"+sessionfactory);
		//Session s1=hibernatetemplate.getSessionFactory().getCurrentSession();
		ArrayList<Student> s = (ArrayList<Student>)session.createQuery("from Student where id=:ids").setInteger("ids", ids).list();
		//Student s=(Student)s.get(Student.class, 1);
		//ArrayList<Student> s=find;
		//System.out.println("name"+s.getName());
		//session.getTransaction().commit();
		//System.out.println(s.getId());
		if(s.isEmpty()){
			
			return false;
		}
		return true;
	}
	
	

	

}

