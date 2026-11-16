package recursividad_ia;

public class Recursivo3 {
	//ejemplo de recursividad ascendente
    static void incrementar(int i, int n) {
    	if(i==n) {
    		return;
    	}
    	incrementar(i, n);//arreglar esta instrucción
		System.out.println(n);
    }
    
    public static void main(String[] args) {
    	incrementar(0, 5);
	}
}





