package d;

public class anakAyam {
    int anakayam;

    
    public anakAyam(int n) {
        this.anakayam = n;
    }

    public void songstart() {
        while (anakayam > 1) {
            System.out.println("\nTek kotek, kotek kotek");
            System.out.println("Anak ayam turunlah berkotek");
            System.out.println("Anak ayam turunlah " + anakayam);

            // Mengurangi jumlah anak ayam
            anakayam--;
            System.out.println("Mati satu tinggallah " + anakayam);
        }

        System.out.println("Mati satu tinggallah induknya");
    }
}
