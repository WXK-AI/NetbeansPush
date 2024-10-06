/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xkwon
 */
public class Lab2Q8 {
    public static void main (String[] args){
        double[] numbers = new double[100];
        for (int i = 0; i < 100; i++) {
            numbers[i] = i + 1;  // Fill array with numbers 1 to 100
        }
        double sum = 0;
        for (double number : numbers){
            sum += number;
        }
        System.out.println("Total sum of the numbers is " + sum);
    }
}
