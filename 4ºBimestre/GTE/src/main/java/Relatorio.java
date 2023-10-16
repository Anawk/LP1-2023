import java.time.LocalDate;

public class Relatorio {

    //Esta classe é responsavel por armazenar informações sobre o progresso e desempenho do usuário.

    private Long id; //Chave identificadora do relatório
    private LocalDate dataGeracao; //Data em que o relatório foi gerado
    private int tarefasConcluidas; //Quantidade de tarefas concluidas
    private int tarefasPendentes; //Quantidade de tarefas pendentes
    private int TotalTarefa; // Soma das Tarefas, soma das pendentes e concluídas;
    private int Desempenho; // Métrica de desempenho


    //construtor
    public Relatorio(LocalDate dataGeracao, int tarefasConcluidas, int tarefasPendentes, int totalTarefa, int desempenho) {
        this.dataGeracao = dataGeracao;
        this.tarefasConcluidas = tarefasConcluidas;
        this.tarefasPendentes = tarefasPendentes;
        TotalTarefa = totalTarefa;
        Desempenho = desempenho;
    }

    //getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDate getDataGeracao() {
        return dataGeracao;
    }

    public void setDataGeracao(LocalDate dataGeracao) {
        this.dataGeracao = dataGeracao;
    }

    public int getTarefasConcluidas() {
        return tarefasConcluidas;
    }

    public void setTarefasConcluidas(int tarefasConcluidas) {
        this.tarefasConcluidas = tarefasConcluidas;
    }

    public int getTarefasPendentes() {
        return tarefasPendentes;
    }

    public void setTarefasPendentes(int tarefasPendentes) {
        this.tarefasPendentes = tarefasPendentes;
    }

    public int getTotalTarefa() {
        return TotalTarefa;
    }

    public void setTotalTarefa(int totalTarefa) {
        TotalTarefa = totalTarefa;
    }

    public int getDesempenho() {
        return Desempenho;
    }

    public void setDesempenho(int desempenho) {
        Desempenho = desempenho;
    }
}
