package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.dao.CarDAO;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping()
public class CarController {
    @Autowired
    private CarDAO carDAO;

    @GetMapping("/cars")
    public String carView(@RequestParam("count") int count, ModelMap model) {
        System.out.println(count);
        System.out.println(carDAO.getPeoples(count));
        model.addAttribute("cars", carDAO.getPeoples(count));
        return "cars";
    }
}
