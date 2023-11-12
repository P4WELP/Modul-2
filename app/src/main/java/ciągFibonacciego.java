/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class ciągFibonacciego {
    public static void main(String[] args) {
        ciagFibo(10);
    }
    
    public static void ciagFibo(int n) {
        if (n <= 0){
            System.out.println("Podana liczba musi być większa od zera.");
            return;
        }
        
        int liczba1 = 0;
        int liczba2 = 1;
        
        System.out.println("Ciąg Fibonacciego do " + n + ":");
        System.out.println(liczba1 + " " + liczba2 + " ");
        
        while (liczba1 + liczba2 <= n) {
            int suma = liczba1 + liczba2;
            System.out.print(suma + " ");
            liczba1 = liczba2;
            liczba2 = suma;
        }
        
        System.out.println();
    }
}
