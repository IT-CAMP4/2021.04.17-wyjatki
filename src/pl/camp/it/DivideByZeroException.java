package pl.camp.it;

public class DivideByZeroException extends Exception {
    private String info;

    public DivideByZeroException(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
