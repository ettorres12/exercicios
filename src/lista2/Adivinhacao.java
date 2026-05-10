/*8. Classe JogoAdivinhacao
Crie uma classe “Adivinhacao”. O programa gera um número aleatório (use “Math.random()”)
entre 1 e 10. O método pede para o usuário chutar o número e só para quando ele acertar,
informando no final quantas tentativas foram necessárias. */

package lista2;

import java.util.Scanner;

public class Adivinhacao {

    Scanner leitura = new Scanner(System.in);

    public void chute(){

        int x = (int) (Math.random() * 10) + 1;
        int chute;

        do{
            System.out.println("Chute um valor entre 1 e 10: ");
            chute = leitura.nextInt();
        }while (chute != x);

        System.out.println("Acertou!!");

    }
}
