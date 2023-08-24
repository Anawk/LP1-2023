package entity;

import entity.Produtos;
import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity(name = "pedido")
@Table(name = "pedido")

public class Pedido {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private int Id;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "pessoaId")
    private Pessoa pessoa;



    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "pedido-produto", joinColumns = @JoinColumn(name =  "pedidoId"), inverseJoinColumns = @JoinColumn(name = "produtoId"))
    private List<Produtos>produtos;


    public Pedido(Pessoa pessoa, List<Produtos> produtos) {
        this.pessoa = pessoa;
        this.produtos = produtos;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
        this.pessoa = pessoa;
    }

    public List<Produtos> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produtos> produtos) {
        this.produtos = produtos;
    }

    @Override
    public String toString() {
        return "entity.Pedido{" +
                "Id=" + Id +
                ", Pessoa='" + pessoa + '\'' +
                ", produtos=" + produtos +
                '}';
    }
}



