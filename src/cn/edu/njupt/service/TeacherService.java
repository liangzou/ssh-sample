package cn.edu.njupt.service;

import java.util.Timer;

import javax.annotation.Resource;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

import cn.edu.njupt.dao.TeacherDAO;
import cn.edu.njupt.log.LogEvent;
import cn.edu.njupt.model.Teacher;

@Component("TeacherService")
public class TeacherService implements ApplicationEventPublisherAware  {
	TeacherDAO tdao;
	private ApplicationEventPublisher publisher;
	public TeacherDAO getTdao() {
		return tdao;
	}
	@Resource(name="TeacherDAOimpl")
	public void setTdao(TeacherDAO tdao) {
		this.tdao = tdao;
	}
	//add Tacher
	public void add(Teacher t){
		tdao.add(t);
		
	}
	
	public void logEvent(Teacher t){
		LogEvent le=new LogEvent(this, t.getName(), new Timer());
		publisher.publishEvent(le);
		return;
	}
	@Override
	public void setApplicationEventPublisher(
			ApplicationEventPublisher applicationEventPublisher) {
		// TODO Auto-generated method stub
		this.publisher=publisher;
	}
   
	

}
