package Contador;

public class Contador {
    private int valorAtual;

    public void resetValor(){
        valorAtual =0;
    }
    public void incrementaContador(){
        valorAtual ++;
    }
    public void obtemValor(){
        System.out.println(valorAtual);
    }

}
