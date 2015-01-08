/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package foodbank.volunteer;

/**
 *
 * @author ccolegrove17
 */
public class Volunteer {
    String name;
    String ID;
    Timecard timecard = new Timecard();
    
    public void setName(String name){
        this.name = name;
    }
    
    public String getName(){
        return name;
    }
    
    public void setID(String ID){
        this.ID = ID;
    }
    
    public String getID(){
        return ID;
    }
}
