public class MyBigNumberMain {


    /*
     * Main function, take number strings from input
     * example: sum(1,2)
     * */
    public static void main(String[] args) {

        MyBigNumber s = new MyBigNumber();
        String result = s.sum(args[1], args[2]);
        System.out.print(result);
    }

}
