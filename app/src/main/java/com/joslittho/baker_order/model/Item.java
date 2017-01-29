package com.joslittho.baker_order.model;

/**
 * A baked good
 */
// begin class Item
public class Item {

    /* CONSTANTS */
    
    /* Integers */
    
    /* Strings */

    /* VARIABLES */

    String name;

    int price;

    int picture;
    
    /* CONSTRUCTOR */

    public Item( String name, int picture, int price ) {
        this.picture = picture;
        this.name = name;
        this.price = price;
    }

    /* METHODS */
    
    /* Getters and Setters */

    public String getName() {
        return name;
    }

    public void setName( String name ) {
        this.name = name;
    }

    public int getPicture() {
        return picture;
    }

    public void setPicture( int picture ) {
        this.picture = picture;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice( int price ) {
        this.price = price;
    }

    /* Overrides */
    
    /* Other Methods */

} // end class Item
