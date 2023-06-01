package loja;

import jdk.swing.interop.SwingInterOpUtils;
import loja.Clientes;
import loja.Loja;

import java.util.ArrayList;
import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Loja Loja = new Loja("Blue");
        System.out.println("");
        System.out.println("************************************************************************************************************");
        System.out.println("Bem-vindo à "+ Loja.getNomeloja());
        System.out.println("************************************************************************************************************");
        System.out.println("");

        Clientes clientes= new Clientes("Isabella  ||", "453.654.064-98  ||", "(11)99665-9657");
        Clientes clientes2 = new Clientes("Milhozinho  ||", "123.123.123-22  ||", "(11)99923-8743");
        Clientes clientes3 = new Clientes("Lelet  ||", "465.473.968-96  ||", "(11)99453-6443");
        Clientes clientes4 = new Clientes("Luquinhas  ||", "505.653.078-21  ||", "(75)98878-0914");

        Pedidos pedidos= new Pedidos("camiseta azul", 29.99, clientes, 111);
        Pedidos pedidos2 = new Pedidos("camiseta rosa", 29.99, clientes2, 222);
        Pedidos pedidos3 = new Pedidos("body azul", 59.99, clientes3, 333);
        Pedidos pedidos4 = new Pedidos("camiseta vermelha", 59.99, clientes4, 444);



        Loja.addClientes(clientes);
        Loja.addClientes(clientes2);
        Loja.addClientes(clientes3);
        Loja.addClientes(clientes4);


        Loja.addPedidos(pedidos);
        Loja.addPedidos(pedidos2);
        Loja.addPedidos(pedidos3);
        Loja.addPedidos(pedidos3);

        Loja.listarcliente();
        Loja.listarpedidos();

    }
}