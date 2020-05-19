/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lession03;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author Đạt Đạt
 */
public class ByeStreamDemo {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileInputStream sourceStream = null;
        FileOutputStream targetStream = null;
        try{
            sourceStream = new FileInputStream("sourceStream.txt");
            targetStream = new FileOutputStream("C:/Users/PC/Documents/targetStream.txt");
            
            int temp;
            while ((temp = sourceStream.read()) != -1);{
                targetStream.write((byte) temp);
        }
        }finally{
            if(sourceStream != null){
                sourceStream.close();
            }
            if(targetStream != null){
                targetStream.close();
            }
        }
    }
}
