package loja;

public class Pedidos {
    private String produto;
    private double valor;
    private Clientes cliente;
    private int cod;

    public Pedidos(String produto, double valor, Clientes cliente, int cod) {
        this.produto = produto;
        this.valor = valor;
        this.cliente = cliente;
        this.cod = cod;
    }

    public String getProduto() {
        return produto;
    }

    public double getValor() {
        return valor;
    }

    public Clientes getCliente() {
        return cliente;
    }

    public int getCod() {
        return cod;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public void setCliente(Clientes cliente) {
        this.cliente = cliente;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public void pedidos(){
        System.out.println("Dados do pedido:");
        System.out.println("Produto: "+ this.produto+ "  || Código: "+ this.cod+ "  || Valor: "+ this.valor);
        System.out.println("");
    }
}
