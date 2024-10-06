/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xkwon
 */
import java.util.Scanner;
public class Lab2Q4 {
    public static void main (String[] args){
        String word;
        System.out.println("Enter your word: ");
        Scanner scan = new Scanner(System.in);
        word = scan.nextLine();
        System.out.println("Uppercased word: "+ word.toUpperCase());
    }
}
