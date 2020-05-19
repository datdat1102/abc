/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 

/**
 *
 * @author Đạt Đạt
 */
public class ReadingString {
    public static void main(String[] args) throws IOException {
        //readingstring
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));
        System.out.println("nhap vao 1 chuoi");
        String text = br.readLine();
        System.out.println("hello, "+ text);
        
        System.out.println("nhap ho ten:");
        String name = br.readLine();
        System.out.println("nhap dia chi:");
        String address= br.readLine();
        System.out.println("Welcome" + name);
        System.out.println("Dia chi cua ban:" +address);
    }
    /*
    - sử dụng buffereadReader để đọc vào chuỗi mô tả:
        +họ tên
        + địa chỉ
    -in ra màn hình
    */
}
