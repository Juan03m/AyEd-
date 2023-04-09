package tp02.ejercicio4;
import tp02.ejercicio2.*;
public class PilaGenerica<T> {

	ListaGenerica <T> pila=new ListaEnlazadaGenerica<T>();
	
	

public void apilar(T elem) {
	pila.agregarFinal(elem);
}


public T desapilar() {
	T elem=pila.elemento(pila.tamanio());
	pila.eliminar(elem);
	return elem;
}



public T tope() {
		return pila.elemento(pila.tamanio());
		
}

public boolean esVacia() {
	return pila.esVacia();
	
}

	
}
