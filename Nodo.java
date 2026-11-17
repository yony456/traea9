package recursividad_ia;

//definicion de nuestra class
public class Nodo {
	int valor;
    Nodo izquierdo;
    Nodo derecho;
    
    //metodo constructor
    public Nodo(int valor) {
    	this.valor= valor;
    	this.izquierdo= null;
    	this.derecho= null;
    }
}
