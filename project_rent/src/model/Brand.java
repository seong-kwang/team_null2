package model;

public class Brand {
	private int brand_num;
	private String brand_name;
	
	public int getBrand_num() {
		return brand_num;
	}
	public void setBrand_num(int brand_num) {
		this.brand_num = brand_num;
	}
	public String getBrand_name() {
		return brand_name;
	}
	public void setBrand_name(String brand_name) {
		this.brand_name = brand_name;
	}
	
	@Override
	public String toString() {
		return "Brand [brand_num=" + brand_num + ", brand_name=" + brand_name + "]";
	}
}
