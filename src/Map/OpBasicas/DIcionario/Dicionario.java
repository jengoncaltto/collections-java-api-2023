package Map.OpBasicas.DIcionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    private Dicionario() {
        this.dicionario = new HashMap<>();
    }

    private void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    private void removerPalavra(String palavra){
        if(!dicionario.isEmpty()){
            dicionario.remove(palavra);
            System.out.println("Palavra " + palavra + " removida com sucesso!");
        }
    }

    private void exibirPalavras(){
        if(!dicionario.isEmpty()){
            System.out.println(dicionario);
        }
    }

    private void pesquisarPorPalavra(String palavra){
        if (!dicionario.isEmpty()){
            System.out.println(dicionario.get(palavra));

        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("amor", "sentimento");
        dicionario.adicionarPalavra("sorrir","sentimento");
        dicionario.adicionarPalavra("amizade","relacionamento");

        dicionario.exibirPalavras();
        dicionario.pesquisarPorPalavra("amizade");
        dicionario.removerPalavra("sorrir");
        dicionario.exibirPalavras();

    }

}
