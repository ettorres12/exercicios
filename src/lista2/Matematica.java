/*10. Classe CalculadoraFatorial
 Crie uma classe “Matematica”. O método “calcularFatorial” deve receber um número inteiro e
 calcular o seu fatorial (ex: 5! = 5 * 4 * 3 * 2 * 1) utilizando um laço de repetição e exibindo o
 resultado.*/

package lista2;

import java.util.Scanner;

public class Matematica {
    Scanner leitura = new Scanner(System.in);

    public void calcularFatorial(){
        int resultado;
        System.out.println("Digite um numero inteiro: ");
        int numero = leitura.nextInt();
        resultado = numero;

        for(int i = (numero-1); i> 0; i--){
            resultado = resultado * i;
        }
        System.out.println("O fatorial do numero " + numero + " é: " + resultado);


    }
}
