package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import web.service.CarService;
import javax.servlet.http.HttpServletRequest;


@Controller
@RequestMapping("/")
public class CarsController {

    @Autowired
    private HttpServletRequest request;

    @Autowired
    private CarService carService;


    @RequestMapping(value = "cars", method = RequestMethod.GET)
    public String viewPageCars(ModelMap modelMap) {
        String locale = request.getParameter("locale");

        if (locale == null) {
            locale = "";
        }

        if (locale.equals("ru")) {
            modelMap.addAttribute("loc", "МАШИНЫ");
        } else if (locale.equals("en")) {
            modelMap.addAttribute("loc", "CARS");
        } else {
            modelMap.addAttribute("loc", "車");
        }
        modelMap.addAttribute("cars", carService.getListCar());
        return "cars";

    }
}
