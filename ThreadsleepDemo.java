/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EXCEPTION;

import java.util.Random;

/**
 *
 * @author Đạt Đạt
 */
public class ThreadsleepDemo {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("sleep-5000");
        int i=0;
        Thread thread = Thread.currentThread();
        System.out.println(thread);
        while(i<1500){
            Random rand = new Random();
            int rand_int1 = rand.nextInt(1000);
            System.out.printf("%6d",rand_int1);
            Thread.sleep(500);
            i++;
        }
    }
}
