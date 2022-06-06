package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import web.dao.CarDao;

@Controller
@RequestMapping("/cars")
public class CarsController {

    private final CarDao carDAO;

    @Autowired
    public CarsController(CarDao carDAO) {
        this.carDAO = carDAO;
    }

    @GetMapping()
    public String printCars(@RequestParam(value = "count", defaultValue = "5") int count, ModelMap model) {
        model.addAttribute("cars", carDAO.showSameCars(count));
        return "cars";
    }

    /*@GetMapping("/{num}")
    public String printSameCars(@PathVariable("num") int num, ModelMap model) {
        //получим необходимое кол-во машин
        model.addAttribute("car", carDAO.showSameCars(num));
        return "cars";
    }*/
}
