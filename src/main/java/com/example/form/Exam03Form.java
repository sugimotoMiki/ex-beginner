package com.example.form;

public class Exam03Form {

	private Integer price1;
	private Integer price2;
	private Integer price3;
	
	public Integer getPrice1() {
		return price1;
	}
	public void setPrice1(Integer price1) {
		this.price1 = price1;
	}
	public Integer getPrice2() {
		return price2;
	}
	public void setPrice2(Integer price2) {
		this.price2 = price2;
	}
	public Integer getPrice3() {
		return price3;
	}
	public void setPrice3(Integer price3) {
		this.price3 = price3;
	}
	
	@Override
	public String toString() {
		return "Exam02Form [price1=" + price1 + ", price2=" + price2 + ", price3=" + price3 + "]";
	}
	
	
}
