/*3. Classe MenuOpcoes
Implemente uma classe “Menu” com um método “exibirMenu”. O método deve imprimir
opções de 1 a 3 e a opção 0 para sair. O menu deve continuar sendo exibido e lendo a opção
do usuário até que ele digite 0. Garanta que o menu seja exibido pelo menos uma vez. */

package lista2;

import java.util.Scanner;

public class Menu {
    Scanner leitura = new Scanner(System.in);

    public void exibirMenu(){
        int opcao = -1;

        do{
            System.out.println("Digite a opção desejada");
            System.out.println("-----MENU----");
            System.out.println("1 - Depositar");
            System.out.println("2 - Sacar");
            System.out.println("3 - COnsultar saldo");
            System.out.println("0 - Sair");
            opcao = leitura.nextInt();

            if(opcao == 0){
                System.out.println("Operação encerrada");
            }

        } while (opcao != 0);

        }
    }
