package pl.sdacademy.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Exercises {

    public static void main(String[] args) {



            List<Car> cars = new ArrayList<>();
            cars.add(new Car("Opel Astra", "Czarny", 150));
            cars.add(new Car("Nissan Almera", "Czarny", 140));
            cars.add(new Car("Fiat Panda", "Biały", 120));
            cars.add(new Car("Mitsubishi Eclipse", "Czerwony", 180));
            cars.add(new Car("Volkswagen Golf", "Granatowy", 160));
            cars.add(new Car("BMW E46", "Bordowy", 150));

            List <Car> list = cars.stream()
                    .sorted(Comparator.comparing(Car :: getColour))
                    .collect(Collectors.toList());
        System.out.println(list);


            Map <Car, String> map = cars.stream()
                    .sorted(Comparator.comparing(Car :: getColour))

                    .collect(Collectors.toMap(k -> k, Car::getColour));
            System.out.println(map);

        }
    }

