package model;

import java.sql.Timestamp;

public class Board {
	private int b_num;
	private String b_id;
	private String b_title;
	private String b_content;
	private int b_readcount;
	private Timestamp b_writedate;
	
	public int getB_num() {
		return b_num;
	}
	public void setB_num(int b_num) {
		this.b_num = b_num;
	}
	public String getB_id() {
		return b_id;
	}
	public void setB_id(String b_id) {
		this.b_id = b_id;
	}
	public String getB_title() {
		return b_title;
	}
	public void setB_title(String b_title) {
		this.b_title = b_title;
	}
	public String getB_content() {
		return b_content;
	}
	public void setB_content(String b_content) {
		this.b_content = b_content;
	}
	public int getB_readcount() {
		return b_readcount;
	}
	public void setB_readcount(int b_readcount) {
		this.b_readcount = b_readcount;
	}
	public Timestamp getB_writedate() {
		return b_writedate;
	}
	public void setB_writedate(Timestamp b_writedate) {
		this.b_writedate = b_writedate;
	}
	
	@Override
	public String toString() {
		return "Board [b_num=" + b_num + ", b_id=" + b_id + ", b_title=" + b_title + ", b_content=" + b_content
				+ ", b_readcount=" + b_readcount + ", b_writedate=" + b_writedate + "]";
	}
	
	
	
}
