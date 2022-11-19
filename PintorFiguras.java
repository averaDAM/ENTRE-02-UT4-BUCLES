/**
 *  Clase que dibuja una figura 
 * 
 * @author - Adrian Vera
 *  
 */
public class PintorFiguras
{
    private static final int ANCHO_BLOQUE = 4;
    private static final char ESPACIO = ' ';
    private static final char CAR1 = 'B';
    private static final char CAR2 = '=';
    
    /**
     * Dibuja una figura (ver enunciado) de altura
     * indicada (se asume la altura un valor correcto)
     * 
     * (usa bucles for)
     */
    public void dibujarFigura(int altura)
    {
        for (int i = 1; i <= altura; i++)
        {
            for(int w = 1; w <= altura - i; w++)
            {
                System.out.print(ESPACIO);
                System.out.print(ESPACIO);
            };
            
            for(int k = 1; k <= i ; k++)
            {
                if(k % 2 == 0)
                {
                    this.escribirCaracter(CAR2, ANCHO_BLOQUE);
                    continue;
                }
                
                this.escribirCaracter(CAR1, ANCHO_BLOQUE);   
            }
            System.out.print("\n");
        }
        
        System.out.print("\n");
    }

    /**
     * Método privado de ayuda que escribe n veces un caracter en la misma línea, sin saltos de línea
     */
    private void escribirCaracter(char caracter, int n)
    {
        for(int i = 0; i < n; i++)
        {
            System.out.print(caracter);
        }
    }
}
