/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Craig
 */
public class User {

    String _name;//user's name
    Class classes = new Class();//for class methods
    ArrayList<Class> userClasses = new ArrayList<Class>();//all the user's classes

    /**
     * default constructor that sets the user's name
     *
     * @param name the user's name
     */
    public User(String name) {
        _name = name;
    }

    /**
     * sets the user's name
     *
     * @param name the user's name
     */
    public void setName(String name) {
        _name = name;
    }

    /**
     * gets the user's name
     *
     * @return the user's name
     */
    public String getName() {
        return _name;
    }

    /**
     * checks validity of adding a new class to the user's schedule
     *
     * @param c1 the class they want to add
     * @return false if there is a conflict; true if there is no conflict
     */
    public boolean checkClasses(Class c1) {
        for (int i = 0; i < userClasses.size(); i++) {
            if (classes.dayConflict(c1, userClasses.get(i))) {
                return false;
            }
        }
        return true;
    }

    /**
     * removes all the classes from the user's schedule
     */
    public void clearClass() {
        int size = userClasses.size();
        for (int i = 0; i < size; i++) {
            userClasses.remove(0);
        }
        try {
            BufferedWriter wrtr = new BufferedWriter(new FileWriter(_name + ".txt"));
            wrtr.close();
        } catch (Exception ex) {
        }
    }

    /**
     * adds a class to the user's schedule and writes it the user's file
     *
     * @param c1 the class to add
     * @return true if it worked; false if it failed
     */
    public boolean addClass(Class c1) {
        if (checkClasses(c1)) {
            userClasses.add(c1);
            try {
                BufferedWriter wrtr = new BufferedWriter(new FileWriter(_name + ".txt"));
                for (int i = 0; i < userClasses.size(); i++) {
                    String line = userClasses.get(i).outputInfoNoNewLine(i);
                    wrtr.write(line);
                    wrtr.newLine();
                }
                wrtr.close();
            } catch (Exception ex) {

            }
            return true;
        } else {
            return false;
        }
    }

    /**
     * reads the user's text file and creates the arraylist of the user's
     * classes if there is no text file for the user, it will create one.
     *
     * @param u1
     */
    public void userIO(User u1) {
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(_name + ".txt"));
            try {
                String line;
                boolean[] days = {false, false, false, false, false};
                String[] info = {"", "", "", "", "", "", "", ""};
                String[] patterns = {"ID: (.*?)Name:", "Name: (.*?)Credits", "Credits: (.*?)Faculty", "Faculty: (.*?)Start", "Start Time: (.*?)MEnd", "End Time: (.*?)MDays", "Days: (.*day)"};
                while ((line = rdr.readLine()) != null) {
                    for (int i = 0; i < 7; i++) {
                        Pattern p = Pattern.compile(patterns[i]);
                        Matcher m = p.matcher(line);
                        while (m.find()) {
                            info[i] = m.group(1);
                        }
                    }
                    days = classes.findDays(line);
                    Class newClass = new Class(info[0], info[1], days.clone(), info[4], info[5], info[3], Integer.parseInt(info[2]));
                    userClasses.add(newClass);
                    for (int k = 0; k < 7; k++) {
                        info[k] = "";
                    }
                    for (int k = 0; k < 5; k++) {
                        days[k] = false;
                    }
                }
            } catch (Exception e) {
            }
        } catch (Exception ex) {
            try {
                BufferedWriter wrtr = new BufferedWriter(new FileWriter(_name + ".txt"));
                wrtr.close();
            } catch (Exception e) {

            }
        }
    }

    /**
     * returns how many classes the user is taking
     *
     * @return how many classes the user is taking
     */
    public int numberOfClasses() {
        return userClasses.size();
    }

    /**
     * returns how many credits the user is taking
     *
     * @return how many credits the user is taking
     */
    public int totalCredits() {
        int sum = 0;
        for (int i = 0; i < userClasses.size(); i++) {
            sum += userClasses.get(i).getCredits();
        }
        return sum;
    }
}
