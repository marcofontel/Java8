package org.arca.arrayparallel;

import java.util.Arrays;

public class TestArrayParallel {

	public static void main(String[] args) {
		int[] numeros = {10, 34, 1, 35, 3, 2, 11, -2};
		Arrays.parallelSort(numeros, 0,8);
		for(int numero: numeros) {
			System.out.println(numero + " ");
		}
	}
}
