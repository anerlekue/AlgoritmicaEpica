package Algorithms;

import java.util.Scanner;

public class LinearSearch {

		public int v;
		public int [] lista = new int [10];
		
		public LinearSearch(int v, int[]lista) {
			this.v = v;
			this.lista = lista;
		}
		
		public void rellenarLista(int[]lista) {		
			for(int x = 0; x<lista.length ;x++) {
				int numRandom = (int) (Math.random()*101);
				lista[x]= numRandom;		
				System.out.print(lista[x]+" ");	
			}
		}
		public String linear_search(int [] lista, int v) {		
			for(int i = 0;i<lista.length ;i++) {
				if (lista[i]==v) {
					return (lista[i]+" Its on the list bro");
				}				
			}		
			return "Null";
			
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			int [] lista = new int [10];		
			
			System.out.println("What number you want to find?");
			String numAsked = scanner.nextLine();
			int v = Integer.parseInt(numAsked);  //Change from string to int
			
			LinearSearch ln = new LinearSearch(v, lista);
			
			System.out.println("Disordered List:");
			ln.rellenarLista(lista);
			
			System.out.println("\n"+ln.linear_search(lista, v));
			
			
				
			
		}
		
		
}
