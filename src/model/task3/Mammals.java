package model.task3;

import java.util.Objects;

public class Mammals extends Animal{
        private String livingEnvironment;
    private int speed;

    public Mammals(String name, int age) {
        super(name, age);
    }

    public String getLivingEnvironment() {
        return livingEnvironment;
    }

    public void setLivingEnvironment(String livingEnvironment) {
        this.livingEnvironment = valueOrDefault(livingEnvironment);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = valueOrDefault(speed);
    }

    @Override
    public void go(){
        System.out.println("Гулять");
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Mammals)) return false;
        if (!super.equals(o)) return false;

        Mammals mammals = (Mammals) o;

        if (speed != mammals.speed) return false;
        return Objects.equals(livingEnvironment, mammals.livingEnvironment);
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (livingEnvironment != null ? livingEnvironment.hashCode() : 0);
        result = 31 * result + speed;
        return result;
    }

    @Override
    public String toString() {
        return "Подкласс наследует " + super.getClass().getName() + "\n" +
                "Mammals{" + '\'' +
                super.toString() +
                "livingEnvironment='" + livingEnvironment + '\'' +
                ", speed=" + speed +
                '}';
    }
}
