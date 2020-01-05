/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ap.pizzafactory;

import java.util.ArrayList;

/**
 *
 * @author maxim
 */
public abstract class Pizza {
    protected String name;

    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    Dough dough;
    Sauce sauce;
    Veggie veggies[];
    Cheese cheese;
    Pepperoni pepperoni;
    Clams clams;
    
    abstract void prepare();
    
    void bake(){
        System.out.println("Bake for 25 minutes at 350");
    }
    
    void cut(){
        System.out.println("Cutting the pizza into diagonal slices");
    }
    
    void box(){
        System.out.println("Place pizza in official PizzaStore box");
    }
}
