package org.arca.methodreference;

@FunctionalInterface
interface FazAlgo{
	TipoAlgo fazAlgo(Double l, Double a);
	
}

class TipoAlgo{
	public TipoAlgo (Double l, Double a) {
		System.out.println("Faz L: " + l + " e A: "+ a);
	}
}
public class ReferenceMain {
	public static void main(String[] args) {
		test1();
		
	}	
	static void test1() {
		FazAlgo faz = TipoAlgo::new;
		faz.fazAlgo(10.9, 34.8);
	}
	static void test2() {
		FazAlgo faz = TipoAlgo::new;
		//FazAlgo faz = tipoAlgo::fazAlgumaCoisaR;
		faz.fazAlgo(22.33, 11.33);
		
	}
}
