public class MatematikaBeraksi {    
    public static void main(String[] args) {
       Dasar balok = new Balok(5, 3, 4);
       Dasar kubus = new Kubus(5);

       System.out.println("Volume balok = " + balok.hitungVolume());
       System.out.println("Luas permukaan balok = " + balok.hitungLuasPermukaan());
       System.out.println("Volume kubus = " + kubus.hitungVolume());
       System.out.println("Luas permukaan kubus = " + kubus.hitungLuasPermukaan());
    }
    
}
