public class ExNumberFormatException extends NumberFormatException {

    private int errorPost;
    private String mess = "";

    public ExNumberFormatException(int pos) {
        this.errorPost = pos;
        mess = "Vi tri thu: " + (errorPost + "");
    }

    @Override
    public String getMessage() {
        return mess;
    }
}