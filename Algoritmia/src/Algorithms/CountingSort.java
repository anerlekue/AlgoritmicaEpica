package Algorithms;

public class CountingSort {
	
	public static void main(String[] args) { 
		System.out.println("Disordered List:");
		
		//hay que usar recursividad
		int [] lista = new int[10]; //the value between the square brackets defines the length of the List
		int numero = 1000;
		
		for(int x = 0; x<lista.length ;x++) {
			int numRandom = (int) (Math.random()*numero);
			lista[x]= numRandom;		
			System.out.print(lista[x]+" ");
		}
		System.out.println("\n");
		System.out.println("Ordered list:");}
		
		
		 static void countingSort(int[] lista,int[] listaB,int mayor){
		    	int[] C= new int[mayor];
		    	for(int i=0;i<mayor;i++) {
		    		C[i]=0;}
		    	for(int j=1;j<lista.length;j++) {
		    		C[lista[j]]++;}
		    	for(int i=1;i<mayor;i++) {
		    		C[i]=C[i]+C[i-1];}
		    	for(int j=lista.length-1;j>0;j--){
		    		listaB[C[lista[j]]]=lista[j];
		    		C[lista[j]]--;
		    	}
	}	
}
