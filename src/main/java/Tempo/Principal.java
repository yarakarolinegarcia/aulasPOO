package Tempo;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Tempo time = new Tempo();
        int hora = 0;
        int minuto = 0;
        int segundo = 0;
        System.out.println("Digite a hora para alterar");
        hora = teclado.nextInt();
        System.out.println("Digite min para alterar");
        minuto = teclado.nextInt();
        System.out.println("Digite segundo para alterar");
        segundo = teclado.nextInt();
        time.alteraHora(hora,minuto,segundo);

        time.tempoSeg(hora,minuto,segundo);
        System.out.print("tempo em segundos: " );
        time.toString();
    }

}
