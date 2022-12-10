import java.util.Scanner;

public class ortalamaHesaplama
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double toplam=0;
        System.out.println("Kaç tane sayı gireceğinizi yazınız:");
        int sayi=scanner.nextInt();

        for (int i=0;i<sayi;i++)
        {
            System.out.println("Sayıyı giriniz:");
            double sayi2=scanner.nextDouble();
             toplam=sayi2+toplam;
        }
        double ortalama=toplam/sayi;
        System.out.println("Girdiğiniz sayıların ortalaması: "+ortalama);

    }
}
