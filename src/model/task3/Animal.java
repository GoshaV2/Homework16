package model.task3;

public class Animal {
    private String name;
    private int age;

    public Animal(String name) {
        this.name = valueOrDefault(name);
    }

    public Animal(String name, int age) {
        this(name);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = valueOrDefault(age);
    }

    public void eat() {
        System.out.println("Кушать");
    }

    public void sleep() {
        System.out.println("Спать");
    }

    public void go() {
        System.out.println("Двигаться");
    }

    protected String valueOrDefault(String el) {
        if (el == null && el.isBlank()) {
            return "default";
        }
        return el;
    }

    protected int valueOrDefault(int el) {
        if (el < 1) {
            return 5;
        }
        return el;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;

        Animal animal = (Animal) o;

        if (age != animal.age) return false;
        return name.equals(animal.name);
    }

    @Override
    public int hashCode() {
        int result = name.hashCode();
        result = 31 * result + age;
        return result;
    }

    @Override
    public String toString() {
        return "Главный класс" + '\n' +
                "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
