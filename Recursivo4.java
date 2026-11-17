package recursividad_ia;

import java.util.HashMap;
import java.util.Map;

public class Recursivo4 {
	//re
	static Map<Integer, Integer> memo= new HashMap<Integer, Integer>();
	static int sumarHasta(int n) {
		if(n==0) {
			return 0;
		}
		if (memo.containsKey(n)) {
			System.out.println("recuperando de la memoria..."+n);
			return memo.get(n);
		}
		int suma= n+ sumarHasta(n-1);
		memo.put(n, suma);
		System.out.println("memoria actual: "+ memo);
		return suma;
	}
	
	public static void main(String[] args) {
		System.out.println("Resultado: " + sumarHasta(5));
		System.out.println("Resultado: "+ sumarHasta(6));
	}
}
