import java.util.Scanner;
/**
 * Modela el interfaz para interactuar con el usuario
 * @author - Adrian Vera
 */
public class IUTexto
{
    private Scanner teclado;
    private CalculadoraOctal calculadora;
    private PintorFiguras pintor;

    /**
     * Constructor  
     */
    public IUTexto(CalculadoraOctal calculadora, PintorFiguras pintor)
    {
        this.teclado = new Scanner(System.in);
        this.calculadora = calculadora;
        this.pintor = pintor;
    }

    /**
     * Controla la l√≥gica de la aplicaci√≥n
     */
    public void iniciar()
    {
        this.hacerSumasOctales();
        this.dibujarFiguras();
    }

    /**
     *  - borrar la pantalla
     *  - pedir al usuario un par de n√∫meros
     *  - si los n√∫meros no est√°n en octal mostrar un mensaje
     *  - si los n√∫meros no tienen el mismo n√∫mero de cifras mostrar un mensaje
     *  - si son correctos calcular su suma octal y mostrar el resultado en pantalla
     *  - los pasos anteriores se repiten mientras el usuario quiera (pulsa 'S' o 's')
     *  
     */
    private void hacerSumasOctales()
    {
        String resultado = "S";
        
        do
        {
            new Pantalla().borrarPantalla();
        
            System.out.print("Teclee numero 1: ");
            int num1 = teclado.nextInt();

            System.out.print("Teclee numero 2: ");
            int num2 = teclado.nextInt();
            
            if(new Utilidades().estaEnOctal(num1) && new Utilidades().estaEnOctal(num2))
            {
                if(new Utilidades().contarCifras(num1) == new Utilidades().contarCifras(num2))
                {
                    System.out.print("-----------------------------------------\n");
                    System.out.printf("%30d\n", num1);
                    System.out.printf("%30d\n", num2);
                    System.out.printf("%20s%10d\n", "Suma octal:", this.calculadora.sumarEnOctal(num1, num2));
                }
                else
                {
                    System.out.println("No tienen el mismo n∫ de cifras");
                }
            }
            else
            {
                System.out.println("Alguno de los n˙meros no est· en octal");
            }
    
            teclado.nextLine();
            System.out.print("\n\n\nQuiere hacer otra suma en octal? (S / s)");
        
            resultado = teclado.nextLine();
        
        } while(resultado.equalsIgnoreCase("s"));
    }

    /**
     *  Pide al usuario un valor de altura, 
     *  valida que sea correcto (un valor entre 1 y 10)
     *  y muestra la figura en pantalla
     */

    private void dibujarFiguras()
    {
        new Pantalla().borrarPantalla();

        System.out.println("Ahora dibujar· una figura");
        int resultado = 0;
        
        System.out.print("Altura de la figura? (1-10) ");
        do
        {
            resultado = teclado.nextInt();
            
            if(resultado < 1 || resultado > 10)
            {
                System.out.print("Error, Altura de la figura? (1-10) ");
                resultado = 0;
            }
        } while(resultado == 0);
        
        System.out.print("\n");
        this.pintor.dibujarFigura(resultado);
    }
}
