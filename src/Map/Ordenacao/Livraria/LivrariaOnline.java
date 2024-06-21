package Map.Ordenacao.Livraria;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    protected void adicionarLivro(String link, String titulo, String autor, double preco){
        livroMap.put(link, new Livro(titulo, autor, preco));
    }
    protected void removerLivro(String titulo){
        List<String> chavesRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : livroMap.entrySet()){
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)){
                chavesRemover.add(entry.getKey());
            }
        }
        for (String chave : chavesRemover){
            livroMap.remove(chave);
        }
    }
    protected Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livrosOrdenarPreco = new ArrayList<>(livroMap.entrySet());

        Collections.sort(livrosOrdenarPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : livrosOrdenarPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }
    protected Livro obterLivroMaisCaro(){
        Livro livroMaisCaro = null;
        double precoLivroCaro = Double.MIN_VALUE;
        if(!livroMap.isEmpty()){
            for (Livro l: livroMap.values()) {
                if(l.getPreco() > precoLivroCaro ){
                   livroMaisCaro = l;
                }
            }
        }

        return livroMaisCaro;
    }
    protected Livro obterLivroMaisBarato(){
        Livro livroMaisBarato = null;
        double precoLivroBarato = Double.MAX_VALUE;
        if(!livroMap.isEmpty()){
            for (Livro l: livroMap.values()) {
                if(l.getPreco() < precoLivroBarato ){
                    livroMaisBarato = l;
                }
            }
        }
        return livroMaisBarato;
    }

    protected Map<String, Livro> exibirTodosLivros(){
        return livroMap;
    }

    public static void main(String[] args) {
        LivrariaOnline livraria = new LivrariaOnline();
        livraria.adicionarLivro("https:a", "Jantar Secreto", "Raphael Montes", 64.90);
        livraria.adicionarLivro("https:b","Uma Familia Feliz","Raphael Montes",50.90);
        livraria.adicionarLivro("https:c", "O amor não é obvio", "Elaine Baeta", 43.20);
        livraria.adicionarLivro("https:d", "Oxe, baby", "Elaine Baeta", 30.10);
        livraria.adicionarLivro("https:e", "Divergente", "Veronica Roth", 77.20);
        livraria.adicionarLivro("mir", "mala", "marcia", 00.20);

        System.out.println(livraria.exibirTodosLivros());
        livraria.removerLivro("mala");
        System.out.println(livraria.obterLivroMaisBarato());
        System.out.println(livraria.obterLivroMaisCaro());
        livraria.exibirLivrosOrdenadosPorPreco();

        System.out.println(livraria.exibirTodosLivros());


    }
}
