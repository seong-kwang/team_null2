package board.controller;

import board.controller.action.BoardAction;
import board.controller.action.BoardDeleteAction;
import board.controller.action.BoardDetailAction;
import board.controller.action.BoardListAction;
import board.controller.action.BoardUpdateAction;
import board.controller.action.BoardUpdateFormAction;
import board.controller.action.BoardWriteAction;
import board.controller.action.BoardWriteFormAction;

public class BoardActionFactory {

	private static BoardActionFactory instance;
	
	private BoardActionFactory(){
		
	}
	
	public synchronized static BoardActionFactory getInstance(){
		if(instance == null){
			instance = new BoardActionFactory();
		}
		return instance;
	}
	
	public BoardAction getAction(String command){
		BoardAction action = null;
		
		if(command.equals("board_list")){
			action = new BoardListAction();
		}else if(command.equals("board_write_form")){
			action = new BoardWriteFormAction();
		}else if(command.equals("board_write")){
			action = new BoardWriteAction();
		}else if(command.equals("board_detail")){
			action = new BoardDetailAction();
		}else if(command.equals("board_update_form")){
			action = new BoardUpdateFormAction();
		}else if(command.equals("board_update")){
			action = new BoardUpdateAction();
		}else if(command.equals("board_delete")){
			action = new BoardDeleteAction();
		}
		
		return action;
	}
	
}
