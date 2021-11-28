package web.service;

import web.model.Car;

import java.awt.*;
import java.util.ArrayList;

public class CarServiseImpl implements CarService{
    @Override
    public ArrayList<Car> tableCar(int count) {
        ArrayList<Car> carsOut = new ArrayList();
        for (int i = 0; i < count; i++){
            carsOut.add(new Car("Model 00-" + i, "red", 90 + i*15));
        }
        return carsOut;
    }
}
