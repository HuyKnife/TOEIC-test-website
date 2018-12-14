public class MyBigNumber {
    public String sum(String str1, String str2) {

        String s1 = str1;
        String s2 = str2;
        String res = "";
        int n1;
        int n2;
        int sum = 0;
        int rem = 0;
        if (s1.length() > s2.length()) {
            while (s2.length() < s1.length())
                s2 = "0" + s2;
        } else {
            while (s1.length() < s2.length())
                s1 = "0" + s1;
        }

        for (int i = s1.length() - 1; i >= 0; i--) {
            n1 = s1.charAt(i) - '0';
            n2 = s2.charAt(i) - '0';
            sum = n1 + n2;
            if (rem != 0) sum += rem;
            rem = 0;
            if (sum > 9) {
                rem = sum / 10;
                sum = sum % 10;
            }
            res += ("" + sum);
        }
        if (rem != 0) res += ("" + rem);

        res = stringReverse(res);
        return res;
    }
	
    public static String stringReverse(String str) {
        String tempt = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            tempt += str.charAt(i);
        }
        str = tempt;
        return str;
    }
}