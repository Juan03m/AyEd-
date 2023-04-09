package punto1;

public class prueba {

	public static void ConFor(int a, int b) {
		for(int i=a; i<=b;i++) {
			System.out.println(i);
		}
	}
	
	public static void ConWhile(int a,int b) {
		while(a<=b) {
			System.out.println(a);
			a++;
		}
	}
	
	
	public static void Recursion(int a,int b) {
		if(a<=b) {
			System.out.println(a);
			
			Recursion(a+1,b);
			
		}
	}
}
