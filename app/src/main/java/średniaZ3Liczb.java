
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class średniaZ3Liczb {
     public static void main(String[] args) {
        double liczba1 = pobierzLiczbe("Podaj pierwszą liczbę: ");
        double liczba2 = pobierzLiczbe("Podaj drugą liczbę: ");
        double liczba3 = pobierzLiczbe("Podaj trzecią liczbę: ");
        
        if (warunkiLiczb(liczba1, liczba2, liczba3)) {
            double srednia = średniaZ3Liczb(liczba1, liczba2, liczba3);
            System.out.println("Średnia z podanych liczb wynosi: " + srednia);
        } else {
            System.out.println("Podane liczby nie spełniają warunków.");
        }
    }

    public static double pobierzLiczbe(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        return scanner.nextDouble();
    }

    public static boolean warunkiLiczb(double liczba1, double liczba2, double liczba3) {
        return (liczba1 > 0 && liczba2 > 0 && liczba3 > 0);
    }

    public static double średniaZ3Liczb(double liczba1, double liczba2, double liczba3) {
        return (liczba1 + liczba2 + liczba3) / 3;
    }
}
