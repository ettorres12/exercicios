/*10. Classe GerenciadorVoo
Implemente uma classe PassagemAerea. O método definirAssento deve receber a classe do voo (1
para Econômica, 2 para Executiva, 3 para Primeira Classe). Use switch para imprimir as vantagens
de cada uma e um default para opção inválida. */

package lista1;

import java.util.Scanner;

public class PassagemAerea {

    Scanner leitura = new Scanner(System.in);


    public void definirAssento(){
        System.out.println("Digite a classe do voo: ");
        System.out.println("1 - Economica");
        System.out.println("2 - Executiva");
        System.out.println("3 - Primeira Classe");
        int classe = leitura.nextInt();
        System.out.println("--------------------------");

        switch (classe){
            case 1:
                System.out.println("Classe escolhida: Econômica");
                System.out.println("Beneficios: opção mais básica, " +
                        "focada em transportar o passageiro com conforto essencial e preço mais baixo.");
            break;

            case 2:
                System.out.println("Classe escolhida: Executiva");
                System.out.println("Beneficios: assentos que viram cama (flat-bed), " +
                        "acesso a lounges VIP, " +
                        "embarque e check-in prioritários, " +
                        "além de refeições gourmet e " +
                        "maior franquia de bagagem");
            break;

            case 3:
                System.out.println("Classe escolhida: Primeira Classe");
                System.out.println("Beneficios: poltronas que viram camas, " +
                        "gastronomia de chefs renomados, " +
                        "bebidas premium (como champanhe) e " +
                        "atendimento exclusivo, " +
                        "incluindo salas VIP e " +
                        "check-in prioritário");
            break;

            default:
                System.out.println("Opção incorreta");
            break;
        }
    }
}
