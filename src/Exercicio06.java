package Lista04;

public class Exercicio06 {
    public static void main(String[] args) {

        int a[] = {10,30,50,90,60,50};
        int b[] = {12,13,15,19,10,5};
        int c[] = new int[6];
        int contador = 5;


        for (int i = 0; i < 6; i++){
            c[i] = a[i] - b[contador];
            contador --;
        }

        System.out.print("Vetor C: ");
        for(int i =0; i< 6;i++){
            System.out.print(c[i] + ", ");
        }
    }
}
