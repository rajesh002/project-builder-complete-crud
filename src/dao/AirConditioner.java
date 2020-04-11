package dao;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
public class AirConditioner{
			private ArrayList<Integer> prices=new  ArrayList<Integer>();
			private ArrayList<String> selectedItems=new ArrayList<String>();
			private ArrayList<String> conditionerBrands=new ArrayList<String>();
			private LinkedHashMap<String,Integer> diakinPrice=new LinkedHashMap<String,Integer>();
			private LinkedHashMap<String,Integer> hitachiPrice=new LinkedHashMap<String,Integer>();
			private LinkedHashMap<String,Integer> electrluxPrice=new LinkedHashMap<String,Integer>();
			
			//Adding Brands , Models and Prices to the Airconditioner
			
			public AirConditioner() {
				conditionerBrands.add("Diakin"); 
				conditionerBrands.add("Hitachi"); 
				conditionerBrands.add("Electrolux"); 
				diakinPrice.put("Daikin FTKF50TV16U 1.5 Ton",49000);
				diakinPrice.put("Daikin FTKG50TV16U 1.5",41999);
				diakinPrice.put("Daikin FTKH35SRV 1 Ton 3S",33000);
				hitachiPrice.put("Hitachi RSNG317HCEA 1.5 Ton",35000);
				hitachiPrice.put("Hitachi RSNS318HCDO 1.5 Ton",33000);
				hitachiPrice.put("Hitachi Kaze Plus RAW318KUD 1.5 Ton",27000);
				electrluxPrice.put( "Electrolux S12E3 1.0 Ton",22000);
				electrluxPrice.put("Electrolux ES18L5C 1.5 Ton",27000);
				electrluxPrice.put("Electrolux 1 Ton 3 Star SN33N",25000); 
			}
			
			//Displaying Airconditioner brands 
			
			public void displayBrands() {
				for(int index1=0;index1<conditionerBrands.size();index1++) {
			         System.out.println(index1+1+" "+conditionerBrands.get(index1));
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

			
				//  Adding the new brand 
				public void addBrand(String newBrand) {
					conditionerBrands.add(newBrand);
				}
				
				
			//Add model to the user selected brand
				public void addModel(String name,int price,int modelNum) {
					switch(modelNum) {
					case 1:
						diakinPrice.put(name,price);
						break;
					case 2:
						hitachiPrice.put(name,price);
						break;
					case 3:
						electrluxPrice.put(name,price);
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
						diakinPrice.remove(item);
						break;
					case 2:
							String item1=selectedItems.get(removeModel-1);
							selectedItems.clear();
							hitachiPrice.remove(item1);
							break;
					case 3:
						String item2=selectedItems.get(removeModel-1);
						selectedItems.clear();
						electrluxPrice.remove(item2);
						break;
						
					}
				}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
			//Displaying models and prices 
				
				public void displayModels(int choice) {
					int pos=1;
					switch(choice) {
					case 1:
						for (Entry<String, Integer> entry : diakinPrice.entrySet()) {
				            System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue()); 
				            prices.add(entry.getValue());
				            selectedItems.add(entry.getKey());
				            pos++;
						}
						break;
					
					case 2:
						for (Entry<String, Integer> entry : hitachiPrice.entrySet())  {
					         System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue());
					         prices.add(entry.getValue());
					         selectedItems.add(entry.getKey());
					         pos++;
							}
							break;
					case 3:
						for (Entry<String, Integer> entry : electrluxPrice.entrySet())  {
					         System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue());
					         prices.add(entry.getValue());
					         selectedItems.add(entry.getKey());
					         pos++;
						}
						break;
					}
					
				}
			}