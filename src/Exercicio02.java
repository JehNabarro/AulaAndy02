package Lista04;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        // Exercicio 02 - B
        System.out.println("Exercicio - 01");
        String[] nomes = new String[5];
        String[] endereco = new String[5];

        for (int i = 0; i < 5; i++){
            System.out.println("Digite o Nome:");
            Scanner ler1a = new Scanner(System.in);
            nomes[i] = ler1a.next();
            System.out.println("Digite o Endereço:");
            Scanner ler1b = new Scanner(System.in);
            endereco[i] = ler1b.next();
        }

        System.out.println("Digite o nome para saber o endereço");
        Scanner ler1c = new Scanner(System.in);
        String buscaEndereco = ler1c.next();

        for (int i = 0; i < nomes.length; i++ ){
            if (nomes[i].equals(buscaEndereco)){
                System.out.println("O endereço é: " + endereco[i] );
            }
        }



    }
}
