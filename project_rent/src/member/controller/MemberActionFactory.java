package member.controller;

import member.controller.action.MemberAction;
import member.controller.action.MemberLoginAttemptAction;
import member.controller.action.MemberLoginFormAction;

public class MemberActionFactory {

	private static MemberActionFactory instance;
	
	private MemberActionFactory(){
		
	}
	
	public synchronized static MemberActionFactory getInstance(){
		if(instance == null){
			instance = new MemberActionFactory();
		}
		return instance;
	}
	
	public MemberAction getAction(String command){
		MemberAction action = null;
		
		if(command.equals("login_attempt")){
			action = new MemberLoginAttemptAction();
		}else if(command.equals("login_form")){
			action = new MemberLoginFormAction();
		}
		
		return action;
	}
	
}
