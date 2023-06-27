package com.app.repo;

import com.app.entity.OrderDish;
import com.app.vo.OrderDishKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDishRepository extends JpaRepository<OrderDish, OrderDishKey> {
}
