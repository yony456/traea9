package recursividad_ia;



public class Ejercicio2 {
   //implementación de una función de retorno de tipo String
		public static String dibujarCuadradado(int t) {
			String cuadrado="";
			for (int i = 1; i <= t; i++) {
				for (int j = 1; j <= t; j++) {
					cuadrado+="*";
				}
				cuadrado+="\n";
			}
			return cuadrado;
		}
		//implementación de un procedimiento
		public static void cuadrado(int t) {
			for (int i = 1; i <= t; i++) {
				for (int j = 1; j <= t; j++) {
					System.out.print("*");
				}
				System.out.print("\n");
			}
		}
		public static void main(String[] args) {
			//Consumo de nuestra función de retorno (Utilizamos println ya que el retorno es interno)
			//System.out.println(dibujarCuadradado(5));
			//JOptionPane.showMessageDialog(null, dibujarCuadradado(3));
			//Consumo de nuestro procedimiento (En este caso ya imprime, por lo que no se requiere print)
			cuadrado(3);
		}	
}
