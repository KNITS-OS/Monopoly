package com.knits.proto.monopoly.demo.collections;

import java.util.Stack;

public class DemoStack {

	public static void main(String[] args) {

		//LIFO logic
		Stack<String> aStackOfStrings = new Stack<String>();
		aStackOfStrings.push("Berlin");
		aStackOfStrings.push("Barcelona");
		aStackOfStrings.push("New York");
		aStackOfStrings.push("London");
		aStackOfStrings.push("Roma");
		aStackOfStrings.push("Tallinn");
		aStackOfStrings.push("Berlin");
		
		System.out.println("Position (3) "+aStackOfStrings.get(3));
		System.out.println("Size "+aStackOfStrings.size());
		
		String fromTop =aStackOfStrings.peek();
		System.out.println(fromTop);
		
		
		int newSize =aStackOfStrings.size();
		System.out.println("Last Position Value: "+aStackOfStrings.get(newSize-1) );
		System.out.println("Size: "+aStackOfStrings.size());

	}

}
