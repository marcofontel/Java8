package org.arca.stringjoiner;

import java.util.StringJoiner;

public class TestStringJoiner {

	
	static String seq = "Marcos, Paulo, Palmeira, Ana, João";
	public static void main(String[] args) {

		StringJoiner join = new StringJoiner(", ");
		join.add("Maria");
		join.add("pedro");
		join.add("Paula");
		join.add("Ana");
		
		System.out.println(join.toString());
	}
} 
