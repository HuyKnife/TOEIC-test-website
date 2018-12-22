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

        String str1 = s1;                       // chuỗi chứa giá trị của s1
        String str2 = s2;                       // chuỗi chứa giá trị của s2

        if ((s1 == null) || (s1.trim().isEmpty())) {
            str1 = "0";
        }

        if ((s2 == null) || (s2.trim().isEmpty())) {
            str2 = "0";
        }

        if (str1.charAt(0) == '-') {
            throw new NumberFormatException("Chua ho tro so am: " + s1);
        }

        if (str2.charAt(0) == '-') {
            throw new NumberFormatException("Chua ho tro so am: " + s2);
        }


        String res = "";                        // chuỗi chứa kết quả
        String stepMsg = "";                    // chuỗi chứa các bước trong quá trình cộng

        int temp = 0;                           // biến lấy tổng
        int temp2 = 0;                          // biến lấy hàng đơn vị
        int carry = 0;                          // biến nhớ
        int i = 0;                              // biến đếm

        int n1 = 0;                             // biến chứa số trong chuỗi 1
        int n2 = 0;                             // biến chứa số trong chuỗi 2

        int len1 = str1.length();               // biến chứa độ dài chuỗi 1
        int len2 = str2.length();               // biến chứa độ dài chuỗi 2

        char checkS1;                           // biến kiểm tra từng vị trí trong s1 có phải là số
        char checkS2;                           // biến kiểm tra từng vị trí trong s2 có phải là số

        int length = len1 < len2 ? len2 : len1; // biến chứa độ dài lớn nhất trong 2 chuỗi s1, s2

        for (i = 0; i < length; i++) {

            checkS1 = (i < len1) ? str1.charAt(i) : '0';
            checkS2 = (i < len2) ? str2.charAt(i) : '0';

            if (!(checkS1 >= '0' && checkS1 <= '9')) {
                this.receiver.sendMessage("\nVui long khong chua ki tu dac biet hoac chu trong s1 : " + s1);
                throw new ExNumberFormatException((s1.indexOf(checkS1) + 1));
            }

            if (!(checkS2 >= '0' && checkS2 <= '9')) {
                this.receiver.sendMessage("\nVui long khong chua ki tu dac biet hoac chu trong s2 : " + s2);
                throw new ExNumberFormatException((s2.indexOf(checkS2) + 1));
            }

            n1 = (i < len1) ? (str1.charAt(len1 - i - 1) - '0') : 0;
            n2 = (i < len2) ? (str2.charAt(len2 - i - 1) - '0') : 0;

            temp = n2 + n1 + carry;
            temp2 = temp % 10;

            if (carry == 0) {
                stepMsg += "\n" + "Buoc " + (i + 1) + ": "
                        + "lay " + n1
                        + ", cong " + n2
                        + ", bang " + temp
                        + ", viet " + temp2
                        + ", nho " + temp / 10 + "\n";
            } else {
                stepMsg += "\n" + "Buoc " + (i + 1) + ": "
                        + "lay " + n1
                        + ", cong " + n2
                        + ", nho " + carry
                        + ", bang " + temp
                        + ", viet " + temp2
                        + ", nho " + carry + "\n";
            }

            carry = temp / 10;
            res = temp2 + res;

        }

        if (carry > 0) {
            res = carry + res;
            stepMsg += "\n" + "Buoc " + (i + 1) + ": "
                    + "lay " + 0
                    + ", cong " + 0
                    + ", nho " + 1
                    + ", bang " + 1
                    + ", viet " + 1
                    + "\n";
        }


        receiver.sendMessage(stepMsg);

        return res;

    }
}