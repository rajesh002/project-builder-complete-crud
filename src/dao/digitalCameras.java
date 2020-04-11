package dao;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class digitalCameras{
					private ArrayList<Integer> prices=new  ArrayList<Integer>();
					private ArrayList<String> selectedItems=new ArrayList<String>();
					private ArrayList<String> cameraBrands=new ArrayList<String>();
					private LinkedHashMap<String,Integer> canonPrice=new LinkedHashMap<String,Integer>();
					private LinkedHashMap<String,Integer> nikonPrice=new LinkedHashMap<String,Integer>();
					private LinkedHashMap<String,Integer> sonyPrice=new LinkedHashMap<String,Integer>();
					
					//Adding Brands , Models and Prices to the DigitalCameras
					
					public digitalCameras() {
						cameraBrands.add("Canon"); 
						cameraBrands.add("Nikon"); 
						cameraBrands.add("Sony"); 
						canonPrice.put("Canon 1500D (EF-S 18-55mm f/3.5Lens) DSLR",34000);
						canonPrice.put("Canon EOS 200D (18 -55mmlens) DSLR",54000);
						canonPrice.put("Canon 80D (EF-S 18-55mm f/3.5Lens) DSLR",71000);
						nikonPrice.put("Nikon D3500 (AF-P DX 18-55mm Lens) DSLR ",41999);
						nikonPrice.put("Nikon D7500 DSLR",37000);
						nikonPrice.put("Nikon D5600 DSLR",89000);
						sonyPrice.put( "Sony ILCE-6000Y/B 24.3 MP DSLR ",51000);
						sonyPrice.put("Sony Cybershot DSC-RX100M3 20.1 MP",49000);
						sonyPrice.put("Sony ILCE-6300L 24.2MP",58000); 
					}
					
					//Displaying digitalCameras brands 
					
					public void displayBrands() {
						for(int index1=0;index1<cameraBrands.size();index1++) {
					         System.out.println(index1+1+" "+cameraBrands.get(index1));
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
							canonPrice.remove(item);
							break;
						case 2:
								String item1=selectedItems.get(removeModel-1);
								selectedItems.clear();
								nikonPrice.remove(item1);
								break;
						case 3:
							String item2=selectedItems.get(removeModel-1);
							selectedItems.clear();
							sonyPrice.remove(item2);
							break;
							
						}
					}
						
						

						//  Adding the new brand 
						public void addBrand(String newBrand) {
							cameraBrands.add(newBrand);
						}
						
						
						
						//Add model to the user selected brand
						public void addModel(String name,int price,int modelNum) {
							switch(modelNum) {
							case 1:
								canonPrice.put(name,price);
								break;
							case 2:
								nikonPrice.put(name,price);
								break;
							case 3:
								sonyPrice.put(name,price);
								break;
								
							}
						}
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
						
			
					//Displaying models and prices 
						
						
						public void displayModels(int choice) {
							int pos=1;
							switch(choice) {
							case 1:
								for (Entry<String, Integer> entry : canonPrice.entrySet()) {
						            System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue()); 
						            prices.add(entry.getValue());
						            selectedItems.add(entry.getKey());
						            pos++;
								}
								break;
							
							case 2:
								for (Entry<String, Integer> entry : nikonPrice.entrySet())  {
							         System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue());
							         prices.add(entry.getValue());
							         selectedItems.add(entry.getKey());
							         pos++;
									}
									break;
							case 3:
								for (Entry<String, Integer> entry : sonyPrice.entrySet())  {
							         System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue());
							         prices.add(entry.getValue());
							         selectedItems.add(entry.getKey());
							         pos++;
								}
								break;
							}
							
						}
					}

