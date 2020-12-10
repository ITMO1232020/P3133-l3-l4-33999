package lab4.planet.atmosphere;

public class FreshAir extends Air{
    @Override
    public String toString(){
        return "Fresh air";
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
