import java.util.ArrayList;

public class Usuario {

    //Esta classe é responsavel pela autenticação do usuário

    //Atributos da classe Usuario
    private Long Id; //Chave identificadora do usuario
    private String Username; //Nome de usuario do usuario
    private String Password; //Senha do usuario para login
    private String Email; // Correio eletronico do usuario para login
    private String Nome; //Primeiro nome do usuario
    private String Sobrenome; // Sobrenome do usuario
    private ArrayList<Tarefa>tarefas; //Usuário terá uma lista de tarefas que precisará ser feita


    //construtor
    public Usuario(String username, String password, String email, String nome, String sobrenome, ArrayList<Tarefa> tarefas) {
        Username = username;
        Password = password;
        Email = email;
        Nome = nome;
        Sobrenome = sobrenome;
        this.tarefas = tarefas;
    }

    //getters e setters
    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String username) {
        Username = username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String password) {
        Password = password;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public String getNome() {
        return Nome;
    }

    public void setNome(String nome) {
        Nome = nome;
    }

    public String getSobrenome() {
        return Sobrenome;
    }

    public void setSobrenome(String sobrenome) {
        Sobrenome = sobrenome;
    }

    public ArrayList<Tarefa> getTarefas() {
        return tarefas;
    }

    public void setTarefas(ArrayList<Tarefa> tarefas) {
        this.tarefas = tarefas;
    }


}
