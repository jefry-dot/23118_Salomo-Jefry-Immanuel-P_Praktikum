import java.util.Scanner;

public class TokoSerbaAdaRun {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan Item Barang: ");
        int itemCount = scanner.nextInt();
        scanner.nextLine(); // Menyerap newline

        String[] kodePembelian = new String[itemCount];
        int[] jumlahBeli = new int[itemCount];
        int totalBayar = 0;

        // Input data pembelian
        for (int i = 0; i < itemCount; i++) {
            System.out.println("Data ke " + (i + 1));
            System.out.print("Masukkan Kode: ");
            kodePembelian[i] = scanner.nextLine();

            System.out.print("Masukkan Jumlah Beli: ");
            jumlahBeli[i] = scanner.nextInt();
            scanner.nextLine(); // Menyerap newline

            
            totalBayar += TokoCalculator.hitungTotalPerBarang(kodePembelian[i], jumlahBeli[i]);
        }

  
        System.out.println("\nTOKO SERBA ADA");
        System.out.println("**************************************");
        System.out.println("No   Kode Barang   Nama Barang   Harga   Jumlah Beli   Jumlah Bayar");
        System.out.println("===============================================================");

        for (int i = 0; i < itemCount; i++) {
            String namaBarang = TokoCalculator.getNamaBarang(kodePembelian[i]);
            int harga = TokoCalculator.getHargaBarang(kodePembelian[i]);
            int jumlahBayar = TokoCalculator.hitungTotalPerBarang(kodePembelian[i], jumlahBeli[i]);

            System.out.printf("%-5d%-13s%-13s%-8d%-12d%d\n",
                    (i + 1), kodePembelian[i], namaBarang, harga, jumlahBeli[i], jumlahBayar);
        }

        System.out.println("===============================================================");
        System.out.println("Total Bayar\t\t\t\t\t\t" + totalBayar);
    }
}
