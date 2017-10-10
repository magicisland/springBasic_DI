package org.mjr.dependecyInjection;

public class Triangle {

	protected String type;
	protected int height;
	
	
	public Triangle(String type, int height) {
		super();
		this.type = type;
		this.height = height;
	}



	public int getHeight() {
		return height;
	}



	public String getType() {
		return type;
	}

	

	public Triangle(String type) {
		super();
		this.type = type;
	}



	/*public void setType(String type) {
		this.type = type;
	}
*/

	public void draw(){
		
		System.out.println(" Triangle type : "  + getType() + "  " +  getHeight());
		
	}
}
