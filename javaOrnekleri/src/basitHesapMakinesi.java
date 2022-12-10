import java.util.Scanner;

public class basitHesapMakinesi
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.print("1. Sayıyı giriniz: ");
        int sayi1=scanner.nextInt();

        System.out.print("2. Sayıyı giriniz: ");
        int sayi2=scanner.nextInt();

        System.out.println("Yapılacak işlemi seçiniz.");
        System.out.println("1. TOPLAMA");
        System.out.println("2. ÇIKARMA");
        System.out.println("3. ÇARPMA");
        System.out.println("4. BÖLME");
        int secim = scanner.nextInt();

        switch (secim) {
            case 1 -> System.out.println(sayi1 + "+" + sayi2 + "=" + (sayi1 + sayi2));
            case 2 -> System.out.println(sayi1 + "-" + sayi2 + "=" + (sayi1 - sayi2));
            case 3 -> System.out.println(sayi1 + "x" + sayi2 + "=" + (sayi1 * sayi2));
            case 4 -> System.out.println(sayi1 + "/" + sayi2 + "=" + ((float) sayi1 / sayi2));
        }

    }
}
