package Nave;

public class RoboExploracao {
    private int area;
    private int coordX;
    private int coordY;
    private char frente;


    public RoboExploracao(int area, int coordX, int coordY, char frente) {
        this.area = area;
        this.coordX = coordX;
        this.coordY = coordY;
        this.frente = frente;
    }

    public String getCoord() {
        return String.valueOf(coordX) + " " + String.valueOf(coordY) + " " + frente;
    }

    public String moverForReal(String plano) {
        int salvaX = coordX;
        int salvaY = coordY;

        for (int i = 0; i < plano.length(); i++) {
            String caracter = plano.substring(i, i + 1);
            if (coordX < salvaX + Math.sqrt(area) && coordY < salvaY + Math.sqrt(area)) {
                mover(caracter);
            } else {
                return  "Ultrapassou a arae limitada";
            }
        }

        return getCoord();
    }


    public void mover(String plano) {
        if(plano.equals("E")){
            if(frente == 'N') {
                frente = 'O';
            } else if(frente == 'O'){
                frente = 'S';
            } else if(frente == 'S'){
                frente = 'L';
            } else{
                frente = 'N';
            }
        }
        else if(plano.equals("D")){
            if(frente == 'N'){
                frente = 'L';
            } else if(frente == 'L'){
                frente = 'S';
            } else if(frente == 'S'){
                frente = 'O';
            } else if (frente == 'N'){
                frente = 'N';
            }
        }
        else if(plano.equals("M")){
            if(frente == 'N') {
                coordY++;
            } else if(frente == 'S'){
                coordY--;
            } else if (frente == 'L'){
                coordX++;
            } else{
                coordX--;
            }

        }
        //movendo para direita
        // estou: 0 0 N, chegar em : 0 0 O


    }

    private void pegaComando(String plano) {
        for (int i = 0; i < plano.length(); i++) {
            String caracter  =  plano.substring(i,i+1);
            System.out.println(caracter);

        }
    }

}
