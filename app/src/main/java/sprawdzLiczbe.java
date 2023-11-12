
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class sprawdzLiczbe {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbę: ");
        double liczba = scanner.nextDouble();
        
        sprawdzLiczbe(liczba);
    }

    public static void sprawdzLiczbe(double liczba) {
        if (liczba > 0) {
            System.out.println("Liczba jest większa od zera.");
        } else {
            System.out.println("Liczba jest mniejsza od zera.");
        }
    }
}

