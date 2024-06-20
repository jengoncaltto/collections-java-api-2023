package List.Pesquisa.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNum {
    private List<Integer> inteiros;

    protected SomaNum() {
        this.inteiros = new ArrayList<>();
    }

    protected void adicionarNumero(int numero){
        this.inteiros.add(numero);
    }

    protected int calcularSoma(){
        int total = 0;
        if (!inteiros.isEmpty()){
            for (Integer i : inteiros) {
            total = total + i;
            }
        }
        return total;
    }

    protected int encontrarMaiorNumero(){
        int maior = Integer.MIN_VALUE;
        if(!inteiros.isEmpty())
        for (Integer i = 0; i < inteiros.size(); i++) {
            if(i >= maior){
                maior = i;
            }
        }
        return maior;
    }

    protected int encontrarMenorNumero(){
        int menor = Integer.MAX_VALUE;
        if(!inteiros.isEmpty())
            for (Integer i = 0; i < inteiros.size(); i++) {
                if(i <= menor){
                    menor = i;
                }
            }
        return menor;
    }

    protected void exibirNumeros(){
        if(!inteiros.isEmpty()){
            System.out.println(this.inteiros);
        }
    }

    public static void main(String[] args) {
        SomaNum somaNum = new SomaNum();

        somaNum.adicionarNumero(4);
        somaNum.adicionarNumero(6);
        somaNum.adicionarNumero(8);
        somaNum.adicionarNumero(3);
        System.out.println(somaNum.calcularSoma());
        System.out.println(somaNum.encontrarMaiorNumero());
        System.out.println(somaNum.encontrarMenorNumero());
        somaNum.exibirNumeros();
    }
}
