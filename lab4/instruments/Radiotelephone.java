package lab4.instruments;

public class Radiotelephone {
    private String data = "";

    public void receiveData(String data){
        this.data = data;
    }

    public String transmitData() {
        return data;
    }

    @Override
    public String toString() {
        return "Radiotelephone";
    }
}
