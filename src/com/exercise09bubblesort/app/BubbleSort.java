package com.exercise09bubblesort.app;

import java.util.Random;
public class BubbleSort {
	/*
	 *     = = = = = = = = = = =    Bubble Sort    = = = = = = = = = = = 
	 * Is the simplest sorting algorithm that works by repeatedly swapping the 
	 * adjacent elements if they are in wrong order. It takes minimum of times 
	 *  n-1 when elements are already sorted.
	 */

	public static void main(String[] args) {
		// 	Constants declaration
		final int ELEMENTS_ARRAY = 10;
		// Variable declaration
		int temp = 0;
		
		// Array declaration
		int[] disorderedArray = new int[ELEMENTS_ARRAY];
		int[] orderedArray = new int[ELEMENTS_ARRAY];
		
		// Object construction
		Random randomNumbers = new Random(System.nanoTime());
		
		// Create and display disordered array
		for(int i = 0; i < ELEMENTS_ARRAY; i++) {
			disorderedArray[i] = randomNumbers.nextInt(101);
			System.out.print(disorderedArray[i]+ " ");
		}
		System.out.println();
		//  B U B B L E		S O R T		M E T H O D
		// 		A S C E N D I N G
		for(int i = 0; i < ELEMENTS_ARRAY-1; i++) {
			for(int j = 0; j < ELEMENTS_ARRAY-1; j++) {
				if(disorderedArray[j] > disorderedArray[j+1]) {
					temp = disorderedArray[j+1];
					disorderedArray[j+1] = disorderedArray[j];
					orderedArray[j] = temp;
				}
			}
		}
		
		System.out.println("Ordered Array");
		for(int i = 0; i < ELEMENTS_ARRAY; i++) {
			System.out.print(orderedArray[i]+ " ");
		}
		
		// 		D E S C E N D I N G
		for(int i = 0; i < ELEMENTS_ARRAY-1; i++) {
			for(int j = 0; j < ELEMENTS_ARRAY-1; j++) {
				if(disorderedArray[j]  disorderedArray[j+1]) {
					temp = disorderedArray[j+1];
					disorderedArray[j+1] = disorderedArray[j];
					orderedArray[j] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("Ordered Array");
		for(int i = 0; i < ELEMENTS_ARRAY; i++) {
			System.out.print(orderedArray[i]+ " ");
		}
		

	}

}
