/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xkwon
 */
import java.util.Scanner;
public class Lab2Q11 {
    public static void  main (String[] args){
        double am, rate, y, val;
        System.out.println("Enter your amount: ");
        Scanner scan = new Scanner(System.in); 
        am = Double.parseDouble(scan.nextLine());
        System.out.println("Enter your annual interest rate: ");
        Scanner scan1 = new Scanner(System.in); 
        rate = Double.parseDouble(scan1.nextLine());
        System.out.println("Enter your number of years: ");
        Scanner scan2 = new Scanner(System.in); 
        y = Double.parseDouble(scan2.nextLine());
        val = am * Math.pow((1+rate), (y*12));
        System.out.println("Your future investment value is " + val + ".");
        
    }
}
