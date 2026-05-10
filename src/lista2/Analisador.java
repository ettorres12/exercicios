/*9. Classe AnalisadorPares
Desenvolva uma classe “Analisador”. O método “somarPares” deve receber um limite máximo
e somar apenas os números pares de 0 até o limite máximo estabelecido. */

package lista2;

public class Analisador {
    public void somarPares(int limiteMax){
        int contador = 0;

        if(limiteMax < 0){
            System.out.println("Digite um numero positivo");
        }else{
            for(int i = 0; i <= limiteMax; i++){
                if(i % 2 == 0){
                    contador += i;
                }
            }
            System.out.println("A soma dos numeros é: " + contador);
        }
    }
}
