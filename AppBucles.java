import java.util.Scanner;

/**
 *  @author - Adrian Vera
 *  
 * Punto de entrada a la aplicación
 *  
 */
public class AppBucles
{
    /**
     *  Punto de entrada a la aplicacion. 
     *  
     *  
     */
    public static void main(String[] args)
    {
        IUTexto interfaz = new IUTexto(new CalculadoraOctal(), new PintorFiguras());
        interfaz.iniciar();
    }
}

