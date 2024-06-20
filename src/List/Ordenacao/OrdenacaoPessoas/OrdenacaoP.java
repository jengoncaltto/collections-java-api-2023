package List.Ordenacao.OrdenacaoPessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoP {
    private List<Pessoa> listaPessoas;

    protected OrdenacaoP() {
        this.listaPessoas = new ArrayList<>();
    }

    protected void adicionarPessoa(String nome, int idade, double altura){
        listaPessoas.add(new Pessoa(nome,idade,altura));
    }

    protected List<Pessoa> ordenaPorIdade(){
        List<Pessoa> pessoasPorIdade = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    protected List<Pessoa> ordenarPorAltura(){
        List<Pessoa> pessoasPorAltura = new ArrayList<>(listaPessoas);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoP ordenacaoP = new OrdenacaoP();

        ordenacaoP.adicionarPessoa("Isabelle", 21, 1.70);
        ordenacaoP.adicionarPessoa("Jhon", 20, 1.55);
        ordenacaoP.adicionarPessoa("Julia", 20, 1.61);
        ordenacaoP.adicionarPessoa("Julia", 22, 1.68);
        ordenacaoP.adicionarPessoa("Diogo", 21, 1.65);

        System.out.println(ordenacaoP.ordenarPorAltura());
        System.out.println(ordenacaoP.ordenaPorIdade());
        System.out.println(ordenacaoP.listaPessoas);

    }

}
