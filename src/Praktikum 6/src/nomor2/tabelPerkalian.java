package nomor2;


 
public class tabelPerkalian {
 
    public static void main(String[] args) {
 
        System.out.println("\t Tabel Perkalian 1-10 ");
 
        for (int i = 1; i <= 10; i++) {
 
            for(int j = 1; j <= 10; j++){
 
                System.out.print(" " + i * j + "\t");
            }
            System.out.print("\n");
        }
    }
}