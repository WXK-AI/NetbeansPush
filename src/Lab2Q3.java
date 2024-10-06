/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xkwon
 */
import java.util.Scanner;
public class Lab2Q3 {
    public static void main (String[] args){
        int remainder, sum, num1;
        remainder = sum = num1 = 0;
        while (num1>=1000 || num1<=0){
            System.out.println("Enter a number between 0 - 1000: ");
            Scanner scan = new Scanner(System.in);
            num1 = Integer.parseInt(scan.nextLine());
        }
        while (num1 > 0){
           remainder = num1%10;
           sum += remainder;
           num1 /= 10;
        }
        System.out.println("Sum of the number: "+ sum);
    }
}



