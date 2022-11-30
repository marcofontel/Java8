package org.arca.methodreference;

interface FazAlgo{
	void fazAlgo(Double l, Double a);
	
}

class TipoAlgo{
	public void fazAlgumaCoisaR(Double l, Double a) {
		System.out.println("Faz L: " + l + " e A: "+ a);
	}
}
public class ReferenceMain {
	
	public static void main(String[] args) {
		test2();
		
	}	
	

	static void test1() {
		FazAlgo faz = (a, b)->System.out.println("A: " +a + " B:" + b);
		faz.fazAlgo(10.9, 34.8);
	}
	static void test2() {
		TipoAlgo tipoAlgo = new TipoAlgo();
		FazAlgo faz = tipoAlgo::fazAlgumaCoisaR;
		faz.fazAlgo(22.33, 11.33);
		
	}
}
