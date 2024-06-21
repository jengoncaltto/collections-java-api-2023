package Map.Ordenacao.Agenda;

import java.time.LocalDate;
import java.util.*;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventos;

    public AgendaEventos() {
        this.eventos = new HashMap<>();
    }

    protected void adicionarEvento(LocalDate data, String nome, String atracao){
        eventos.put(data, new Evento(nome, atracao));
    }

    protected void exibirAgenda(){
        Map<LocalDate, Evento> eventosTreeMap = new TreeMap<>(eventos);
        for (Map.Entry<LocalDate, Evento> entry : eventosTreeMap.entrySet()) {
            LocalDate dataEvento = entry.getKey();
            Evento evento = entry.getValue();
            System.out.println("Data: " + dataEvento + ", Evento: " + evento.getNome() + ", Atração: " + evento.getAtracao());
        }
    }

    protected void obterProximoEvento(){
        LocalDate dataAtual = LocalDate.now();
        LocalDate proximaData = null;
        Evento proximoEvento = null;

        for (Map.Entry<LocalDate, Evento> entry : eventos.entrySet()){
            if(entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                proximaData = entry.getKey();
                proximoEvento = entry.getValue();
                System.out.println("O próximo evento: " + proximoEvento + " acontecerá na data " + proximaData);
                break;
            }
        }
    }

    public static void main(String[] args) {
        AgendaEventos eventos = new AgendaEventos();
        eventos.adicionarEvento(LocalDate.of(2022, 12, 15), "Evento 1", "atracao 1");
        eventos.adicionarEvento(LocalDate.of(2024, 7, 20), "Evento 2", "atracao 2");
        eventos.adicionarEvento(LocalDate.of(2024, 7, 19), "Evento 3", "atracao 3");
        eventos.adicionarEvento(LocalDate.of(2024, 8, 1), "Evento 3", "atracao 3");
        eventos.adicionarEvento(LocalDate.of(2023, 4, 15), "Evento 4", "atracao 4");

        eventos.exibirAgenda();
        eventos.obterProximoEvento();

    }
}
