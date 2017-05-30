package board.controller.action;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.dao.BoardDAO;
import model.Board;
import model.BoardListView;

public class BoardListAction implements BoardAction{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		BoardDAO bDao = BoardDAO.getInstance();
		
		int pageNumber=1; //기본적으로 1번 페이지
        
		String pageNumberStr = request.getParameter("page");
		              
		if(pageNumberStr!=null){
		    pageNumber = Integer.parseInt(pageNumberStr);
		}
		
		BoardListView viewData = null;

		int currentPageNumber = pageNumber;
		int boardCountPerPage = 3;//나중에 가변으로 만들어주자.
        int firstRow = 0;
        int endRow = 0;
        
        firstRow = (pageNumber-1)*boardCountPerPage;
        endRow = boardCountPerPage;
        
        int boardTotalCount = bDao.selectCount();
        List<Board> boardList = null;
        
        if(boardTotalCount > 0){
            boardList = bDao.selectAllBoard(firstRow, endRow);
        }else{
        	boardList = new ArrayList<Board>();
        }
        
        viewData = new BoardListView(boardTotalCount, currentPageNumber, boardList, boardCountPerPage, firstRow, endRow);
        request.setAttribute("viewData", viewData);
        request.getRequestDispatcher("/board/boardList.jsp").forward(request, response);
		
	}

}
