package Set.OpBasicas.ConjuntoC;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }

    protected void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    protected void removerCandidatoCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    protected int contarConvidado(){
        return convidadoSet.size();
    }

    protected void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjunto = new ConjuntoConvidado();
        conjunto.adicionarConvidado("Isabelle", 01);
        conjunto.adicionarConvidado("Julia", 02);
        conjunto.adicionarConvidado("Nat", 03);
        conjunto.adicionarConvidado("Eduardo", 04);
        conjunto.exibirConvidados();
        conjunto.removerCandidatoCodigoConvite(3);
        conjunto.exibirConvidados();
        System.out.println(conjunto.contarConvidado());
    }
}
