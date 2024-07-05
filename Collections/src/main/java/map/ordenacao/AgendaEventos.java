package map.ordenacao;

import jdk.jfr.Event;

import java.time.LocalDate;
import java.time.Month;
import java.util.*;

public class AgendaEventos {

    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao){
        eventosMap.put(data, new Evento(nome, atracao));
    }
    public void exibirAgenda(){
        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        System.out.println(eventoTreeMap);
    }
    public void obterProximoEvento(){
//        Set<LocalDate> dataSet =  eventosMap.keySet();
//        Collection<Evento> values = eventosMap.values();
        LocalDate dataAtual = LocalDate.now();

        Map<LocalDate, Evento> eventoTreeMap = new TreeMap<>(eventosMap);
        for (Map.Entry<LocalDate, Evento> entry : eventoTreeMap.entrySet()){
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)){
                System.out.println("O proximo e venveto é : " + entry.getKey() + " Acontera na data :" + entry.getValue());
                break;
            }
        }

    }


    public static void main(String[] args) {

        AgendaEventos agenda = new AgendaEventos();


        agenda.adicionarEvento(LocalDate.of(2024, Month.JANUARY,8),"Gabriel","Aniversario");
        agenda.adicionarEvento(LocalDate.of(2024, Month.JULY,06),"Pai","Aniversario");
        agenda.adicionarEvento(LocalDate.of(2024, Month.SEPTEMBER,10),"Amanda","Aniversario");



        agenda.exibirAgenda();

        agenda.obterProximoEvento();

    }


}
