import java.time.LocalDate;
import java.time.Month;

import map.eventos.AgendaEventos;

public class MapAgenda {
    public static void main(String[] args) {
        AgendaEventos agendaEventos = new AgendaEventos();

        agendaEventos.adicionarEvento(LocalDate.of(2025, 4, 20), "Evento 01", "Atração 01");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 3, 12), "Evento 02", "Atração 02");
        agendaEventos.adicionarEvento(LocalDate.of(2024, Month.JULY, 4), "Evento 03", "Atração 03");
        agendaEventos.adicionarEvento(LocalDate.of(2023, Month.AUGUST, 27), "Evento 04", "Atração 04");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 4, 21), "Evento 05", "Atração 05");
        agendaEventos.adicionarEvento(LocalDate.of(2025, 4, 22), "Evento 06", "Atração 06");
        agendaEventos.adicionarEvento(LocalDate.of(2025, Month.SEPTEMBER, 12), "Evento 07", "Atração 07");

        agendaEventos.listarEventos();

        agendaEventos.listarProximoEvento();
    }
}
