package lab3.person.instruments.parachute;

public class WingedParachute extends Parachute {
    public String toString(){
        return "Крылатый парашют";
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
