package abstratos;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Moto moto = new Moto();

        System.out.println("CARRO:");

        String resp= carro.desligar("shhh");
        System.out.println(resp);

        String resp1= carro.ligar("vrum vrum");
        System.out.println(resp1);

        System.out.println("");

        System.out.println("MOTO:");

        String resp3=moto.ligar("bololo");
        System.out.println(resp3);

        String resp4=moto.desligar("mimimi");
        System.out.println(resp4);

        System.out.println("");

        System.out.println("NAVIO:");
        String resp5=moto.ligar("brum brum");
        System.out.println(resp5);

        String resp6=moto.desligar("silencio");
        System.out.println(resp6);

    }
}
