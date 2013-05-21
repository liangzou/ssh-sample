package cn.edu.njupt.log;

import java.util.Timer;

import org.springframework.context.ApplicationEvent;

public class LogEvent extends ApplicationEvent {
	public String message;
	public Timer time;
	public LogEvent(Object source,String message,Timer time) {
		super(source);
		this.message=message;
		this.time=time;
		// TODO Auto-generated constructor stub
	}
    
	public void log(){
		System.out.println(time.toString()+"-----"+message);
	}


	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

}
