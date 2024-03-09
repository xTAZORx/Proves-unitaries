/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package myutils;

import java.util.Calendar;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author CFGS
 */
public class MyUtilsTest {

    @Test
    public void testInverteix() { //Invierte la cadena
        System.out.println("Hola Mundo");
        String expResult = "odnuM aloH";
        String result = MyUtils.inverteix("Hola Mundo");
        assertEquals(expResult, result);
        
        result = MyUtils.inverteix(null);
        expResult = null;
        assertEquals(expResult, result);
        
        result = MyUtils.inverteix("123456789");
        expResult = "987654321";
        assertEquals(expResult, result);

    }
    
    @Test
    public void testEdat() { //Calcula la edad en base a la fecha proporcionada
        
        int edad1 = MyUtils.edat(15, 02, 1993);
        assertEquals(31, edad1);

        int edad2 = MyUtils.edat(15, 02, 1600);
        assertEquals(-1, edad2);

        int edad3 = MyUtils.edat(15, 2, 2030);
        assertEquals(-2, edad3); 
        
       
        
    }
    
    @Test
    public void testFactorial() { //Calcular el factorial en base al parámetro de entrada
        
        double factorial1= MyUtils.factorial(5);
        assertEquals(120.0, factorial1);
        
        double factorial2= MyUtils.factorial(0);
        assertEquals(1.0, factorial2);
        
        double factorial3= MyUtils.factorial(-10);
        assertEquals(-1.0, factorial3);
        
    }
   

    
}
