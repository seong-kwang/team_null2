package hello.controller.action;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import hello.dao.HelloDAO;
import model.Hello;

public class HelloResultAction implements HelloAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Hello hello = new Hello();
		HelloDAO hDao = HelloDAO.getInstance();
		
		String greeting = request.getParameter("greeting");
		System.out.println(greeting);
		
		hello.setGreeting(greeting);
		hDao.insert(hello);
		
		ArrayList<Hello> helloList = hDao.selectAll();
		
		request.setAttribute("msg", "Hello~연동성공!");
		request.setAttribute("list", helloList);
		request.getRequestDispatcher("hello_result.jsp").forward(request, response);
	}	
}
