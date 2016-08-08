package com.vahtakiss.classes;

import com.vahtakiss.classes.supplements.Milk;
import com.vahtakiss.classes.supplements.Nuts;
import com.vahtakiss.classes.supplements.Syrup;
import com.vahtakiss.classes.supplements.Zephyr;
import com.vahtakiss.classes.typesofcoffee.*;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;

public class BeverageFactory {
    public List<Beverage> createBeverages(HttpServletRequest req) {
        List<Beverage> beverages = new ArrayList<Beverage>();

        int count = Integer.parseInt(req.getParameter("count"));

        for (int i = 0; i < count; i++) {
            createBeverage(req, i);
        }

        return beverages;
    }

    private Beverage createBeverage(HttpServletRequest req, int current) {
        Beverage      beverage;
        Supplements[] supplements = Supplements.values();

        String coffee = req.getParameter("coffee" + current);
        int    sugar  = Integer.parseInt(req.getParameter("sugar" + current));

        beverage = createMainBeverage(coffee, sugar);
        if (beverage == null)
            return null;


        for (int i = 0; i < supplements.length; i++) {
            boolean exist =
                    Boolean.parseBoolean(req.getParameter(supplements[i].toString().toLowerCase() + current));
            if (exist)
                addSupplements(beverage, supplements[i]);
        }

        return beverage;
    }

    private Beverage createMainBeverage(String coffee, int sugar) {
        coffee = coffee.toUpperCase();
        switch (Beverages.valueOf(coffee)) {
            case LATTE:
                return new Latte(sugar);
            case FRAPPUCCINO:
                return new Frappuccino(sugar);
            case ESPRESSO:
                return new Espresso(sugar);
            case COCOA:
                return new Cocoa(sugar);
            case CAPPUCCINO:
                return new Cappuccino(sugar);
            case AMERICANO:
                return new Americano(sugar);
            default:
                return null;
        }
    }

    private Beverage addSupplements(Beverage in, Supplements supplement) {
        switch (supplement) {
            case MILK:
                return new Milk(in);
            case NUTS:
                return new Nuts(in);
            case SYRUP:
                return new Syrup(in);
            case ZEPHYR:
                return new Zephyr(in);
        }

        return null;
    }

}
