package Algorithms;

public class MergeSort {
	
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
	    System.out.println("Ordered list:");
	    
	    MergeSort2(lista, 0, lista.length);
	    for(int x = 0; x<lista.length ;x++) { 		//Fills the array with random numbers between 1 to 100		
			System.out.print(lista[x]+" ");	
			}	    
		}
		
		
		public static void MergeSort2 (int[] lista, int p, int r) {
			if (p < r){
				int q = ((p + r)/2);
				MergeSort2 (lista,p,q);
				MergeSort2 (lista,q+1,r);
				MergeSort.Merge(lista,p,q,r);
			}
			}
		
		
		public static void Merge (int[] lista, int p, int q, int r) {
			int n1=q-p+1;
	    	int n2=r-q;
	    	int L []= new int[n1+1];
	    	int R []= new int[n2+1];
	    	for(int i=0;i<=n1;i++) {
	    		L[i]=lista[p+i];
	    		}
	    	L[n1]= Integer.MAX_VALUE;
	    	for(int j=0;j<=n2;j++) {
	    		R[j]=lista[q+j+1];
	    		}
	    	R[n2+1]= Integer.MAX_VALUE;
	    	
	    	int i=0;
	    	int j=0;
	    	for(int k=p;k<=r;k++){
	    		if(L[i]<=R[j]){
	    			lista[k]=L[i];
	    			i++;
	    		}else{
	    			lista[k]=R[j];
	    			j++;
	    		}
	    	}
	    }
}

	
