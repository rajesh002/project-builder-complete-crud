package dao;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class laptops{
				private ArrayList<Integer> prices=new  ArrayList<Integer>();
				private ArrayList<String> selectedItems=new ArrayList<String>();
				private ArrayList<String> laptopBrands=new ArrayList<String>();
				private LinkedHashMap<String,Integer> dellPrice=new LinkedHashMap<String,Integer>();
				private LinkedHashMap<String,Integer> lenovoPrice=new LinkedHashMap<String,Integer>();
				private LinkedHashMap<String,Integer> hpPrice=new LinkedHashMap<String,Integer>();
				
				//Adding Brands , Models and Prices to the laptops.
				
				public laptops() {
					laptopBrands.add("Dell"); 
					laptopBrands.add("Lenovo"); 
					laptopBrands.add("HP"); 
					dellPrice.put("Dell Inspiron 15 5567 (W56652353TH)",49000);
					dellPrice.put("Dell Latitude E6330 Laptop",24000);
					dellPrice.put("Dell Inspiron 14R N4010 Laptop",34000);
					lenovoPrice.put("Lenovo Yoga S940",14999);
					lenovoPrice.put("Lenovo NoteBook G575",37000);
					lenovoPrice.put("Lenovo Ideapad 330-151IGM",28000);
					hpPrice.put( "HP 15q-ds0007tu (4TT09PA) ",30000);
					hpPrice.put("HP 14q-cs0023tu (8QG87PA) ",31000);
					hpPrice.put("HP 15-da0327tu (5AY25PA) ",40000); 
				}
				
				//Displaying laptop brands  
				
				public void displayBrands() {
					for(int index1=0;index1<laptopBrands.size();index1++) {
				         System.out.println(index1+1+" "+laptopBrands.get(index1));
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
				public void removeModel(int modelNum,int removeModel) {
					int index=0;
					switch(modelNum) {
					case 1:
						String item=selectedItems.get(removeModel-1);
						selectedItems.clear();
						dellPrice.remove(item);
						break;
					case 2:
							String item1=selectedItems.get(removeModel-1);
							selectedItems.clear();
							lenovoPrice.remove(item1);
							break;
					case 3:
						String item2=selectedItems.get(removeModel-1);
						selectedItems.clear();
						hpPrice.remove(item2);
						break;
						
					}
				}
					
					
					

					//  Adding the new brand 
					public void addBrand(String newBrand) {
						laptopBrands.add(newBrand);
					}
					
				
					
					//Add model to the user selected brand
					public void addModel(String name,int price,int modelNum) {
						switch(modelNum) {
						case 1:
							dellPrice.put(name,price);
							break;
						case 2:
							lenovoPrice.put(name,price);
							break;
						case 3:
							hpPrice.put(name,price);
							break;
							
						}
					}
					
					
					
					
					
				
				//Displaying models and prices 
					
					public void displayModels(int choice) {
						int pos=1;
						switch(choice) {
						case 1:
							for (Entry<String, Integer> entry : dellPrice.entrySet()) {
					            System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue()); 
					            prices.add(entry.getValue());
					            selectedItems.add(entry.getKey());
					            pos++;
							}
							break;
						
						case 2:
							for (Entry<String, Integer> entry : lenovoPrice.entrySet())  {
						         System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue());
						         prices.add(entry.getValue());
						         selectedItems.add(entry.getKey());
						         pos++;
								}
								break;
						case 3:
							for (Entry<String, Integer> entry : hpPrice.entrySet())  {
						         System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue());
						         prices.add(entry.getValue());
						         selectedItems.add(entry.getKey());
						         pos++;
							}
							break;
						}
						
					}
				}

