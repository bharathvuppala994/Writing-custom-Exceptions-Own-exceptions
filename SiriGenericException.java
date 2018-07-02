package com.siri.exceptions;

public class SiriGenericException extends Exception {
	
	private String execptionMessage;
	
	public SiriGenericException(String execptionMessage) {
		this.execptionMessage = execptionMessage;
		printException(execptionMessage);
	}
	
	
	public void printException(String execptionMessage) {
		System.out.println("This is TSiri Exception "+ execptionMessage);
	}

}