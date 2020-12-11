package lab4.instruments;

public enum Time {
    MINUTE,
    HOUR,
    DAY;

    private String count;

    public String getCount(){
        return count + " of " + this;
    }

    public void setCount(String count){
        this.count = count;
    }
}
