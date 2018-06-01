package Lista04;

import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        double[] numeros = new double[15];

        System.out.println("Digite 15 valores inteiros:");
        for (int i = 0; i < numeros.length; i++){
            Scanner ler = new Scanner(System.in);
            numeros[i] = ler.nextDouble();
        }

        System.out.println("Digite 10 valores inteiros:");

    }
}
