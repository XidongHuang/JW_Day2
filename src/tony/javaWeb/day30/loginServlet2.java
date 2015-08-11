package tony.javaWeb.day30;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.GenericServlet;
import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class loginServlet2 extends HttpServlet {

	
	/**
	 * 
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	
	@Override
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		
		//获取请求方式是 GET 还是 POST
		HttpServletRequest httpServletRequest = (HttpServletRequest)request;
		String method = httpServletRequest.getMethod();
		System.out.println(method);
		
		
		System.out.println("service...");
		//1. 获取请求参数: userName, password
		String username = request.getParameter("inputName");
		String password = request.getParameter("password");
		
		
		//2. 获取当前WEB 应用的初始化参数: user, password
		// 需要使用ServletContext 对象
		//ServletContext servletContext = getServletConfig().getServletContext();
		String initUser = getServletContext().getInitParameter("userName");
		String iniPassword = getServletContext().getInitParameter("userPassowrd");
		

		
		PrintWriter out = response.getWriter();
		//3. 比对
		if(initUser.equals(username) && iniPassword.equals(password)){
			out.println("Hello: " + username);
		} else {
			out.println("Sorry: " + username);
		}
		
		
		
	} 
	

}
