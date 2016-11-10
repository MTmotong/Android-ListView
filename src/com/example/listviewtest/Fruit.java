package com.example.listviewtest;

/*作为ListView适配器的适配类型*/
public class Fruit {
	
	private String name;
	private int imageId;
	
	public Fruit(String name, int imageId) {
		this.name = name;
		this.imageId = imageId;
	}
	
	public String getName() {
		return name;
	}
	public int getIamgeId() {
		return imageId;
	}
}
