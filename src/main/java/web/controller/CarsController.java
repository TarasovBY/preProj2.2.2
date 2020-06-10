package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.model.Car;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/")
public class CarsController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    Car car1, car2, car3;

    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String viewPageCars(ModelMap modelMap) {
        String locale = request.getParameter("locale");

        if (locale == null) {
            locale = "";
        }

        List<Car> cars = new ArrayList<>();
        cars.add(car1);
        cars.add(car2);
        cars.add(car3);

        if (locale.equals("ru")) {
            modelMap.addAttribute("loc", "МАШИНЫ");
        } else if (locale.equals("en")) {
            modelMap.addAttribute("loc", "CARS");
        } else {
            modelMap.addAttribute("loc", "車");
        }
        modelMap.addAttribute("cars", cars);
        return "cars";

    }
}