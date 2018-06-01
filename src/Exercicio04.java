package Lista04;

import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        double[] numeros = new double[10];
        double maiorNumero = 0;
        double[] divisao = new double[10];

        System.out.println("Digite 10 números: ");

        for (int i = 0; i < 10; i++){
            Scanner ler = new Scanner(System.in);
            numeros[i] = ler.nextDouble();

            if (maiorNumero < numeros[i] ){
                maiorNumero = numeros[i];
            }
        }
        System.out.println("Maior Número é " + maiorNumero);

        for(int i = 0; i < 10; i++){
            divisao[i] = numeros[i] /maiorNumero;
            System.out.println("A divisão de "+ numeros[i] + " por " + maiorNumero + " é = " + divisao[i] );
        }


        System.out.print("Vetor: [");
        for(int i = 0; i<10;i++){
            System.out.print( numeros[i] + "] [");
        }

    }
}
