package Model;


public class Pedido extends Orcamento {
    private String dataEntrega;
    private boolean entregue = false;


  //exibindo o orçamento completo
    @Override
    public void exibir(boolean completa) {
        String entregueString;
        if(entregue)
            entregueString = "Entregue";
        else
            entregueString = "Não Entregue";

        if (completa){
            System.out.println("Pedido: " + getId());
            System.out.println("Itens: ");
            for (ItemPedido item : itens) {
                System.out.printf("%s, %s, %s, R$%f", item.getPeca(), item.getModelo(), item.getTamanho(), item.getValor());
            }
            System.out.println("Data de entrega: " + dataEntrega);


            System.out.println("Situação: " + entregueString);
            System.out.println("Valor Total: " + getValorTotal());

        }
        else{
            System.out.printf("%d, %s, %s, R$%f", getId(), dataEntrega, entregueString, getValorTotal());
        }
        System.out.println();
    }

    //exceção
    public void entregar() throws Exception{
        if(entregue) throw new Exception("O pedido já foi entregue!");
        entregue = true;
    }

   //construtor
    public Pedido(String dataEntrega) {
        this.dataEntrega = dataEntrega;

    }


    //getters e setters
    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }

    public String getDataEntrega() {
        return dataEntrega;
    }

    public boolean isEntregue() {
        return entregue;
    }

}
