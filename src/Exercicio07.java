package Lista04;

public class Exercicio07 {
    public static void main(String[] args) {

        int v[] = {10,30,50,90,60,80,100,20,0,0,0,0,0,20,0,30,40,180,90,20,
                    0,0,0,0,0,30,20,50,60,10,0,0,0,40,50,0,0,54,0,20,
                    0,0,0,0,50,100,100,100};
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Set","Out","Nov","Dez"};
        int contadorSemana = 0;

        System.out.println("Secretaria de Obras do município");
        for (int i = 0; i < mes.length; i++){

            int acumuloMensal = 0;

            for (int j = 0; j < 4; j++){
                acumuloMensal = acumuloMensal + v[contadorSemana];

                contadorSemana ++;
            }

            System.out.println("O mês de " + mes[i] + " teve: "+ acumuloMensal + "ml de chuva.");
            System.out.print("Medidas preventiva: ");

            if(acumuloMensal == 0){
                System.out.println("Limpeza dos garis ");
            } else if(acumuloMensal <= 100){
                System.out.println("Limpeza tradicional das bocas-de-lobo(entradas das galerias) previnem inundações");
            }else if (acumuloMensal <= 250){
                System.out.println("Desobstrução das galerias subterrâneas");
            }else {
                System.out.println("Os canais de escoamento pluviais devem ser dragados");
            }

            System.out.println("-------------------------------------------------------------------------------------");
        }

    }
}
