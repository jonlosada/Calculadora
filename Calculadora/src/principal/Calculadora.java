
package principal;

import menu.Menu;
import operaciones.Operaciones;
/**
 * Clase Calculadora
 * @author Jon Losada
 * @version 23.01.2023
 * 
 */
public class Calculadora {
	public static void main(String[] args) {
		/**
		 * @param resultado Integer con el valor 0
		 * @param operacion String vacio
		 * @param operandos Array de dos enteros
		 * 
		 */
		int resultado = 0;
		String operacion = "";
		int[] operandos = new int[2];

		/**
		 * Mediante la clase Menu y la clase Operaciones, obtenemos los operandos y las
		 * operaciones. Después mediante un if preguntamos que operación ha introducido
		 * y la realizamos añadiendo el resultado en la variable resultado
		 * 
		 */
		Menu menu = new Menu();
		Operaciones operaciones = new Operaciones();
		do {
			operandos = menu.pedirNumeros();
			operacion = menu.menuOpciones();
			if (operacion.equalsIgnoreCase("+")) {
				resultado = operaciones.sumar(operandos[0], operandos[1]);
				System.out.println("Resultado: " + resultado);
			} else if (operacion.equalsIgnoreCase("-")) {
				resultado = operaciones.restar(operandos[0], operandos[1]);
				System.out.println("Resultado: " + resultado);
			} else if (operacion.equalsIgnoreCase("*")) {
				resultado = operaciones.multiplicar(operandos[0], operandos[1]);
				System.out.println("Resultado: " + resultado);
			} else if (operacion.equalsIgnoreCase("/")) {
				/**
				 * @param resultado El nuevo resultado de la division.
				 * @throws ArithmeticException Si el operando2 es 0
				 */
				try {
					resultado = operaciones.dividir(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);

				} catch (ArithmeticException e) {
					System.out.println("Error aritmetico: " + e.getMessage());
				}

			} else if (operacion.equalsIgnoreCase("%")) {
				resultado = operaciones.resto(operandos[0], operandos[1]);
				System.out.println("Resultado: " + resultado);
			} else {
				System.out.println("Operaci�n no v�lida");
			}

		} while (menu.repetir());
	}
}