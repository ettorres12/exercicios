package lista1;

public class MainPedido {
    public static void main(String[] args) {
        Pedido pedido = new Pedido();

        pedido.aplicarDesconto(500);
        pedido.aplicarDesconto(200);
        pedido.aplicarDesconto(100);
        pedido.aplicarDesconto(600);
    }
}
