import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int mat, fizik, kimya, tr, tarih, muzik;

        Scanner input = new Scanner(System.in);

        //Kullanıcı Verileri
        System.out.print("Matematik Notunuz : ");
        mat = input.nextInt();

        System.out.print("Fizik Notunuz : ");
        fizik = input.nextInt();

        System.out.print("Kimya Notunuz : ");
        kimya = input.nextInt();

        System.out.print("Türkçe Notunuz : ");
        tr = input.nextInt();

        System.out.print("Tarih Notunuz : ");
        tarih = input.nextInt();

        System.out.print("Müzik Notunuz : ");
        muzik = input.nextInt();

        //Kullanıcının girdiği notların ortalaması.
        int toplam = (mat + fizik + kimya + tr + tarih + muzik);
        double ort = toplam / 6.0;
        System.out.println("Ortalamanız : " + ort);
        //Ortalamaya göre ekrana sonucu yazdırma.
        String sonuc = (ort > 60) ? "Sınıfı Geçti." : "Sınıfta Kaldı.";
        System.out.println(sonuc);

    }
}