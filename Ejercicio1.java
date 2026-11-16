package recursividad_ia;


public class Ejercicio1 {
    public static void main(String[] args) {
    	System.out.println("serie de 1 - 5");
		for (int i = 1; i < 6; i++) {
			System.out.println(i);
		}
		System.out.println("serie de 1 - 5");
		for (int i = 5; i >= 1; i--) {
			System.out.println(i);
		}
		System.out.println("sema hasta 5");
		int suma=0;
		for (int i = 0; i <= 5; i++) {
			suma+=i;
		}
		System.out.println(suma);
		System.out.println("pares eimpares hasta 5");
		for (int i = 0; i <= 5; i++) {
			if (i%2==0) {
				System.out.println(i+"par: ");
			}
			else {
				System.out.println(i+"impar");
			}
		}
	}
}
