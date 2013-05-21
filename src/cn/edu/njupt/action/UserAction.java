package cn.edu.njupt.action;

import javax.annotation.Resource;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import cn.edu.njupt.model.Student;
import cn.edu.njupt.service.StudentService;

import com.opensymphony.xwork2.ActionSupport;

@Component(value="register")
public class UserAction extends ActionSupport{
	private int userid;
	public int getUserid() {
		return userid;
	}
  
	StudentService studentservice;
	
	public StudentService getStudentservice() {
		return studentservice;
	}
    @Resource(name="StudentService")
	public void setStudentservice(StudentService studentservice) {
		this.studentservice = studentservice;
	}

	public String getUsername() {
		return username;
	}

	public void setUserid(int userid) {
		this.userid = userid;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	private String username;
	StudentService service;
	  	  

	public  String execute() {
		System.out.println("uname");
		System.out.println(userid);
		Student stu=new Student();
		stu.setId(userid);
		stu.setName(username);
		System.out.println(stu);
		try{
		if(studentservice.add(stu)==1)
		      return "success";	
		else return "fail";
		}catch(RuntimeException e){			
				return "fail";
		}
		
	}

}
