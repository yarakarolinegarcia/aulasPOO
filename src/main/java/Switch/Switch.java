package Switch;

public class Switch {
    private int numeroPortas = 8;

    public void ocupaPorta(int quantidadeDePortasHaOcupar) {
        if (numeroPortas != 8) {
            numeroPortas += quantidadeDePortasHaOcupar;
        } else {
            System.out.println("Todas as portas estão ocupadas");
        }
    }

        public void liberaPorta(int quantidadePortasHaLiberar){
            if (numeroPortas >= quantidadePortasHaLiberar) {
                numeroPortas -= quantidadePortasHaLiberar;
            } else {
                System.out.println("O switch tem somente 8 portas, tente novamete com uma numeração aceitavel");
            }
        }

        public void reset(){
            numeroPortas-=numeroPortas;
        }

        public void verificaPortas () {
            System.out.println(numeroPortas);
        }
}
