package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.context.WebContext;
import web.model.Car;
import web.service.CarService;
import web.service.CarServiseImpl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Controller
public class CarController {

	@GetMapping(value = "/cars")

	public String printCar(@RequestParam(defaultValue = "5") int count, ModelMap model) {
		if (count < 0){
			count = 0;
		} else if(count > 5){
			count = 5;
		}

		CarService tableCar = new CarServiseImpl();
		List<Car> myTable = tableCar.tableCar(count);
		model.addAttribute("rows", myTable);

		return "/cars";
	}

}