package model;

public class Car {
	private int c_num;
	private int brand_num;
	private String c_model;
	private String c_name;
	private String c_fuel;
	private int c_type;
	private String c_year;
	private String c_image;
	private int c_pirce;
	
	public int getC_num() {
		return c_num;
	}
	public void setC_num(int c_num) {
		this.c_num = c_num;
	}
	public int getBrand_num() {
		return brand_num;
	}
	public void setBrand_num(int brand_num) {
		this.brand_num = brand_num;
	}
	public String getC_model() {
		return c_model;
	}
	public void setC_model(String c_model) {
		this.c_model = c_model;
	}
	public String getC_name() {
		return c_name;
	}
	public void setC_name(String c_name) {
		this.c_name = c_name;
	}
	public String getC_fuel() {
		return c_fuel;
	}
	public void setC_fuel(String c_fuel) {
		this.c_fuel = c_fuel;
	}
	public int getC_type() {
		return c_type;
	}
	public void setC_type(int c_type) {
		this.c_type = c_type;
	}
	public String getC_year() {
		return c_year;
	}
	public void setC_year(String c_year) {
		this.c_year = c_year;
	}
	public String getC_image() {
		return c_image;
	}
	public void setC_image(String c_image) {
		this.c_image = c_image;
	}
	public int getC_pirce() {
		return c_pirce;
	}
	public void setC_pirce(int c_pirce) {
		this.c_pirce = c_pirce;
	}
	
	@Override
	public String toString() {
		return "Car [c_num=" + c_num + ", brand_num=" + brand_num + ", c_model=" + c_model + ", c_name=" + c_name
				+ ", c_fuel=" + c_fuel + ", c_type=" + c_type + ", c_year=" + c_year + ", c_image=" + c_image
				+ ", c_pirce=" + c_pirce + "]";
	}
	
	
	
}
