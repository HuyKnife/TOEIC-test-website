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
                String input = sc.nextLine();

                String[]split = input.split(" ");

                String result = s.sum(split[1], split[2]);
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