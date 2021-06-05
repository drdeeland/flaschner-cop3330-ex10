/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Dillon Flaschner
 */

package base;

public class Item {
    private int itemNumber;
    private int itemPrice;
    private int itemQuantity;

    public Item(int itemNumber) {
        this.itemNumber = itemNumber;
    }

    public void setPrice(int itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getPrice() {
        return itemPrice;
    }

    public void setQuantity(int itemQuantity) {
        this.itemQuantity = itemQuantity;
    }

    public int getQuantity() {
        return itemQuantity;
    }

    public int getNumber() {
        return itemNumber;
    }
}
