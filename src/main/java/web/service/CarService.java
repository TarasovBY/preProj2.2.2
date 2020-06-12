package web.service;

import org.springframework.stereotype.Service;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Service
public class CarService {

    private List<Car> listCar;

    public CarService() {
        createListCar();
    }

    public List<Car> getListCar() {
        return listCar;
    }

    private void createListCar() {
        listCar = new ArrayList<>();
        listCar.add(new Car());
        listCar.add(new Car());
        listCar.add(new Car());
    }
}
