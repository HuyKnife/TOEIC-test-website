/**
 * Sum two string class.
 */
public class MyBigNumber {

    int sum = 0; // biến chứa giá trị tổng
    int carry = 0; // biến nhớ
    String result = "";

    /**
     * Sum two string function.
     */
    public String sum(final String s1, final String s2) {

        int n1 = 0;
        int n2 = 0;

        String str1 = s1;
        String str2 = s2;

        int len1 = str1.length();
        int len2 = str2.length();
        
        int length = len1 < len2 ? len2 : len1;

        for (int i = 0; i <= length; i++) {

            n1 = i < len2 ? (str2.charAt(len2 - i - 1) - '0') : 0; 
            n2 = i < len1 ? (str1.charAt(len1 - i - 1) - '0') : 0; 

            result += ("" + (n1 + n2 + carry) % 10);
            carry = (n1 + n2 + carry) / 10;
        }
        
        result = reverString(result);

        System.out.println(result);

        return result.toString();
    }

    /**
     * hàm đảo ngược chuỗi.
     */
    public static String reverString(final String str) {
        String tmp = "";
        String t = str;

        for (int i = str.length() - 1; i >= 0; i--) {
            tmp += str.charAt(i);
        }
        t = tmp;

        return t;
    }

    public String toString() {
        
        return result.replaceFirst("^0+(?!$)", "");
    }
}