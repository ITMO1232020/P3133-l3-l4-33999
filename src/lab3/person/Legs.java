package lab3.person;

public class Legs {
    public String kneelDown(){
        return "ноги подкосились.";
    }

    @Override
    public String toString(){
        return "Ноги";
    }

    @Override
    public boolean equals(Object obj) {
        return obj != null && this.getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
