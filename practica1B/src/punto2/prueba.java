package punto2;

import java.util.Scanner;

public class prueba {

		public static void main(String[]args) {
			Scanner sca = new Scanner (System.in);
			int[]resultado= multiplos(sca.nextInt());
			MostrarVector(resultado);
			
			
			
			
		}
		
		
		
		
		public static  int[] multiplos(int n) {
			int[]vector=new int[n];
			for(int i=0; i<n; i++) {
				vector[i]= n * (i + 1);
			}
			return vector;
		}
		
		
		
		public static void MostrarVector(int[] vector) {
			for(int i=0; i<vector.length; i++) {
				System.out.println(vector[i]);
			}
		}
}
