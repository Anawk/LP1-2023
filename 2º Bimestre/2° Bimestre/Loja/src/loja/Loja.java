package loja;

import java.util.ArrayList;
import java.util.List;

public class Loja {
    private String nomeloja;
     ArrayList<Clientes> clientes= new ArrayList<Clientes>();
     ArrayList<Pedidos> pedidos= new ArrayList<Pedidos>();

    public Loja(String nomeloja) {
        this.nomeloja= nomeloja;

    }

    public String getNomeloja() {
        return nomeloja;
    }

    public void setNomeloja(String nomeloja) {
        this.nomeloja = nomeloja;
    }

    public void listarcliente(){
        for (int i = 0; i < clientes.size(); i++) { //até o tamanho da variavel
            clientes.get(i).dadoscliente(); //funcao

        }
    }

    public void listarpedidos(){
        for (int i = 0; i < pedidos.size(); i++) { //até o tamanho da variavel
            pedidos.get(i).pedidos(); //funcao

        }
    }

    public void addPedidos(Pedidos pedidos){
        this.pedidos.add(pedidos);
    }

    public void addClientes(Clientes clientes){
        this.clientes.add(clientes);
    }
}
