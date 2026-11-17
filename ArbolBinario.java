package recursividad_ia;

public class ArbolBinario {
	Nodo raiz;

	public ArbolBinario() {
		raiz=null;
	}
	
	private Nodo insertarRec(Nodo raiz, int valor) {
		if (raiz==null) {
			raiz=new Nodo(valor);
			return raiz;
		}
		if (valor<raiz.valor) {
			raiz.izquierdo= insertarRec(raiz.izquierdo,valor);
		}
		else if (valor>raiz.valor) {
			raiz.derecho= insertarRec(raiz.derecho,valor);
		}
		return raiz;
	}
	
	public void insertar(int valor) {
		raiz= insertarRec(raiz, valor);
	}
	
	public void preOrder(Nodo nodo) {
		if (nodo!=null) {
			System.out.println(nodo.valor);//primero la raiz
			preOrder(nodo.izquierdo);//nodo izquierdo
			preOrder(nodo.derecho);//nodo derecho
		}
	}
	public void postOrder(Nodo nodo) {
		//implementar el metodo
		if (nodo!=null) {
			postOrder(nodo.izquierdo);//nodo izquierdo
			postOrder(nodo.derecho);//nodo derecho
			System.out.println(nodo.valor);//primero la raizs
		}
	}
}
