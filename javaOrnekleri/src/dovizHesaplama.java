import java.util.Scanner;

public class dovizHesaplama
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dönüştürmek istediğiniz miktarı yazınız:");
        int para=scanner.nextInt();
        System.out.println("Dönüştürmek istediğiniz para birimini seçin");
        System.out.println("---------------");
        System.out.println("1-)Dolar");
        System.out.println("2-)Euro");
        System.out.println("3-)Pound");
        System.out.println("4-)Riyal");
        System.out.println("5-)İsviçre Frangı");
        System.out.println("---------------");
        int deger= scanner.nextInt();

        switch (deger) {
            case 1:
                double islem=para/18.64;
                System.out.println("Paranız"+islem+"$");
                break;
            case 2:
                double islem2=para/19.59;
                System.out.println("Paranız"+islem2+"€ ");
                break;
            case 3:
                double islem3=para/22.70;
                System.out.println("Paranız"+islem3+"£");
                break;
            case 4:
                double islem4=para/4.96 ;
                System.out.println("Paranız"+islem4+"﷼");
                break;
            case 5:
                double islem5=para/19.80;
                System.out.println("Paranız"+islem5+"CHF");
                break;
            default:
                System.out.println("Lütgen 1-5 arası bir seçim yapın.");
                break;
        }
    }
}
