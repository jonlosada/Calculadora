/**
 * Clase: Operaciones
 * @author Jon Losada
 * @version 23.01.2023
 * 
 */

package operaciones;
public class Operaciones{
	/**
	 * Metodo para sumar dos valores integer introducidos como parámetros
	 * @param valor1 : Primer valor
	 * @param valor2 : Segundo valor
	 * @return numero : La suma entre los dos valores
	 */
    public int sumar (int valor1, int valor2){
        int numero;
        numero = valor1 + valor2;
        return numero;
    }
    /**
	 * Metodo para restar dos valores integer introducidos como parámetros
	 * @param valor1 Primer valor
	 * @param valor2 Segundo valor
	 * @return numero La resta entre los dos valores
	 */
    public int restar (int valor1, int valor2){
        int numero;
        numero = valor1 - valor2;
        return numero;
    }
    /**
	 * Metodo para multiplicar dos valores integer introducidos como parámetros
	 * @param valor1 Primer valor
	 * @param valor2 Segundo valor
	 * @return numero La multiplicacion entre los dos valores
	 */
    public int multiplicar (int valor1, int valor2){
        int numero;
        numero = valor1 * valor2;
        return numero;
    }
    /**
	 * Metodo para dividir dos valores integer introducidos como parámetros
	 * @param valor1 Primer valor
	 * @param valor2 Segundo valor
	 * @return numero La division entre los dos valores
	 */
    public int dividir (int valor1, int valor2){
        int numero;
        numero = valor1 / valor2;
        return numero;
    }
    /**
	 * Metodo para saber el resto entre los dos valores integer introducidos como parámetros
	 * @param valor1 Primer valor
	 * @param valor2 Segundo valor
	 * @return numero El resto entre los dos valores
	 */
    public int resto (int valor1, int valor2) throws ArithmeticException {
        int numero;
        numero = valor1 % valor2;
        return numero;
    }
}