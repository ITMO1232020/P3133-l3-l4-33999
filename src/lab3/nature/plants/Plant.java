package lab3.nature.plants;

import java.util.Objects;

public abstract class Plant {
    public String whatThePlant() {
        return toString();
    }
    @Override
    public boolean equals(Object obj){
        return obj != null && this.getClass() == obj.getClass();
    }

    @Override
    public String toString() {
        return "Какое-то абстрактное растение";
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
