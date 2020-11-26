package lab3.nature;

public class FreshAir extends Air{
    @Override
    public String toString(){
        return "Свежий воздух";
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
