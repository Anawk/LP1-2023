public abstract class  Gastos {
    private String nome;
    double valor;

    public Gastos(String nome, double valorInicial) {
        this.nome = nome;
        this.valor = valorInicial;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    //constrtores, getters e setters

    public void mudarvalor(double valorNovo){
        this.valor= valorNovo;
    }
}
