package web.service;

import web.dao.DaoCar;
import web.model.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarServiceImpl implements CarService {
    @Autowired
    private DaoCar daoCar;


    @Override
    public List<Car> getCars(int count) {
        return daoCar.getCars(count);
    }


}
