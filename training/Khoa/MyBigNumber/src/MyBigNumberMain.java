public class MyBigNumberMain implements RememberStep{

    public static void main(String[] args) {

        MyBigNumberMain main = new MyBigNumberMain();
        MyBigNumber s = new MyBigNumber(main);
        String result = s.sumNumber(args[1], args[2]);
        System.out.print("Final Result: " + result);
    }

    public void sendMessage(String str) {
        System.out.println(str);
    }

}