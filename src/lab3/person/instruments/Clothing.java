package lab3.person.instruments;

public abstract class Clothing implements DoToClothing{
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
