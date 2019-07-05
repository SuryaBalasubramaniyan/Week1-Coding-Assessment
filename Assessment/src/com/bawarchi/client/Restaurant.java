package com.bawarchi.client;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import com.bawarachi.model.*;
import com.bawarchi.comparators.CaloriesGTComparator;

public class Restaurant {
	public static void main(String args[]) {
		Scanner in = new Scanner(System.in);

		 Dish neerdosa=new Dish(5,"neerdosa",50.00,100);
		    Dish idli=new Dish(2,"Idli-Vada",40.00,200);
		    Dish roti=new Dish(4,"roti",100.00,250);
		    Dish dosa=new Dish(1,"dosa",50.00,300);
		    Dish pulav=new Dish(3,"pulav",80.00,330);
		    
		   
		    	List<Dish> list = new ArrayList<Dish>();
		    	list.add(neerdosa);
		    	list.add(idli);
		    	list.add(roti);
		    	list.add(dosa);
		    	list.add(pulav);
		    
		    
		//List<Account> values = new ArrayList<>();
		boolean cnt = true;
		while (cnt) {
			System.out.println("=================Welcome=====================");
			System.out.println(" Please choose from the below options");
			System.out.println(" 1 => To sort the dishes in the increasing order of calories");
			System.out.println(" 2 => To sort the dishes in the decreasing order of calories");
			System.out.println("3 => To sort the dishes in the increasing order of price");
			System.out.println("   4 => To sort the dishes in the decreasing order of price \r\n");
			int c = in.nextInt();
			if (c == 1) {
				
			        Collections.sort(list, new CaloriesGTComparator()); 
			  
			        for (int i=0; i<list.size(); i++) 
			            System.out.println(list.get(i)); 
			  
			        
			    } 
			else if(c==2) {
				 
				
			      Collections.sort(list,Collections.reverseOrder());
			     
		        for (int i=0; i<list.size(); i++) 
		            System.out.println(list.get(i)); 
			}
			else if(c==3) {
				 Collections.sort(list, new PriceGTComparator()); 
				  
			        for (int i=0; i<list.size(); i++) 
			            System.out.println(list.get(i)); 
			  
				
			}
			
				

				

		}

}
}