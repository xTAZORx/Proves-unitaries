package myutils;

public class Main {

  
    public static void main(String[] args) {
        String cadena_Invertida = null;
        int dia = -400, mes = 02, anyo = 1993, edad = 0;
        int numFactorial = 3;
        
        cadena_Invertida = MyUtils.inverteix(null);
        System.out.println(cadena_Invertida);
        
        edad = MyUtils.edat(dia, mes, anyo);
        
        System.out.println(edad);
        
        System.out.println(MyUtils.factorial(numFactorial));
        
        
        
        
        
    }
    
}
