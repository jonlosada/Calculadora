
package principal;

import java.io.IOException;
import java.util.logging.ConsoleHandler;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

import menu.Menu;
import operaciones.Operaciones;

/**
 * Clase Calculadora
 * 
 * @author Jon Losada
 * @version 23.01.2023
 * 
 */
public class Calculadora {
	private static final Logger LOGGER = Logger.getLogger(Calculadora.class.getName());

	public static void main(String[] args) {

		Handler consoleHandler = null;
		Handler fileHandler = null;
		try {
			consoleHandler = new ConsoleHandler();
			fileHandler = new FileHandler("./operaciones.log");
			LOGGER.addHandler(consoleHandler);
			LOGGER.addHandler(fileHandler);
			LOGGER.setUseParentHandlers(false);
			consoleHandler.setLevel(Level.ALL);
			fileHandler.setLevel(Level.ALL);
			LOGGER.setLevel(Level.ALL);
		} catch (IOException exception) {
			LOGGER.log(Level.SEVERE, "Ocurrió un error en FileHandler.", exception);
		}
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
				LOGGER.log(Level.FINE, "Operacion SUMA realizada");
			} else if (operacion.equalsIgnoreCase("-")) {
				resultado = operaciones.restar(operandos[0], operandos[1]);
				System.out.println("Resultado: " + resultado);
				LOGGER.log(Level.FINE, "Operacion RESTA realizada");
			} else if (operacion.equalsIgnoreCase("*")) {
				resultado = operaciones.multiplicar(operandos[0], operandos[1]);
				System.out.println("Resultado: " + resultado);
				LOGGER.log(Level.FINE, "Operacion MULTIPLICACION realizada");
			} else if (operacion.equalsIgnoreCase("/")) {
				/**
				 * @param resultado El nuevo resultado de la division.
				 * @throws ArithmeticException Si el operando2 es 0
				 */
				try {
					resultado = operaciones.dividir(operandos[0], operandos[1]);
					System.out.println("Resultado: " + resultado);
					LOGGER.log(Level.FINE, "Operacion DIVISION realizada");

				} catch (ArithmeticException e) {
					System.out.println("Error aritmetico: " + e.getMessage());
					LOGGER.log(Level.WARNING, "¡DIVISION ENTRE CERO!");
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