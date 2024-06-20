package Set.Pesquisa.Lista;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    protected Set<Tarefa> tarefaSet;

    protected ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    protected void adicionarTarefa(String descricao){
        tarefaSet.add(new Tarefa(descricao));
    }

    protected Set<Tarefa> removerTarefa(String descricao){
        Set<Tarefa> TarefasParaRemover = new HashSet<>();
        if(!tarefaSet.isEmpty()) {
            for (Tarefa t : tarefaSet) {
                if(t.getDescricao().startsWith(descricao)){
                    TarefasParaRemover.add(t);
                }
            }
        }
        return tarefaSet;
    } //Remove uma tarefa do Set de acordo com a descrição, se estiver presente.

    protected Set<Tarefa> exibirTarefas(){
        return tarefaSet;
    } //Exibe todas as tarefas da lista de tarefas.

    protected int contarTarefas(){
        return tarefaSet.size();
    } //Conta o número total de tarefas na lista de tarefas.

    protected Set<Tarefa> obterTarefasPendentes(){
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        if (!tarefaSet.isEmpty()){
            for (Tarefa t: tarefaSet) {
                if(t.isConclusao() == false){
                    tarefasPendentes.add(t);
                }
            }
        }
        return tarefasPendentes;
    } //Retorna um Set com as tarefas pendentes.

    protected void marcarTarefaConcluida(String descricao){
        if (!tarefaSet.isEmpty()){
            for (Tarefa t: tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConclusao(true);
                }
            }
        }
    } //Marca uma tarefa como concluída de acordo com a descrição.

    protected void marcarTarefaPendente(String descricao){
        if (!tarefaSet.isEmpty()){
            for (Tarefa t: tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)){
                    t.setConclusao(false);
                    break;
                }
            }
        }
    } //Marca uma tarefa como pendente de acordo com a descrição.

    protected void limparListaTarefas(){
        if (!tarefaSet.isEmpty()){
            tarefaSet.removeAll(tarefaSet);
        }
    } //Remove todas as tarefas da lista de tarefas.

    protected Set<Tarefa> obterTarefasConcluidas(){
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        if (!tarefaSet.isEmpty()){
            for (Tarefa t: tarefaSet) {
                if(t.isConclusao() == true){
                    tarefasConcluidas.add(t);
                }
            }
        }
        return tarefasConcluidas;
    } //Retorna um Set com as tarefas concluídas.

    public static void main(String[] args) {
        ListaTarefas tarefas = new ListaTarefas();
        tarefas.adicionarTarefa("estudar");
        tarefas.adicionarTarefa("treinar");
        tarefas.adicionarTarefa("dormir");
        tarefas.adicionarTarefa("trabalhar");

        System.out.println("TOTAL: " + tarefas.contarTarefas());
        System.out.println("TODAS: " + tarefas.exibirTarefas());

        System.out.println("PENDENTES: " + tarefas.obterTarefasPendentes());
        tarefas.marcarTarefaConcluida("treinar");
        tarefas.marcarTarefaConcluida("estudar");

        System.out.println("CONCLUIDAS: " + tarefas.obterTarefasConcluidas());

        tarefas.marcarTarefaPendente("teinar");
        System.out.println("PENDENTES: " + tarefas.obterTarefasPendentes());

        tarefas.removerTarefa("dormir");
        System.out.println("TODAS: " + tarefas.exibirTarefas());

        tarefas.marcarTarefaConcluida("trabalhar");
        System.out.println("CONCLUIDAS: " + tarefas.obterTarefasConcluidas());

        tarefas.limparListaTarefas();
        System.out.println("TODAS: " + tarefas.exibirTarefas());
    }
}
