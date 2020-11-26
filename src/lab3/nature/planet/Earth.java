package lab3.nature.planet;

import lab3.nature.Air;
import lab3.nature.Surface;

public class Earth extends Planet{
    public Earth(Surface surface, Air air){
        super(surface, air);
    }

    @Override
    public String toString(){
        return "планета Земля";
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }
}
