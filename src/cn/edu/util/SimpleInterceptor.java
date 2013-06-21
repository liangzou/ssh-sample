package cn.edu.util;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

public class SimpleInterceptor implements Interceptor {
  // MethodFilterInterceptor
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
	}
	@Override
	public void init() {
		// TODO Auto-generated method stub
	}
	@Override
	public String intercept(ActionInvocation arg0) throws Exception {
		// TODO Auto-generated method stub
		System.out.println(System.currentTimeMillis());
		String result=arg0.invoke();
		System.out.println(arg0.getProxy());
		System.out.println(arg0.getAction());
		System.out.println(System.currentTimeMillis());
		return result;
	}

}
