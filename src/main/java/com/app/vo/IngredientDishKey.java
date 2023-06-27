package com.app.vo;

import com.app.entity.Dish;
import com.app.entity.Ingredient;


import java.io.Serializable;
import java.util.Objects;

//@Embeddable
//@Getter
//@NoArgsConstructor
//@AllArgsConstructor

public class IngredientDishKey implements Serializable {
    //    @Column(name = "Gericht_id")
    private Dish dish;
    private Ingredient ingredient;

    public IngredientDishKey() {
    }
    public IngredientDishKey(Dish dish, Ingredient ingredient) {
        this.dish = dish;
        this.ingredient = ingredient;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof IngredientDishKey that)) return false;
        return Objects.equals(dish, that.dish) &&
                Objects.equals(ingredient, that.ingredient);
    }

    @Override
    public int hashCode() {
        return Objects.hash(dish, ingredient);
    }

}
