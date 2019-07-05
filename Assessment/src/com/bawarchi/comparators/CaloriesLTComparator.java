package com.bawarchi.comparators;
import java.util.Comparator;
import java.util.*;

import com.bawarachi.model.*;
public class CaloriesLTComparator implements Comparator<Dish> {

	@Override
	public int compare(Dish a, Dish b) {
		
		return   b.calories.compareTo(a.calories);;
	}
	
}
