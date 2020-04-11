package dao;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class Televisions{
		private ArrayList<Integer> prices=new  ArrayList<Integer>();
		private ArrayList<String> selectedItems=new ArrayList<String>();
		private ArrayList<String> televisionBrands=new ArrayList<String>();
		private LinkedHashMap<String,Integer> panasonicPrice=new LinkedHashMap<String,Integer>();
		private LinkedHashMap<String,Integer> SharpPrice=new LinkedHashMap<String,Integer>();
		private LinkedHashMap<String,Integer> sonyPrice=new LinkedHashMap<String,Integer>();
		
		//Adding Brands , Models and Prices to the Televisions
		
		public Televisions() {
			televisionBrands.add("Panasonic"); 
			televisionBrands.add("Sharp"); 
			televisionBrands.add("Sony"); 
			panasonicPrice.put("Panasonic TH-28F200DX 28 Inch",10500);
			panasonicPrice.put("Panasonic TH-40DS500D 40 Inch",28000);
			panasonicPrice.put("Panasonic 32F201DX 32 Inch",13000);
			SharpPrice.put("Sharp LC-32LE185M 32 Inch",9500);
			SharpPrice.put("Sharp LC-32SA4500X 32 Inch",13000);
			SharpPrice.put("Samsung UA32N4305 32 Inch",20000);
			sonyPrice.put("Sony Bravia KD-55X7002G 55 Inch",67000);
			sonyPrice.put("Sony KLV-24P413D 24 Inch WXGA LED TV",17000);
			sonyPrice.put("Sony KD-43X7002G 43 Inch Ultra HD",55000); 
		}
		
		//Displaying Televisions brands 
		
		public void displayBrands() {
			for(int index1=0;index1<televisionBrands.size();index1++) {
		         System.out.println(index1+1+" "+televisionBrands.get(index1));
		      }
		}
			
		
		
		// Add new Brand to Television
	    
		public void addBrand(String newBrand) {
				televisionBrands.add(newBrand);
			}
		
		
		
		

		
		//Add model to the user selected brand
		public void addModel(String name,int price,int modelNum) {
			switch(modelNum) {
			case 1:
				panasonicPrice.put(name,price);
				break;
			case 2:
				SharpPrice.put(name,price);
				break;
			case 3:
				sonyPrice.put(name,price);
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
				panasonicPrice.remove(item);
				break;
			case 2:
					String item1=selectedItems.get(removeModel-1);
					selectedItems.clear();
					SharpPrice.remove(item1);
					break;
			case 3:
				String item2=selectedItems.get(removeModel-1);
				selectedItems.clear();
				sonyPrice.remove(item2);
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
					for (Entry<String, Integer> entry : panasonicPrice.entrySet()) {
			            System.out.println(pos+" Model :"+entry.getKey() + "  Price :"+entry.getValue()); 
			            prices.add(entry.getValue());
			            selectedItems.add(entry.getKey());
			            pos++;
					}
					break;
				
				case 2:
					for (Entry<String, Integer> entry : SharpPrice.entrySet())  {
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

