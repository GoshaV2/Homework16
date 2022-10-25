package model.task3;

import java.util.Objects;

public class Bird extends Animal{
    private String livingEnvironment;

    public Bird(String name) {
        super(name);
    }

    public Bird(String name, int age) {
        super(name, age);
    }

    public Bird(String name, String livingEnvironment) {
        super(name);
        setLivingEnvironment(livingEnvironment);
    }

    public Bird(String name, int age, String livingEnvironment) {
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
    public void eat() {
        System.out.println("Клювать");
    }

    public void hunt(){
        System.out.println("Охотится");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        if (!super.equals(o)) return false;

        Bird bird = (Bird) o;

        return Objects.equals(livingEnvironment, bird.livingEnvironment);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (livingEnvironment != null ? livingEnvironment.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return  "Подкласс наследует "+ super.getClass().getName()+"\n"+
                "Bird{" + super.toString() +
                "livingEnvironment='" + livingEnvironment + '\'' +
                '}';
    }
}
