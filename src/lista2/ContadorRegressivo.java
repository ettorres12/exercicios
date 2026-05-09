/*1. Classe ContadorRegressivo
Crie uma classe que simule uma contagem regressiva para o lançamento de um foguete. O
método “iniciarContagem” deve receber um número inteiro positivo e usar um laço para
imprimir os números em ordem decrescente até zero, imprimindo "FOGO!!!" ao final.*/

package lista2;

public class ContadorRegressivo {

    public void iniciarContagem(int tempo){
        System.out.println("---Iniciando contagem---");
        while (tempo > 0){
            System.out.println(tempo);
            tempo--;
        }
        System.out.println("Fogo!!");
    }


}
