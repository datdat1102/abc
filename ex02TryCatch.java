/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ajp;

/**
 *
 * @author Đạt Đạt
 */
public class ex02TryCatch {
    public static void main(String[] args) {
        //cấu trúc try....catch
        int[] arr = {10,20,30};
        try{
            //các câu lệnh có khả năng sinh lỗi
            System.out.println(arr[5]);
        }catch (Exception ex){
            //xử lí khi các câu lệnh trong try có lỗi
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
            System.out.println("\n vuot qua chi so mang");
        }
        System.out.println("tiếp tục xử lý");
    }
}
