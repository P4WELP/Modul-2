
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class wydrukowanieLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
         System.out.print("Podaj liczbę naturalną większą lub równą zeru: ");
        int liczba = scanner.nextInt();

        if (liczba < 0) {
            System.out.println("Podana liczba jest mniejsza od zera");
        } else {
            System.out.println("Liczby od 0 do " + liczba + ":");

            for (int i = 0; i <= liczba; i++) {
                System.out.println(i);
            }
        }
    }
    
    
}
