package org.arca.lambda;

public class ThreadMain {

	public static void main(String[] args) {
	
		Thread t1 = new Thread(()->System.out.println("Testando Thread"));
		t1.start();
	}
	
}
