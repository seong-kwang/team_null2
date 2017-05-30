package model;

public class Reply {
	private int rp_num;
	private int b_num;
	private String rp_title;
	private String rp_content;
	
	public int getRp_num() {
		return rp_num;
	}
	public void setRp_num(int rp_num) {
		this.rp_num = rp_num;
	}
	public int getB_num() {
		return b_num;
	}
	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	public String getRp_title() {
		return rp_title;
	}
	public void setRp_title(String rp_title) {
		this.rp_title = rp_title;
	}
	public String getRp_content() {
		return rp_content;
	}
	public void setRp_content(String rp_content) {
		this.rp_content = rp_content;
	}
	
	@Override
	public String toString() {
		return "Reply [rp_num=" + rp_num + ", b_num=" + b_num + ", rp_title=" + rp_title + ", rp_content=" + rp_content
				+ "]";
	}
	
	
	
}
