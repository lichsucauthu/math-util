
import anh.util.MathUtility;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //2.test hàm bằng mắt
        System.out.println("5!"+ MathUtility.getFactorial(5));
        // expected 120,     actual:
        //tao hy vọng m ói về 120 khi tao gọi mày hàm giai thừa ấy 
        //...
        //và test dàn data khác , tình huống khác
        System.out.println("0!"+MathUtility.getFactorial(0));
        //expected 1 , actual
        // e:1 a:1 --> 0ki
        //
        //e: ném về ngoại lệ illegalArgumentException nếu giai thừa -5
        System.out.println("-5"+MathUtility.getFactorial(-5));
        
       
       
    }
     //1.TDD , Test Driven Development
        //Viết dàn khung của hàm getFactorial(int n);
        //sau đó dùng hàm test
        //chạy thử coi xanh đỏ ,đỏ nghĩa là lỗi , xanh là ổn 
        //cứ liên tục xanh đỏ như thế trong quá trình viết code
        //và sửa code , người ta gọi là lập trình thỏa mãn 
        //việc test , tdd
        
        //2. sout(hàm kèm data) để coi kết aua3 ra sao , có đúng như mình kì vọng hay không
        //nó phải trả về như thế hay không --> xem kết quả test = mắt
        
        //3.Joption Pane của bên java Desktop để popup kết quả lên màn hình,
        // vẫn xem = mắt
        
        //4. viết 1 trang web gọi hàm xử lí...., hao sức quá.
        
        // ta chơi với cách 1 với 2 
    
    
    //2 máy so sánh dùm  expected và actual cho mình luôn
    //nếu tất cả các tình huống sài đều khớp  e == a ---> xanh
    // nếu chỉ có ít nhất 1 cặp e != a ---> đỏ hàm sai
    //xài thư viện file.jar
    //thư viện gọi chung là UNIT TEST
}
