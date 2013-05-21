package cn.edu.njupt.dao;



import cn.edu.njupt.model.Student;

public interface StudentDAO {
	
	public void addStudent(Student st);	
	public boolean checkwithid(int id);
	
}
