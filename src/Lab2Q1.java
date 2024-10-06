/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xkwon
 */
import java.util.Scanner;
public class Lab2Q1 {
    public static void main(String[] args){
    double f, c;
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter the Fahrenheit value: ");
    f = Double.parseDouble(scan.nextLine());
    c = f - 32*5/9;
    System.out.println("The celcius value is " + c + " degree");
    }
    
    
}
