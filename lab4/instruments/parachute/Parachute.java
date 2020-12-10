package lab4.instruments.parachute;

public class Parachute {
    private ParachuteState parachuteState;

    public String open() {
        parachuteState = ParachuteState.OPENED;
        return this + " " + parachuteState + " и замедляет падение!";
    }

    public String close() {
        parachuteState = ParachuteState.CLOSED_HOODALIKE;
        return this + " уже " + parachuteState + " и сложен.";
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
