/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restaurantreviewer;

import java.io.BufferedWriter;
import java.io.FileWriter;

/**
 *
 * @author ccolegrove17
 */
public class Restaurant {

    String filename = "restaurants.txt";
    String _name, _address, _note;
    int _rating;

    /**
     * how I want information to be output
     *
     * @return the string to be output
     */
    public String formatString() {
        return "Name:" + _name + " Address:" + _address + " Notes:" + _note + " Rating:" + _rating;
    }

    /**
     * Constructor for a Restaurant
     *
     * @param name name of the restaurant
     * @param address address of the restaurant
     * @param note notes about the restaurant
     * @param rating rating of the restaurant
     */
    public Restaurant(String name, String address, String note, int rating) {
        _name = name;
        _address = address;
        _note = note;
        _rating = rating;
    }

}
