import java.util.Scanner;

public class IndeksMassaTubuh {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

 
        System.out.print("Masukkan berat badan (kg): ");
        double beratBadan = input.nextDouble();

        System.out.print("Masukkan tinggi badan (m): ");
        double tinggiBadan = input.nextDouble();


        double imt = beratBadan / (tinggiBadan * tinggiBadan);

        // Menentukan kategori berdasarkan nilai IMT
        String kategori;
        if (imt < 18.5) {
            kategori = "Berat Badan Kurang";
        } else if (imt < 25) {
            kategori = "Berat Badan Ideal";
        } else if (imt < 30) {
            kategori = "Berat Badan Lebih";
        } else if (imt < 40) {
            kategori = "Gemuk";
        } else {
            kategori = "Sangat Gemuk";
        }

 
        System.out.printf("Nilai IMT: %.2f%n", imt);
        System.out.println("Kategori: " + kategori);
    }
}
