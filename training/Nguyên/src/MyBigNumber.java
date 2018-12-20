/**
 * Class sum of 2 string.
 */
public class MyBigNumber {

    private IObserver observer;

    public MyBigNumber() {
    }

    public MyBigNumber(final IObserver observer) {
        this.observer = observer;
    }

    /**
     * This class count the sum of 2 string number:
     * These 2 strings only include number from '0' to '9'.
     *
     * @param s1 first string number.
     * @param s2 second string number.
     * @return string that have the sum number of these 2 strings.
     */

    public String sum(final String s1, final String s2) {

        if (s1.contains("-")) {
            throw new NumberFormatException("Chuoi so 1 khong duoc co so am");
        }

        if (s2.contains("-")) {
            throw new NumberFormatException("Chuoi so 2 khong duoc co so am");
        }

        int str1 = s1.length();                     //to get the length of 2 strings
        int str2 = s2.length();
        int digit1;                                 //variable to store the digit of string 1
        int digit2;                                 //variable to store the digit of string 2

        int sum = 0;                                //variable to store the sum of 2 strings
        int rem = 0;                                //variable to store the digit to carry onto next step
        int write = 0;                              //variable to store the unit
        int nho = 0;                                //variable to store whether the first step have a carry digit

        String res = "";                            //string to store the result
        String step = "";                           //string to store the steps

        char checker;                               //to check for words in the string

        int length = (str1 > str2) ? str1 : str2;           //variable to store the longest length of 2 strings

        for (int i = 0; i < length; i++) {
            digit1 = i < str1 ? (s1.charAt(str1 - i - 1) - '0') : 0;  // update and get the last digit
            digit2 = i < str2 ? (s2.charAt(str2 - i - 1) - '0') : 0;

            checker = i < str1 ? s1.charAt(i) : '0';

            if (!(checker >= '0' && checker <= '9')) {
                throw new NumberFormatException("Vi tri thu "
                        + (s1.indexOf(checker) + 1)
                        + " cua chuoi so thu 1 khong phai la so");
            }

            checker = i < str2 ? s2.charAt(i) : '0';

            if (!(checker >= '0' && checker <= '9')) {
                throw new NumberFormatException("Vi tri thu "
                        + (s2.indexOf(checker) + 1)
                        + " cua chuoi so thu 2 khong phai la so");
            }

            sum = digit1 + digit2;
            write = (sum + rem) % 10;
            nho = sum / 10;


            if (length == 1) {
                step += "\n" + "Lay " + digit1
                        + " cong " + digit2
                        + " bang " + sum + "\n";
            } else if (rem == 0) {
                step += "\n" + "Buoc " + (i + 1) + " :\n"
                        + "Lay " + digit1
                        + " cong " + digit2
                        + " duoc " + sum + "\n"
                        + "Ghi " + write
                        + " nho " + nho + "\n";
            } else {
                step += "\n" + "Buoc " + (i + 1) + " :\n"
                        + "Lay " + digit1
                        + " cong " + digit2
                        + " duoc " + sum + "\n"
                        + "Cong cho so nho " + rem
                        + " ta duoc " + (sum + rem) + "\n"
                        + "Ghi " + write
                        + " nho " + nho + "\n";
            }

            rem = sum / 10;
            res = write + res;
        }

        if (nho != 0) {                             //Add the carry number if still have any
            res = nho + res;
        }

        observer.sendStep(step);

        return res;
    }
}
