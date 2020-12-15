package web.dao;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
@Component
public class CarDAO {
    private List<Car> cars;


    public CarDAO(){
        cars = new ArrayList<>();
        cars.add(new Car("nissan","1","blue"));
        cars.add(new Car("nissan","2","yellow"));
        cars.add(new Car("nissan","3","green"));
        cars.add(new Car("nissan","4","black"));
        cars.add(new Car("nissan","5","grey"));
    }

    public List<Car> getCars(int Count){
        return cars.stream().limit(Count).collect(Collectors.toList());
    }
}
