package model.task3;

import java.util.Objects;

public class Amphibian extends Animal {
    private String livingEnvironment;

    public Amphibian(String name) {
        super(name);
    }

    public Amphibian(String name, int age) {
        super(name, age);
    }

    public Amphibian(String name, String livingEnvironment) {
        super(name);
        setLivingEnvironment(livingEnvironment);
    }

    public Amphibian(String name, int age, String livingEnvironment) {
        super(name, age);
        setLivingEnvironment(livingEnvironment);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = valueOrDefault(livingEnvironment);
    }

    @Override
    public void go() {
        System.out.println("Охотится");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Amphibian)) return false;
        if (!super.equals(o)) return false;

        Amphibian amphibian = (Amphibian) o;

        return Objects.equals(livingEnvironment, amphibian.livingEnvironment);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (livingEnvironment != null ? livingEnvironment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Подкласс наследует " + super.getClass().getName() + "\n" +
                "Amphibian{" + super.toString() +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}
