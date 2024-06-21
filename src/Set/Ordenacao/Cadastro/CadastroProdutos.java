package Set.Ordenacao.Cadastro;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtos;

    protected CadastroProdutos() {
        produtos = new HashSet<>();
    }

    protected void adicionarProduto( String nome, int cod, double preco, int quantidade){
        produtos.add(new Produto(nome, cod, quantidade, preco));
    }

    protected Set<Produto> exibirProdutosPorNome(){
        Set<Produto> produtosPorNome = new TreeSet<>(produtos);
        return produtosPorNome;
    }

    protected Set<Produto> exibirProdutosPorPreco(){
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtos);
        return produtosPorPreco;

    }

    public static void main(String[] args) {
        CadastroProdutos produtos = new CadastroProdutos();

        // Adicionando produtos ao cadastro
        produtos.adicionarProduto("Smartphone", 1201, 1000, 10);
        produtos.adicionarProduto( "Notebook", 1202,1500, 5);
        produtos.adicionarProduto( "Mouse", 1203,30, 20);
        produtos.adicionarProduto( "Teclado", 1204,50, 15);

        // Exibindo todos os produtos no cadastro
        System.out.println(produtos.produtos);

        // Exibindo produtos ordenados por nome
        System.out.println(produtos.exibirProdutosPorNome());

        // Exibindo produtos ordenados por preço
        System.out.println(produtos.exibirProdutosPorPreco());
    }
}
