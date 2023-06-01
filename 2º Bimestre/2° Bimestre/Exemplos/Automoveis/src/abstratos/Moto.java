package abstratos;

public class Moto implements Motor {

    @Override
    public String ligar(String ok) {
        return "Moto ligada: "+ ok;
    }

    @Override
    public String desligar(String mimi) {
        return "Moto desligada: "+ mimi;
    }

}
