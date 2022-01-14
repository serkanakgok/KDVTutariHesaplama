import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner alinanPara = new Scanner(System.in);

        System.out.print("Lütfen biraz para veriniz: ");

        int alinan = alinanPara.nextInt();
        double kdvsiz = alinan;

        if (alinan > 0 && alinan < 1000) {
            double kdv1 = (kdvsiz * 18) / 100 + alinan;
            double tutar1 = (kdvsiz * 18) / 100;
            System.out.println("KDV'siz Fiyat: " + alinan + "\nKDV oranı: 18%" + "\nKDV'li Fiyat: " + kdv1 + "\nKDV Tutarı: " + tutar1);
        } else if (alinan >= 1000) {
            double kdv2 = (kdvsiz * 8) / 100 + alinan;
            double tutar2 = (kdvsiz * 8) / 100;
            System.out.println("KDV'siz Fiyat: " + alinan + "\nKDV oranı: 8%" + "\nKDV'li Fiyat: " + kdv2 + "\nKDV Tutarı: " + tutar2);

        } else if (alinan==0){
            System.out.println("Sıfır diye para mı olur fakir.");
            return;
        }else{
            System.out.println("Size borcumuz yoktur :-)");
        }
    }
}
