package main;
import java.util.Scanner;

public class punto1
{
    public static void main(String[] args)
    {
        int numero, resultado = 0, resto;

        Scanner s = new Scanner( System.in );
        System.out.println( "Ingrese un número entre 0 y 9999: " );

        numero = s.nextInt();

        if(numero >= 0 && numero <= 9999)
        {
            while( numero > 0 )
            {
                resto = numero % 10;
                resultado = resultado * 10 + resto;
                numero /= 10;
            }

            System.out.println( "Número invertido: " + resultado);
        }
        else
        {
            System.out.println("Solo numeros entre 0 y 9999!.");
        }
    }

}
