import java.util.Scanner;

public class MyBigMain implements IObserver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBigMain myBigMain = new MyBigMain();
        MyBigNumber num = new MyBigNumber(myBigMain);
        String str1 = "";
        String str2 = "";

        try {
            if (args.length > 0) {
                str1 = args[0];
                str2 = args[1];
            } else {
                str1 = "0";
                str2 = "0";
            }
            System.out.println("Ta duoc so: " + num.sum(str1, str2) + "\n");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        scanner.close();
    }

    public void sendStep(String str) {
        System.out.println(str);
    }

}
