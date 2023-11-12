/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class silnia {
    public static void main(String[] args) {
        int liczba = 3; // Przykład: obliczamy 5!

        int wynik = obliczSilnie(liczba);
        System.out.println(liczba + "! = " + wynik);
    }

    public static int obliczSilnie(int n) {
        if (n < 1) {
            System.out.println("Liczba musi być większa lub równa 1.");
        }

        int silnia = 1;
        for (int i = 1; i <= n; i++) {
            silnia *= i;
        }

        return silnia;
    }
}
