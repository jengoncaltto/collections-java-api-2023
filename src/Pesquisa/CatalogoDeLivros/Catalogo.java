package Pesquisa.CatalogoDeLivros;

import java.util.ArrayList;
import java.util.List;

public class Catalogo {
    private List<Livro> catalogoList;

    public Catalogo() {
        this.catalogoList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        catalogoList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisaIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> listaLivroAnos = new ArrayList<>();
        if (!catalogoList.isEmpty()) {
            for (Livro l : catalogoList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    listaLivroAnos.add(l);
                }
            }
        }
        return listaLivroAnos;
    }

    public List<Livro> pesquisaPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if (!catalogoList.isEmpty()) {
            for (Livro l : catalogoList) {
                if (autor.equalsIgnoreCase(l.getAutor())) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }

    public Livro pesquisarTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!catalogoList.isEmpty()) {
            for (Livro l : catalogoList) {
                if (titulo.equalsIgnoreCase(l.getTitulo())) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public List<Livro> anoDePublicacao(int anoPublicacao) {
        List<Livro> livroPorAnoPub = new ArrayList<>();
        if (!catalogoList.isEmpty()) {
            for (Livro l : catalogoList) {
                if (anoPublicacao == l.getAnoPublicacao()) {
                    livroPorAnoPub.add(l);
                }
            }
        }
        return livroPorAnoPub;
    }


    public static void main(String[] args) {
        Catalogo catalogo = new Catalogo();

        catalogo.adicionarLivro("o duque e eu", "julia quinn", 2017);
        catalogo.adicionarLivro("um perfeito cavalheiro", "julia quinn", 2017);
        catalogo.adicionarLivro("jantar secreto", "raphael montes", 2023);
        catalogo.adicionarLivro("uma família feliz", "raphael montes", 2024);
        catalogo.adicionarLivro("the 100", "kiss morgan", 2014);
        catalogo.adicionarLivro("dia 21", "kiss morgan", 2022);

        System.out.println(catalogo.pesquisaPorAutor("julia quinn"));
        System.out.println(catalogo.pesquisarTitulo("the 100"));
        System.out.println(catalogo.anoDePublicacao(2023));
        System.out.println(catalogo.pesquisaIntervaloAnos(2013,2018));
    }
}