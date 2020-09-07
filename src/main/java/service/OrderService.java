package service;

import lombok.extern.slf4j.Slf4j;
import model.OrderDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class OrderService {

    @Autowired
    OrderDTO orderDTO;

    public void completeOrder(OrderDTO orderDTO){

        orderDTO.setIsOrderComplete(true);

    }
}
