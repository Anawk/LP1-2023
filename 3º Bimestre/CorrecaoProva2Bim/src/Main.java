import model.*;

public class Main {
    public static void main(String[] args) throws Exception {

        ItemPedido i1 = new ItemPedido("Camiseta", "Oversized", "M", 99.00);
        i1.exibir(true);
        i1.exibir(false);

        Orcamento o = new Orcamento();
        o.addItem(i1);
        System.out.println();
        o.exibir(true);
        System.out.println();
        o.exibir(false);

        ItemPedido i2 = new ItemPedido("Calça", "Cargo", "M", 160.00);
        o.addItem(i2);
        System.out.println();
        o.exibir(true);
        System.out.println();
        o.removerItem(2L);
        o.exibir(true);

        o.removerItem(19L);
        o.exibir(true);

        Pedido pedido = new Pedido("31/08/2023");
        pedido.addItem(i2);
        System.out.println();
        pedido.exibir(true);
        System.out.println();
        pedido.exibir(false);

        pedido.entregar();
        System.out.println();
        pedido.exibir(false);
        System.out.println();
        pedido.entregar();
        pedido.exibir(false);
    }
}
