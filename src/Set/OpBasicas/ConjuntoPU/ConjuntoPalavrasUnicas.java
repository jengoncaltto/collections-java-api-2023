package Set.OpBasicas.ConjuntoPU;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasUnicas;

    protected ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    protected void adicionarPalavra(String palavra){
        this.palavrasUnicas.add(palavra);
    }

    protected void removerPalavra(String palavra){
        String palavraParaRemover = null;
        if(!palavrasUnicas.isEmpty()) {
            for (String c : palavrasUnicas) {
                if (c.equalsIgnoreCase(palavra)) {
                    palavraParaRemover = c;
                    break;
                }
            }
        }
        palavrasUnicas.remove(palavraParaRemover);
    }

    protected void verificarPalavra(String palavra){
        String palavraVerificada = null;
        if(!palavrasUnicas.isEmpty()) {
            for (String c : palavrasUnicas) {
                if (c.equalsIgnoreCase(palavra)){
                    palavraVerificada = c;
                    break;
                }
            }

        }
        if(palavraVerificada == null){
            System.out.println("Essa palavra não existe na lista.");
        } else{
            System.out.println("A palavra " + palavraVerificada + " já se encontra no na lista" );
        }
    }

    protected Set<String> exibirPalavrasUnicas(){
        return palavrasUnicas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof ConjuntoPalavrasUnicas that)) return false;
        return Objects.equals(palavrasUnicas, that.palavrasUnicas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(palavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();
        conjuntoPalavrasUnicas.adicionarPalavra("viva");
        conjuntoPalavrasUnicas.adicionarPalavra("amor");
        conjuntoPalavrasUnicas.adicionarPalavra("love");
        conjuntoPalavrasUnicas.adicionarPalavra("marca");

        System.out.println(conjuntoPalavrasUnicas.exibirPalavrasUnicas());
        conjuntoPalavrasUnicas.removerPalavra("marca");
        System.out.println(conjuntoPalavrasUnicas.exibirPalavrasUnicas());
        conjuntoPalavrasUnicas.verificarPalavra("amor");
        conjuntoPalavrasUnicas.verificarPalavra("olhar");
        conjuntoPalavrasUnicas.adicionarPalavra("viva");
        System.out.println(conjuntoPalavrasUnicas.exibirPalavrasUnicas());


    }


}
