package model;

public class Epilogue {
	private int e_num;
	private String e_title;
	private String e_content;
	
	public int getE_num() {
		return e_num;
	}
	public void setE_num(int e_num) {
		this.e_num = e_num;
	}
	public String getE_title() {
		return e_title;
	}
	public void setE_title(String e_title) {
		this.e_title = e_title;
	}
	public String getE_content() {
		return e_content;
	}
	public void setE_content(String e_content) {
		this.e_content = e_content;
	}
	
	@Override
	public String toString() {
		return "Epilogue [e_num=" + e_num + ", e_title=" + e_title + ", e_content=" + e_content + "]";
	}
	
	
	
}
