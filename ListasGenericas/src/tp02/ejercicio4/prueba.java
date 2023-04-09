package tp02.ejercicio4;
import java.util.Scanner;
public class prueba {

	
	public static void main(String[]args) {
		PilaGenerica <Integer> pila=new PilaGenerica<Integer>();
		Scanner s =new Scanner(System.in);
		for(int i=0; i<5; i++) {
			int n= s.nextInt();
			pila.apilar(n);
			}
	System.out.println(pila.desapilar());
	s.close();
	}
}
