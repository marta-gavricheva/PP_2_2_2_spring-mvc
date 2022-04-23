package web.dao;
import org.springframework.stereotype.Repository;
import web.dao.DaoCar;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
 public class DaoCarImpl implements DaoCar {
    private List<Car> cars = new ArrayList<>();

    {
        cars.add(new Car("Reno", 111, "color1"));
        cars.add(new Car("BMV", 222, "color2"));
        cars.add(new Car("Lada", 333, "color3"));
        cars.add(new Car("MAZ", 444, "color4"));
        cars.add(new Car("KIA", 555, "color5"));
    }

    @Override
    public List<Car> getCars(int count) {
        if (count == 0) {
            return cars;

        }
        return cars.stream().limit(count).collect(Collectors.toList());
    }
}
