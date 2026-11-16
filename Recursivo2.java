package recursividad_ia;

public class Recursivo2 {
    //sumarHasta
	static int sumarHasta(int n) {
		if (n==0) {//caso base
			return 1;//detenemos recursividad
		}
		int suma= n+ sumarHasta(n-1);//llamada recurciva y reduccion del problema
		return suma;
	}
	
	static int factorial(int n) {
		if (n==1) {//caso base
			return 1;//detenemos recursividad
		}
		int factorial= n* factorial(n-1);//llamada recurciva y reduccion del problema
		return factorial;
	}
	
	public static void main(String[] args) {
		//consumiendo la suma
		System.out.println(sumarHasta(5));
		//consumiendo el factorial recursivo
		System.out.println(factorial(5));
	}
}
// retorno por que no se usa void al inicio 