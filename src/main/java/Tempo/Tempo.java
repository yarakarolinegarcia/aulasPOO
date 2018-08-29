package Tempo;
import java.util.Scanner;
public class Tempo {


    @Override
    public String toString() {
        return "Tempo{" +
                "hora=" + hora +
                ", minuto=" + minuto +
                ", segundo=" + segundo +
                '}';
    }

    private int hora;
    private int minuto;
    private int segundo;


    public Tempo(){
    }

    public Tempo(int hora) {
        this.hora = hora;
        if(hora <= 24){
            System.out.println("Hora valida");
        } else {
            System.out.println("hora invalida");
        }
    }

    public Tempo(int hora, int minuto){
        this.hora = hora;
        this.minuto = minuto;
        if(hora <= 24 && minuto <=60){
            System.out.println("hora e minuto validos");
        } else{
            System.out.println("hora ou minuto invalidos");
        }

    }




    public Tempo(int hora, int minuto, int segundo) {
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;

        if(hora <=24 && minuto<=60 && segundo <=60 ){
            System.out.println("hora correta");
        } else {
            System.out.println("hora incorreta");
        }
    }
    public boolean alteraHora(int hora, int minuto, int segundo){

        if(hora <=24 && minuto <=60 && segundo <=60) {
            System.out.println("hora correta");
            return true;
        } else {
            System.out.println("hora incorreta");
            return false;
        }

    }
    public long tempoSeg(String tempo){
        String hora = tempo.substring(0,2);
        String minuto = tempo.substring(3,5);
        String segundo = tempo.substring(6,8);

        long tempoHora = Integer.valueOf(hora) * 3600;
        long tempoMinuto = Integer.valueOf(minuto) * 60;
        long tempoSeg = Integer.valueOf(segundo);
        return tempoHora + tempoMinuto +tempoSeg;
    }



}

