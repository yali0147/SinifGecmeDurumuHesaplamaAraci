import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Sınıf Geçme Durumu Hesaplama aracı");
        double mat, fiz, tur, kim, muz;

        Scanner inp = new Scanner(System.in);

        System.out.print("Matematik notunuzu girin : ");
        mat = inp.nextDouble();

        System.out.print("Fizik notunuzu giriniz : ");
        fiz = inp.nextDouble();

        System.out.print("Türkçe notunuzu giriniz : ");
        tur = inp.nextDouble();

        System.out.print("Kimya notunuzu giriniz : ");
        kim = inp.nextDouble();

        System.out.print("Müzik notunuzu giriniz : ");
        muz = inp.nextDouble();

        double total = 0;
        int count = 0;


        if (mat >= 0 && mat <= 100) {
            total += mat;
            count++;
        } else {
            System.out.println("Matematik notunuz geçersiz.");
        }if (fiz >= 0 && fiz <= 100) {
            total += fiz;
            count++;
        } else {
            System.out.println("Fizik notunuz geçersiz.");
        }if (tur >= 0 && tur <= 100) {
                total += tur;
                count++;
        } else {
                System.out.println("Türkçe notunuz geçersiz.");
        }if (kim >= 0 && kim <= 100) {
                    total += kim;
                    count++;
        } else {
                System.out.println("Kimya notunuz geçersiz.");
        } if (muz >= 0 && muz <= 100) {
                        total += muz;
                        count++;
        } else {
            System.out.println("Müzik notunuz geçersiz.");
        }double avarage = total / count;

        if (avarage >= 55) {
            System.out.println("Tebrikler.Sınıfı geçtiniz.");

        } else {
            System.out.println("Maalesef.Sınıfta Kaldınız.");
        }
        System.out.printf("Ortalamanız : " + ("%.1f"), avarage);
    }
}
