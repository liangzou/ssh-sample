package cn.edu.njupt.log;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Authorized_annotation {
	
	@Pointcut("execution(public * cn.edu.njupt.service.*.add*(..))")
	public void authorized(){
		System.out.println("Authorized_annotation");
	}
	
	
	

}
