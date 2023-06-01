public class Pedidos {
   public String cliente, produto, valor;
    int cod;

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public Pedidos(String produto, int cod, String valor){

        this.produto= produto;
        this.cod= cod;
        this.valor=valor;



    }

    public void pedidoscamiseta(){
        System.out.println("Dados do pedido:");
        System.out.println("Produto: "+ this.produto+ "  || Código: "+ this.cod+ "  || Valor: "+ this.valor);
    }

}
