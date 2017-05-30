package model;

public class Hello {
	
	private int num;
	private String greeting;
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getGreeting() {
		return greeting;
	}
	public void setGreeting(String greeting) {
		this.greeting = greeting;
	}
	
	@Override
	public String toString() {
		return "Hello [num=" + num + ", greeting=" + greeting + "]";
	}
}
