/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package myutils;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Raúl Classe de funcions pròpies utils.
 */
public class MyUtils {

    /**
     *
     * @param cadena Strint cadena que es vol invertir
     * @return cadena invertida (null per cadenes nulls).
     */
    public static String inverteix(String cadena) {
        String resultat = "";
        
        
        if (cadena != null) {
            
            for (int i = cadena.length() - 1; i >= 0; i--) {
            resultat += cadena.charAt(i);

        }
            
        } else {
            return resultat = null;
        }
        

        return resultat;
    }

    /**
     *
     * @param day int dia del naixement
     * @param month int mes del naixement
     * @param year int any del naixement
     * @return edat de la persona, per edat>150 retorna -1, per dates
     * impossibles retorna -2
     *
     */
     public static int edat(int day, int month, int year) {
        int resultat = 0;
        Calendar calendari = Calendar.getInstance(), dataNaixement = Calendar.getInstance();
        Date dataActual = calendari.getTime();
        dataNaixement.set(year, month - 1, day);

        // Verificar si la fecha de nacimiento es posterior a la fecha actual
        if (dataNaixement.after(calendari)) {
            return -2; // Retorna -2 para fechas imposibles
        }

        resultat = calendari.get(Calendar.YEAR) - dataNaixement.get(Calendar.YEAR);
        if (dataNaixement.get(Calendar.MONTH) > calendari.get(Calendar.MONTH)
                || (dataNaixement.get(Calendar.MONTH) == calendari.get(Calendar.MONTH)
                        && dataNaixement.get(Calendar.DAY_OF_MONTH) > calendari.get(Calendar.DAY_OF_MONTH))) {
            resultat--;
        }

        // Verificar si la edad calculada supera los 150 años
        if (resultat > 150) {
            return -1; // Retorna -1 para edades mayores de 150 años
        }

        return resultat;
    }

    /**
     *
     *
     * Calcula el factorial de un número.
     *
     * @param numero número del que se calcula el factorial
     * @return retorna el factorial de un número. Si el número es negativo
     * retorna -1.
     */
    public static double factorial(int numero) {
        if (numero < 0) {
            return -1; // Retorna -1 si el número es negativo
        } else if (numero == 0) {
            return 1; // Retorna 1 si el número es 0
        } else {
            double resultado = numero * factorial(numero - 1); // Calcula el factorial 
            return resultado;
        }
    }

}
