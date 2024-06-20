package List.OpBasicas.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {
    private List<Tarefa> tarefaList;

    protected ListaTarefas() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removeTarefa(String descricao){
        List<Tarefa> tarefasParaRemover =new ArrayList<>();
        for (Tarefa t : tarefaList) {
            if(t.getDescricao().equalsIgnoreCase(descricao)){
                tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();
        System.out.println("Tarefas total: " + listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefa("Beber água.");
        listaTarefas.adicionarTarefa("Beber água.");
        listaTarefas.adicionarTarefa("ir ao banheiro.");
        listaTarefas.adicionarTarefa("Beber água.");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.removeTarefa("Beber água.");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());
        listaTarefas.obterDescricoesTarefas();

    }
}
