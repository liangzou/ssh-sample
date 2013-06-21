package cn.edu.util;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class MymethodInterceptor extends MethodFilterInterceptor {

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("**"+System.currentTimeMillis());
		String result =invocation.invoke();
		System.out.println("**"+System.currentTimeMillis());
		return result;
	}

}
