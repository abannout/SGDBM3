package com.app.entity;

import com.app.vo.IngredientDishKey;
import com.app.vo.OrderDishKey;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "Bestellung_Gericht")
@IdClass(OrderDishKey.class)
@NoArgsConstructor
@AllArgsConstructor

public class OrderDish {

    @Id
    @ManyToOne
    //@MapsId("orderId")
    @JoinColumn(name = "BESTELLUNG_ID")
    private Order order;
    @Id
    @ManyToOne
   // @MapsId("dishId")
    @JoinColumn(name = "GERICHT_ID")
    private Dish dish;

    @Column(name = "ANZAHL")
    private int amount;

}
