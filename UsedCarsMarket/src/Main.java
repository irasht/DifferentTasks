import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();
        createCarsDatabase(carList);
        System.out.println("-------------------------");
        System.out.println("Cars with standard Euro-6");
        System.out.println("-------------------------");
        findCarByStandard(carList);
        System.out.println("----------------------------");
        System.out.println("Cars with engine type patrol");
        System.out.println("----------------------------");
        findCarByEngineType(carList);
        System.out.println("---------------------------------");
        System.out.println("Cars was released after 2006 year");
        System.out.println("---------------------------------");
        findCarByYear(carList);
        System.out.println("--------------------------");
        System.out.println("Sort cars by engine volume");
        System.out.println("--------------------------");
        sortByEngineVolume(carList);
        printCarList(carList);
    }

    private static List<Car> createCarsDatabase(List<Car> list) {
        list.add(new Car("Chevrolet Colorado", 2017, new CarType("Truck"), "gas", 2.5, "Euro-6"));
        list.add(new Car("Ford Transit Connect", 2010, new CarType("Minivan"), "diesel", 1.8, "Euro-5"));
        list.add(new Car("Nissan NV350 Caravan", 2012, new CarType("Van"), "diesel", 3, "Euro-6"));
        list.add(new Car("Nissan Elgrand", 2005, new CarType("Minivan"), "petrol", 3.5, "Euro-5"));
        list.add(new Car("Mercedes-Benz Sprinter", 2006, new CarType("Van"), "diesel", 2.3, "Euro-5"));
        list.add(new Car("Honda Ridgeline", 2006, new CarType("Truck"), "gas", 3.5, "Euro-5"));
        list.add(new Car("Audi A6 C6 Quattro", 2004, new CarType("Car"), "diesel", 3, "Euro-4"));
        list.add(new Car("BMW X6", 2008, new CarType("Car"), "petrol", 3.5, "Euro-5"));
        list.add(new Car("Ferrari 458 Italia", 2009, new CarType("SportsCar"), "petrol", 4.4, "Euro-5"));
        list.add(new Car("Aston Martin Vantage", 2005, new CarType("SportsCar"), "petrol", 4.3, "Euro-4"));
        return list;
    }

    private static void findCarByStandard(List<Car> list) {
        for (Car car : list) {
            if (car.getStandard().equals("Euro-6")) {
                System.out.println(car);
            }
        }
    }

    private static void findCarByEngineType(List<Car> list) {
        for (Car car : list) {
            if (car.getEngineType().equals("petrol")) {
                System.out.println(car);
            }
        }
    }

    private static void findCarByYear(List<Car> list) {
        for (Car car : list) {
            if (car.getYear() > 2006) {
                System.out.println(car);
            }
        }
    }

    private static void sortByEngineVolume(List<Car> list) {
        list.sort(new Car.EngineVolumeComparator());
    }

    private static void printCarList(List<Car> list) {
        for (Car car : list) {
            System.out.println(car);

        }
    }
}
