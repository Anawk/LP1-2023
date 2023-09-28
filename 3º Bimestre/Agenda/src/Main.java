

import Calendar.Calendario;
import Calendar.Evento;
import Calendar.Lembrete;
import Calendar.Tarefa;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws ParseException {
        Calendario calendario = new Calendario();
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm");

        while (true) {
            System.out.println("1. Adicionar Evento");
            System.out.println("2. Adicionar Lembrete");
            System.out.println("3. Adicionar Tarefa");
            System.out.println("4. Consultar Eventos por Data");
            System.out.println("5. Consultar Lembretes por Data");
            System.out.println("6. Consultar Tarefas por Data");
            System.out.println("7. Sair");
            System.out.print("Escolha uma opção: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    // Adicionar Evento
                    System.out.print("Nome do Evento: ");
                    String nomeEvento = scanner.nextLine();
                    System.out.print("Data de Início (dd/MM/yyyy HH:mm): ");
                    Date dataInicioEvento = dateFormat.parse(scanner.nextLine());
                    System.out.print("Data de Término (dd/MM/yyyy HH:mm): ");
                    Date dataFimEvento = dateFormat.parse(scanner.nextLine());
                    Evento evento = new Evento(nomeEvento, dataInicioEvento, dataFimEvento);
                    calendario.adicionarEvento(evento);
                    break;
                case 2:
                    // Adicionar Lembrete
                    System.out.print("Descrição do Lembrete: ");
                    String descricaoLembrete = scanner.nextLine();
                    System.out.print("Data e Hora (dd/MM/yyyy HH:mm): ");
                    Date dataHoraLembrete = dateFormat.parse(scanner.nextLine());
                    Lembrete lembrete = new Lembrete();
                    calendario.adicionarLembrete(lembrete);
                    break;
                case 3:
                    // Adicionar Tarefa
                    System.out.print("Descrição da tarefa: ");
                    String descricaoTarefa = scanner.nextLine();
                    System.out.print("Data da tarefa (dd/MM/yyyy): ");
                    String dataTarefaStr = scanner.nextLine();
                    SimpleDateFormat dateFormatTarefa = new SimpleDateFormat("dd/MM/yyyy");
                    Date dataTarefa = dateFormatTarefa.parse(dataTarefaStr);
                    Tarefa tarefa = new Tarefa(descricaoTarefa, dataTarefa);
                    calendario.adicionarTarefa(tarefa);
                    break;
                case 4:
                    // Consultar Eventos por Data
                    System.out.print("Data (dd/MM/yyyy): ");
                    String dataConsultaStr = scanner.nextLine();
                    SimpleDateFormat dateFormatConsulta = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        Date dataConsulta = dateFormatConsulta.parse(dataConsultaStr);
                        List<Evento> eventosData = calendario.getEventosData(dataConsulta);
                        if (eventosData.isEmpty()) {
                            System.out.println("Nenhum evento encontrado para a data especificada.");
                        } else {
                            for (Evento e : eventosData) {
                                System.out.println(e);
                            }
                        }
                    } catch (ParseException e) {
                        System.out.println("Formato de data inválido. Use dd/MM/yyyy.");
                    }
                    break;

                case 5:
                    // Consultar Lembretes por Data
                    System.out.print("Data (dd/MM/yyyy): ");
                    dataConsultaStr = scanner.nextLine();
                    dateFormatConsulta = new SimpleDateFormat("dd/MM/yyyy");
                    try {
                        Date dataConsulta = dateFormatConsulta.parse(dataConsultaStr);
                        List<Lembrete> lembretesData = calendario.getLembretesData(dataConsulta);
                        if (lembretesData.isEmpty()) {
                            System.out.println("Nenhum lembrete encontrado para a data especificada.");
                        } else {
                            for (Lembrete lembrete1 : lembretesData) {
                                if (lembrete1.ocorreNaData(dataConsulta)) {
                                    System.out.println(lembrete1);
                                }
                            }
                        }
                    } catch (ParseException e) {
                        System.out.println("Formato de data inválido. Use dd/MM/yyyy.");
                    }
                    break;

                case 6:
                    // Consultar Tarefas por Data
                    System.out.print("Data (dd/MM/yyyy): ");
                    dataConsultaStr = scanner.nextLine();
                    try {
                        dateFormatConsulta = new SimpleDateFormat("dd/MM/yyyy");
                        Date dataConsulta = dateFormatConsulta.parse(dataConsultaStr);
                        List<Tarefa> tarefasData = calendario.getTarefasData(dataConsulta);
                        if (tarefasData.isEmpty()) {
                            System.out.println("Nenhuma tarefa encontrada para a data especificada.");
                        } else {
                            for (Tarefa tarefa1 : tarefasData) {
                                System.out.println(tarefa1);
                            }
                        }
                    } catch (ParseException e) {
                        System.out.println("Formato de data inválido. Use dd/MM/yyyy.");
                    }
                    break;

                case 7:
                    // Sair do Programa
                    System.out.println("Saindo do programa.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}