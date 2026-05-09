/*4. Classe SistemaPedagio
Implemente uma classe Pedagio com um método calcularTarifa. O usuário informa o tipo de veículo
(C - Carro, M - Moto, C - Caminhão). Use switch para definir os valores: Moto (R$ 5,00), Carro (R$
10,00) e Caminhão (R$ 20,00).*/

package lista1;

import java.util.Scanner;

public class Pedagio {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o tipo de veiculo: ");
        System.out.println("C - CARRO, M - MOTO, CAM - CAMINHÃO");
        String tipo = leitura.nextLine();
        System.out.println("-------------------------------------");

        switch (tipo){
            case "M":
                System.out.println("O valor para moto é R$ 5,00 ");
                break;
            case "C":
                System.out.println("O valor para carro é R$ 10,00 ");
                break;
            case "CAM":
                System.out.println("O valor para caminhão é R$ 20,00 ");
                break;
            default:
                System.out.println("Tipo incorreto");
                break;
        }

    }
}
