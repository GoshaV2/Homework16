package model;

public class Bus extends Transport {
    public Bus(String brand, String model, int yearCreation, String country) {
        super(brand, model, yearCreation, country);
    }

    @Override
    public void refill(String typeFuel) {
        switch (typeFuel) {
            case "бензин":
                System.out.println("Заправка бензином");
                break;
            case "дизель":
                System.out.println("Заправка дизелем");
                break;
            default:
                System.out.println("Выберете коректую заправку из списка: бензин, дизель");
        }
    }
}
