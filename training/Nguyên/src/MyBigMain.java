import java.util.Scanner;

public class MyBigMain implements IObserver {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        MyBigMain myBigMain = new MyBigMain();
        MyBigNumber num = new MyBigNumber(myBigMain);

        System.out.print("Nhập chuỗi số đầu tiên: ");
        String str1 = scanner.next();

        System.out.print("Nhập chuỗi số thứ hai: ");
        String str2 = scanner.next();

        System.out.println("Ta đươc số " + num.sum(str1, str2));
    }

    public void sendStep(String str) {
        System.out.println(str);
    }
}
