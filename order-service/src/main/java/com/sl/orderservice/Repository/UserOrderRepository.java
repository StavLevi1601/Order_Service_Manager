package com.sl.orderservice.Repository;

import com.sl.orderservice.Model.UserOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserOrderRepository extends JpaRepository<UserOrder,Integer> {
}
