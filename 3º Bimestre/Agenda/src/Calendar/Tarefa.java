package Calendar;
import java.text.SimpleDateFormat;
import java.util.*;

public class Tarefa {
    private String descricao;
    private Date data;

    public Tarefa(String descricao, Date data) {
        this.descricao = descricao;
        this.data = data;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }


    public boolean ocorreNaData(Date data) {
        Calendar calTarefa = Calendar.getInstance();
        calTarefa.setTime(this.data);

        Calendar calData = Calendar.getInstance();
        calData.setTime(data);

        return calTarefa.get(Calendar.YEAR) == calData.get(Calendar.YEAR)
                && calTarefa.get(Calendar.MONTH) == calData.get(Calendar.MONTH)
                && calTarefa.get(Calendar.DAY_OF_MONTH) == calData.get(Calendar.DAY_OF_MONTH);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return "Tarefa: " + descricao + " - Data: " + dateFormat.format(data);
    }
}