package com.sl.orderservice.Controller;

import com.sl.orderservice.Model.UserOrder;
import com.sl.orderservice.Services.UserOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserOrderController {

    @Autowired
    private UserOrderService userOrderService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public UserOrder saveProduct(@RequestBody UserOrder order) {
        return userOrderService.saveProduct(order);
    }


}
