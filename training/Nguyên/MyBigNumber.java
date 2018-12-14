public class MyBigNumber {
    public String sum(String str1, String str2) {

        String s1 = str1;
        String s2 = str2;
        String res = "";
        int n1;
        int n2;

        int sum = 0;                                //khởi tạo biến tổng
        int rem = 0;                                //khởi tạo biến nhớ số dư


        if (s1.length() > s2.length()) {
            while (s2.length() < s1.length())
                s2 = "0" + s2;                      //cân bằng 2 chuỗi số bằng cách chèn số 0 phía trước
        } else {
            while (s1.length() < s2.length())
                s1 = "0" + s1;
        }

        for (int i = s1.length() - 1; i >= 0; i--) {
            n1 = s1.charAt(i) - '0';                //biến chuỗi 1 thành số nguyên theo bảng mã ascii
            n2 = s2.charAt(i) - '0';                //biến chuỗi 2 thành số nguyên theo bảng mã ascii
            sum = n1 + n2;
            if (rem != 0) sum += rem;               //cộng số dư nếu có
            rem = 0;                                //làm mới lại biến số dư
            if (sum > 9) {
                rem = sum / 10;                     //chia lấy số dư trường hợp tổng lớn hơn hoặc bằng 10
                sum = sum % 10;                     //lấy chữ số bên trái điền vào chuỗi tổng
            }
            res += ("" + sum);                      //cộng số dư vào nếu còn sau khi chạy xong vòng lặp
        }

        if (rem != 0) res += ("" + rem);            //

        res = stringReverse(res);                     //đảo ngược chuỗi vì chuỗi được cộng từ phải sang trái

        return res;
    }


    public static String stringReverse(String str) {  //hàm để đảo chuỗi
        String tempt = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tempt += str.charAt(i);
        }
        str = tempt;
        return str;
    }
}