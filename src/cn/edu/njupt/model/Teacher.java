package cn.edu.njupt.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

@Entity
public class Teacher implements Serializable {
	
  private int id;
  @Id
  
  public int getId() {
	return id;
}
  @NotNull
public String getName() {
	return name;
}
  @Pattern(regexp = "[a-z]",message="Wrong id")
public String getCourse() {
	return course;
}

public void setId(int id) {
	this.id = id;
}
public void setName(String name) {
	this.name = name;
}
public void setCourse(String course) {
	this.course = course;
}
private String name;
  private String course;
}
