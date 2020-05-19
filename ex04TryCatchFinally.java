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
public class ex04TryCatchFinally {
    public static void main(String[] args) {
        //finally => luôn luôn đc thực hiện
        int[] arr = new int [2];
        System.out.println("=======có lỗi=======");
        try{
            System.out.println(arr[10]);
        }catch (Exception ex){
            //xử lí khi các câu lệnh trong try có lỗi
            System.out.println("\n vượt quá chỉ số mảng");
        }finally{
            arr[0] = 123;
            System.out.println(arr[0]);
        }
        System.out.println("=========không lỗi========");
        try{
            System.out.println(arr[0]);
        }catch (Exception ex){
            //xử lí khi các câu lệnh trong try có lỗi
            System.out.println("\n vượt quá chỉ số mảng");
        }finally{
            arr[0] = 123;
            System.out.println(arr[0]);
        }
    }
 
}
