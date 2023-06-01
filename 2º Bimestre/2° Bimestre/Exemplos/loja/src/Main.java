public class Main {
    public static void main(String[] args) {

        Loja Loja=new Loja("blue", "isa", "roupas");
        Clientes Clientes= new Clientes("Milhomem  ||", "123.123.123-22  ||", "(11)99923-8743");
        Pedidos Pedidos= new Pedidos("camiseta azul", 222, "R$49,99");

        Clientes Clientes2= new Clientes("Lelet  ||", "465.473.968-96  ||", "(11)99453-6443");
        Pedidos Pedidos2= new Pedidos("body azul", 333, "R$29,99");


        Loja.loja();
        Clientes.dadoscliente();
        Pedidos.pedidoscamiseta();
    }
}