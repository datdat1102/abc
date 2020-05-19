/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXCEPTION;

import java.util.Scanner;

/**
 * REVIEW exception
 *
 * @author Đạt Đạt
 */
public class lesson02 {

    public static void main(String[] args) {
        int n;
        Scanner input = new Scanner(System.in);
        do {
//            System.out.println("nhap n");            
//            try{
//                n=input.nextInt();
//            }catch(Exception ex){
//                System.out.println(ex.getMessage());
//                n=0;
//            }
            while (!input.hasNextInt()) {
                System.out.println("ban phai nhap so nguyen");
                input.next();
            }
            n = input.nextInt();
        } while (n <= 0 || n >= 100);
        //khai bao va khoi tao n phan tu
        int[] arrInt = new int[n];
        System.out.println("nhap mang so nguyen");
        for (int i = 0; i < n; i++) {
//            boolean flag = true;
//            do {
//                try {
//                    System.out.println("nhap arrInt[" + i + "]=");
//                    arrInt[i] = input.nextInt();
//                    flag = false;
//                } catch (Exception e) {
//                    System.out.println(e.getMessage());
//                    flag = true;
//                }
//            } while (flag == true);
            System.out.println("nhap so nguyen");
            while(!input.hasNextInt()){
            System.out.println("sai roi, nhap lai");
            }
        arrInt[i]= input.nextInt();
        }
        System.out.println("danh sach mang so nguyen" +n+"phan tu");
        for (int i=0;i<n; i++){
            System.out.printf("%4d",arrInt[i]);
        }
    }
}
