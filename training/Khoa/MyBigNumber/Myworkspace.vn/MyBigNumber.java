import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author leond
 */

public class MyBigNumber {
    private RememberStep rememberStep;
    
    public MyBigNumber() {
    }
    
    public MyBigNumber(final RememberStep rememberStep) {
        this.rememberStep = rememberStep;
    }

    public String sumNumber(final String str1, final String str2) {

        if (!str1.matches("^[0-9]+$") || !str2.matches("^[0-9]+$")) { // Check input: Number or String
            return "Please input numeric string or positive number";
        }

        String finalResult = "";                                                // String contain the final result 
        String stepMsg = "";                                                  // chuỗi chứa các bước trong quá trình cộng

        int getSum = 0;                                                         // variable get The Sum of two numbers
        int getUnit = 0;                                                        // variable get The number per unit
        int remember = 0;                                                       // variable remember The number when sumed greater than 9

        int stringContain1 = 0;                                                 // variable get the number in String 1
        int stringContain2 = 0;                                                 // variable get the number in String 2

        int lengthStr1 = str1.length();                                         // variable contain the length of String 1
        int lengthStr2 = str2.length();                                         // variable contain the length of String 2

        int lengthContain = lengthStr1 < lengthStr2 ? lengthStr2 : lengthStr1;  // variable contain the longest string of String 1 and String 2

        for (int i = 0; i < lengthContain; i++) {
            stringContain1 = i < lengthStr1 ? (str1.charAt(lengthStr1 - i - 1) - '0') : 0;
            stringContain2 = i < lengthStr2 ? (str2.charAt(lengthStr2 - i - 1) - '0') : 0;

            getSum = stringContain2 + stringContain1 + remember;
            getUnit = getSum % 10;

            stepMsg = "Step" + (i + 1) + " : " + "\n" 
                    + " Remember" + " : " + remember + "\n" 
                    + " Take" + " : " + stringContain1 + "\n" 
                    + " Plus" + " : " + stringContain2 + "\n" 
                    + " Result of sum two digits" + " : " + getSum + "\n" 
                    + " Write" + " : " + getUnit + "\n";
            
            remember = getSum / 10 ;
            finalResult = getUnit + finalResult;
            rememberStep.sendMessage(stepMsg);
        }
        return finalResult;
    }
}