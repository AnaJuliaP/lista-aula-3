import java.util.Scanner;

public class Exercicio3 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.printf("Insira notas do auluno");
        double NP1 = entrada.nextDouble(), NP2 = entrada.nextDouble();
        double NPA = 0,  NFA = 0;

        NPA = (NP1 + NP2) / 2;

        if (NPA >= 60) {
            System.out.printf("Aprovado!");

        } else {
            System.out.println("Insira nota NP3");
            double NP3 = entrada.nextDouble();
            NFA = (NPA + NP3) / 2;
            if (NFA >= 50) {
                System.out.println("Aprovado");
            } else {
                System.out.println("Reprovado");
            }
        }

    }
}
