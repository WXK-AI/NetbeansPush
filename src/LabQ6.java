/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xkwon
 */
import java.util.Scanner;
public class LabQ6 {
    public static void main(String[] args){
        int month, year, days;
        days = 0;
        System.out.println("Enter your month: ");
        Scanner scan = new Scanner(System.in);
        month = Integer.parseInt(scan.nextLine());
        System.out.println("Enter your year: ");
        Scanner scann = new Scanner(System.in);
        year = Integer.parseInt(scann.nextLine());
        switch (month){
            case 1:
                days = 31;
            case 2:
                if (year%4 == 0){
                    days = 29;
                }
                else{
                    days = 28;
                }
            case 3:
                days = 31;
            case 4:
                days = 30;
            case 5:
                days = 31;
            case 6:
                days = 30;
            case 7:
                days = 31;
            case 8:
                days = 31;
            case 9:
                days = 30;
            case 10:
                days = 31;
            case 11:
                days = 30;
            case 12:
                days = 31;
            
    }
        System.out.println("The number of days in this month is "+ days + ".");
        
    }
}
