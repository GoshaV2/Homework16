package model;

public class Train extends Transport {
    private double cost;
    private int hourTravel;
    private String stationStart;
    private String stationEnd;
    private int countTrolley;

    public Train(String brand, String model, int yearCreation, String country) {
        super(brand, model, yearCreation, country);
    }


    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getHourTravel() {
        return hourTravel;
    }

    public void setHourTravel(int hourTravel) {
        this.hourTravel = hourTravel;
    }

    public String getStationStart() {
        return stationStart;
    }

    public void setStationStart(String stationStart) {
        this.stationStart = stationStart;
    }

    public String getStationEnd() {
        return stationEnd;
    }

    public void setStationEnd(String stationEnd) {
        this.stationEnd = stationEnd;
    }

    public int getCountTrolley() {
        return countTrolley;
    }

    public void setCountTrolley(int countTrolley) {
        this.countTrolley = countTrolley;
    }

    @Override
    public void refill(String typeFuel) {
        switch (typeFuel) {
            case "дизель":
                System.out.println("Заправка дизелем");
                break;
            default:
                System.out.println("Выберете коректую заправку из списка: дизель");
        }
    }

    @Override
    public String toString() {
        return "Train{" +
                "brand='" + getBrand() + '\'' +
                ", model='" + getModel() + '\'' +
                ", yearCreation=" + getYearCreation() + '\'' +
                ", country='" + getCountry() + '\'' + '\'' +
                ", color='" + getColor() + '\'' + '\'' +
                ", maxSpeed=" + getMaxSpeed() + '\'' +
                "cost=" + cost +
                ", hourTravel=" + hourTravel + '\'' +
                ", stationStart='" + stationStart + '\'' +
                ", stationEnd='" + stationEnd + '\'' +
                ", countTrolley=" + countTrolley +
                '}';
    }
}
