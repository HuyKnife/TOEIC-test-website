/**
 * Class cộng 2 số
 */
public class MyBigNumber {

    /**
     * Phương thức cộng 2 chuỗi số làm tham số cho hàm sum:
     * 2 chuỗi này đều chỉ chứa các kí tự số từ '0' đến '9'.
     *
     * @param str1 chuỗi số thứ nhất.
     * @param str2 chuỗi số thứ hai.
     * @return chuỗi có giá trị là tổng của hai số str1 và str2.
     */

    private IObserver observer;

    public MyBigNumber() {
    }

    public MyBigNumber(final IObserver observer) {
        this.observer = observer;
    }

    public String sum(String str1, String str2) {

        int s1 = str1.length();                     //lấy ra độ dài của 2 chuỗi
        int s2 = str2.length();
        int digit1;                                 //biến chứa kí số trong chuỗi 1
        int digit2;                                 //biến chưa kí số trong chuỗi 2

        int sum = 0;                                //khởi tạo biến tổng
        int rem = 0;                                //khởi tạo biến nhớ số dư
        int write = 0;                              //khởi tạo biến chứa hàng đơn vị
        int nho = 0;                                 //khởi tạo biến chứa số dư ban đầu

        String res = "";                            //khởi tạo chuỗi chứa kết quả
        String step = "";                           //khởi tạo chuỗi chứa bước phép cộng

        int length = (s1 > s2) ? s1 : s2;           //biến chứa độ dài lớn nhất giữa 2 chuỗi

        for (int i = 0; i < length; i++) {
            digit1 = i < s1 ? (str1.charAt(s1 - i - 1) - '0') : 0;  // cập nhật vị trí của kí số và lấy kí số cuối
            digit2 = i < s2 ? (str2.charAt(s2 - i - 1) - '0') : 0;

            sum = digit1 + digit2;
            write = (sum + rem) % 10;
            if (sum > 10) {
                nho = sum / 10;
            }


            if (length == 1) {
                step += "\n" + "Lấy " + digit1
                        + " cộng " + digit2
                        + " bằng " + sum + "\n";
            } else {
                step += "\n" + "Bước" + (i + 1) + " :\n"
                        + "Lấy " + digit1
                        + " cộng cho " + digit2
                        + " bằng " + sum + "\n"
                        + "Cộng cho số dư là " + rem
                        + " ta được số " + (sum + rem) + "\n"
                        + "Viết " + write
                        + " nhớ " + nho + "\n";
            }

            rem = sum / 10;
            res = write + res;
        }

        if (nho != 0) {
            res = nho + res;
        }

        observer.sendStep(step);

        return res;
    }
}