package org.mjr.dependecyInjection;

public class Triangle {

	protected String type;
	
	
	public String getType() {
		return type;
	}


	public void setType(String type) {
		this.type = type;
	}


	public void draw(){
		
		System.out.println(" Triangle type : "  + getType());
		
	}
}
