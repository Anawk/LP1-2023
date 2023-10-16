import java.util.ArrayList;

public class Categoria {

    //Esta classe é responsavel por categorizar tarefas de forma genérica

    private Long id; //Chave identificadora de Categoria
    private String nome; //Nome da categoria
    private ArrayList<Tarefa> tarefas; //Usuário terá uma lista de tarefas que precisará ser feita

    //construtor
    public Categoria(String nome) {
        this.nome = nome;
    }

    //getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }
}
