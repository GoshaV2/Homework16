package model.task3;

import java.util.Objects;

public class Herbivores extends Mammals {
    private String typeEating;

    public Herbivores(String name) {
        super(name);
    }

    public Herbivores(String name, String livingEnvironment) {
        super(name, livingEnvironment);
    }

    public Herbivores(String name, String livingEnvironment, String typeEating) {
        super(name, livingEnvironment);
        setTypeEating(typeEating);
    }

    public Herbivores(String name, int age, String livingEnvironment, int speed, String typeEating) {
        super(name, age, livingEnvironment, speed);
        setTypeEating(typeEating);
    }

    public Herbivores(String name, int age, String livingEnvironment, String typeEating) {
        super(name, age, livingEnvironment);
        setTypeEating(typeEating);
    }

    public Herbivores(String name, int age, String livingEnvironment, int speed) {
        super(name, age, livingEnvironment, speed);
    }

    public Herbivores(String name, int age, String livingEnvironment) {
        super(name, age, livingEnvironment);
    }

    public String getTypeEating() {
        return typeEating;
    }

    public void setTypeEating(String typeEating) {
        this.typeEating = valueOrDefault(typeEating);
    }

    @Override
    public void go() {
        System.out.println("Пастись");
    }

    @Override
    public void eat() {
        System.out.println("Кушать "+typeEating);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Herbivores)) return false;
        if (!super.equals(o)) return false;

        Herbivores that = (Herbivores) o;

        return Objects.equals(typeEating, that.typeEating);
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
                "Herbivores{" + super.toString() +
                "typeEating='" + typeEating + '\'' +
                '}';
    }
}
