package lab3.person.instruments.parachute;

public class Parachute {
    private ParachuteState parachuteState;

    public void open() {
        parachuteState = ParachuteState.OPENED;
        System.out.println(this + " " + parachuteState + " и замедляет падение!");
    }

    public void close() {
        parachuteState = ParachuteState.CLOSED_HOODALIKE;
        System.out.println(this + " уже " + parachuteState + " и сложен.");
    }

    @Override
    public String toString(){
        return "Парашют";
    }
    @Override
    public boolean equals(Object obj){
        return obj != null && this.getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
