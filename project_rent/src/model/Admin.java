package model;

public class Admin {
	private int admin_num;
	private String admin_id;
	private String admin_pass;
	
	public int getAdmin_num() {
		return admin_num;
	}
	public void setAdmin_num(int admin_num) {
		this.admin_num = admin_num;
	}
	public String getAdmin_id() {
		return admin_id;
	}
	public void setAdmin_id(String admin_id) {
		this.admin_id = admin_id;
	}
	public String getAdmin_pass() {
		return admin_pass;
	}
	public void setAdmin_pass(String admin_pass) {
		this.admin_pass = admin_pass;
	}
	
	@Override
	public String toString() {
		return "Admin [admin_num=" + admin_num + ", admin_id=" + admin_id + ", admin_pass=" + admin_pass + "]";
	}
}
