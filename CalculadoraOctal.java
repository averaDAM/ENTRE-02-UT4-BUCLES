/**
 *  Representa a una calcualdora que hace sumas octales
 * 
 * @author - Adrian Vera
 * 
 */
public class CalculadoraOctal
{
    /**
     * sumar dos nºs supuestos en base 8 y con el mismo
     * nº de cifras
     * Asumimos positivos
     */
    public static int sumarEnOctal(int n1, int n2)
    {
        int cifrasN1 = new Utilidades().contarCifras(n1);
        int resultadoOctal = 0;
        int i = 0;
                
        // Valor donde se guarda la operacion
        int auxiliar = 0;
        
        // Sumatorio si el numero es mayor a 7
        int add = 0;
        
        // Posicion en el entero
        int posicion = 1;
        
        while(n1 != 0 || n2 != 0)
        {
            auxiliar = (n1 % 10) + (n2 % 10) + add;
            
            add = 0;
            
            if(auxiliar > 7)
            {
                auxiliar -= 8;
                add++;
            }
            
            resultadoOctal += auxiliar * posicion;
            
            posicion *= 10;
            
            n1 /= 10;
            n2 /= 10;
        }
        
        return resultadoOctal + (add * posicion);
    }
}
