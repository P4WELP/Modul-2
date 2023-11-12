
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class sumowanieLiczb {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj liczbę naturalną większą lub równą zeru: ");
        int liczba = scanner.nextInt();
        
        if (liczba <0) {
            System.out.println("Podana liczba jest mniejsza od zera");
        } else {
            int suma = 0;
            
            for (int i = 0; i <= liczba; i++){
                suma += i;
            }
            System.out.println("Suma liczb od 0 do " + liczba + " wynosi: " + suma);
        }
    }
}
