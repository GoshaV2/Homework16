import model.Bus;
import model.Car;
import model.Train;
import model.task3.*;

public class Main {
    public static void main(String[] args) {
        task12();
        task3();
    }


    private static void task12() {
        //task 1
        Car car = new Car("audi", "A3", 2003, "German");
        car.setColor("черный");
        car.setMaxSpeed(200);
        Train train1 = new Train("Ласточка", "B-901", 2011, "Россия");
        train1.setMaxSpeed(301);
        train1.setStationStart("Белорусский вокзал");
        train1.setStationEnd("Минск-Пассажирский");
        train1.setCost(3500);
        train1.setCountTrolley(11);
        Train train2 = new Train("Ленинград", "D-125", 2019, "Россия");
        train2.setMaxSpeed(270);
        train2.setStationStart("Ленинградский вокзал");
        train2.setStationEnd("Минск-Пассажирский");
        train2.setCost(1700);
        train2.setCountTrolley(8);
        Bus bus1 = new Bus("Автоваз", "M1", 2000, "Россия");
        bus1.setColor("пурпурный");
        bus1.setMaxSpeed(200);
        Bus bus2 = new Bus("Автоваз", "M1", 2000, "Россия");
        bus2.setColor("красный");
        bus2.setMaxSpeed(100);
        Bus bus3 = new Bus("Автотурбо", "M1", 2020, "Германия");
        bus3.setColor("синий");
        bus3.setMaxSpeed(150);
        System.out.println(car);
        System.out.println(train1);
        System.out.println(train2);
        System.out.println(bus1);
        System.out.println(bus2);
        System.out.println(bus3);

        //task 2
        car.refill("зарядка");
        train1.refill("дизель");
        train2.refill("дизель");
        bus1.refill("бензин");
        bus2.refill("дизель");
        bus3.refill("подзарядка");
    }

    private static void task3(){
        Herbivores gazel=new Herbivores("Газель",11);
        gazel.setLivingEnvironment("Луга");
        gazel.setTypeEating("Трава");
        gazel.setSpeed(100);
        gazel.go();
        System.out.println(gazel);
        Herbivores girafe=new Herbivores("Жирав",21);
        girafe.setLivingEnvironment("Савана");
        girafe.setSpeed(40);
        girafe.setTypeEating("Листья деревьев");
        System.out.println(girafe);
        Herbivores hourse=new Herbivores("Лошадь",15);
        hourse.setLivingEnvironment("Луга");
        hourse.setTypeEating("Сено");
        hourse.setSpeed(40);
        System.out.println(hourse);
        hourse.eat();

        Predator giena=new Predator("Гиена",15);
        giena.setLivingEnvironment("Савана");
        giena.setSpeed(30);
        giena.setTypeEating("Скот");
        System.out.println(giena);
        Predator tiger=new Predator("Тигр",13);
        tiger.setLivingEnvironment("Савана");
        tiger.setSpeed(50);
        tiger.setTypeEating("Крупнорогатый скот");
        System.out.println(tiger);
        Predator bear=new Predator("Медведь",30);
        bear.setLivingEnvironment("Лес");
        bear.setSpeed(40);
        bear.setTypeEating("Мёд, рыба");
        System.out.println(bear);


        Flightless pavlin=new Flightless("Павлин",5);
        pavlin.setLivingEnvironment("Савана");
        pavlin.setTypeMove("медленый шаг");
        System.out.println(pavlin);
        Flightless pingvin=new Flightless("Пингвин",20);
        pingvin.setLivingEnvironment("Север");
        pingvin.setTypeMove("На животе");
        System.out.println(pingvin);
        Flightless birdDodo=new Flightless("Птица Додо",2);
        birdDodo.setAge(2);
        birdDodo.setLivingEnvironment("Тропический лес");
        birdDodo.setTypeMove("Бег");
        System.out.println(birdDodo);

        Flying chayka=new Flying("Чайка",5);
        chayka.setLivingEnvironment("пляж");
        chayka.setTypeMove("полёт");
        System.out.println(chayka);
        Flying albatros=new Flying("Альбатрос",7);
        albatros.setLivingEnvironment("неизвестно");
        System.out.println(albatros);
        Flying sokol=new Flying("Сокол",70);
        sokol.setLivingEnvironment("Скалы");
        System.out.println(sokol);

        Amphibian frog=new Amphibian("Лягушка",1);
        System.out.println(frog);
        Amphibian zmeya=new Amphibian("уж пресноводный",2);
        System.out.println(zmeya);
    }
}