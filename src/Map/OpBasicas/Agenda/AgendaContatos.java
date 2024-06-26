package Map.OpBasicas.Agenda;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaMap;

    private AgendaContatos() {
        this.agendaMap = new HashMap<>();
    }

    private void adicionarContato(String nome, Integer telefone){
        agendaMap.put(nome, telefone);
    }

    private void removerContato(String nome){
        if(!agendaMap.isEmpty()){
            agendaMap.remove(nome);
        }
    }

    private void exibirContatos(){
        System.out.println(agendaMap);
    }

    private Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if(!agendaMap.isEmpty()) {
            numeroPorNome = agendaMap.get(nome);
        }
        return numeroPorNome;

    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Mara", 936274858);
        agenda.adicionarContato("Mara", 900004858);
        agenda.adicionarContato("Joao", 973632654);
        agenda.adicionarContato("Luisa", 985787234);

        agenda.exibirContatos();

        agenda.removerContato("joao");

        System.out.println(agenda.pesquisarPorNome("Mara"));

        agenda.exibirContatos();
    }


}
