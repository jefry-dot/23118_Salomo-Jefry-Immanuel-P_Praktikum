

public class genapGanjil {

    public static void main(String[] args) {
        System.out.println("Bilangan Ganjil 0-20: ");
        int i = 0;  
        while (i <= 20) {
            if (i % 2 != 0) {  
                System.out.print(i + " ");
            }
            i++;  
        }

        System.out.println("\n");
        System.out.println("Bilangan Genap 0-20: ");
        i = 0;  
        while (i <= 20) {
            if (i % 2 == 0) {  
                System.out.print(i + " ");
            }
            i++;  
        }
    }
}
