/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xkwon
 */
import java.util.Scanner;
public class Welcome {
    public static void main(String[] args){
        /*
        Data types in java
        - {numeric support}
        - int
        - double
        - float
        
        - {non-numeric support}
        - char
        - string
        
        - boolean

        */
    System.out.println("My first program.");
    int age;
    String name;
    Scanner scan = new Scanner (System.in);
    System.out.println("Enter your name: ");
    name = scan.nextLine();
    System.out.println("Enter your age: ");
    age = Integer.parseInt(scan.nextLine());
    System.out.println("Hi "+ name + " !");
    System.out.println("Your age is " + age + " years old.");
    }
}