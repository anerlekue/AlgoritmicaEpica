package Algorithms;

public class SelectionSort {

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
			System.out.println("Ordered List:");

			for (int i = 0; i<=lista.length-1; i++) {
				int minIndex = i;
				
				for (int j = i+1;j<lista.length ;j++) {
					if (lista[j]<lista[minIndex]) {
						minIndex = j;
					}
				}//Swap
				int k=lista[i];
	    		lista[i]=lista[minIndex];
	    		lista[minIndex]=k;
	    		
			System.out.print(lista[i] + " ");
			}	
		}
	
}
