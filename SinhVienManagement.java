/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai_tap;

import java.util.Arrays;

/**
 *
 * @author Đạt Đạt
 */
public class SinhVienManagement {
    String [] arrSinhVien;
    public SinhVienManagement(){
        arrSinhVien = new String[0];//tạo mảng 0 phần tử
    }
    //hàm mở rông dữ liệu
    private  void moRong(){
        int size= arrSinhVien.length +1;
        String[] temp =Arrays.copyOf(arrSinhVien,size);
        arrSinhVien= new String[size];
        System.arraycopy(temp, 0, arrSinhVien, 0, size);
    }
    //thêm dữ liệu và kiểm soát ngoại lệ khi thêm
    public void themSinhVien(String name, int pos){
        try{
            arrSinhVien[pos - 1]= name;
        }catch(ArrayIndexOutOfBoundsException ex){
            moRong();
            arrSinhVien[arrSinhVien.length - 1] = name;
            //System.out.println("lỗi:" +e);
        }
    }
    //hàm hiển thị
    public void hienThi(){
        for(int i = 0; i<arrSinhVien.length;i++){
            String arrSinhVien1= arrSinhVien[i];
            System.out.println(arrSinhVien1);
        }
    }
}
