import java.util.Scanner;

public class dataMahasiswa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    
        System.out.print("NPM: ");
        String npm = input.nextLine();

        System.out.print("Nama Mahasiswa: ");
        String nama = input.nextLine();

        System.out.print("Nilai Kehadiran: ");
        double nilaiKehadiran = input.nextDouble();

        System.out.print("Nilai Tugas: ");
        double nilaiTugas = input.nextDouble();

        System.out.print("Nilai UTS: ");
        double nilaiUTS = input.nextDouble();

        System.out.print("Nilai UAS: ");
        double nilaiUAS = input.nextDouble();

        double nilaiAkhir = (0.10 * nilaiKehadiran) + (0.20 * nilaiTugas) + (0.30 * nilaiUTS) + (0.40 * nilaiUAS);

        char grade;
        String keterangan;

        if (nilaiAkhir >= 0 && nilaiAkhir <= 45) {
            grade = 'E';
            keterangan = "KURANG SEKALI";
        } else if (nilaiAkhir > 45 && nilaiAkhir <= 55) {
            grade = 'D';
            keterangan = "KURANG";
        } else if (nilaiAkhir > 55 && nilaiAkhir <= 65) {
            grade = 'C';
            keterangan = "CUKUP";
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 75) {
            grade = 'B';
            keterangan = "BAIK";
        } else {
            grade = 'A';
            keterangan = "ISTIMEWA";
        }

        System.out.println("\nNPM Mahasiswa: " + npm);
        System.out.println("Nama Mahasiswa: " + nama);
        System.out.println("Nilai Rata-rata: " + nilaiAkhir);
        System.out.println("Grade: " + grade);
        System.out.println("Keterangan: " + keterangan);

        input.close();
    }
}
