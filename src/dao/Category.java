package dao;

import java.util.ArrayList;

public class Category {
	private ArrayList<String> Categories=new ArrayList<String>(); //List for adding Categories to store
	public Category(){
		Categories.add("Refrigerators");
		Categories.add("Washing Machines");
		Categories.add("Televisions");
		Categories.add("Mobile Phones");
		Categories.add("Air conditioners");
		Categories.add("Laptops");
		Categories.add("Digital Cameras");
		
	}
	
	//Displaying the items on the console
	public void displayCategory() {
		for(int index1=0;index1<Categories.size();index1++) {
	         System.out.println(index1+1+" "+Categories.get(index1));
	      }
	}
	
	public void addProduct(String newProduct) {
		Categories.add(newProduct);
	}
	
	
}














/*
public class Category {
    private float price;
    private String brand;
    private String model;
  Category(float price,String brand,String model){
    	this.price=price;
    	this.model=model;
    	this.brand=brand;
    }
    public void setPrice(float price) {
    	this.price=price;
    }
    public void setBrand(String brand) {
    	this.brand=brand;
    }
    public void setModel(String model) {
    	this.model=model;
    }
    
    
    public float getPrice() {
    	return price;
    }
    public String getBrand() {
    	return brand;
    }
    public String getModel() {
    	return model;
    }
}
*/

