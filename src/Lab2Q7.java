/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xkwon
 */
import java.util.Scanner;
public class Lab2Q7 {
    public static void main(String[] args){
        int m1;
        String grade;
        grade = null;
        System.out.println("Enter your marks: ");
        Scanner scan  = new Scanner(System.in);
        m1 = Integer.parseInt(scan.nextLine());
        if (m1>=0 && m1<=39){
            grade = "F";
        }else if(m1>=40 && m1<=49){
            grade = "F+";
        }else if(50<=m1 && m1<=54){
            grade = "D";
        }else if (55<=m1 && m1<=64){
            grade = "C";
        }else if (65<=m1 && m1<=69){
            grade = "B";
        }else if (70<=m1 && m1<=74){
            grade = "B+";
        }else if (75<=m1 && m1<=79){
            grade = "A";
        }else if (80<=m1 && m1<=100){
            grade = "A+";
        }else{
            System.out.println("Please enter a valid marks.");
        }
        System.out.println("Your grade is " + grade + ".");
    }
    
}
