package cn.edu.njupt.action;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import javax.annotation.Resource;

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
   private File fileupload;
   private String savePath;
   private String fileuploadFileName;

	public String getFileuploadFileName() {
	return fileuploadFileName;
}
public void setFileuploadFileName(String fileuploadFileName) {
	this.fileuploadFileName = fileuploadFileName;
}
	public String getSavePath() {
	return savePath;
}
public void setSavePath(String savePath) {
	this.savePath = savePath;
}
	public File getFileupload() {
	return fileupload;
}
public void setFileupload(File fileupload) {
	this.fileupload = fileupload;
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
	  	  

	public  String execute() throws Exception {
		System.out.println("unames");
		System.out.println(userid);
		Student stu=new Student();
		stu.setId(userid);
		stu.setName(username);
		System.out.println(getFileupload());
		FileInputStream fis=new FileInputStream(getFileupload());
		System.out.println("test");
		FileOutputStream fos=new FileOutputStream(getSavePath()+"\\"+getFileuploadFileName());
		
		
		byte[] buffer=new byte[1024];
		int len=0;
		while((len=fis.read(buffer))>0){
			fos.write(buffer,0,len);
		}
		//try{
		//if(studentservice.add(stu)==1)
		      return "success";	
		/*else return "fail";
		}catch(RuntimeException e){			
				return "fail";
		}*/
		
	}
	
	public String haha(){
		System.out.println("geeee");
		return "success";
	}

}
