/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.util.ArrayList;

/**
 *
 * @author Craig
 */
public class User {

    String _name;
    Class classes = new Class();
    ArrayList<Class> userClasses = new ArrayList<Class>();

    public User(String name) {
        _name = name;
    }

    public void setName(String name) {
        _name = name;
    }

    public String getName() {
        return _name;
    }

    public boolean checkClasses(Class c1) {
        for (int i = 0; i < userClasses.size(); i++) {
            if (classes.dayConflict(c1, userClasses.get(i))) {
                return false;
            }
        }
        return true;
    }

    public boolean addClass(Class c1) {
        if (checkClasses(c1)) {
            userClasses.add(c1);
            return true;
        } else {
            return false;
        }
    }

    public void userCreateFile(User u1) {

    }

}
