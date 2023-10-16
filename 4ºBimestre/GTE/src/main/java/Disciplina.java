import java.util.ArrayList;

public class Disciplina {

    //Esta classe é responsavel por representar uma disciplina escolar

    private Long id; //Chave identificadora do usuario
    private String nome; //Nome da Disciplina
    private ArrayList<Tarefa> tarefas; //Usuário terá uma lista de tarefas que precisará ser feita


    //construtor
    public Disciplina(String nome) {
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
