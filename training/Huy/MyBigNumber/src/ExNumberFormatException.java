public class ExNumberFormatException extends NumberFormatException {

    private int errorPost;

    public ExNumberFormatException(int pos) {
        super("Vi tri thu: ");
        this.errorPost = pos;
    }

    @Override
    public String getMessage() {
        return "Vi tri thu: " + (errorPost + "");
    }
}
