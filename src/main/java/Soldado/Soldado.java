package Soldado;

public class Soldado {
    public static int getNumeroSoldados() {
        return numeroSoldados;
    }

    private static int numeroSoldados;
    private final int DISTANCIAPADRAO = 10;
    private int distancia;


    public Soldado() {
        numeroSoldados++;
        System.out.println("Soldado criado" + numeroSoldados);


    }
    public void Atacar(){
        if(numeroSoldados<10){
            System.out.println("ainda não, esperando o exército ficar maior.");
            return;
        }
        System.out.println("Ataque bem sucedido com fuzil");
    }


    public void Atacar(String arma){
        if(numeroSoldados<10){
            System.out.println("ainda não, esperando o exército ficar maior.");
            return;
        }
        if(arma.equals("baioneta")){
            System.out.println("Ataque bem sucedido com baioneta");
        }else if (arma.equals("punho")){
            System.out.println("Ataque bem sucedido com punho");
        }else if(arma.equals("fuzil")) {
            System.out.println("Ataque bem sucedido com fuzil");
        }
    }

    public void Movimentar(int distancia){
        if(distancia<=0){
            this.distancia += DISTANCIAPADRAO;
            System.out.println("A distancia é " + this.distancia);
        } else {
            this.distancia +=distancia;
            System.out.println("A distancia é " + this.distancia);
        }
    }

}
