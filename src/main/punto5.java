package main;
import java.util.Scanner;

public class punto5
{
    public static void main(String[] args)
    {
        Scanner teclado = new Scanner(System.in);

        double peso, estatura, imc;

        System.out.println("Ingrese su peso en KG (Ej: 70) ");
        peso = teclado.nextDouble();

        System.out.println("Ingrese su estatura en M (Ej: 1,75): ");
        estatura = teclado.nextDouble();

        imc = peso/(estatura*estatura);

        System.out.println("SU IMC ES: " + imc);

        if (imc<18.5)
        {
            System.out.println("Bajo peso");
        }
        else if (imc>=18.5 && imc<=24.9)
        {
            System.out.println("Normal");
        }
        else if (imc>=25 && imc<=29.9)
        {
            System.out.println("Sobrepeso");
        }
        else {
            System.out.println("Obesidad");
        }
    }
}
