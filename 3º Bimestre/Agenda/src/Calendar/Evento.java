package Calendar;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

public class Evento {
    private String nome;
    private Date dataInicio;
    private Date dataFim;

    public Evento(String nome, Date dataInicio, Date dataFim) {
        this.nome = nome;
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
    }

    // Getters e setters


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Date getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(Date dataInicio) {
        this.dataInicio = dataInicio;
    }

    public Date getDataFim() {
        return dataFim;
    }

    public void setDataFim(Date dataFim) {
        this.dataFim = dataFim;
    }

    public boolean conflito(Evento outroEvento) {
        return this.dataInicio.before(outroEvento.getDataFim()) && this.dataFim.after(outroEvento.getDataInicio());
    }

    public boolean ocorreNaData(Date data) {
        Calendar calEvento = Calendar.getInstance();
        calEvento.setTime(dataInicio);
        calEvento.set(Calendar.HOUR_OF_DAY, 0);
        calEvento.set(Calendar.MINUTE, 0);
        calEvento.set(Calendar.SECOND, 0);
        calEvento.set(Calendar.MILLISECOND, 0);

        Calendar calData = Calendar.getInstance();
        calData.setTime(data);
        calData.set(Calendar.HOUR_OF_DAY, 0);
        calData.set(Calendar.MINUTE, 0);
        calData.set(Calendar.SECOND, 0);
        calData.set(Calendar.MILLISECOND, 0);

        return calEvento.getTime().equals(calData.getTime());
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return "Evento: " + nome + "\nData de Início: " + dateFormat.format(dataInicio) + "\nData de Término: " + dateFormat.format(dataFim);
    }
}