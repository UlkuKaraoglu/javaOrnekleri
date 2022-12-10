import java.util.Random;
import java.util.Scanner;

public class sayiTahminOyunu
{
    public static void main(String[] args)
    {
        int sayac1=0,sayac2=0;
        Scanner scanner = new Scanner(System.in);
        Random random= new Random();

        int sayi = random.nextInt(101);

        System.out.println("Tahmininizi yazınız:");
        int tahmin = scanner.nextInt();

        while (tahmin != sayi) {
            if(tahmin > 100 || tahmin < 0) {
                System.out.println("Tahmininiz 1-100 arasında olmalıdır!!!: ");
                tahmin = scanner.nextInt(); }

            else if (tahmin < sayi) {
                System.out.println("Daha büyük bir sayı giriniz: ");

                tahmin = scanner.nextInt();
                sayac1++;
            }
            else{
                System.out.println("Daha küçük bir sayı giriniz: ");

                tahmin = scanner.nextInt();
                sayac2++;
            }
        }
        int tSayisi=sayac1+sayac2;
        System.out.println("Tebrikler doğru tahmin");
        System.out.println("Random sayı:"+sayi);
        System.out.println("Deneme sayınız:"+tSayisi);

    }
}