package com.app.vo;

import com.app.entity.Dish;
import com.app.entity.Order;


import java.io.Serializable;
import java.util.Objects;


public class OrderDishKey implements Serializable {
  //  @Column(name = "Bestellung_id")
    private Order order;

   // @Column(name = "Gericht_id")
    private Dish dish;

    public OrderDishKey(Order order, Dish dish) {
        this.order = order;
        this.dish = dish;
    }

    public OrderDishKey() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof OrderDishKey that)) return false;
        return Objects.equals(order, that.order) &&
                Objects.equals(dish, that.dish);
    }

    @Override
    public int hashCode() {
        return Objects.hash(order, dish);
    }
}
