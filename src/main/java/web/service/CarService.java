package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import web.dao.CarDAO;
import web.model.Car;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class CarService {
    @Autowired
    private CarDAO carDAO;

    public List<Car> getCars(int Count){
        return carDAO.getCars(Count);
    }
}
