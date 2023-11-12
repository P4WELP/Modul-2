/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Trójkąt {
    public static void main(String[] args) {
        rysujTrojkat(7);
    }
    
    public static void rysujTrojkat(int wysokosc){
        if(wysokosc <= 0) {
            System.out.println("Wysokość musi być wieksza od 0.");
            return;
        }
        
        for (int i = 1; i <= wysokosc; i++){
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
    }
}}
