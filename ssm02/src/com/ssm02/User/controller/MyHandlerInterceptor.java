package com.ssm02.User.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.ssm02.User.pojo.User;

//拦截的是handlerMapping
public class MyHandlerInterceptor implements HandlerInterceptor{

	/**
	 * 执行完了handler之后执行此方法
	 */
	public void afterCompletion(HttpServletRequest arg0,
			HttpServletResponse arg1, Object arg2, Exception arg3)
			throws Exception {
		
	}

	/**
	 * 请求到了handler之后，返回ModelAndView之前 
	 * 
	 * 使用：给指定的资源统一添加资源
	 */
	public void postHandle(HttpServletRequest arg0, HttpServletResponse arg1,
			Object arg2, ModelAndView arg3) throws Exception {
		
	}

	/**
	 * 执行handler之前调用此方法，
	 * return false:直接结束请求
	 * return true:放行
	 * 
	 * 使用：身份认证
	 */
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response,
			Object arg2) throws Exception {
		String url = request.getRequestURL().toString();
		if(url.contains("login.action")){
			return true;
		}
		User user = (User)request.getSession().getAttribute("form");
		if(user==null){
			request.setAttribute("errorMsg", "请先登录");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
			return false;
		}else{
			return true;
		}
	}
	
	
}
