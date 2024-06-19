package List.CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class Carrinho {
    private List<Item> listaItens;

    public Carrinho() {
        this.listaItens = new ArrayList<>();
    }

    // adiciona um item do carrnho com o nome, preço e quantidade.
    public void adicionarItem(String nome, double preco, int quantidade){
        listaItens.add(new Item(nome, preco, quantidade));
    }

    // remove um item do carrinho com base no nome
    public void removerItem(String nome){
        List<Item> listaParaRemoção = new ArrayList<>();
        for (Item t : listaItens) {
            if(t.getNome().equalsIgnoreCase(nome)){
                listaParaRemoção.add(t);
            }
        }
        /*for (Item t: listaItens ) {
            if(t.getNome().equalsIgnoreCase(nome))
            listaItens.remove(t);
        }*/
    }

    // calcula e retorna o valor total do carrinho, levando e consideração o preço e a quantidade de cada item.
    public double calcularValorToTal(){
        double valorTotal = 0;
        int valorTotalQuantidade = 0;


        for (Item t: listaItens) {
            valorTotalQuantidade = valorTotalQuantidade + t.getQuantidade();
            valorTotal = valorTotalQuantidade * t.getPreco();
        }
        return valorTotal;
    }

    // exibe todos os itens presentes no carrinho mostrando seus nomes preços e quantidades.
    public void exibirItens(){
        System.out.println(listaItens);
    }


    public static void main(String[] args) {
        Carrinho listaItem = new Carrinho();

        listaItem.adicionarItem("lápis", 2.5,3);
        listaItem.adicionarItem("caneta",2.5,3);
        listaItem.adicionarItem("borracha",2,1);
        listaItem.adicionarItem("borracha",2.5,3);



        System.out.println(listaItem.calcularValorToTal());
        listaItem.removerItem("borracha");
        listaItem.exibirItens();

    }
}



