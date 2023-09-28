package Calendar;
import java.text.SimpleDateFormat;
import java.util.*;

public class Lembrete {
    private String descricao;
    private Date dataHora;

    public Lembrete() {
        this.descricao = descricao;
        this.dataHora = dataHora;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Date getDataHora() {
        return dataHora;
    }

    public void setDataHora(Date dataHora) {
        this.dataHora = dataHora;
    }

    public boolean ocorreNaData(Date dataConsulta) {
        SimpleDateFormat dateFormatLembrete = new SimpleDateFormat("dd/MM/yyyy");
        String dataLembreteStr = dateFormatLembrete.format(dataHora);
        String dataConsultaStr = dateFormatLembrete.format(dataConsulta);
        return dataLembreteStr.equals(dataConsultaStr);
    }

    @Override
    public String toString() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        return "Lembrete: " + descricao + " - Data/Hora: " + dateFormat.format(dataHora);
    }
}