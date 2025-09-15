package main;

import car.Car;
import java.util.List;


public class Main {


    public void printCarList(List<Car> cars) {
        cars.forEach(System.out::println);
    }

    public List<Car> modelList(List<Car> cars, String model) {
        return cars.stream()
                .filter(car -> car.getModel().equals(model))
                .toList();
    }

    public List<Car> modelYearList(List<Car> cars, int n, String model) {
        return cars.stream()
                .filter(car -> car.getYear() < (2025 - n) && car.getModel().equals(model))
                .toList();
    }

    public List<Car> yearPriceList(List<Car> cars, int year, double price) {
        return cars.stream()
                .filter(car -> car.getYear() == year && car.getPrice() > price)
                .toList();
    }

    public static void main(String[] args) {

        Car car1 = new Car(1, "Toyota", 2015, 15000, "ABC123");
        Car car2 = new Car(2, "Honda", 2018, 18000, "DEF456");
        Car car3 = new Car(3, "Ford", 2012, 12000, "GHI789");
        Car car4 = new Car(4, "Toyota", 2020, 25000, "JKL012");
        Car car5 = new Car(5, "Honda", 2016, 16000, "MNO345");

        List<Car> cars = List.of(car1, car2, car3, car4, car5);

        Main main = new Main();
        System.out.println("All cars:");
        main.printCarList(cars);

        System.out.println("\nCars with model 'Honda':");
        main.printCarList(main.modelList(cars, "Honda"));

        System.out.println("\nCars older than 5 years with model 'Toyota':");
        main.printCarList(main.modelYearList(cars, 5, "Toyota"));

        System.out.println("\nCars from year 2018 with price greater than 15000:");
        main.printCarList(main.yearPriceList(cars, 2018, 15000));
    }
}
