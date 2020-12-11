package lab4.exceptions;

public class NegativeHeightException extends RuntimeException{
    private final double height;

    public NegativeHeightException(String msg, double height){
        super(msg);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }
}
