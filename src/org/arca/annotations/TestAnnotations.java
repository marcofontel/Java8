package org.arca.annotations;

import org.arca.lambda.Produto;

public class TestAnnotations {
	
	
	public static void main(String[] args) {
		Voltagem[] volts = Produto.class.getAnnotationsByType(Voltagem.class);
		for(Voltagem v: volts) {
			System.out.println(v.tensao());
		}
		
	}
	
}
