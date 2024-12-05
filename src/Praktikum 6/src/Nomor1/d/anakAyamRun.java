package d;

import java.util.Scanner;

public class anakAyamRun {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Masukkan Jumlah anak ayam: ");
            if (input.hasNextInt()) {
                anakAyam ayam = new anakAyam(input.nextInt());
                ayam.songstart();
                break; 
            } else {
                System.out.println("Input harus bilangan bulat");
                input.next(); // Mengabaikan input yang salah
            }
        }

        input.close();
    }
}
