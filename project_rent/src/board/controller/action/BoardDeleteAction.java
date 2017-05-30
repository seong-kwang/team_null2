package board.controller.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;

public class BoardDeleteAction implements BoardAction {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO bDao = BoardDAO.getInstance();
		String num = request.getParameter("num");

		int result = bDao.deleteBoard(num);
		String url = "";
		
		if(result == 1){
			url = "BoardServlet?command=board_list";
		}else{
			request.setAttribute("msg", "글 삭제 실패...");
			request.setAttribute("loc", "javascript:history.back()");
			url = "/showMsg.jsp";
		}
		
		request.getRequestDispatcher(url).forward(request, response);
		
	}

}
