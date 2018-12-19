import java.util.Comparator;

public class Car {
    private String name;
    private int year;
    private CarType carType;
    private String engineType;
    private double engineVolume;
    private String standard;

    public Car(String name, int year, CarType carType, String engineType, double engineVolume, String standard) {
        this.name = name;
        this.year = year;
        this.carType = carType;
        this.engineVolume = engineVolume;
        this.standard = standard;
        this.engineType = engineType;
    }

    public int getYear() {
        return year;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getStandard() {
        return standard;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    static class EngineVolumeComparator implements Comparator<Car> {
        @Override
        public int compare(Car car1, Car car2) {
//            if (car1.getEngineVolume() < car2.getEngineVolume()) {return -1;}
//            if (car1.getEngineVolume() > car2.getEngineVolume()) {return 1;}
//            return 0;
            return Double.compare(car1.getEngineVolume(), car2.getEngineVolume());
        }
    }

    @Override
    public String toString() {
        return name + " was released in " + year + " year. It's " + carType + ", with engine type " + engineType + " and engine volume: " + engineVolume + "L. Has " + standard + " standard.";
    }
}
