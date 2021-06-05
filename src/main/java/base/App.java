/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

import java.util.Scanner;

public class App {
    Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        Item item1 = new Item(1);
        Item item2 = new Item(2);
        Item item3 = new Item(3);

        myApp.setItem(item1);
        myApp.setItem(item2);
        myApp.setItem(item3);

        int total1 = myApp.itemTotal(item1);
        int total2 = myApp.itemTotal(item2);
        int total3 = myApp.itemTotal(item3);

        float subtotal = myApp.subtotalCalc(total1, total2, total3);
        float tax = myApp.taxCalc(subtotal);
        float total = myApp.calcTotal(subtotal, tax);

        String output = myApp.buildOutput(subtotal, tax, total);

        myApp.printOutput(output);
    }

    public void setItem(Item item) {
        System.out.print("Enter the price of item " + item.getNumber() + ": ");
        String priceString = input.nextLine();
        int price = Integer.parseInt(priceString);
        item.setPrice(price);

        System.out.print("Enter the quantity of item " + item.getNumber() + ": ");
        String quantityString = input.nextLine();
        int quantity = Integer.parseInt(quantityString);
        item.setQuantity(quantity);
    }

    public int itemTotal(Item item) {
        return item.getPrice() * item.getQuantity();
    }

    public float subtotalCalc(int total1, int total2, int total3) {
        return total1 + total2 + total3;
    }

    public float taxCalc(float subtotal) {
        return subtotal * .055f;
    }

    public float calcTotal(float subtotal, float tax) {
        return subtotal + tax;
    }

    String buildOutput(float subtotal, float tax, float total) {
        String subtotalString = String.format("%.2f", subtotal);
        String taxString = String.format("%.2f", tax);
        String totalString = String.format("%.2f", total);

        return "Subtotal: " + subtotalString + "\nTax: " + taxString + "\nTotal: " + totalString;
    }

    public void printOutput(String output) {
        System.out.println(output);
    }
}
