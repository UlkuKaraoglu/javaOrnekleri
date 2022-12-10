import java.util.Scanner;

public class vucutKitleEndeksi 
{
    public static void main(String[] args)
    {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Kilo değerinizi giriniz:");
        double kilo=scanner.nextDouble();

        System.out.println("Boy değerinizi giriniz(metre)");
        double boy=scanner.nextDouble();

        double VKI=kilo/(boy*boy);
        System.out.println("Vücut kitle endeksiniz:"+VKI);

        if (VKI<18.5)
        {
            System.out.println("Zayıf");
        } else if (18.5<VKI && VKI<24.9) {
            System.out.println("Normal");
        } else if (25<VKI && VKI<29.9) {
            System.out.println("Fazla kilolu");
        } else if (30<VKI && VKI<39.9) {
            System.out.println("Obez");
        } else if (VKI>40){
            System.out.println("İleri derecede obez");
        }


    }
}
