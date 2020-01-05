/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.pizzafactory;

/**
 *
 * @author maxim
 */
public class NYPizzaStore extends PizzaStore{
    

    @Override
    protected Pizza createPizza(String type) {
        Pizza pizza = null;
        PizzaIngredientFactory ingredientFactory = new NYPizzaIngredientFactory();
        if(type.equals("cheese")){
            pizza = new CheesePizza(ingredientFactory);
            pizza.setName("New York Stlye Cheese Pizza");
            return pizza;
        }
        return null;
    }
    
}
