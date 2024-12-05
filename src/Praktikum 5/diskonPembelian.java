import java.util.Scanner;

public class diskonPembelian {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Total pembelian Rp. = ");
        double totalPembelian = input.nextDouble();

        double potongan;
        if (totalPembelian < 50000) {
            potongan = totalPembelian * 0.05;
        } else {
            potongan = totalPembelian * 0.20;
        }

        double totalBayar = totalPembelian - potongan;

        System.out.println("Besarnya potongan Rp. " + potongan);
        System.out.println("Jumlah yang harus dibayarkan Rp. " + totalBayar);
    }
}
