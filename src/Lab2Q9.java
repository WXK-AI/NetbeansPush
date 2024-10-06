/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author xkwon
 */
public class Lab2Q9 {
    public static void main(String[] args){
        double fee = 10000;
        final double rate  = 1.05;
        for (int i = 0 ; i < 10; i++){
            fee = fee * rate;
        }
        System.out.println("The total fee of the tuition fee in 10 years is RM" + fee + ".");
    }
}
