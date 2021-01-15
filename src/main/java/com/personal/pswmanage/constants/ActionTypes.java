package com.personal.pswmanage.constants;

import java.util.ArrayList;
import java.util.List;

public enum ActionTypes {
	DEL("Delete"), INS("Insert"), ENC("Encrypt"), DEC("Decrypt"), IGN("Ignore");
	
	private final String actionType;
	
	ActionTypes(String val){
		this.actionType = val;
	}
	
	public final static ActionTypes getActionType(String act) {
		
		if (act != null) {
			
			if(act.equalsIgnoreCase("Delete")) {
				return DEL;
			} else if(act.equalsIgnoreCase("Insert")) {
				return INS;
			} else if(act.equalsIgnoreCase("Encrypt")) {
				return ENC;
			} else if(act.equalsIgnoreCase("Decrypt")) {
				return DEC;
			} else if(act.equalsIgnoreCase("Ignore")) {
				return IGN;
			}
			
		} 	
		
		return IGN;
		
	}
	
	public final static List<String> returnList(){
		List<String> actionTypeList = new ArrayList<>();
		
		for(ActionTypes actionType : ActionTypes.values()) {
			actionTypeList.add(actionType.actionType);
		}
		
		return actionTypeList;
	}
	
	@Override
	public String toString() {
		return this.actionType;
	}
	
}
