public class main {
    public static void main(String[] args) {
        pessoa pessoa1=new pessoa();
        pessoa pessoa=new pessoa("isabella", 16);
        pessoa.apresentar();

        animal animal1= new animal();
        animal animal=new animal("gatinha", 2, "miau");
        animal.nome();
        animal.fazerbarulho();
        System.out.print(animal.envelhecer());


    }
}