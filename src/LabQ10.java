/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xkwon
 */
import java.util.Scanner;
public class LabQ10 {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String ans; // Declare outside the loop to use it after loop exit

    do {
        System.out.print("Please enter Y or N: ");
        ans = scan.nextLine(); // Read user input
    } while (!ans.equalsIgnoreCase("N"));

    // Outside the loop, because user input is either "Y" or "N"
    System.out.println("You entered: " + ans);
    }
}
