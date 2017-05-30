package model;

public class Member {
	private int m_num;
	private String m_id;
	private String m_pass;
	private String m_name;
	private int m_gender;
	private String m_zipcode;
	private String m_addr;
	private String m_phone;
	private String m_email;
	
	public int getM_num() {
		return m_num;
	}
	public void setM_num(int m_num) {
		this.m_num = m_num;
	}
	public String getM_id() {
		return m_id;
	}
	public void setM_id(String m_id) {
		this.m_id = m_id;
	}
	public String getM_pass() {
		return m_pass;
	}
	public void setM_pass(String m_pass) {
		this.m_pass = m_pass;
	}
	public String getM_name() {
		return m_name;
	}
	public void setM_name(String m_name) {
		this.m_name = m_name;
	}
	public int getM_gender() {
		return m_gender;
	}
	public void setM_gender(int m_gender) {
		this.m_gender = m_gender;
	}
	public String getM_zipcode() {
		return m_zipcode;
	}
	public void setM_zipcode(String m_zipcode) {
		this.m_zipcode = m_zipcode;
	}
	public String getM_addr() {
		return m_addr;
	}
	public void setM_addr(String m_addr) {
		this.m_addr = m_addr;
	}
	public String getM_phone() {
		return m_phone;
	}
	public void setM_phone(String m_phone) {
		this.m_phone = m_phone;
	}
	public String getM_email() {
		return m_email;
	}
	public void setM_email(String m_email) {
		this.m_email = m_email;
	}
	
	@Override
	public String toString() {
		return "Member [m_num=" + m_num + ", m_id=" + m_id + ", m_pass=" + m_pass + ", m_name=" + m_name + ", m_gender="
				+ m_gender + ", m_zipcode=" + m_zipcode + ", m_addr=" + m_addr + ", m_phone=" + m_phone + ", m_email="
				+ m_email + "]";
	}
	
}
