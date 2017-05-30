package hello.controller;

import hello.controller.action.HelloAction;
import hello.controller.action.HelloResultAction;

public class HelloActionFactory {

	private static HelloActionFactory instance;
	
	private HelloActionFactory(){
		
	}
	
	public synchronized static HelloActionFactory getInstance(){
		if(instance == null){
			instance = new HelloActionFactory();
		}
		return instance;
	}
	
	public HelloAction getAction(String command){
		HelloAction action = null;
		
		if(command.equals("hello")){
			action = new HelloResultAction();
		}
		
		return action;
	}
	
}
