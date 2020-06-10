package web.model;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
@Scope(value = "prototype")
public class Car {
    private String brand;
    private String model;
    private int price;

    public Car(String brand, String model, int price) {
        this.brand = brand;
        this.model = model;
        this.price = price;
    }

    public Car() {
        this.brand = "brand "+ new Random().nextInt(5000);
        this.model = "model" + new Random().nextInt(5000);
        this.price = new Random().nextInt(500000);
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getPrice() {
        return price;
    }
}
