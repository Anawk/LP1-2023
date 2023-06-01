public class Lazer extends Gastos{
    private boolean importante;

    public Lazer(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public void mudarvalor(double valor) {
        super.mudarvalor(valor + (0.05 * valor));
    }
}
