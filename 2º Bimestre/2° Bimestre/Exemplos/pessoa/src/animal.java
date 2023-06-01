public class animal {
    public String nome;
    public int idade;
    public String barulho;

    public animal(String nome, int idade, String barulho) {
        System.out.println("criei um animal");

        this.nome = nome;
        this.idade=idade;
        this.barulho=barulho;
    }

    public animal() {

    }

    public void fazerbarulho(){
        System.out.println("O meu barulho é: "+ this.barulho);
    }

    public int envelhecer(){
        System.out.print("A minha idade é: " );
        this.idade++;
        return this.idade;

    }

    public void nome(){
        System.out.println("meu nome é: "+ this.nome);
    }
}