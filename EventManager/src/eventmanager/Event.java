/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventmanager;

import java.io.*;
import java.util.*;

/**
 *
 * @author ccolegrove17
 */
public class Event {

    private String name, location, date;

    /**
     * constructor for the event class
     *
     * @param name name of the event
     * @param location location of the event
     * @param date date of the event
     */
    public Event(String name, String location, String date) {
        this.name = name;//sets the name
        this.location = location;//sets the location
        this.date = date;//sets the date
    }

    /**
     * outputs the correct string of information
     *
     * @return
     */
    @Override
    public String toString() {
        return "Name:" + getName() + " Location:" + getLocation() + " Month:" + date.substring(4, 6) + " Day:" + date.substring(6, 8) + " Year:" + date.substring(0, 4);//info to output
    }

    /**
     * how to sort by name
     */
    public static Comparator<Event> nameComparator = new Comparator<Event>() {
        @Override
        public int compare(Event e1, Event e2) {//compares two events
            int cmp = e1.getName().compareTo(e2.getName());//compares the names of the events
            if (cmp == 0) {//if the names are the same
                cmp = e1.getDate().compareTo(e2.getDate());//compares the dates of the events
            }
            if (cmp == 0) {//if the dates are the same
                cmp = e1.getLocation().compareTo(e2.getLocation());//compares the locations of the events
            }
            return cmp;//returns the comparison 
        }
    };

    /**
     * how to sort by location
     */
    public static Comparator<Event> locationComparator = new Comparator<Event>() {
        @Override
        public int compare(Event e1, Event e2) {//compares two events
            int cmp = e1.getLocation().compareTo(e2.getLocation());//compares the location of the events
            if (cmp == 0) {//if the location is the same
                cmp = e1.getDate().compareTo(e2.getDate());//compares the dates of the events
            }
            if (cmp == 0) {//if the dates are the same
                cmp = e1.getName().compareTo(e2.getName());//compares the names of the events
            }
            return cmp;//returns the comparison
        }
    };

    /**
     * how to sort by date
     */
    public static Comparator<Event> dateComparator = new Comparator<Event>() {
        @Override
        public int compare(Event e1, Event e2) {//compares two events 
            int cmp = e1.getDate().compareTo(e2.getDate());//compares the dates of the events
            if (cmp == 0) {//if the dates are the same
                cmp = e1.getName().compareTo(e2.getName());//compares the names of the events
            }
            if (cmp == 0) {//if the names are the same
                cmp = e1.getLocation().compareTo(e2.getLocation());//compares the locations of the events
            }
            return cmp;//returns the comparison
        }
    };

    /**
     * gives the event's date
     *
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * gives the event's name
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * gives the event's location
     *
     * @return the location
     */
    public String getLocation() {
        return location;
    }

    /**
     * gives the event's month
     *
     * @return the month
     */
    public String getMonth() {
        return date.substring(4, 6);
    }

    /**
     * gives the event's day
     *
     * @return the day
     */
    public String getDay() {
        return date.substring(6, 8);
    }

    /**
     * gives the event's year
     *
     * @return the year
     */
    public String getYear() {
        return date.substring(0, 4);
    }
}
