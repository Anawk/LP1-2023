public class Main {
    public static void main(String[] args) {

        Fixo conta1 = new Fixo("conta de água", 120.90);
        Fixo conta2 = new Fixo("conta de luz", 340.87);
        Fixo conta3 = new Fixo("Telefone", 100.00);

        Lazer cinema= new Lazer("Cinema", 50.00);
        Lazer praia= new Lazer("Praia", 300.00);

        Variavel tenis= new Variavel("Tenis", 300.00, 2);
        Variavel Carro= new Variavel("Carro", 1.00000, 3);

        System.out.println("");

        System.out.println("Conta fixa:");
        System.out.println(conta1.getNome());
        System.out.print("Valor da conta: R$"+ conta1.getValor());

        System.out.println("");
        System.out.println("");

        System.out.println("Lazer:");
        System.out.print("Valor inicial do cinema: R$");
        System.out.println(cinema.getValor());
        cinema.mudarvalor(100.00);
        System.out.print("Valor reajustado do cinema: R$");
        System.out.println(cinema.getValor());
        System.out.println("");

        System.out.print("Valor inicial da praia: R$");
        System.out.println(praia.getValor());
        praia.mudarvalor(500);
        System.out.print("Valor reajustado da praia: R$");
        System.out.println(praia.getValor());
        System.out.println("");

        System.out.println("Contas variáveis:");
        System.out.println(tenis.getNome());
        System.out.println("Valor da conta: R$"+ tenis.getValor());
        System.out.println("Quantidade de parcelas: "+ tenis.getTempoMeses());
    }
}
