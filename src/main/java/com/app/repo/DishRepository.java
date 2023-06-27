package com.app.repo;

import com.app.entity.Dish;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

public interface DishRepository extends JpaRepository<Dish, Integer> {
    @Query(value = "SELECT check_ingredient2(:dishId) FROM dual", nativeQuery = true)
    String checkIngredient(@Param("dishId") int dishId);

}
