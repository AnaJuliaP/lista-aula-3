import java.util.Scanner;

public class Exercicio4 {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        int X = entrada.nextInt();

        switch (X){
            case 10:
                System.out.printf("SALA I-15");
            break;
            case 20:
                System.out.printf("SALA I-15");
            break;
            case 30:
                System.out.printf("SALA I-22");
            break;
            default:
                System.out.println("Nenhuma sala disponível");
        }

    }
}
