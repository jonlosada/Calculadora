/**
 * Clase: Menu
 * @author Jon Losada
 * @version 23.01.2023
 * 
 */

package menu;
import java.util.Scanner;
public class Menu {
    private static Scanner teclado = new Scanner(System.in);
    
    /**
     * Pide 2 enteros por teclado y los almacena en un array
     * @return Array de los 2 enteros
     */
    public int[] pedirNumeros(){
        int[] ret = new int[2];
        System.out.print ("Operando 1: ");
        ret [0] = teclado.nextInt();
        System.out.print ("Operando 2: ");
        ret [1] = teclado.nextInt();
        return ret;
    }
    
    /**
     * Pedimos un string para saber qué operación vamos a realizar. En caso de introducir otra cosa, seguir pidiendo.
     * @param ret String vacio para rellenarlo con la operacion
     * @return String con la operación
     */
    public String menuOpciones() {
        String ret = "";
        do {
            System.out.print ("Operaciones [+, -, *, /, %]: ");
            ret = teclado.next();
        } while (!((ret.equalsIgnoreCase("+")) || (ret.equalsIgnoreCase("-")) ||
                (ret.equalsIgnoreCase("*")) || (ret.equalsIgnoreCase("/")) ||
                (ret.equalsIgnoreCase("%"))
                ));
                return ret;
    }
    
    /**
     * Preguntamos si el usuario quiere seguir trabajando con la calculadora, devolviendo un true si es asi y false en caso contrario.
     * @param respuesta String que vamos a pedir por teclado, para saber si la respuesta es un si o un no.
     * @param ret Booleano para saber si la respuesta ha sido un si
     * @return Booleano ret
     */
    public boolean repetir(){
        boolean ret = false;
        String respuesta;
        do {
            System.out.print ("�Desea continuar trabajando con la calculadora? [s / n]");
            respuesta = teclado.next();
        } while (!((respuesta.equalsIgnoreCase("s")) || (respuesta.equalsIgnoreCase("n"))
                    ));
                    
        if (respuesta.equalsIgnoreCase("s")){
            ret = true;
        }
        return ret;
    }
}