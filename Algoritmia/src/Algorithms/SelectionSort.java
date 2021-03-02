package Algorithms;

public class SelectionSort {
	
	public static void Swap(int a , int b)
	{
	   int temp;
	   temp = a;
	   a = b;
	   b = temp;
	} 

	public static void main(String[] args) {
		
		System.out.println("Disordered List:");
		int n = 10;
		int [] lista = new int[n]; //the value between the square brackets defines the length of the List
		
		for(int x = 0; x<lista.length ;x++) { 		//Fills the array with random numbers between 1 to 100
			int numRandom = (int) (Math.random()*101);
			lista[x]= numRandom;		
			System.out.print(lista[x]+" ");	
		}
		System.out.println("\n");
		for (int i = 0; i<=lista.length-1; i++) {
			int min = i;
			
			for (int j = i+1;j<lista.length ;j++) {
				if (lista[j]<lista[min]) {
					min=j;
					
				}
			Swap(lista[i], lista[min]); //huele mal 
			}		
			
		}		
	}
}
