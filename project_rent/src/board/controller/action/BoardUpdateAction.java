package board.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import model.Board;

public class BoardUpdateAction implements BoardAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO bDao = BoardDAO.getInstance();
		String num = request.getParameter("num");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		
		Board board = bDao.selectOneBoard(num);
		
		board.setB_title(title);
		board.setB_content(content);
		
		int result = bDao.updateBoard(board);
		String url = "";
		
		if(result == 1){
			url = "BoardServlet?command=board_list";
		}else{
			request.setAttribute("msg", "글수정 실패...");
			request.setAttribute("loc", "javascript:history.back()");
			url = "/showMsg.jsp";
		}
		
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
