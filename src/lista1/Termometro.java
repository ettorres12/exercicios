/*6. Classe ConversorTemperatura
Escreva uma classe Termometro com um método que converta Celsius para Fahrenheit ou Kelvin. O
usuário deve passar o valor e a escala de destino. Use switch para a escolha da fórmula e if para
impedir temperaturas abaixo do zero absoluto em Kelvin.*/

package lista1;

import java.util.Scanner;

public class Termometro {
    Scanner leitura = new Scanner(System.in);
    public void Converter(){

        System.out.println("Digite para qual escala quer converter: ");
        System.out.println("F -  Fahrenheit, K - Kelvin");
        String tipo = leitura.nextLine();
        System.out.println("------------------------------------------");
        System.out.println("Digite o valor em celsius que quer converter: ");
        int valor = leitura.nextInt();

        switch (tipo){
            case "F":
                double Fahrenheit = (valor * 1.8) + 32;
                System.out.println("O valor em Fahrenheit é: ");
                System.out.println(Fahrenheit);
                break;
            case "K":
                double Kelvin = valor + 273;
                System.out.println("O valor em Kelvin é: ");
                System.out.println(Kelvin);
                break;
            default:
                System.out.println("Tipo incorreto");
        }
    }
}
