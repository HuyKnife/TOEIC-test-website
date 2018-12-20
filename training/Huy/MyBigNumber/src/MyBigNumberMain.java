import java.util.Scanner;

public class MyBigNumberMain implements IReceiver{


    /*
     * Main function, take number strings from input
     * example: sum(1,2)
     * */
    public static void main(String[] args) {

        boolean success = false;

        Scanner sc = new Scanner(System.in);
        MyBigNumberMain main = new MyBigNumberMain();
        MyBigNumber s = new MyBigNumber(main);

        System.out.println("Welcome to Sum two number program !!!\n");
        while (!success) {
            try {
                System.out.print("Input 1st number: ");
                String s1 = sc.nextLine();

                System.out.print("Input 2nd number: ");
                String s2 = sc.nextLine();

                String result = s.sum(s1, s2);
                System.out.println("Result: " + result + "\n");

                success = true;
            } catch (NumberFormatException e) {
                System.out.println("\n" + e.getMessage() + "\n");
            }
        }

        sc.close();

    }

    public void sendMessage(String str) {
        System.out.println(str);
    }

}
