package tp02.ejercicio4;
import tp02.ejercicio2.*;
public class ColaGenerica<T> {
	
	ListaGenerica<T> cola=new ListaEnlazadaGenerica<T>();
	
	
	
public void encolar(T elem) {
	cola.agregarFinal(elem);
	
}


public T desencolar() {
	T elem=cola.elemento(1);
	cola.eliminarEn(1);
	return elem;
}
	


public T tope() {
	
	T elem=cola.elemento(cola.tamanio());
	
	return elem;
}



public boolean esVacia() {
	return cola.esVacia();
}


}
