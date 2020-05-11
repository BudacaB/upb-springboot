package com.upb.demo;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@CrossOrigin(origins = "*")
@RestController
public class CarController {

    @GetMapping(path = "/cars")
    public List<Car> retrieveCars() {
        return Arrays.asList(new Car(1l, "Ferrari", "Enzo"), new Car(2l, "Tesla", "Model S"));
    }
}
