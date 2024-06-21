package Set.Ordenacao.Lista;

import java.util.*;

public class GerenciadorAlunos {
    Set<Aluno> listaAlunos;

    protected GerenciadorAlunos() {
        this.listaAlunos = new HashSet<>();
    }

    protected void adicionarAluno(String nome, int matricula, double media){
        listaAlunos.add(new Aluno(nome, matricula, media));
    }

    protected void removerAluno(int matricula){
        Aluno alunoParaRemover = null;
        if(!listaAlunos.isEmpty()){
            for (Aluno a : listaAlunos) {
                if(a.getMatricula() == matricula){
                    alunoParaRemover = a;
                    break;
                }
            }
        }
         listaAlunos.remove(alunoParaRemover);
    }

    protected Set<Aluno> exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(listaAlunos);
        alunosPorNome.addAll(listaAlunos);
        return alunosPorNome;
    }

    protected Set<Aluno> exibirAlunoPorNota(){
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        if(!listaAlunos.isEmpty()){
            alunoPorNota.addAll(listaAlunos);
        }
        return alunoPorNota;
    }

    protected Set<Aluno> exibirAlunos(){
        return listaAlunos;
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciaAlunos = new GerenciadorAlunos();

        gerenciaAlunos.adicionarAluno("joao", 2019247934 , 10);
        gerenciaAlunos.adicionarAluno("julio", 2020435336, 8);
        gerenciaAlunos.adicionarAluno("marcos", 2012143537, 5);
        gerenciaAlunos.adicionarAluno("marcos", 2012143537, 9);
        gerenciaAlunos.adicionarAluno("felipe", 2012143726, 8);

        System.out.println(gerenciaAlunos.exibirAlunos());
        gerenciaAlunos.removerAluno(2012143537);

        System.out.println(gerenciaAlunos.exibirAlunoPorNota());
        System.out.println(gerenciaAlunos.exibirAlunosPorNome());
        gerenciaAlunos.exibirAlunosPorNome();

    }

}
