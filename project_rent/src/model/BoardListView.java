package model;

import java.util.List;

public class BoardListView {

	private int boardTotalCount;// 총 게시글 개수
	private int currentPageNumber;// 현재 페이지 번호
	private List<Board> boardList;// 요청 페이지의 게시글 목록
	private int boardCountPerPage;// 페이지당 게시글 개수
	private int pageTotalCount; // 총 페이지 개수
	private int firstRow;//전체목록에서 현재 페이지에 보여줄 메시지 목록의 인덱스
	private int endRow; //인덱스로 부터 가져올 페이지 개수 
	
	private int startPage;
	private int endPage;

	public BoardListView(int boardTotalCount, int currentPageNumber, List<Board> boardList, int boardCountPerPage,
			int firstRow, int endRow) {
		this.boardTotalCount = boardTotalCount;
		this.currentPageNumber = currentPageNumber;
		this.boardList = boardList;
		this.boardCountPerPage = boardCountPerPage;
		this.firstRow = firstRow;
		this.endRow = endRow;
		
		calculatePageTotalCount();
		
	}
	
	public int getStartPage() {
		return startPage = (currentPageNumber - 1) / 10 * 10 + 1;
	}

	public int getEndPage() {
		return endPage = ((currentPageNumber - 1) / 10 + 1) * 10;
	}

	public int getBoardTotalCount() {
		return boardTotalCount;
	}

	public void setBoardTotalCount(int boardTotalCount) {
		this.boardTotalCount = boardTotalCount;
	}

	public int getCurrentPageNumber() {
		return currentPageNumber;
	}

	public void setCurrentPageNumber(int currentPageNumber) {
		this.currentPageNumber = currentPageNumber;
	}

	public List<Board> getBoardList() {
		return boardList;
	}

	public void setBoardList(List<Board> boardList) {
		this.boardList = boardList;
	}

	public int getBoardCountPerPage() {
		return boardCountPerPage;
	}

	public void setBoardCountPerPage(int boardCountPerPage) {
		this.boardCountPerPage = boardCountPerPage;
	}

	public int getPageTotalCount() {
		return pageTotalCount;
	}

	public void setPageTotalCount(int pageTotalCount) {
		this.pageTotalCount = pageTotalCount;
	}
	public int getFirstRow() {
		return firstRow;
	}

	public void setFirstRow(int firstRow) {
		this.firstRow = firstRow;
	}

	public int getEndRow() {
		return endRow;
	}

	public void setEndRow(int endRow) {
		this.endRow = endRow;
	}

	private void calculatePageTotalCount() {

		if (boardTotalCount == 0) {
			// 메시지가 없음
			pageTotalCount = 0;
		} else {
			// 메시지가 있음

			pageTotalCount = boardTotalCount / boardCountPerPage;
			if (boardTotalCount % boardTotalCount > 0) {
				pageTotalCount++;
			}
		}
	}

	public boolean isEmpty() {
		// 메시지의 총개수가 0이면 true 반환
		return boardTotalCount == 0;
	}

}
