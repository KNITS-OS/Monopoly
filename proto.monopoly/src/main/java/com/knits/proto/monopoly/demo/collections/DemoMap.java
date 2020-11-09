package com.knits.proto.monopoly.demo.collections;

import java.util.HashMap;
import java.util.Map;

public class DemoMap {

	public static void main(String[] args) {
	
		
		Map<Integer, String> intId2Strings= new HashMap<Integer, String>();
		intId2Strings.put(1001,"Berlin");
		intId2Strings.put(101,"Barcelona");
		intId2Strings.put(21,"New York");
		intId2Strings.put(12,"London");
		intId2Strings.put(123,"Roma");
		intId2Strings.put(66,"Tallinn");
		intId2Strings.put(49,"Berlin");
		
		System.out.println("For id 12 : "+intId2Strings.get(12));
		
		
	}
}
