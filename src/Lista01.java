import java.util.Scanner;

public class Lista01 {
    public static void main(String[] args) {

        System.out.println("Lista 01 - Exxercicios 02");
        System.out.println("-------------------------");

        // Exercicio 02 - A
        System.out.println("Exercicio - A");

        double x = 1;
        double y = (x * 2) + (2 * x) + 10;

        System.out.println("Com x valendo = " + x + ". y vale: " + y);
        System.out.println("-------------------------");


        // Exercicio 02 - B
        System.out.println("Exercicio - B");
        System.out.println("Digite dois números a ser somados: ");
        Scanner lerB1 = new Scanner(System.in);
        Scanner lerB2 = new Scanner(System.in);
        double numero1 = lerB1.nextInt();
        double numero2 = lerB2.nextInt();

        double soma = numero1 + numero2;

        System.out.println("A soma dos dois números acima é: " + soma );
        System.out.println("-------------------------");


        // Exercicio 02 - C
        System.out.println("Exercicio - C");
        System.out.println("Digite o número em metros que queira converter em centimetros:");
        Scanner lerC = new Scanner(System.in);
        double metros = lerC.nextDouble();
        double centimetro = metros * 100;

        System.out.println("O número acima equivale a " + centimetro + "cm");
        System.out.println("-------------------------");


        // Exercicio 02 - D
        System.out.println("Exercicio -D");
        System.out.println("Valor a ser depositado: R$");
        Scanner lerD = new Scanner(System.in);
        double valorDepositado = lerD.nextDouble();
        double rendimento = valorDepositado + (valorDepositado*0.007);

        System.out.println("Valor com rendimento: R$" + rendimento );
        System.out.println("-------------------------");


        // Exercicio 02 - E
        System.out.println("Exercicio - E");
        System.out.println("Quanto se ganha por hora? em R$");
        Scanner lerE1 = new Scanner(System.in);
        double valorHora = lerE1.nextDouble();
        System.out.println("Quantas horas foram trabalhadas no mês?");
        Scanner lerE2 = new Scanner(System.in);
        double horas = lerE2.nextInt();

        double salario = valorHora * horas;

        System.out.println("O salário do mês será: R$" + salario);
        System.out.println("-------------------------");


        // Exercicio 02 - F
        System.out.println("Exercicio - F");
        System.out.println("Valor da compra: R$");
        Scanner lerF = new Scanner(System.in);
        double valorCompra = lerF.nextDouble();
        double parcelas = valorCompra/5;

        System.out.println("Ficam 5 parcelas de R$" + parcelas + " sem juros.");
        System.out.println("-------------------------");


        // Exercicio 02 - G
        System.out.println("Exercicio - G");
        System.out.println("Digite o valor de custo do produto:");
        Scanner lerG1 = new Scanner(System.in);
        double valorCusto = lerG1.nextDouble();

        System.out.println("Percentual a adicionar ao valor de custo:");
        Scanner lerG2 = new Scanner(System.in);
        double percent = lerG2.nextDouble();

        double valorVenda = (percent*valorCusto)/100 + valorCusto;


        System.out.println("O valor de venda do produto é R$" + valorVenda);
        System.out.println("-------------------------");


        // Exercicio 02 - H
        System.out.println("Exercicio - H");
        System.out.println("Digite o nome do aluno:");
        Scanner lerH1 = new Scanner(System.in);
        String nomeAluno = lerH1.next();
        System.out.println("Número de crédito cursado:");
        Scanner lerH2 = new Scanner(System.in);
        int creditosCursado = lerH2.nextInt();
        System.out.println("Valor unitário do crédito: R$");
        Scanner lerH3 = new Scanner(System.in);
        double valorCredito = lerH3.nextDouble();
        double valorMensalidade = creditosCursado * valorCredito;

        System.out.println("Aluno:" + nomeAluno + " sua mensalidade será de R$" + valorMensalidade);
        System.out.println("-------------------------");


        // Exercicio 02 - I
        System.out.println("Exercicio - I");
        System.out.println("Digite o nome do carro:");
        Scanner lerI1 = new Scanner(System.in);
        String nomeCarro = lerI1.next();

        System.out.println("Digite o preço de fábrica:");
        Scanner lerI2 = new Scanner(System.in);
        double valorFabrica = lerI2.nextDouble();
        double valorFinal = valorFabrica*0.45 + valorFabrica*0.28 + valorFabrica;

        System.out.println("O valor do carro " + nomeCarro + " é R$" + valorFinal);
        System.out.println("-------------------------");


        // Exercicio 02 - J
        System.out.println("Exercicio -J");

        System.out.println("Digite o preço de fábrica:");
        Scanner lerJ2 = new Scanner(System.in);
        double valorFabrica2 = lerJ2.nextDouble();
        double valorFinal2 = (valorFabrica2*0.45) + (valorFabrica2*0.45 + valorFabrica2)*0.28 + valorFabrica;

        System.out.println("O valor do carro é de R$" + valorFinal2 );
        System.out.println("---------------------------");

    }
}
