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
import javax.servlet.http.HttpServletRequest;

public class loginServlet extends GenericServlet {

	//对当前的Servlet 进行初始化:
	@Override
	public void init() throws ServletException{
		System.out.println("初始化..." );
	}
	

	@Override
	public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
		
		//获取请求方式是 GET 还是 POST
		HttpServletRequest httpServletRequest = (HttpServletRequest)servletRequest;
		String method = httpServletRequest.getMethod();
		System.out.println(method);
		
		
		System.out.println("service...");
		//1. 获取请求参数: userName, password
		String username = servletRequest.getParameter("inputName");
		String password = servletRequest.getParameter("password");
		
		
		//2. 获取当前WEB 应用的初始化参数: user, password
		// 需要使用ServletContext 对象
		//ServletContext servletContext = getServletConfig().getServletContext();
		String initUser = getServletContext().getInitParameter("userName");
		String iniPassword = getServletContext().getInitParameter("userPassowrd");
		
		System.out.println(username);
		System.out.println(password);
		System.out.println(initUser);
		System.out.println(iniPassword);
		
		PrintWriter out = servletResponse.getWriter();
		//3. 比对
		if(initUser.equals(username) && iniPassword.equals(password)){
			out.println("Hello: " + username);
		} else {
			out.println("Sorry: " + username);
		}
		
		//4.打印相应字符串
		
		
		System.out.println("service");
		
	}

}
