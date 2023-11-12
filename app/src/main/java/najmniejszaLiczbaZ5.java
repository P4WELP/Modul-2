
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class najmniejszaLiczbaZ5 {
    public static void main(String[] args) {
        szukajNajmniejszaLiczba();
    }

    public static void szukajNajmniejszaLiczba() {
        Scanner scanner = new Scanner(System.in);
        double najmniejszaLiczba = 0;

        for (int i = 1; i <= 5; i++) {
            System.out.print("Podaj liczbę " + i + ": ");
            double liczba = scanner.nextDouble();

            if (i == 1 || liczba < najmniejszaLiczba) {
                najmniejszaLiczba = liczba;
            }
        }

        System.out.println("Najmniejsza podana liczba to: " + najmniejszaLiczba);
    }
}
