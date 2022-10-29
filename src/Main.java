import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int number,counter=0,total=0;
        System.out.print("Sayiyi Giriniz :");
        number=input.nextInt();
        System.out.println("Girilen Sayi: "+number);

        while(number!=0)
        {
            total+=(number%10);
            number/=10;
            counter++;
        }

        System.out.println("Basamak Sayisi: "+counter);
        System.out.println("Basamak Degerlerinin Toplami : "+total);




    }
}