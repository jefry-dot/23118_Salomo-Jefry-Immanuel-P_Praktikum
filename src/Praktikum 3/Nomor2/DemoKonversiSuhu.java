package Nomor2;

public class DemoKonversiSuhu {
    public static void main(String[] args) {
        
        KonversiSuhu konversi1 = new KonversiSuhu();
        
        KonversiSuhu2 konversi2 = new KonversiSuhu2();

        
        double celcius = 100;
        System.out.println("Celcius to Fahrenheit: " + konversi1.celciusToFahrenheit(celcius));
        System.out.println("Celcius to Reamur: " + konversi1.celciusToReamur(celcius));

        
        double fahrenheit = 212;
        System.out.println("Fahrenheit to Reamur: " + konversi2.fahrenheitToReamur(fahrenheit));
    }
}