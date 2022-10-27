package model.task3;

import java.util.Objects;

public class Predator extends Mammals {
    private String typeEating;

    public Predator(String name, int age) {
        super(name, age);
    }

    public String getTypeEating() {
        return typeEating;
    }

    public void setTypeEating(String typeEating) {
        this.typeEating = valueOrDefault(typeEating);
    }

    @Override
    public void go() {
        System.out.println("Охотится");
    }
    @Override
    public void eat() {
        System.out.println("Кушать "+typeEating);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Predator)) return false;
        if (!super.equals(o)) return false;

        Predator predator = (Predator) o;

        return Objects.equals(typeEating, predator.typeEating);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (typeEating != null ? typeEating.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Подкласс наследует " + super.getClass().getName() + "\n" +
                "Predator{" + super.toString() +
                "typeEating='" + typeEating + '\'' +
                '}';
    }
}
