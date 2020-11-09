package com.knits.proto.monopoly.demo.collections;

import java.util.HashSet;
import java.util.Set;

public class DemoSet {

	public static void main(String[] args) {

		//LIFO logic
		Set<String> aSetOfStrings = new HashSet<String>();
		aSetOfStrings.add("Berlin"); //1
		aSetOfStrings.add("Barcelona"); //2
		aSetOfStrings.add("New York"); //3
		aSetOfStrings.add("London"); //4
		aSetOfStrings.add("Roma"); //5
		aSetOfStrings.add("Tallinn"); //6
		aSetOfStrings.add("Berlin"); //7
		
		// no way to get a specific item (no indexed position)
		//System.out.println("Position (3) "+aStackOfStrings.get(3));
				
		System.out.println("Size "+aSetOfStrings.size()); // size ==6 (Berlin is no added second time)
		
	
		// to access all elements we need to use iterator
		while ( aSetOfStrings.iterator().hasNext()) {
			System.out.println(aSetOfStrings.iterator().next()); //return next element and move to following one
		}
		
	
		
		

	}

}
