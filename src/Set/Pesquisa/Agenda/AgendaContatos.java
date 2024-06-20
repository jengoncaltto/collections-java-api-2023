package Set.Pesquisa.Agenda;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    protected void adicionarContato(String nome, int numero){
        contatoSet.add(new Contato(nome, numero));
    }

    protected Set<Contato> exibirContatos(){
        return contatoSet;
    }

    protected Set<Contato> pesquisarPorNome(String nome){
        Set<Contato> contatoPorNome = new HashSet<>();
        if (!contatoSet.isEmpty()){
            for (Contato c: contatoSet) {
                if(c.getNome().startsWith(nome)){
                    contatoPorNome.add(c);
                }
            }
        }
        return contatoPorNome;
    }


    protected Contato atualizarNumeroContato(String nome, int novoNumero){
        Contato contatoAtualizado = null;
        if (!contatoSet.isEmpty()){
            for (Contato c: contatoSet) {
                if(c.getNome().equalsIgnoreCase(nome)){
                    c.setNumero(novoNumero);
                    contatoAtualizado = c;
                    break;
                }
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();
        agenda.adicionarContato("Jhon", 937284736);
        agenda.adicionarContato("Marcia", 937837456);
        agenda.adicionarContato("Amanda", 999999999);

        System.out.println(agenda.exibirContatos());
        System.out.println(agenda.pesquisarPorNome("Jhon"));
        agenda.atualizarNumeroContato("Amanda", 914375847);
        System.out.println(agenda.pesquisarPorNome("Amanda"));
    }
}
