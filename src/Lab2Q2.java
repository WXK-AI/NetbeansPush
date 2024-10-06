/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xkwon
 */
import java.util.Scanner;
public class Lab2Q2 {
    public static void main(String[] args){
        double rad, len, vol, area;
        var pi = 3.142;
        System.out.println("Radius of the cylinder: ");
        Scanner scan = new Scanner(System.in);
        rad = Double.parseDouble(scan.nextLine());
        System.out.println("Length of the cylinder: ");
        Scanner scann = new Scanner(System.in);
        len = Double.parseDouble(scann.nextLine());
        area = rad * rad * pi;
        vol = area * len;
        System.out.println("Volume of the cyliner: " + vol);
        
        
    }
}
