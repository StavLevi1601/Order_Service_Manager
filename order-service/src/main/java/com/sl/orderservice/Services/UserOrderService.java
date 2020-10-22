package com.sl.orderservice.Services;

import com.sl.orderservice.Model.UserOrder;
import com.sl.orderservice.Repository.UserOrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserOrderService {

    @Autowired
    private UserOrderRepository userOrderRepository;

    public UserOrder saveProduct(UserOrder userOrder)
    {
        return userOrderRepository.save(userOrder);
    }

}
