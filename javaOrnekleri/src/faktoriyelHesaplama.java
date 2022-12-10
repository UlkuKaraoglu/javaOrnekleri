import java.util.Scanner;

public class faktoriyelHesaplama {
  public static void main(String[] args)
  {
      Scanner scanner=new Scanner(System.in);
      System.out.println("Faktoriyeli hesaplanacak sayıyı giriniz:");
      int sayi=scanner.nextInt();
      int carpim=1;

      for (int i=1;i<=sayi;i++)
      {
          carpim=carpim*i;
      }
      System.out.println("İşlem sonucu "+carpim+"'dır");
  }
}
