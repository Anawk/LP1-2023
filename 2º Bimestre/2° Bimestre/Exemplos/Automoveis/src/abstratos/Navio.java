package abstratos;

public class Navio implements Motor {
    @Override
    public String ligar(String ok) {
        return "Navio ligado: "+ ok;
    }

    @Override
    public String desligar(String mimi) {
        return "Navio desligado: "+ mimi;
    }
}
