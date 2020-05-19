/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession03;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *BufferedReader
 * @author Đạt Đạt
 */
public class ReadTextFile {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("text.txt");
        BufferedReader fileRead = new BufferedReader( new FileReader(file));
        String str;
        //thuacj hiện đọc từng dòng
        while((str= fileRead.readLine()) !=null){
            System.out.println(str);
        }
    }
}
