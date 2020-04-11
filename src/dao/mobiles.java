package dao;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;
public class mobiles{
			private ArrayList<Integer> prices=new  ArrayList<Integer>();
			private ArrayList<String> selectedItems=new ArrayList<String>();
			private ArrayList<String> mobileBrands=new ArrayList<String>();
			private LinkedHashMap<String,Integer> applePrice=new LinkedHashMap<String,Integer>();
			private LinkedHashMap<String,Integer> nokiaPrice=new LinkedHashMap<String,Integer>();
			private LinkedHashMap<String,Integer> samsungPrice=new LinkedHashMap<String,Integer>();
			
			//Adding Brands , Models and Prices to the mobiles
			
			public mobiles() {
				mobileBrands.add("Apple"); 
				mobileBrands.add("Nokia"); 
				mobileBrands.add("Samsung"); 
				applePrice.put("Apple iPhone 7 Plus",35000);
				applePrice.put("Apple iPhone XR",49000);
				applePrice.put("Apple iPhone 7",28000);
				nokiaPrice.put("Nokia 9 plus",30500);
				nokiaPrice.put("Nokia 6.1 plus",12000);
				nokiaPrice.put("Nokia 7.2",16000);
				samsungPrice.put( "Samsung Galaxy A71",30000);
				samsungPrice.put("samsung s9",23500);
				samsungPrice.put("Samsung Galaxy M30",15000); 
			}
			
			
			//Displaying mobile brands 
			
			public void displayBrands() {
				for(int index1=0;index1<mobileBrands.size();index1++) {
			         System.out.println(index1+1+" "+mobileBrands.get(index1));
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
					mobileBrands.add(newBrand);
				}
				
				
				

				//Add model to the user selected brand
				public void addModel(String name,int price,int modelNum) {
					switch(modelNum) {
					case 1:
						applePrice.put(name,price);
						break;
					case 2:
						nokiaPrice.put(name,price);
						break;
					case 3:
						samsungPrice.put(name,price);
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
						applePrice.remove(item);
						break;
					case 2:
							String item1=selectedItems.get(removeModel-1);
							selectedItems.clear();
							nokiaPrice.remove(item1);
							break;
					case 3:
						String item2=selectedItems.get(removeModel-1);
						selectedItems.clear();
						samsungPrice.remove(item2);
						break;
						
					}
				}
				
				
				
			//Displaying models and prices 
				
				public void displayModels(int choice) {
					int pos=1;
					switch(choice) {
					case 1:
						for (Entry<String, Integer> entry : applePrice.entrySet()) {
				            System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue()); 
				            prices.add(entry.getValue());
				            selectedItems.add(entry.getKey());
				            pos++;
						}
						break;
					
					case 2:
						for (Entry<String, Integer> entry : nokiaPrice.entrySet())  {
					         System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue());
					         prices.add(entry.getValue());
					         selectedItems.add(entry.getKey());
					         pos++;
							}
							break;
					case 3:
						for (Entry<String, Integer> entry : samsungPrice.entrySet())  {
					         System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue());
					         prices.add(entry.getValue());
					         selectedItems.add(entry.getKey());
					         pos++;
						}
						break;
					}
					
				}
			}

