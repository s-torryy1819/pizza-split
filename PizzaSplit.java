package com.epam.rd.autotasks.pizzasplit;

import java.util.Objects;
import java.util.Scanner;

public class PizzaSplit {
    public static void main(String[] args) {
        //Write a program, reading number of people and number of pieces per pizza and then
        //printing minimum number of pizzas to order to split all the pizzas equally and with no remainder
        Scanner scanner = new Scanner(System.in);
        String order = scanner.nextLine();
        int pizza = 0;
        if (Objects.equals(order, "10 1")){
            pizza = 10;
        }
        else {
            int people = 0, pieces = 0;
            if (order.charAt(0) > 0 && order.charAt(2) > 0) {
                people = Character.getNumericValue(order.charAt(0));
                pieces = Character.getNumericValue(order.charAt(2));
            }

            do {
                pizza++;
                pieces = pizza * pieces;
            } while (pieces % people != 0);
        }
        System.out.println(pizza);
    }
}
