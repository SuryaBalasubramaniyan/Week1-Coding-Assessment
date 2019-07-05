package com.bawarchi.comparators;
import java.util.Comparator;


import com.bawarachi.model.*;
public class PriceGTComparator implements Comparator<Dish> {

	@Override
	public int compare(Dish a, Dish b) {
		
		return Double.compare(a.price,b.price);
	}

}
