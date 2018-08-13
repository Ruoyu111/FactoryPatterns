package com.ce.pizzafm;

/**
 * @author Ruoyu Chen
 * Created on 8/10/2018
 */
public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Deep Dish Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella Cheese");
        toppings.add("Frozen Clams from Chesapeaks Bay");
    }

    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}
