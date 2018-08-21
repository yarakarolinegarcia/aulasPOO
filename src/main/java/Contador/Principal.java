package Contador;

public class Principal {
    public static void main(String[] args) {
        Contador cont = new Contador();
        cont.obtemValor();
        cont.incrementaContador();
        cont.incrementaContador();
        cont.obtemValor();
        cont.resetValor();
        cont.obtemValor();
    }
}

