import java.util.Scanner;
public class KDVHesaplayanProgram{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);

        System.out.println("Ürün Tutarını Giriniz");
        double urunTutarı= scanner.nextDouble();

        // kdv oranını belirle
        double kdvOrani = (urunTutarı > 1000) ? 0.08 : 0.18;

        // kdv li fiyatı ve KDV tutarını hesapla
        double kdvliFiyat = urunTutarı * (1 + kdvOrani);
        double kdvTutari = urunTutarı * kdvOrani;

        System.out.println("KDV'siz Fiyat: " + urunTutarı + " TL");
        System.out.println("KDV Oranı: %" + (kdvOrani * 100));
        System.out.println("KDV'li Fiyat: " + kdvliFiyat + " TL");
        System.out.println("KDV Tutarı: " + kdvTutari + " TL");

        scanner.close();
    }
}















