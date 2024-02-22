import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n1, n2;
        int ebob = 1;
        int ekok = 0;
        int i = 1;

        Scanner inp = new Scanner(System.in);

        System.out.println("Lütfen İki Sayı Giriniz : ");
        n1 = inp.nextInt();
        n2 = inp.nextInt();

        while(i <= n1 && i <= n2){
            i++;
            if(n1 % i == 0 && n2 % i == 0){
                ebob = i;
            }

        }
        System.out.println(n1 + " ve " + n2 + " sayılarının Ebob Değeri : " + ebob);


        while(i < n1 * n2){
            i++;
            if(i % n1 == 0 && i % n2 == 0){
                ekok = i;
                break;
            }
        }
        System.out.println("Sayıların Ekok Değeri : " + ekok);


    }
}