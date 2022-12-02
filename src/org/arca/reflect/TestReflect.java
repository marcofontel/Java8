package org.arca.reflect;

import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

import org.arca.lambda.Produto;

public class TestReflect {

	public static void main(String[] args) {
		Produto p = new Produto("Geladeira", "3000");
		Class cl = p.getClass();
		
		Method[] metodos = cl.getDeclaredMethods();
		for(Method m : metodos) {
			System.out.println(m.getName());
			Parameter[] pr = m.getParameters();
			for(Parameter pp: pr) {
				System.out.println(pp);
			}
		}
		
	}
}
