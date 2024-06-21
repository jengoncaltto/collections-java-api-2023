package Map.Pesquisa.Contagem;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    private Map<String, Integer> palavras;

    protected ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    private void adicionarPalavra(String palavra, Integer contagem){
        palavras.put(palavra, contagem);
    }

    private void removerPalavra(String palavra){
        if(!palavras.isEmpty()){
            palavras.remove(palavra);
        }
    }

    private int exibirContagemPalavras(){
        int contagemTotal = 0;
        if (!palavras.isEmpty()){
            for (int contagem: palavras.values()) {
                contagemTotal += contagem;
            }
        }
        return contagemTotal;
    }

    public String encontrarPalavrasMaisFrequente() {
        String palavraFrequente = null;
        int maiorContagem = 0;
        for (Map.Entry<String, Integer> entry : palavras.entrySet()) {
            if (entry.getValue() > maiorContagem) {
                maiorContagem = entry.getValue();
                palavraFrequente = entry.getKey();
            }
        }
        return palavraFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras palavras = new ContagemPalavras();
        palavras.adicionarPalavra("amor", 3);
        palavras.adicionarPalavra("razao", 3);
        palavras.adicionarPalavra("razao", 1);


        System.out.println(palavras.exibirContagemPalavras());
        System.out.println(palavras.encontrarPalavrasMaisFrequente());

        palavras.removerPalavra("razao");
    }

}
