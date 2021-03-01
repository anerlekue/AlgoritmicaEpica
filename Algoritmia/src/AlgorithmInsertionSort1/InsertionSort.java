package AlgorithmInsertionSort1;

import java.lang.reflect.Array;

public class InsertionSort {
	public static void main(String[] args) { 

	int [] lista = new int[10]; //the value between the square brackets defines the length of the array	
	
	for(int j = 2; j <= lista.length ; j++ ) {
		int key = lista[j];
		int i = j-1;
		while (i>0 && lista[i]>key){
			lista[i+1] = lista[i];
			i = i-1;		
		}
		lista[1+i]=key;
	}	
  }	
}
