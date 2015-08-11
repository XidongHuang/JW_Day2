package tony.javaWeb.day30;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * 自定义的一个 Servlet 接口的实现类: 让开发的任何 Servlet 都继承该类，以简化开发
 * 
 * @author tony
 *
 */

public  class MyGenericServlet implements Servlet, ServletConfig {

	/** 以下为 Servlet 接口方法 **/
	@Override
	public void destroy() {
		

	}

	@Override
	public ServletConfig getServletConfig() {
		
		return servletConfig;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}
	private ServletConfig servletConfig;

	@Override
	public void init(ServletConfig arg0) throws ServletException {

		this.servletConfig = arg0;
		init();
	}

	public void init()throws ServletException{
		
	}
	
	
	@Override
	public void service(ServletRequest arg0, ServletResponse arg1) 
			throws ServletException, IOException {
	}

	/** 以下为 ServletConfig 接口的方法 **/
	@Override
	public String getInitParameter(String arg0) {
		// TODO Auto-generated method stub
		return servletConfig.getInitParameter(arg0);
	}
	

	@Override
	public Enumeration<String> getInitParameterNames() {
		// TODO Auto-generated method stub
		return servletConfig.getInitParameterNames();
	}

	@Override
	public ServletContext getServletContext() {
		// TODO Auto-generated method stub
		return servletConfig.getServletContext();
	}

	@Override
	public String getServletName() {
		// TODO Auto-generated method stub
		return servletConfig.getServletName();
	}

}
