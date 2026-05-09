/*6. Classe TabuadaDinamica
Crie uma classe “Tabuada”. O método “imprimirTabuada” deve receber um número de 1 a 10
e imprimir a tabuada de multiplicação desse número (de 1 a 10).*/

package lista2;

import java.util.Scanner;

public class Tabuada {
    Scanner leitura = new Scanner(System.in);

    public void imprimirTabuada(){
        int numero;
        boolean valido = true;

        while (valido) {

            System.out.println("Digite um numero de 1 a 10: ");
            numero = leitura.nextInt();

            if(numero > 0 && numero <= 10){
                for(int i =1; i <= 10; i++){
                    int resultado = numero * i;

                    System.out.println(numero + " x " + i + " = " + resultado);
                    System.out.println("----------------------------------------");
                }
                valido = false;
            }else {
                System.out.println("Numero fora do intervalo");
            }

        }

    }
}
