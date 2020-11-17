/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anh.util.test;

import anh.util.MathUtility;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Admin
 */
public class MathUtilityTest {
    
    //test cac tình huống xài hàm getFractorial() ở đây
    // tình huống là đưa tham số vào 
    // tình huống test hàm tiếng anh gọi là test cases
    // thành công đưa vào value hợp lệ
    //thất bại : đưa vào âm > 20 , bị ăn đòn
    // hàm phài bắt các tình huống này , và ta test cod hàm xử lí đúng kh 
    //@test biến hàm này thành public static void main
    //quy tắc đặt tên hàm cho việc test phần mềm : rất nhiều quy tắt 
    //không giống quy tắt đặt tên hàm trong viết app
    //mình muốn test hàm trả về ngon nếu tham số ngon
    @Test
    public void getFactorial_Runswell_IfValidArgument()
    {
        assertEquals(120, MathUtility.getFactorial(5));
        //muốn gọi hàm xem 5! có trả về 120 hay không 
        // đúng xanh
        // sai đỏ
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
        assertEquals(2, MathUtility.getFactorial(1));
        //mac dinh code test doc lap voi code chinh
        //doc lap voi qua trinh clean and build 
        //dung cod ban xanh hay do mien la error cu phap ban luon dong goi hay build ra dc file .jar .war
        //hop ve logic mau xanh tuc la ham chuan thi moi nen ra dc .jar . war
        //vay ta can co 1 cach de gai cai xanh do vao cai quy trinh build file word
        //hay noi cach khac neu cod dang mau do thi phai disable cai nut bam clean and build
    }
}
