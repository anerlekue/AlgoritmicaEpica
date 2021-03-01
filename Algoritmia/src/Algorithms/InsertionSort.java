package Algorithms;

import java.lang.reflect.Array;

public class InsertionSort {
	public static void main(String[] args) { 
	System.out.println("Disordered List:");

	int [] lista = new int[100]; //the value between the square brackets defines the length of the List
	
	for(int x = 0; x<lista.length ;x++) {
		int numRandom = (int) (Math.random()*1000);
		lista[x]= numRandom;		
		System.out.print(lista[x]+" ");	
	}
	System.out.println("\nOrdered List:");	
	for(int j = 1; j < lista.length ; j++ ) {
		int key = lista[j];
		int i = j-1;
		while (i>=0 && lista[i]>key){
			lista[i+1] = lista[i];
			i = i-1;		
		}
		lista[1+i]=key;
		
	}	
	for(int x = 0; x<lista.length ;x++) {	// Prints the ordered list 
			System.out.print(lista[x]+" ");	
	}
  }	
}
