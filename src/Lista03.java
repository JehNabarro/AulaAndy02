import java.util.Scanner;

public class Lista03 {

    public static void main(String[] args) {

        // Exercicio 02 ------------------------------------------------
        System.out.println("Exercicio 02 - ");
        System.out.println("Digite cinco números inteiros qualquer - ");

        int soma = 0;

        for (int i = 0; i < 5 ; i++){
            Scanner ler = new Scanner(System.in);
            int numero = ler.nextInt();
            soma = soma + numero;
        }

        System.out.println("A soma dos números digitados é " + soma);

        System.out.println("-----------------------------------------");



        // Exercicio 03 ------------------------------------------------
        System.out.println("Exercicio 03 - ");
        System.out.println("Digite um número inteiro - ");

        Scanner ler2 = new Scanner(System.in);
        int numero2 = ler2.nextInt();

        int resultado = 1;

        for (int i = 1; i <= numero2; i++) {

            resultado = resultado * i;

        }

        System.out.println("Fatorial: " + resultado);

        System.out.println("-----------------------------------------");



        // Exercicio 04 ------------------------------------------------

        System.out.println("Exercicio 04 - ");
        System.out.println("Digite um número inteiro - ");

        Scanner ler3 = new Scanner(System.in);
        int numero3 = ler3.nextInt();

        for (int i = numero3; i < (numero3 + 20); i++){
            System.out.println(i+1);
        }

         System.out.println("-----------------------------------------");



        // Exercicio 05 ------------------------------------------------
        System.out.println("Exercicio 05 - ");
        System.out.println("Digite dois numeros para ser somado o intervalo entre eles:");
        Scanner ler5a = new Scanner(System.in);
        Scanner ler5b = new Scanner(System.in);
        int numero5a = ler5a.nextInt();
        int numero5b = ler5b.nextInt();
        int total = 0;

        for (int i = numero5a; i <= numero5b; i++){
            total = total + i;

        }

        System.out.println("O tolta da soma entre o intervalo de números é: "+ total);
        System.out.println("-----------------------------------------");



        // Exercicio 06 ------------------------------------------------
        System.out.println("Exercicio 06 - ");
        System.out.println("Digite 15 números para ser somado os 5 primeiros, depois do 6 até o 10 e os 5 últimos:");

        int soma1 = 0;
        int soma2 = 0;
        int soma3 = 0;

        for (int i = 0; i < 5 ; i++){
                Scanner ler = new Scanner(System.in);
                int numero = ler.nextInt();
                soma1 = soma1 + numero;
        }
        for (int i = 0; i < 5 ; i++){
            Scanner ler = new Scanner(System.in);
            int numero = ler.nextInt();
            soma2 = soma2 + numero;
        }
        for (int i = 0; i < 5 ; i++){
            Scanner ler = new Scanner(System.in);
            int numero = ler.nextInt();
            soma3 = soma3 + numero;
        }

        System.out.println("A soma dos 5 primeiros números é: " + soma1);
        System.out.println("A soma dos 6 até 10 números é: " + soma2);
        System.out.println("A soma dos 10 até 15 números é: " + soma3);

        System.out.println("-----------------------------------------");



        // Exercicio 07 ------------------------------------------------
        System.out.println("Exercicio 07 - ");
        System.out.println("Digite dois números inteiros para ser mostrado os pares entre eles:");

        Scanner ler7 = new Scanner(System.in);
        int intervaloA = ler7.nextInt();
        Scanner ler7b = new Scanner(System.in);
        int intervaloB = ler7b.nextInt();

        for (int i = intervaloA; i < intervaloB; i++) {
            if (i > 10){
                if ((i % 2) == 0 ){
                    System.out.println(i);
                }
            }
        }

        System.out.println("-----------------------------------------");



        // Exercicio 08 ------------------------------------------------
        System.out.println("Exercicio 08 - ");
        System.out.println("Entre com 10 números quaisquer, para ser somado os pares de 1 a 5 e os ímpares de 6 a 10");

        int somaPar = 0;
        int somaImpar = 0;

        for (int i = 0; i < 5 ; i++) {
            Scanner ler8 = new Scanner(System.in);
            int numeros = ler8.nextInt();

            if ((numeros % 2) == 0){
                somaPar = somaPar + numeros;
            }
        }
        for (int i = 0; i < 5 ; i++) {
            Scanner ler8 = new Scanner(System.in);
            int numeros = ler8.nextInt();

            if ((numeros % 2) != 0){
                somaImpar = somaImpar + numeros;
            }
        }

        System.out.println("A soma dos primeiros 5 números pares é:" + somaPar );
        System.out.println("A soma dos 5 últimos números ímpares é:" + somaImpar );

        System.out.println("-----------------------------------------");



        // Exercicio 09 ------------------------------------------------
        System.out.println("Exercicio 09 - ");
        System.out.println("Entre com valores inteiros:");
        System.out.println("(ao terminar digite 0)");

        Scanner ler9 = new Scanner(System.in);
        int valores = ler9.nextInt();
        int contador9 = 1;
        int somaValores = valores;

        while ( valores != 0 ){
            Scanner ler9a = new Scanner(System.in);
            valores = ler9a.nextInt();
            if ( valores != 0 ) {
                somaValores = somaValores + valores;

                contador9++;

            }
        }

        System.out.println("O número de valores digitados é " + contador9);
        System.out.println("A soma dos valores é " + somaValores);
        System.out.println("A media aritmética do somatorio é: "+ somaValores/contador9);

        System.out.println("-----------------------------------------");



         // Exercicio 10 ------------------------------------------------
        System.out.println("Exercicio 10 - ");
        System.out.println("Entre com o valor base:");
        Scanner ler10a = new Scanner(System.in);
        int valorBase = ler10a.nextInt();

        System.out.println("Entre com o valor expoente:");
        Scanner ler10b = new Scanner(System.in);
        int expoente = ler10b.nextInt();
        int potenciacao = 1;

        for (int i = 1; i <= expoente; i++){

            potenciacao = potenciacao*valorBase;

        }

        System.out.println("A resposta para essa equação é: " + potenciacao);

        System.out.println("-----------------------------------------");






        // Exercicio 13 ------------------------------------------------
        System.out.println("Exercicio 13 - ");
        System.out.println("Digite um número para saber a tabuada do mesmo:");
        Scanner ler13 = new Scanner(System.in);
        int tabuada = ler13.nextInt();

        System.out.println("Tabuada do " + tabuada);

        for ( int i = 1; i <= 10; i++) {

            System.out.println( i + " x " + tabuada + " = " + (tabuada*i));
        }

        System.out.println("-----------------------------------------");



        // Exercicio 14 ------------------------------------------------
        System.out.println("Exercicio 14 - ");
        System.out.println("Entre com 2 números quaisquer(O primeiro deve ser menor que o segundo):");

        Scanner ler14a = new Scanner(System.in);
        Scanner ler14b = new Scanner(System.in);
        int x = ler14a.nextInt();
        int y = ler14b.nextInt();
        int somaNumPar = 0;
        int multNumImpar = 1;

        if ( x < y ){

            for (int i = x; i <= y ; i++) {
                if ((i % 2) == 0){
                    somaNumPar = somaNumPar + i;
                }else{
                    multNumImpar = multNumImpar * i;
                }
            }

            System.out.println("A soma dos números pares desse intervalo de números é: " + somaNumPar);
            System.out.println("A multiplicação dos números ímpares desse intervalo de números é: " + multNumImpar);

        } else {
            System.out.println("O primeiro número deve ser menor que o segundo.");
        }


        System.out.println("-----------------------------------------");



        // Exercicio 15 ------------------------------------------------
        System.out.println("Exercicio 15 - ");
        System.out.println("Entre com as idades: (ao terminar digite 0)");

        Scanner ler15 = new Scanner(System.in);
        int idades = ler15.nextInt();
        int contador = 1;
        int mediaIdades = idades;
        int menorIdade = idades;
        int maiorIdade = idades;

        while ( idades != 0 ){
            Scanner ler15a = new Scanner(System.in);
            idades = ler15a.nextInt();
            if ( idades != 0 ) {
                mediaIdades = mediaIdades + idades;
                contador++;

                if ( idades > maiorIdade ){
                    maiorIdade = idades;
                }else if (idades < menorIdade ){
                    menorIdade = idades;
                }
            }
        }

        System.out.println("O número de pessoas é " + contador);
        System.out.println("idade média do grupo: " + mediaIdades/contador + " anos.");
        System.out.println("A menor idade é: "+ menorIdade + " anos e a maior é: "+ maiorIdade + " anos.");

        System.out.println("-----------------------------------------");



//        // Exercicio 11 ------------------------------------------------
//        System.out.println("Exercicio 11 - ");
//
//        double mediaSeq = 0;
//
//        for (int i = 2; i <= 50; i++){
//            mediaSeq = 1/i;
//        }
//
//        System.out.println("A média da sequecia é:" + mediaSeq);
//
//        System.out.println("-----------------------------------------");


        // Exercicio 12 -------------------------------------------------

//            System.out.println("Exercicio 12 - ");
//            System.out.println("Números primos de 1 a 50 - ");
//
//            for (int i = 1; i <= 50; i++){
//                for (int j = 1; j <= i; j++){
//                     if ( ( i % j ) != 0 ){
//                        System.out.println( i );
//
//                    }
//                }
//            }
//
//

//        // 12
//
//        for (int i = 2; i <= 100; i++) {
//            if( ehPrimo(i) )
//                System.out.println(i + " é primo.");
//            }
//
//        }
//
//        private static boolean ehPrimo(int numero) {
//            for (int j = 2; j < numero; j++) {
//                if (numero % j == 0)
//                    return false;
//            }
//            return true;

       }
}
