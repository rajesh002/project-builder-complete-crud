package dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Refrigerator{
	private ArrayList<Integer> prices=new  ArrayList<Integer>();
	private ArrayList<String> selectedItems=new ArrayList<String>();
	private ArrayList<String> RefigBrands=new ArrayList<String>();
	private LinkedHashMap<String,Integer> RefigLgPrice=new LinkedHashMap<String,Integer>();
	private LinkedHashMap<String,Integer> RefigSamsungPrice=new LinkedHashMap<String,Integer>();
	private LinkedHashMap<String,Integer> RefigWhirlpooLPrice=new LinkedHashMap<String,Integer>();
	
	//Adding Brands , Models and Prices to the Refrigerator
	
	
    public Refrigerator() {
	RefigBrands.add("LG");
	RefigBrands.add("Samsung");
	RefigBrands.add("Whirlpool");
	RefigLgPrice.put("LG GL-D201ABPX 190L",10000);  
	RefigLgPrice.put("LG GL-T302RBPN 284L",15000);
	RefigLgPrice.put("LG GL-B221ABPX 215L",18000);
	RefigSamsungPrice.put("Samsung RT30M3425S8/HL 275L",12000);
	RefigSamsungPrice.put("Samsung RR20N1Y1ZSE/HL 192L",20000);
	RefigSamsungPrice.put("Samsung RR20T182XU8 192L",25000);
	RefigWhirlpooLPrice.put("Whirlpool WDE 205 CLS 190L", 11000);
	RefigWhirlpooLPrice.put("Whirlpool FP 263D Royal Protton 240 L",22000);
	RefigWhirlpooLPrice.put("Whirlpool NEO DF258 ROY 2S 245 L",18000);
	
    }
    
	
	// Add new Brand to Refigerator
    
	public void addBrand(String newBrand) {
			RefigBrands.add(newBrand);
		}
	
	//Displaying Refrigerator brands 
	
	public void displayBrands() {
		for(int index1=0;index1<RefigBrands.size();index1++) {
	         System.out.println(index1+1+" "+RefigBrands.get(index1));
	      }
	}
	

	// Getting the price and product of user selected item 
	
	public int getPrice(int model) {
		int value=prices.get(model-1);
		prices.clear();
		return value;
		}
	
	public String getModel(int model) {
		String item=selectedItems.get(model-1);
		selectedItems.clear();
		return item;
	}

	
	
	//Add model to the user selected brand
	public void addModel(String name,int price,int modelNum) {
		switch(modelNum) {
		case 1:
			RefigLgPrice.put(name,price);
			break;
		case 2:
			RefigSamsungPrice.put(name,price);
			break;
		case 3:
			RefigWhirlpooLPrice.put(name,price);
			break;
			
		}
	}
	
	

	//Add model to the user selected brand
	public void removeModel(int modelNum,int removeModel) {
		int index=0;
		switch(modelNum) {
		case 1:
			String item=selectedItems.get(removeModel-1);
			selectedItems.clear();
			RefigLgPrice.remove(item);
			break;
		case 2:
				String item1=selectedItems.get(removeModel-1);
				selectedItems.clear();
				RefigSamsungPrice.remove(item1);
				break;
		case 3:
			String item2=selectedItems.get(removeModel-1);
			selectedItems.clear();
			RefigWhirlpooLPrice.remove(item2);
			break;
			
		}
	}
	
	
	
	
	
	//Displaying models and prices 
	
	
	public void displayModels(int choice) {
		int pos=1;
		switch(choice) {
		case 1:
			for (Entry<String, Integer> entry : RefigLgPrice.entrySet()) {
	            System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue()); 
	            prices.add(entry.getValue());
	            selectedItems.add(entry.getKey());
	            pos++;
			}
			break;
		
		case 2:
			for (Entry<String, Integer> entry : RefigSamsungPrice.entrySet())  {
		         System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue());
		         prices.add(entry.getValue());
		         selectedItems.add(entry.getKey());
		         pos++;
				}
				break;
		case 3:
			for (Entry<String, Integer> entry : RefigWhirlpooLPrice.entrySet())  {
		         System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue());
		         prices.add(entry.getValue());
		         selectedItems.add(entry.getKey());
		         pos++;
			}
			break;
		}
		
	}
}












/*
public class Refrigerator extends Category{
	Refrigerator(float price, String brand, String model) {
		super(price, brand, model);
	}
	
}*/
