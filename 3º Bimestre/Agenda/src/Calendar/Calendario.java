package Calendar;

import java.util.*;


public class Calendario {


    private List<Evento> eventos = new ArrayList<>();
    private List<Lembrete> lembretes = new ArrayList<>();
    private List<Tarefa> tarefas = new ArrayList<>();


    public void adicionarEvento(Evento evento) {
        boolean conflito = eventos.stream().anyMatch(e -> evento.conflito(e));
        if (!conflito) {
            eventos.add(evento);
            System.out.println("Evento adicionado com sucesso.");
        } else {
            System.out.println("Conflito de data/horário. Evento não adicionado.");
        }
    }

    public void adicionarLembrete(Lembrete lembrete) {
        lembretes.add(lembrete);
        System.out.println("Lembrete adicionado com sucesso.");
    }

    public void adicionarTarefa(Tarefa tarefa) {
        tarefas.add(tarefa);
        System.out.println("Tarefa adicionada com sucesso.");
    }

    public List<Evento> getEventosData(Date data) {
        List<Evento> eventosData = new ArrayList<>();
        for (Evento evento : eventos) {
            if (evento.ocorreNaData(data)) {
                eventosData.add(evento);
            }
        }
        return eventosData;

    }


    public List<Lembrete> getLembretesData(Date data) {
        if (data == null) {
            return Collections.emptyList();
        }

        List<Lembrete> lembretesData = new ArrayList<>();
        for (Lembrete lembrete : lembretes) {
            // Resto do código para verificar lembretes por data
        }
        return lembretesData;
    }

    public List<Tarefa> getTarefasData(Date data) {
        List<Tarefa> tarefasData = new ArrayList<>();
        for (Tarefa tarefa : tarefas) {
            Calendar calTarefa = Calendar.getInstance();
            calTarefa.setTime(tarefa.getData());

            Calendar calData = Calendar.getInstance();
            calData.setTime(data);

            if (calTarefa.get(Calendar.YEAR) == calData.get(Calendar.YEAR)
                    && calTarefa.get(Calendar.MONTH) == calData.get(Calendar.MONTH)
                    && calTarefa.get(Calendar.DAY_OF_MONTH) == calData.get(Calendar.DAY_OF_MONTH)) {
                tarefasData.add(tarefa);
            }
        }
        return tarefasData;
    }

}