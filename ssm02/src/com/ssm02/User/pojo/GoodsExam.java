package com.ssm02.User.pojo;

public class GoodsExam {
	
	private String name;
	private Double minPrice;
	private Double maxPrice;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getMinPrice() {
		return minPrice;
	}
	public void setMinPrice(Double minPrice) {
		this.minPrice = minPrice;
	}
	public Double getMaxPrice() {
		return maxPrice;
	}
	public void setMaxPrice(Double maxPrice) {
		this.maxPrice = maxPrice;
	}
	@Override
	public String toString() {
		return "GoodsExam [name=" + name + ", minPrice=" + minPrice
				+ ", maxPrice=" + maxPrice + "]";
	}
	
}
