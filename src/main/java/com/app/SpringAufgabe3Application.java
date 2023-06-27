package com.app;

import com.app.entity.*;
import com.app.repo.*;
import com.app.vo.Address;
import com.app.vo.IngredientDishKey;
import com.app.vo.OrderDishKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;
import java.util.Optional;

@SpringBootApplication
public class SpringAufgabe3Application implements CommandLineRunner {

    @Autowired
    private CustomerRepository customerRepository;
    @Autowired

    private EmployeRepository employeRepository;
    @Autowired

    private DishRepository dishRepository;
    @Autowired

    private IngredientRepository ingredientRepository;
    @Autowired
    private OrderRepository orderRepository;
    @Autowired
    private OrderDishRepository orderDishRepository;
    @Autowired
    private IngredientDishRepository ingredientDishRepository;
    public static void main(String[] args) {
        SpringApplication.run(SpringAufgabe3Application.class, args);
    }



    @Override
    public void run(String... args) throws Exception {
//        Address a1 = new Address("wasserwerkstr","19","Bielefeld","33729");
//        Customer c1 = new Customer("Ahmad","Bannout","Ahmadiskönig","99999999","best",a1);
//
//        customerRepository.save(c1);
//        Customer c2 = new Customer("Ahmad","Bannout","Ahmadiskönig","99999999","best",a1);
//
//        customerRepository.save(c2);
//        Employe e1 = new Employe("Ahmad","Bannout","99999999","best",1.50f,new Date(),a1);
//
//        employeRepository.save(e1);
//        for (Customer customer:customerRepository.findAll()
//             ) {
//            System.out.println(customer.toString());
//        }
//
//       Dish dish = new Dish(12.0f,"Nudeln");
//        dishRepository.save(dish);
//        Ingredient ingredient = new Ingredient("Zwiebeln","stück",10.f);
//        ingredientRepository.save(ingredient);
////       Optional<Ingredient> ingredient1 = ingredientRepository.findById(1); // Replace ingredientRepository with your actual repository class
//
////        IngredientDishKey key = new IngredientDishKey(dish,ingredient);
//        IngredientDish ingredientDish = new IngredientDish(dish,ingredient,1);
//        ingredientDishRepository.save(ingredientDish);
//
//        Order order = new Order(new Date(),c1,e1,"in Vorbereitung");
//        orderRepository.save(order);
//        OrderDishKey orderDishKey = new OrderDishKey(order,dish);
//        OrderDish orderDish = new OrderDish(order,dish,3);
//        orderDishRepository.save(orderDish);

        String result = dishRepository.checkIngredient(1);
        System.out.println(result);


    }
}
