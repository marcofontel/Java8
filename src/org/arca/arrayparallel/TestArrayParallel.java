package org.arca.arrayparallel;

import java.util.Arrays;

public class TestArrayParallel {

	public static void main(String[] args) {
		int[] numeros = {10, 34, 1, 35, 3, 2, 11, -2};
		Arrays.parallelSort(numeros);
		for(int numero: numeros) {
			System.out.println(numero + " ");
		}
	}
}
