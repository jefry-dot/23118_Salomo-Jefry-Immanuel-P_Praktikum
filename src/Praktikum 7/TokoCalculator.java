public class TokoCalculator {
    // Daftar barang
    private static final String[] kodeBarang = {"a001", "a002", "a003"};
    private static final String[] namaBarang = {"Buku", "Pensil", "Pulpen"};
    private static final int[] hargaBarang = {3000, 4000, 5000};

  
    public static String getNamaBarang(String kode) {
        for (int i = 0; i < kodeBarang.length; i++) {
            if (kodeBarang[i].equalsIgnoreCase(kode)) {
                return namaBarang[i];
            }
        }
        return null;
    }

    // Metode untuk mencari harga barang berdasarkan kode
    public static int getHargaBarang(String kode) {
        for (int i = 0; i < kodeBarang.length; i++) {
            if (kodeBarang[i].equalsIgnoreCase(kode)) {
                return hargaBarang[i];
            }
        }
        return 0;
    }

    // Metode untuk menghitung total harga per item
    public static int hitungTotalPerBarang(String kode, int jumlah) {
        int harga = getHargaBarang(kode);
        return harga * jumlah;
    }
}
