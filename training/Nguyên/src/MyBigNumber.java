/**
 * Class sum of 2 string
 */
public class MyBigNumber {

    /**
     * This class count the sum of 2 string number:
     * These 2 strings only include number from '0' to '9'.
     *
     * @param str1 first string number.
     * @param str2 second string number.
     * @return string that have the sum number of these 2 strings.
     */

    private IObserver observer;

    public MyBigNumber() {
    }

    public MyBigNumber(final IObserver observer) {
        this.observer = observer;
    }

    public String sum(String str1, String str2) {

        // To check whether these 2 strings are included positive numbers or not
        // All credit of this exception goes to Đào Anh Huy - 51600034
        if (!str1.matches("^[0-9]+$") || !str2.matches("^[0-9]+$")) {
            throw new NumberFormatException("The input must not contain word or negative number");
        }

        int s1 = str1.length();                     //to get the length of 2 strings
        int s2 = str2.length();
        int digit1;                                 //variable to store the digit of string 1
        int digit2;                                 //variable to store the digit of string 2

        int sum = 0;                                //variable to store the sum of 2 strings
        int rem = 0;                                //variable to store the digit to carry onto next step
        int write = 0;                              //variable to store the unit
        int nho = 0;                                //variable to store whether the first step have a carry digit

        String res = "";                            //string to store the result
        String step = "";                           //string to store the steps

        int length = (s1 > s2) ? s1 : s2;           //variable to store the longest length of 2 strings

        for (int i = 0; i < length; i++) {
            digit1 = i < s1 ? (str1.charAt(s1 - i - 1) - '0') : 0;  // update and get the last digit
            digit2 = i < s2 ? (str2.charAt(s2 - i - 1) - '0') : 0;

            sum = digit1 + digit2;
            write = (sum + rem) % 10;
            if (sum > 9) {
                nho = sum / 10;
            }


            if (length == 1) {
                step += "\n" + "Lay " + digit1
                        + " cong " + digit2
                        + " bang " + sum + "\n";
            } else if (i != 0) {
                step += "\n" + "Buoc " + (i + 1) + " :\n"
                        + "Lay " + digit1
                        + " cong " + digit2
                        + " duoc " + sum + "\n"
                        + "Cong cho so nho " + rem
                        + " ta duoc " + (sum + rem) + "\n"
                        + "Ghi " + write
                        + " nho " + nho + "\n";
            } else {
                step += "\n" + "Buoc " + (i + 1) + " :\n"
                        + "Lay " + digit1
                        + " cong " + digit2
                        + " duoc " + sum + "\n"
                        + "Ghi " + write
                        + " nho " + nho + "\n";
            }

            rem = sum / 10;
            res = write + res;
        }

        if (nho != 0) {                             //If after all the calculation still have the carry number, add it to the result
            res = nho + res;
        }

        observer.sendStep(step);

        return res;
    }
}
