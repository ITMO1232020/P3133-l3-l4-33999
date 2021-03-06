package lab3.nature;

import java.util.Objects;

public class Air implements Atmosphere {
    protected boolean isMove;

    public Air() {
        isMove = true;
    }

    public String move() {
        if (getIsMove()) {
            return "Дует " + this + "...";
        }
        else{
            return "Тихо, " + this + " не дует.";
        }
    }

    public boolean getIsMove() {
        return isMove;
    }

    public void setIsMove(boolean isMove) {
        this.isMove = isMove;
    }

    @Override
    public String toString(){
        return "Воздух";
    }

    @Override
    public boolean equals(Object obj){
        if(obj == null || this.getClass() != obj.getClass()){
            return false;
        }

        Air air = (Air)obj;
        return isMove == air.isMove;
    }

    @Override
    public int hashCode(){
        return Objects.hash(super.hashCode(), isMove);
    }
}
