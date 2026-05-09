/*2. Classe SomadorIterativo
Desenvolva uma classe “Somador” com um método “somarAteN”. O usuário informa um
número “N” e o método deve somar todos os números inteiros de 1 até “N” e exibir o
resultado.
*
 Conceito: Comando “for” e acumuladores. */

package lista2;

import java.util.Scanner;

public class Somador {

    Scanner leitura = new Scanner(System.in);

    public void somarAteN(){
        int N;
        System.out.println("Digite um valor: ");
        N = leitura.nextInt();

        for (int i = 1; i <= N; i++) {
            System.out.println(i);
        }
    }
}
