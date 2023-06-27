package com.app.entity;

import com.app.vo.IngredientDishKey;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Table(name = "ZUTATEN_GERICHT")
@IdClass(IngredientDishKey.class)

public class IngredientDish {
//    @EmbeddedId
//    IngredientDishKey id;
    @Id
    @ManyToOne
    @JoinColumn(name = "GERICHT_ID")
    private Dish dish;
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    //@MapsId("ingredientId")
    @JoinColumn(name = "ZUTAT_ID")
    private Ingredient ingredient;

    @Column(name = "MENGE")
    private int amount;

    public IngredientDish(Dish dish, Ingredient ingredient, int amount) {
        this.dish = dish;
        this.ingredient = ingredient;
        this.amount = amount;
    }

}
