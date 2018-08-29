package Soldado;

public class Principal {
    public static void main(String[] args) {
        Soldado soldado = new Soldado();
        soldado.Atacar("fuzil");
        Soldado soldado1 = new Soldado();
        Soldado soldado2 = new Soldado();
        Soldado soldado3 = new Soldado();
        Soldado soldado4 = new Soldado();
        Soldado soldado6 = new Soldado();
        Soldado soldado7 = new Soldado();
        Soldado soldado8 = new Soldado();
        Soldado soldado9 = new Soldado();
        Soldado soldado10 = new Soldado();
        soldado.Atacar();
        soldado.Movimentar(5);
        System.out.println("O número de soldados é " + Soldado.getNumeroSoldados());
        System.out.println();
    }

}
