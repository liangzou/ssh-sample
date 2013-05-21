package cn.edu.util;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import cn.edu.njupt.log.LogEvent;

@Component("LogListener")
public class LogListener implements ApplicationListener<LogEvent> {

	
	@Override
	public void onApplicationEvent(LogEvent event) {
		// TODO Auto-generated method stub
		event.log();
	}

}
