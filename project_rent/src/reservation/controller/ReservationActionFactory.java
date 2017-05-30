package reservation.controller;

import reservation.controller.action.ReservationAction;
import reservation.controller.action.ReserveFormAction;

public class ReservationActionFactory {

	private static ReservationActionFactory instance;
	
	private ReservationActionFactory(){
		
	}
	
	public synchronized static ReservationActionFactory getInstance(){
		if(instance == null){
			instance = new ReservationActionFactory();
		}
		return instance;
	}
	
	public ReservationAction getAction(String command){
		ReservationAction action = null;
		
		if(command.equals("reserve_form")){
			action = new ReserveFormAction();
		}
		return action;
	}
	
}
