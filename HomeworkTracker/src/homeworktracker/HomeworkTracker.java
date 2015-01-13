/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package homeworktracker;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ccolegrove17
 */
public class HomeworkTracker {

    /**
     * This function finds the maximum value of a List of scores passed in.
     *
     * @param list a List of scores
     * @return
     */
    //PT -- These could all be static, since HomeworkTracker has no member variables
    public double findMax(List<Double> list) {
        double max = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) > max) {
                max = list.get(i);
            }
        }
        return max;
    }

    /**
     * This function finds the minimum value of a List of scores passed in.
     *
     * @param list a List of scores
     * @return
     */
    public double findMin(List<Double> list) {
        double min = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            if (list.get(i) < min) {
                min = list.get(i);
            }
        }
        return min;
    }

    /**
     * This function finds the average value of a List of scores passed in.
     *
     * @param list a List of scores
     * @return
     */
    public double findAverage(List<Double> list) {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum / list.size();
    }

}
