package com.knits.proto.monopoly.demo.collections;

import java.util.ArrayList;
import java.util.List;

public class DemoList {

	public static void main(String[] args) {

		List<String> aTestListOfString = new ArrayList<String>();
		aTestListOfString.add("Berlin");
		aTestListOfString.add("Barcelona");
		aTestListOfString.add("New York");
		aTestListOfString.add("London");
		aTestListOfString.add("Roma");
		aTestListOfString.add("Tallinn");
		aTestListOfString.add("Berlin");
		
		System.out.println("Position (3) "+aTestListOfString.get(3));
		System.out.println("Size "+aTestListOfString.size());
		
		aTestListOfString.add("Berlin");
		
		int newSize =aTestListOfString.size();
		System.out.println("Last Position Value: "+aTestListOfString.get(newSize-1) );
		System.out.println("Size: "+aTestListOfString.size());

	}

}
