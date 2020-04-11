package dao;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class WashingMachine extends Category{
	private ArrayList<Integer> prices=new  ArrayList<Integer>();
	private ArrayList<String> selectedItems=new ArrayList<String>();
	private ArrayList<String> washBrands=new ArrayList<String>();
	private LinkedHashMap<String,Integer> mitashiPrice=new LinkedHashMap<String,Integer>();
	private LinkedHashMap<String,Integer> SamsungPrice=new LinkedHashMap<String,Integer>();
	private LinkedHashMap<String,Integer> HaierPrice=new LinkedHashMap<String,Integer>();
	
	
	//Adding Brands , Models and Prices to the WashingMachine
	
	public WashingMachine() {
		washBrands.add("Mitashi");
		washBrands.add("Samsung"); 
		washBrands.add("Haier"); 
		mitashiPrice.put("Mitash 7.8kg MiFAWM78v20",13999);
		mitashiPrice.put("Mitashi 8.5kg MiSAWM85v25 AJD",11999);
		mitashiPrice.put("Mitashi 7.2kg MiSAWM72v45",8999);
		SamsungPrice.put("Samsung 6.5Kg WA65M4000HA/HP",18410);
		SamsungPrice.put("Samsung 7.2Kg WT725QPNDMP/XTL",10290);
		SamsungPrice.put("Samsung 7kg WW70J4243JS/TL",36900);
		HaierPrice.put("Haier 7.5Kg HWM75-707NZP",17000);
		HaierPrice.put("Haier 6.2Kg HWM62-707NZP",14000);
		HaierPrice.put("Haier 8Kg HTW80-1128",11000); 
	}
	
	
	
	//Displaying WashingMachine brands 
	
	public void displayBrands() {
		for(int index1=0;index1<washBrands.size();index1++) {
	         System.out.println(index1+1+" "+washBrands.get(index1));
	      }
	}
		
	

	//  Adding the new brand 
		public void addBrand(String newBrand) {
			washBrands.add(newBrand);
		}
		
	

		//Add model to the user selected brand
		public void addModel(String name,int price,int modelNum) {
			switch(modelNum) {
			case 1:
				mitashiPrice.put(name,price);
				break;
			case 2:
				SamsungPrice.put(name,price);
				break;
			case 3:
				HaierPrice.put(name,price);
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
				mitashiPrice.remove(item);
				break;
			case 2:
					String item1=selectedItems.get(removeModel-1);
					selectedItems.clear();
					SamsungPrice.remove(item1);
					break;
			case 3:
				String item2=selectedItems.get(removeModel-1);
				selectedItems.clear();
				HaierPrice.remove(item2);
				break;
				
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

		//Displaying models and prices 
		
		public void displayModels(int choice) {
			int pos=1;
			switch(choice) {
			case 1:
				for (Entry<String, Integer> entry : mitashiPrice.entrySet()) {
		            System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue()); 
		            prices.add(entry.getValue());
		            selectedItems.add(entry.getKey());
		            pos++;
				}
				break;
			
			case 2:
				for (Entry<String, Integer> entry : SamsungPrice.entrySet())  {
			         System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue());
			         prices.add(entry.getValue());
			         selectedItems.add(entry.getKey());
			         pos++;
					}
					break;
			case 3:
				for (Entry<String, Integer> entry : HaierPrice.entrySet())  {
			         System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue());
			         prices.add(entry.getValue());
			         selectedItems.add(entry.getKey());
			         pos++;
				}
				break;
			}
			
		}
	}

