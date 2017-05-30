package model;

public class Reservation {
	private int r_num;
	private int m_num;
	private int c_num;
	private String r_name;
	private String r_phone;
	private String r_addr;
	private int r_price;
	
	public int getR_num() {
		return r_num;
	}
	public void setR_num(int r_num) {
		this.r_num = r_num;
	}
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public int getC_num() {
		return c_num;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	public String getR_name() {
		return r_name;
	}
	public void setR_name(String r_name) {
		this.r_name = r_name;
	}
	public String getR_phone() {
		return r_phone;
	}
	public void setR_phone(String r_phone) {
		this.r_phone = r_phone;
	}
	public String getR_addr() {
		return r_addr;
	}
	public void setR_addr(String r_addr) {
		this.r_addr = r_addr;
	}
	public int getR_price() {
		return r_price;
	}
	public void setR_price(int r_price) {
		this.r_price = r_price;
	}
	
	@Override
	public String toString() {
		return "Reservation [r_num=" + r_num + ", m_num=" + m_num + ", c_num=" + c_num + ", r_name=" + r_name
				+ ", r_phone=" + r_phone + ", r_addr=" + r_addr + ", r_price=" + r_price + "]";
	}
	
	
	
}
