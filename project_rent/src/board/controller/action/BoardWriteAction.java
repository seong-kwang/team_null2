package board.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import model.Board;

public class BoardWriteAction implements BoardAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		BoardDAO bDao = BoardDAO.getInstance();
		
		String id = (String) request.getSession().getAttribute("MEMBER");//아이디는 나중에 session으로 받아오기 
		System.out.println("BoardWriteAction id : " + id);
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		Board board = new Board();
		board.setB_id(id);
		board.setB_title(title);
		board.setB_content(content);
		
		int result = bDao.insertBoard(board);
		
		String url = "";
		
		if(result == 1){
			url = "BoardServlet?command=board_list";
		}else{
			request.setAttribute("msg", "글쓰기 실패...");
			request.setAttribute("loc", "javascript:history.back()");
			url = "/showMsg.jsp";
		}
		
		request.getRequestDispatcher(url).forward(request, response);
	}

}
