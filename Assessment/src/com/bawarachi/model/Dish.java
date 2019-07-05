package com.bawarachi.model;
import java.util.*;
import java.lang.*;
public class Dish{
	private int id;
    private String name; 
    public double calories;
    public double price;
    public Dish() {
    	
    }
	public Dish(int id, String name,  double price,double calories) {
		
		this.id = id;
		this.name = name;
		this.calories = calories;
		this.price = price;
	}
	
    
    @Override
	public String toString() {
		return "Dish [id=" + id + ", name=" + name + ", calories=" + calories + ", price=" + price + "]";
	}

	
    
    public void print() {
    	System.out.println("Dish Id :"+id+"name: "+name+"price: "+price+"Calories: "+calories);
    	
    }

}
