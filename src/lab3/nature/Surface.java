package lab3.nature;

public abstract class Surface {
    public String whatTheSurface() {
        return toString() + '.';
    }
    @Override
    public boolean equals(Object obj){
        return obj != null && this.getClass() == obj.getClass();
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return "Какая-то поверхность";
    }
}
