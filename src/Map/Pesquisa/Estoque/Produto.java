package Map.Pesquisa.Estoque;

public class Produto {
    private String nome;
    private int quantidade;
    private double preco;

    protected Produto(String nome, int quantidade, double preco) {
        this.nome = nome;
        this.quantidade = quantidade;
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", quantidade=" + quantidade +
                ", preco=" + preco +
                '}';
    }

    protected String getNome() {
        return nome;
    }

    protected int getQuantidade() {
        return quantidade;
    }

    protected double getPreco() {
        return preco;
    }
}
