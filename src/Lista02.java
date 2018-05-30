import java.util.Scanner;

public class Lista02 {
    public static void main(String[] args) {


        // Exercicio 01 ------------------------------------------------
        System.out.println("Exercicio 01 - ");
        System.out.println("Digite um número  - ");

        Scanner ler1 = new Scanner(System.in);
        int numero1 = ler1.nextInt();

        if (numero1 <= 0){
            System.out.println("Número inválido, digite um número inteiro maior que 0.");
        } else {
            if ((numero1 % 2) == 0 ){
                System.out.println("Número par");
            } else {
                System.out.println("Número impar");
            }
        }

        System.out.println("------------------------------------ ");


        // Exercicio 02 ------------------------------------------------
        System.out.println("Exercicio 02 - ");
        System.out.println("Digite o valor do cateto: ");
        Scanner ler2a = new Scanner(System.in);
        int cateto01 = ler2a.nextInt();

        System.out.println("O próximo valor é do segundo cateto(c) ou da hipotenusa(h) digite a letra correspondente:");
        Scanner ler2b = new Scanner(System.in);
        String segundoValor = ler2b.next();

        //Por que funciona com equals e não funciona com ==? )
        if (segundoValor.equals("c")){
            System.out.println("Digite o valor do segundo cateto para descobrir a hipotenusa:");
            Scanner ler2c = new Scanner(System.in);
            int cateto02 = ler2c.nextInt();

            double hipotenusa = (cateto01 * cateto01) + (cateto02 * cateto02);
            hipotenusa = Math.sqrt(hipotenusa);

            System.out.println("O valor da hipotenusa é: " + hipotenusa);

        }else if (segundoValor.equals("h")){
            System.out.println("Digite o valor da hipotenusa para descobrir o segundo cateto:");
            Scanner ler2d = new Scanner(System.in);
            int hipotenusa = ler2d.nextInt();
            double cateto02 = (hipotenusa * hipotenusa) - (cateto01 *cateto01);
            cateto02 = Math.sqrt(cateto02);

            System.out.println("O valor do segundo cateto é: " + cateto02);

        } else {
            System.out.println("Valor inválido.");
        }

        System.out.println("------------------------------------ ");


        // Exercicio 03 ------------------------------------------------
        System.out.println("Exercicio 03 - ");
        System.out.println("Entre com a nota da primeira prova:");
        Scanner ler3a = new Scanner(System.in);
        double nota01 = ler3a.nextDouble();

        System.out.println("Entre com a nota da segunda prova:");
        Scanner ler3b = new Scanner(System.in);
        double nota02 = ler3b.nextDouble();
        double media = (nota01 + nota02) / 2;

        if (media >= 6){
            System.out.println("APROVADO");
        } else {
            System.out.println("REPROVADO");
        }

        System.out.println("------------------------------------ ");



        // Exercicio 04 ------------------------------------------------
        System.out.println("Exercicio 04 - ");
        int a = -2;
        int b = -16;
        int c = -18;

        if (a == 0){
            System.out.println("A não pode valer 0");
        }else {

            double delta = (b*b) - (4*a*c);

            if (delta < 0 ){
                System.out.println("Delta não pode dar menor que 0");
            } else {

                double x1 = (-b + Math.sqrt(delta))/(2*a);
                double x2 = (-b - Math.sqrt(delta))/(2*a);

                System.out.println("Com de A B e C valendo respectivamente:" + a + " " + b + " " + c +
                        "\nx1 vale: " + x1 + " e x2: " + x2 );
            }
        }

        System.out.println("------------------------------------ ");



        // Exercicio 05 ------------------------------------------------
        System.out.println("Exercicio 05 - ");
        System.out.println("Digite sua data de nascimento: (formato dd-mm-aaaa)");
        Scanner ler5 = new Scanner(System.in);
        String nascimento = ler5.next();
        String datas[] = nascimento.split("-");

        int dia = Integer.parseInt(datas[0]);
        int mes = Integer.parseInt(datas[1]);
        int ano = Integer.parseInt(datas[2]);

        dia = 31 - dia;
        mes = (12 - mes) * 30;
        ano = (2018 - ano) * 365;

        int dias = dia + mes + ano;


        System.out.println("Você já viveu: " + dias + " dias");

    }
}
