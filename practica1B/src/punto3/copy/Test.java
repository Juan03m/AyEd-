package punto3.copy;

public class Test {

	
	public static void main(String[]args) {
		Estudiante [] estudiantes= new Estudiante[3];
		Profesor[] profesores=new Profesor[2];
		
		
		estudiantes[0]= new Estudiante("juam","mazu","2b", "juan@ss", "belgrano");
		estudiantes[1]= new Estudiante("pepe", "gomez","3a","pepe@sss", "centenraio");
		estudiantes[2]= new Estudiante("martin","jimenenz", "4b", "martin@sss", "453");
		
		profesores[0]=new Profesor("naza", "rofriges","cadp","ess@ggs","informatica");
		profesores[1]=new Profesor("sss","pitop", "taller", "ss@afgsf", "ingenieria");
		
		
		for(Estudiante estudiante: estudiantes) {
			System.out.println(estudiante.tusDatos());
		}
		
		for(Estudiante estudiante:estudiantes) {
			System.out.println(estudiante.tusDatos());
			
		}
		
		
	}
}
