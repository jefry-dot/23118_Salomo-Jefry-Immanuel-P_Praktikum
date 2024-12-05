public class DemoNilai {
    public static void main(String[] args) throws Exception {
        Nilai nilai = new Nilai();
        nilai.NIM = "23118";
        nilai.Nama = "Salomo Jefry IP";
        nilai.nilaiAbsen = 00;
        nilai.nilaiTugas = 00;
        nilai.nilaiUTS = 85;
        nilai.nilaiUAS = 90;
        
        nilai.cetakNilai();
    }
}