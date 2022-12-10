import java.util.Scanner;

public class vizeFinalHesaplama
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.print("Vize notunu giriniz:");
        int vize=scanner.nextInt();

        System.out.print("Final notunu giriniz:");
        int ffinal=scanner.nextInt();

        double ortalama=vize*0.4+ffinal*0.6;
        System.out.println("Ders ortalaması "+ortalama+"'dır.");
        if (ortalama>=50) {
            System.out.println("Dersi geçtiniz Tebrikler!");
        }
        else {
            System.out.println("Dersten kaldınız.");
        }
    }
}
