import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args){
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Digite um numero: ");
        int numero1 = entrada.nextInt();
        System.out.printf("Digite um numero: ");
        int numero2 = entrada.nextInt();
        System.out.printf("Digite um numero: ");
        int numero3 = entrada.nextInt();

        int Zumbis = numero1 + numero2 + numero3;

        System.out.println("Total zumbis derrotados:" + Zumbis/3);

    }
}
