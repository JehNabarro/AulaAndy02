package Lista04;

import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {

        double[] numeros = new double[10];

        System.out.println("Digite 10 números:");
        for (int i = 0; i < 10; i++){
            Scanner ler = new Scanner(System.in);
            numeros[i] = ler.nextDouble();
        }

        System.out.print("Números múltiplos de 2: ");
        for (int i = 0; i < 10; i++) {
            if ((numeros[i] % 2) == 0) {
                System.out.print(numeros[i] + ", ");
            }
        }
        System.out.println(" ");

        System.out.print("Números múltiplos de 3: ");
        for (int i = 0; i < 10; i++) {
            if ((numeros[i] % 3) == 0) {
                System.out.print(numeros[i] + ", ");
            }
        }

        System.out.println(" ");
        System.out.print("Números múltiplos de 2 e 3: ");
        for (int i = 0; i < 10; i++) {
            if ((numeros[i] % 2 ) == 0 || (numeros[i] % 3 ) == 0) {
                System.out.print(numeros[i] + ", ");
            }
        }
    }
}
