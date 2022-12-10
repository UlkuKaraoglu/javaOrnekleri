import java.util.Scanner;

public class negatifMiPozitifMi
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);

        System.out.println("Bir sayı giriniz");
        int sayi= scanner.nextInt();

        if (sayi<0)
        {
            System.out.println("Sayı NEGATİF'tir. ");
        }
        else if (sayi>0)
        {
            System.out.println("Sayı POZİTİF'tir. ");
        } else if (sayi==0)
        {
            System.out.println("Sayı NÖTÜR'dür. ");
        }
        else
        {
            System.out.println("Lütfen SAYI değeri giriniz.");
        }
    }
}
