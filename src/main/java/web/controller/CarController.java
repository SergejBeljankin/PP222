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
//	public String printCar(ModelMap model){
	public String printCar(@RequestParam(defaultValue = "5") String count, ModelMap model) {
		int countIN = Integer.valueOf(count);
//		if(countIN == 0){
//			countIN = 5;
//		}
		countIN = (countIN == 5 ) ? 5 : countIN;

		CarService tableCar = new CarServiseImpl();
		List<Car> myTable = tableCar.tableCar(countIN);
		model.addAttribute("rows", myTable);


		return "/cars";
	}

}