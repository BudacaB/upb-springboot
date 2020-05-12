package com.upb.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

// acceptarea tuturor rutelor de request cu aceasta adnotare
@CrossOrigin(origins = "*")
// semnalam ca aici avem controller-ul pentru serviciul web
@RestController
public class CarController {

    // semnalam ca vom raspunde cu metoda de aici pentru requesturi http - get
    @GetMapping(path = "/cars")
    public List<Car> retrieveCars() {
        return Arrays.asList(new Car(1l, "Ferrari", "Enzo"), new Car(2l, "Tesla", "Model S"));
    }
}
