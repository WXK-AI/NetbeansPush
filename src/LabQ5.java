
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xkwon
 */
public class LabQ5 {
    public static void main (String[] args){
    int num1;
    num1 = 0;
    while (num1>=128 || num1<=0){
        System.out.println("Enter a number between 0 - 128: ");
        Scanner scan = new Scanner(System.in);
        num1 = Integer.parseInt(scan.nextLine());
    }
    System.out.println((char)num1);
    
}
}

