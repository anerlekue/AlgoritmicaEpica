package Algorithms;

public class QuickSort {
	
	public static void main(String[] args) { 
		//se vuelve loco al ordenar
		QuickSort ob = new QuickSort();
		System.out.println("Disordered List:");

		int [] lista = new int[10]; //the value between the square brackets defines the length of the List
		int n = lista.length;
		for(int i = 0; i<lista.length ;i++) {
			int numRandom = (int) (Math.random()*1000);
			lista[i]= numRandom;		
			System.out.print(lista[i]+" ");

		}
		System.out.println("\n");
		System.out.println("Ordered List:");
	
		for (int j = 0; j<lista.length;j++) {
			ob.quickSort(lista, j, n-1);
			System.out.print(lista[j] + " ");}
	}
	
		public void quickSort(int[] lista,int p,int r){
	        if(p<r){
	            int q=partition(lista,p,r);
	            quickSort(lista,p,q-1);
	            quickSort(lista,q+1,r);}
	        }
	    
	    int partition(int[] lista,int p,int r){
	        int x=lista[r];
	        int i=p-1;
	        for(int j=p;j<r;j++){
	            if(lista[j]<=x){
	            	i++;
	                int temp=lista[i];
	                lista[i]=lista[j];
	                lista[j]=temp;
	                
	            }
	        }
	        int temp=lista[i+1];
	        lista[i+1]=lista[r];
	        lista[r]=temp;
	        return i++;
	        
	}  
}
	
