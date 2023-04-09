package tp02.ejercicio4;
import tp02.ejercicio2.*;
import java.util.Scanner;
public class TestBalanceo {

	public  static char getOpuesto(Character c) {
		switch (c) {
		case '(': return ')';
		case '[': return ']';
		case '{': return '}';
	}
	return '?'; 
}
	
	public static boolean EsBalanceado(String cadena) {
		ListaGenerica<Character> apertura= new ListaEnlazadaGenerica <Character> ();
			apertura.agregarFinal('(');
			apertura.agregarFinal('[');
			apertura.agregarFinal('{');
		ListaGenerica<Character> cierre=new ListaEnlazadaGenerica<Character>();
			cierre.agregarFinal(')');
			cierre.agregarFinal(']');
			cierre.agregarFinal('}');
		
		PilaGenerica<Character> pila= new PilaGenerica<Character>();
		for(int i=0;i<cadena.length();i++) {
			Character c=cadena.charAt(i);
			if(apertura.incluye(c)) {
				pila.apilar(c);
			}
				else
					if(pila.esVacia()) {
						return false;
					}
					if(cierre.incluye(c)) {
						Character actual=pila.desapilar();
						if(c!=getOpuesto(actual)) {
							return false;
						}
					}
			}

		return true;
		}
	

	
	public static void main(String[]args) {
		Scanner s=new Scanner(System.in);
		
		String cadena=s.next();
		if(EsBalanceado(cadena)) {
			System.out.println("esta balanceado");
		}
			else
				System.out.println("no esta balanceado");
			
			
		s.close();	
		}
				}
			
	

