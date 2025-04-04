package edu;

import java.time.OffsetDateTime;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        felipe.setNome("Felipe");
        felipe.setIdade(8);
        felipe.setAnoMatricula(OffsetDateTime.now().getYear());
        System.out.println("O aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos e foi matriculado em "
                + felipe.getAnoMatricula());

        Professor professor = new Professor("Paulo", "Matemática");
        System.out.println("O professor " + professor.getNome() + " ensina " + professor.getMateria());

        EstadosBrasileiros estadoBrasileiro = EstadosBrasileiros.RIO_JANEIRO;
        System.out.println(estadoBrasileiro.getNome() + "/" + estadoBrasileiro.getSigla());

        System.out.println(EstadosBrasileiros.MARANHAO.getNome() + "/" + EstadosBrasileiros.MARANHAO.getSigla());

        for (EstadosBrasileiros eb : EstadosBrasileiros.values()) {
            System.out.println(eb.getNome() + "/" + eb.getSigla());
        }
    }
}
