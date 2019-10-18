package com.gkk.interceptor;

import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.MethodFilterInterceptor;

public class GoLogin extends MethodFilterInterceptor{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	protected String doIntercept(ActionInvocation invocation) throws Exception {
		
		HttpSession httpSession = ServletActionContext.getRequest().getSession();
		Object object = httpSession.getAttribute("userName");

		if (object != null) {
			String rtValue = invocation.invoke();
			return rtValue;
		}else {
			return "login";
		}
	}

}