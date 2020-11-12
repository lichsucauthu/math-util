/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anh.util;

/**
 *
 * @author Admin
 */
public class MathUtility {

    //class nay chua cac ham tien ich dung chung cho moi noi
    //do do no nen la static
    public static final double PI = 3.1415;

    // hàm tính n giai thừa n>=0 && n <= 20
    //nếu qua thì tràn long
    //0!1; 
    public static long getFactorial(int n) {
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("n must be >= 0 AND <=20");
        }// đưa đầu vào sai , kh trả về kết quả 
        if (n == 0 || n == 1) {
            return 1; //
        }
        //
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
}
