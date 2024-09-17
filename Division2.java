import java.util.Scanner;
public class Division2 {
    public static void main(String[] args) {
        Scanner division = new Scanner(System.in);
        double dividendo, divisor, resultado;
        System.out.println("Ingresa el primer numero dividendo: ");
        dividendo=division.nextDouble();
        System.out.println("ingresa en segundo numero divisor: ");
        divisor=division.nextDouble();
        resultado= dividendo/divisor;
        System.out.println("el resultado de tu division es: " +resultado);


    }

}
