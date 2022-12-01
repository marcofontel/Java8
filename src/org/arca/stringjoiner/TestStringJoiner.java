package org.arca.stringjoiner;

import java.util.StringTokenizer;

public class TestStringJoiner {

	
	static String seq = "Marcos, Paulo, Palmeira, Ana, João";
	public static void main(String[] args) {
		StringTokenizer strToken = new StringTokenizer(seq,",");
		while(strToken.hasMoreTokens()) {
			System.out.println(strToken.nextToken());
		}
		
	}
}
