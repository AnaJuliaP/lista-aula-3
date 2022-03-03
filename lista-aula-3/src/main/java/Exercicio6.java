import java.util.Random;
import java.util.Scanner;

public class Exercicio6 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Random rand = new Random();
        int x = rand.nextInt(10) + 1;

        int  CHUTE= entrada.nextInt();
        do{

            if(x>CHUTE)
                System.out.println("Maior");
            else if(x<CHUTE){
                System.out.println("Menor");
            }

            CHUTE = entrada.nextInt();

        }while(x!=CHUTE);

        System.out.println("Acertou!!!");

    }
}
