package map.eventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class AgendaEventos {
    private Map<LocalDate, Evento> eventosMap;

    public AgendaEventos() {
        this.eventosMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        Evento evento = new Evento(nome, atracao);
        this.eventosMap.put(data, evento);
    }

    public void listarEventos() {
        // Como estamos usando uma chave do tipo LocalDate e, sabendo que esta
        // implementa a interface Comparable em sua árvore estrutural, quando
        // informamos o nosso Map de eventos como parâmetro de TreeMap teremos
        // a ordem natural por data automaticamente.
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(this.eventosMap);
        System.out.println(eventosOrdenados);
    }

    public void listarProximoEvento() {
        LocalDate dataProximoEvento = null;
        Evento proximoEvento = null;
        LocalDate dataAtual = LocalDate.now();

        // Ordenando os eventos existentes por data
        Map<LocalDate, Evento> eventosOrdenados = new TreeMap<>(this.eventosMap);

        // Map possui a função .entrySet(), que retorna um par chave/valor (entry) dos
        // enventos existentes e, assim, conseguiremos comparar a data do envento
        // (chave do Map) com a data atual e saber qual é o evento correspondente.
        for (Map.Entry<LocalDate, Evento> entry : eventosOrdenados.entrySet()) {

            // Verificando se a data do evento (chave do Map) é igual (.isEqual()) ou
            // imediatamente posterior (.isAfter()) à data atual
            if (entry.getKey().isEqual(dataAtual) || entry.getKey().isAfter(dataAtual)) {
                dataProximoEvento = entry.getKey();
                proximoEvento = entry.getValue();
                break;
            }
        }

        System.out.println("A data do próximo evento é " + dataProximoEvento);
        System.out.println("Evento: " + proximoEvento);
    }
}
