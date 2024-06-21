package Map.Pesquisa.Estoque;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProds {
    Map<Long, Produto> produtosMap;

    protected EstoqueProds() {
        produtosMap = new HashMap<>();
    }

    protected void adicionarProduto(Long cod, String nome, int quantidade, double preco){
        produtosMap.put(cod, new Produto(nome, quantidade, preco));
    }

    protected void exibirProdutos(){
        System.out.println(produtosMap);
    }

    protected double valorTotalEstoque(){
        double valorTotal = 0;
        if(!produtosMap.isEmpty()){
            for (Produto p: produtosMap.values()) {
                valorTotal += p.getQuantidade() * p.getPreco();
            }
        }
        return valorTotal;
    }

    protected Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }
    protected Produto obterProdutoMaisBarato(){
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!produtosMap.isEmpty()) {
            for (Produto p : produtosMap.values()) {
                if(p.getPreco() < menorPreco){
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!produtosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : produtosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProds produtos = new EstoqueProds();
        produtos.adicionarProduto(14L, "Sabonete", 8, 2.80);
        produtos.adicionarProduto(15L, "pasta de dente", 3, 4.60);
        produtos.adicionarProduto(16L, "café", 5, 7.90);
        produtos.adicionarProduto(17L, "escova", 2, 3.70);

        produtos.exibirProdutos();
        System.out.println(produtos.valorTotalEstoque());
        System.out.println(produtos.obterProdutoMaisCaro());
        System.out.println(produtos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        System.out.println(produtos.obterProdutoMaisBarato());
    }
}
