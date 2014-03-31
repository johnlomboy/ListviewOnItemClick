package com.example.listviewonitemclick;

public class Product {

	private int id;
	private String name;
	private double decimal;

	public Product(int id, String name, double decimal) {
		this.id = id;
		this.name = name;
		this.decimal = decimal;
	}

	@Override
	public String toString() {
		return this.id + ". " + this.name + " [$" + this.decimal + "] asdasd";
	}

}
