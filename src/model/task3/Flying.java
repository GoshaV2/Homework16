package model.task3;

import java.util.Objects;

public class Flying extends Bird {
    private String typeMove;


    public Flying(String name, int age) {
        super(name, age);
    }


    public String getTypeMove() {
        return typeMove;
    }

    public void setTypeMove(String typeMove) {
        this.typeMove = valueOrDefault(typeMove);
    }

    @Override
    public void go() {
        System.out.println("Гулять");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Flying)) return false;
        if (!super.equals(o)) return false;

        Flying flying = (Flying) o;

        return Objects.equals(typeMove, flying.typeMove);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (typeMove != null ? typeMove.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Подкласс наследует " + super.getClass().getName() + "\n" +
                "Flying{" + super.toString() +
                "typeMove='" + typeMove + '\'' +
                '}';
    }
}
