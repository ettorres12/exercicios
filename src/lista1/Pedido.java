/*Classe CalculadoraDesconto
Crie uma classe Pedido. O método aplicarDesconto deve receber o valor total da compra. Se for
acima de R$ 500,00, aplica 15% de desconto; entre R$ 200,00 e R$ 500,00, aplica 10%; abaixo
disso, nenhum desconto. */

package lista1;

public class Pedido {
    public void aplicarDesconto(double valorTotal){
        if(valorTotal > 500.00){
            double valorFinal = valorTotal - (valorTotal * 0.15);
            System.out.println("O valor final com desconto é: ");
            System.out.println(valorFinal);
        } else if (valorTotal >= 200 && valorTotal <= 500) {
            double valorFinal = valorTotal - (valorTotal * 0.10);
            System.out.println("O valor final com desconto é: ");
            System.out.println(valorFinal);
        }else {
            System.out.println("Esse valor não é aplicavel desconto");
        }
    }
    
}
