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

    public Event(String name, String location, String date) {
        this.name = name;
        this.location = location;
        this.date = date;
    }

    @Override
    public String toString(){
        return "Name:" + getName() + " Location:" + getLocation() + " Month:" + date.substring(4, 6) + " Day:" + date.substring(6, 8) + " Year:" + date.substring(0, 4);
    }
    public static Comparator<Event> nameComparator = new Comparator<Event>() {
        @Override
        public int compare(Event e1, Event e2) {
            int cmp = e1.getName().compareTo(e2.getName());
            if (cmp == 0) {
                cmp = e1.getDate().compareTo(e2.getDate());
            }
            if (cmp == 0) {
                cmp = e1.getLocation().compareTo(e2.getLocation());
            }
            return cmp;
        }
    };

    public static Comparator<Event> locationComparator = new Comparator<Event>() {
        @Override
        public int compare(Event e1, Event e2) {
            int cmp = e1.getLocation().compareTo(e2.getLocation());
            if (cmp == 0) {
                cmp = e1.getDate().compareTo(e2.getDate());
            }
            if (cmp == 0) {
                cmp = e1.getName().compareTo(e2.getName());
            }
            return cmp;
        }
    };

    public static Comparator<Event> dateComparator = new Comparator<Event>() {
        @Override
        public int compare(Event e1, Event e2) {
            int cmp = e1.getDate().compareTo(e2.getDate());
            if (cmp == 0) {
                cmp = e1.getName().compareTo(e2.getName());
            }
            if (cmp == 0) {
                cmp = e1.getLocation().compareTo(e2.getLocation());
            }
            return cmp;
        }
    };

    public String getDate() {
        return date;
    }

    public String getName() {
        return name;
    }

    public String getLocation() {
        return location;
    }

    public String getMonth() {
        return date.substring(4, 6);
    }

    public String getDay() {
        return date.substring(6, 8);
    }

    public String getYear() {
        return date.substring(0, 4);
    }

    public void loadList() {

    }
}
