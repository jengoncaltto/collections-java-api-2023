package Map.Ordenacao.Agenda;

import java.util.Comparator;

public class Evento {
    private String nome;
    private String atracao;

    public Evento(String evento, String atracao) {
        this.nome = evento;
        this.atracao = atracao;
    }

    @Override
    public String toString() {
        return "Evento{" +
                "nome do evento='" + nome + '\'' +
                ", nome da atracao='" + atracao + '\'' +
                '}';
    }

    public String getNome() {
        return nome;
    }

    public String getAtracao() {
        return atracao;
    }
}