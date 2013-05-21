package cn.edu.njupt.model;


import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Log {
	private int id;
	@Id
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	private Timestamp dates;
	

	public Timestamp getDates() {
		return dates;
	}

	public void setDates(Timestamp dates) {
		this.dates = dates;
	}
	private String logs;
	public String getLogs() {
		return logs;
	}

	public void setLogs(String logs) {
		this.logs = logs;
	}
}
