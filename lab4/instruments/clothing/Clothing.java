package lab4.instruments.clothing;

public abstract class Clothing{
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
        return "Какая-то абстрактная одежда";
    }
}
