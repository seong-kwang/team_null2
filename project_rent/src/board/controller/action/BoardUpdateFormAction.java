package board.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import model.Board;

public class BoardUpdateFormAction implements BoardAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO bDao = BoardDAO.getInstance();
		String num = request.getParameter("num");
		
		Board board = bDao.selectOneBoard(num);
		
		request.setAttribute("board", board);
		request.getRequestDispatcher("/board/boardUpdateForm.jsp").forward(request, response);
	}

}
