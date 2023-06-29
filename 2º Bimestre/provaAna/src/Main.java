import Model.Orcamento;
import Model.ItemPedido;
import Model.Pedido;


public class Main {
    public static void main(String[] args) throws Exception {


        ItemPedido itemPedido = new ItemPedido("Crooped", "Praia", "M", 80.0);
        itemPedido.exibir(true);
        itemPedido.exibir(false);

        Orcamento orcamento = new Orcamento();
        orcamento.addItem(itemPedido);
        orcamento.exibir(true);
        orcamento.exibir(false);

        //add outro pedido
        ItemPedido itemPedido2 = new ItemPedido("Saia", "Esportivo", "P", 110.0);
        orcamento.addItem(itemPedido2);
        orcamento.exibir(true);


        //exceção
        try {
            orcamento.removerItem(itemPedido2, itemPedido2.getId());
            orcamento.exibir(true);
        } catch (RuntimeException exception) {
            System.out.println("O item que você deseja remover não foi encontrado!");
        }


        //criando pedido
        Pedido pedido;
        pedido = new Pedido("04/09/2023");

        pedido.exibir(true);
        pedido.exibir(false);
        pedido.addItem(itemPedido);

        //entregar pedido
        pedido.entregar();
        //pedido reduzido
        pedido.exibir(false);


        //exceção
        try {
            pedido.entregar();
        } catch (Exception exception) {
            System.out.println("O pedido escolhido já foi entregue!");
        }
        pedido.exibir(false);

    }
}
