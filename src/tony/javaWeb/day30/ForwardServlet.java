package tony.javaWeb.day30;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ForwardServlet
 */
@WebServlet("/forwardServlet")
public class ForwardServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("ForwardServlet's doGet");
		request.setAttribute("name", "forward method...");
		System.out.println(request.getAttribute("name"));
	
		//请求的转发
		//1. 调用 HttpServletRequest 的 getRequesetDisaptcher() 方法获取 RequestDisaptcher 对象
		// 调用 getRequestDispatcher() 需要传入要转发的地址
		String path = "testServlet";
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/"+path);
		
		//2. 调用 HttpServletRequest 的 forward(request, response) 进行请求的转发去
		requestDispatcher.forward(request, response);
	
	}

	
}
