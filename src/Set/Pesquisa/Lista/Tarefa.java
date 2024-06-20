package Set.Pesquisa.Lista;

import java.util.Objects;

public class Tarefa {
    private String descricao;
    private boolean conclusao;

    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    public void setConclusao(boolean conclusao) {
        this.conclusao = conclusao;
    }

    @Override
    public String toString() {
        return "Tarefa{" +
                "descricao='" + descricao + '\'' +
                ", conclusao=" + conclusao +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isConclusao() {
        return conclusao;
    }
}
