package cn.edu.njupt.daoimpl;

import javax.annotation.Resource;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Component;

import cn.edu.njupt.dao.TeacherDAO;
import cn.edu.njupt.model.Teacher;

@Component("TeacherDAOimpl")
public class TeacherDAOimpl implements TeacherDAO {
	SessionFactory sessionfactory;	
	public SessionFactory getSessionfactory() {
		return sessionfactory;
	}
	@Resource(name="sessionFactory")
	public void setSessionfactory(SessionFactory sessionfactory) {
		this.sessionfactory = sessionfactory;
	}
	
	@Override
	public void add(Teacher t) {
		Session s=sessionfactory.getCurrentSession();
		s.save(t);

	}

}
