package com.app.repo;

import com.app.entity.IngredientDish;
import com.app.vo.IngredientDishKey;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IngredientDishRepository extends JpaRepository<IngredientDish, IngredientDishKey> {
}
