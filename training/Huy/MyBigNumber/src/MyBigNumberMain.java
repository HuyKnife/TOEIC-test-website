public class MyBigNumberMain implements IReceiver{


    /*
     * Main function, take number strings from input
     * example: sum(1,2)
     * */
    public static void main(String[] args) {

        MyBigNumberMain main = new MyBigNumberMain();
        MyBigNumber s = new MyBigNumber(main);
        String result = s.sum(args[1], args[2]);
        System.out.print("Result: " + result);
    }

    public void sendMessage(String str) {
        System.out.println(str);
    }

}
