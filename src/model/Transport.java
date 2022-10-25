package model;

public abstract class Transport {
    private String brand;
    private String model;
    private int yearCreation;
    private String country;
    private String color;
    private int maxSpeed;

    public Transport(String brand, String model, int yearCreation, String country) {
        this.brand = brand;
        this.model = model;
        this.yearCreation = yearCreation;
        this.country = country;
    }

    public Transport(String brand, String model, int yearCreation, String country, String color, int maxSpeed) {
        this(brand, model, yearCreation, country);
        setColor(color);
        setMaxSpeed(maxSpeed);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYearCreation() {
        return yearCreation;
    }

    public String getCountry() {
        return country;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = valueOrDefault(color);
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        if (maxSpeed < 1) {
            this.maxSpeed = 50;
            return;
        }
        this.maxSpeed = maxSpeed;
    }

    public abstract void refill(String typeFuel);

    private String valueOrDefault(String el) {
        if (el == null || el.isBlank()) {
            return "default";
        } else {
            return el;
        }
    }

    @Override
    public String toString() {
        return "Transport{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", yearCreation=" + yearCreation +
                ", country='" + country + '\'' +
                ", color='" + color + '\'' +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
