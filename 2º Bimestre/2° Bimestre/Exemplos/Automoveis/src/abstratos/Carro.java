package abstratos;

public class Carro implements Motor {
    @Override
    public String ligar(String ok) {
        return "Carro ligado: "+ ok;
    }

    @Override
    public String desligar(String mimi) {
        return "Carro desligado: "+ mimi;
    }
}

