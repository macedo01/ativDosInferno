package Package;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float tMedio = 0f;
        float[] tempo = new float[20];
        String[] pilotos = new String[20];

        for (int i = 0; i < pilotos.length; i++) {
            System.out.println("Nome do Piloto " + (i + 1) + " :");
            pilotos[i] = input.next();
        }
        for (int i = 0; i < pilotos.length; i++) {

            System.out.println("Tempo do Piloto " + (i + 1) + " :");
            tempo[i] = input.nextFloat();
        }

        System.out.println(getTempoMedio(tempo, tMedio));
        System.out.println(getVencedor(tempo, pilotos));
        System.out.println(getPerdedor(tempo, pilotos));

    }

    private static String getVencedor(float[] tempo, String[] pilotos) {
        float tempoVencedor = 0f;
        String vencedor = "";


        for (int i = 0; i < tempo.length; i++) {
            if(tempo[i] > tempoVencedor){
                tempoVencedor = tempo[i];
                vencedor = pilotos[i];
            }
        }
        return "O nome do vencedor foi: " + vencedor;
    }

    private static String getPerdedor(float[] tempo, String[] pilotos) {
        float tempoPerdedor = Float.MAX_VALUE;
        String perdedor = "";

        for (int i = 0; i < tempo.length; i++) {
            if(tempo[i] < tempoPerdedor){
                tempoPerdedor = tempo[i];
                perdedor = pilotos[i];
            }
        }
        return "O nome do perdedor foi: " + perdedor;
    }

    private static String getTempoMedio(float[] tempo, float tMedio) {
        for (int i = 0; i < tempo.length; i++) {
            tMedio += tempo[i] / tempo.length;
        }
        return "O tempo médio da corrida foi: " + tMedio;
    }


}

