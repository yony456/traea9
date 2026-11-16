package recursividad_ia;

public class Recursivo1 {
    //serie 5 -1 (recursividad)
	static void decrementar(int n) {
		if (n==0) {
			return;//detenemos la recurcividad 
		}
		
		System.out.println(n);//mientras se apila
		decrementar(n-1);
	}
	
	public static void main(String[] args) {
		decrementar(5);
	}
	
}
