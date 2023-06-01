public class pessoa {
    public String nome;
    public int idade;

    public pessoa(){} //pessoa vazia (construtor)

    public pessoa(String nome, int idade){  //criando um construtor  //dentro dos () estão os objetos (nome e idade)
        System.out.println("Criei uma pessoa");
        this.nome = nome; //this é a variável do atributo //atributo nome
        this.idade= idade;  //atributo idade
    }

    public void apresentar() {
        System.out.println("Olá! meu nome é: " + this.nome + " eu tenho: " + this.idade + " anos. "); //exibindo idade e nome
        System.out.println("");
        System.out.println("");
    }

}