public class Nilai {
    String NIM;
    String Nama;
    double nilaiAbsen;
    double nilaiTugas;
    double nilaiUTS;
    double nilaiUAS;
    double nilaiAkhir;

    double hitungNilaiAkhir() {
        nilaiAkhir = (nilaiAbsen * 0.10f) + (nilaiTugas * 0.20f) + (nilaiUTS * 0.30f) + (nilaiUAS * 0.40f);
        return nilaiAkhir;
    }
    

    void cetakNilai(){
        System.out.println("NIM             : " + NIM);
        System.out.println("Nama            : " + Nama);
        System.out.println("Nilai Absen     : " + nilaiAbsen);
        System.out.println("Nilai Tugas     : " + nilaiTugas);
        System.out.println("Nilai UTS       : " + nilaiUTS);
        System.out.println("Nilai UAS       : " + nilaiUAS);
        System.out.println("Nilai Akhir     : " + hitungNilaiAkhir());
    }
}
