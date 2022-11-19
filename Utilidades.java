import java.util.Scanner;
/**
 *   Clase de utilidades
 *   Incluye métodos estáticos
 *   
 *   @author - Adrian Vera
 */
public class Utilidades
{
    /**
     * Dado un número n (asumimos positivo)
     * devueve true si está en octal false en otro caso
     * Un nº está en octal si cada una de sus cifras
     * es un valor entre 0 y 7
     * 
     * (usa bucles while)
     */
    public static boolean estaEnOctal(int n)
    {
        int num = n;
        
        while(num != 0)
        {
            if(num % 10 > 7)
            {
                return false;
            }
            
            num /= 10;
        }
        
        return true;
    }

    /**
     * Dado un número n (asumimos positivo)
     * devuelve la cantidad de cifras que tiene
     * 
     * (usa bucles while)
     */
    public static int contarCifras(int n)
    {
        int i = 0;
        
        while(n != 0)
        {
            n /= 10;
            
            i++;
        }
        
        return i;
    }
}
