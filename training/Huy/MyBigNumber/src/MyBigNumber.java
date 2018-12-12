/**
 * Sum two string class.
 */
public class MyBigNumber {

    private IReceiver receiver;

    public MyBigNumber(){}

    public MyBigNumber(final IReceiver receiver) {
        this.receiver = receiver;
    }


    /**
     * Sum two string function.
     */

    public String sum(final String s1, final String s2) {

        // Kiểm tra s1, s2 có phải chuỗi số hoặc số dương hay không
        if (!s1.matches("^[0-9]+$") || !s2.matches("^[0-9]+$")) {

            return "Please input numeric string or positive number";
        }

        String res = "";                        // chuỗi chứa kết quả
        String stepMsg = "";                    // chuỗi chứa các bước trong quá trình cộng

        int temp = 0;                           // biến lấy tổng
        int temp2 = 0;                          // biến lấy hàng đơn vị
        int carry = 0;                          // biến nhớ

        int n1 = 0;                             // biến chứa số trong chuỗi 1
        int n2 = 0;                             // biến chứa số trong chuỗi 2

        int len1 = s1.length();                 // biến chứa độ dài chuỗi 1
        int len2 = s2.length();                 // biến chứa độ dài chuỗi 2

        int length = len1 < len2 ? len2 : len1; // biến chưa độ dài lớn nhất trong 2 chuỗi s1, s2

        for (int i = 0; i < length; i++) {

            n1 = i < len1 ? (s1.charAt(len1 - i - 1) - '0') : 0;
            n2 = i < len2 ? (s2.charAt(len2 - i - 1) - '0') : 0;

            temp = n2 + n1 + carry;
            temp2 = temp % 10;

            stepMsg = "Buoc " + (i + 1) + ": "
                    + "lay " + n1
                    + " cong " + n2
                    + " nho " + carry
                    + " bang " + temp
                    + " viet " + temp2
                    + " nho " + carry;

            carry = temp / 10;
            res = temp2 + res;

            receiver.sendMessage(stepMsg);
        }

        return res;

    }
}
