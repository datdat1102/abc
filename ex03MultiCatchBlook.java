/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajp;

import java.util.Scanner;

/**
 *
 * @author Đạt Đạt
 */
public class ex03MultiCatchBlook {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        try
        {
            int n = Integer.parseInt(scn.nextLine());
            if(99%n ==0)
                System.out.println(n + "is a factor of 99");
        }catch(ArithmeticException ex){
            System.out.println("Arithmetic" +ex);
        }catch(NumberFormatException ex){
            System.out.println("Number Format Exception");
        }
    }
}
