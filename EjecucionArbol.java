package recursividad_ia;

public class EjecucionArbol {
	public static void main(String[] args) {
		int[] valores= {30,20,40,10,25,35,50};
		ArbolBinario arbol=new ArbolBinario();
		for (int i : valores) {
			arbol.insertar(i);
		}
		arbol.preOrder(arbol.raiz);
		//llamar el metodo postOrder 
		System.out.println("---el Arbol con postOder---");
		arbol.postOrder(arbol.raiz);
	}
}
