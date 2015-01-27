/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Craig
 */
public final class Class {

    ArrayList<Class> directory = new ArrayList<Class>();//arraylist of the class directory
    String _ID, _name, _faculty, _start, _end;//details of the classes
    int _credits, length, convertedStart, convertedEnd;//details of the classes
    boolean[] _days;//what days the classes are
    String filename = "ClassInfo3.txt";//the filename of the class info

    /**
     * default constructor that does nothing
     */
    public Class() {
    }

    /**
     * makes the class toString return the class ID
     *
     * @return the class ID
     */
    @Override
    public String toString() {
        return getID();
    }

    /**
     * constructor that sets all the info for the class
     *
     * @param ID the class ID
     * @param name the class name
     * @param days boolean array of days of the class
     * @param start when the class starts in text (??:??AM/PM)
     * @param end when the class ends in text (??:??AM/PM)
     * @param faculty who teaches the class
     * @param credits how many credits the class is worth
     */
    public Class(String ID, String name, boolean[] days, String start, String end, String faculty, int credits) {
        if (name.substring(0, 1).equals(" ")) {
            _name = name.substring(1, name.length());
        } else {
            _name = name;
        }
        _ID = ID;
        _credits = credits;
        _days = days;
        if (!"".equals(start)) {
            convertedStart = convertTime(start);
            _start = start + "M";
        } else {
            _start = "Unlisted";
            convertedStart = 9999;
        }
        if (!"".equals(start)) {
            convertedEnd = convertTime(end);
            _end = end + "M";
        } else {
            _end = "Unlisted";
            convertedEnd = 9999;
        }
        _faculty = faculty;
        length = convertedEnd - convertedStart;
    }

    /**
     * returns the class ID
     *
     * @return the class ID
     */
    public String getID() {
        return _ID;
    }

    /**
     * returns the class name
     *
     * @return the class name
     */
    public String getName() {
        return _name;
    }

    /**
     * returns the text start time
     *
     * @return the text start time
     */
    public String getStart() {
        return _start;
    }

    /**
     * returns the text end time
     *
     * @return the text end time
     */
    public String getEnd() {
        return _end;
    }

    /**
     * returns the integer start time
     *
     * @return the integer start time
     */
    public int getConvertedStart() {
        return convertedStart;
    }

    /**
     * returns the integer end time
     *
     * @return the integer end time
     */
    public int getConvertedEnd() {
        return convertedEnd;
    }

    /**
     * returns how long the class is
     *
     * @return how long the class is
     */
    public int getLength() {
        return length;
    }

    /**
     * returns the faculty teaching
     *
     * @return the faculty teaching
     */
    public String getFaculty() {
        return _faculty;
    }

    /**
     * returns the number of credits
     *
     * @return the number of credits
     */
    public int getCredits() {
        return _credits;
    }

    /**
     * what days the class is
     *
     * @return boolean array of days
     */
    public String getDays() {
        if (_days[0] == false && _days[1] == false && _days[2] == false && _days[3] == false && _days[4] == false) {
            return "Unlisted";
        } else {
            String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
            String result = "";
            for (int i = 0; i < 5; i++) {
                if (_days[i] == true) {
                    result += dayNames[i] + " ";
                }
            }
            return result;
        }
    }

    /**
     * reads from the text file and fills the class directory
     */
    public void fillClass() {
        boolean[] days = {false, false, false, false, false};
        String[] patterns = {"Monday|Tuesday|Wednesday|Thursday|Friday", "javascript:webAdvisor.newTab\\(\"(.*?) \\(", "\\) (.*?)\",\"", "day (..:...)M - .*?<", " - (..:...)M,.*?<", "</label><input type=\"hidden\" name=\"SEC.FACULTY.INFO_.*?\" value=\"(.*)\">", "</label><input type=\"hidden\" name=\"SEC.MIN.CRED_.*?\" value=\"(.*?).00\">"};
        try {
            String[] info = {"", "", "", "", "", "", ""};
            BufferedReader rdr = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = rdr.readLine()) != null) {
                for (int i = 0; i < 7; i++) {
                    Pattern p = Pattern.compile(patterns[i]);
                    Matcher m = p.matcher(line);
                    while (m.find()) {
                        if (i == 0) {
                            days = findDays(line);
                            break;
                        } else {
                            info[i] = m.group(1);
                            if (i == 6) {
                                Class newClass = new Class(info[1], info[2], days.clone(), info[3], info[4], info[5], Integer.parseInt(info[6]));
                                directory.add(newClass);
                                for (int k = 0; k < 5; k++) {
                                    days[k] = false;
                                }
                                for (int k = 0; k < 7; k++) {
                                    info[k] = "";
                                }
                            }
                        }
                    }
                }
            }
            rdr.close();
        } catch (Exception ex) {
        }
    }

    /**
     * separate method to find the days of the class
     *
     * @param line the line of text from the file
     * @return boolean array of the days of the class
     */
    public boolean[] findDays(String line) {
        String[] patterns = {"(Monday)", "(Tuesday)", "(Wednesday)", "(Thursday)", "(Friday)"};
        boolean[] days = {false, false, false, false, false};
        for (int i = 0; i < 5; i++) {
            Pattern p = Pattern.compile(patterns[i]);
            Matcher m = p.matcher(line);
            if (m.find()) {
                days[i] = true;
            }
        }
        return days;
    }

    /**
     * comparator to sort by ID
     */
    public static Comparator<Class> IDComparator = new Comparator<Class>() {
        @Override
        public int compare(Class e1, Class e2) {
            int cmp = e1.getID().compareTo(e2.getID());
            if (cmp == 0) {
                cmp = e1.getName().compareTo(e2.getName());
            }
            if (cmp == 0) {
                cmp = creditComparison(e1.getCredits(), e2.getCredits());
            }
            if (cmp == 0) {
                cmp = e1.getFaculty().compareTo(e2.getFaculty());
            }
            if (cmp == 0) {
                cmp = timeComparison(e1.getConvertedStart(), e2.getConvertedStart());
            }
            return cmp;
        }
    };
    /**
     * comparator to sort by name
     */
    public static Comparator<Class> nameComparator = new Comparator<Class>() {
        @Override
        public int compare(Class e1, Class e2) {
            int cmp = e1.getName().compareTo(e2.getName());
            if (cmp == 0) {
                cmp = e1.getID().compareTo(e2.getID());
            }
            if (cmp == 0) {
                cmp = creditComparison(e1.getCredits(), e2.getCredits());
            }
            if (cmp == 0) {
                cmp = e1.getFaculty().compareTo(e2.getFaculty());
            }
            if (cmp == 0) {
                cmp = timeComparison(e1.getConvertedStart(), e2.getConvertedStart());
            }
            return cmp;
        }
    };
    /**
     * comparator to sort by credits
     */
    public static Comparator<Class> creditsComparator = new Comparator<Class>() {
        @Override
        public int compare(Class e1, Class e2) {
            int cmp = creditComparison(e1.getCredits(), e2.getCredits());
            if (cmp == 0) {
                cmp = e1.getID().compareTo(e2.getID());
            }
            if (cmp == 0) {
                cmp = e1.getName().compareTo(e2.getName());
            }
            if (cmp == 0) {
                cmp = e1.getFaculty().compareTo(e2.getFaculty());
            }
            if (cmp == 0) {
                cmp = timeComparison(e1.getConvertedStart(), e2.getConvertedStart());
            }
            return cmp;
        }
    };
    /**
     * comparator to sort by faculty
     */
    public static Comparator<Class> facultyComparator = new Comparator<Class>() {
        @Override
        public int compare(Class e1, Class e2) {
            int cmp = e1.getFaculty().compareTo(e2.getFaculty());
            if (cmp == 0) {
                cmp = e1.getID().compareTo(e2.getID());
            }
            if (cmp == 0) {
                cmp = e1.getName().compareTo(e2.getName());
            }
            if (cmp == 0) {
                cmp = creditComparison(e1.getCredits(), e2.getCredits());
            }
            if (cmp == 0) {
                cmp = timeComparison(e1.getConvertedStart(), e2.getConvertedStart());
            }
            return cmp;
        }
    };
    /**
     * comparator to sort by start time
     */
    public static Comparator<Class> startComparator = new Comparator<Class>() {
        @Override
        public int compare(Class e1, Class e2) {
            int cmp = timeComparison(e1.getConvertedStart(), e2.getConvertedStart());
            if (cmp == 0) {
                cmp = e1.getID().compareTo(e2.getID());
            }
            if (cmp == 0) {
                cmp = e1.getName().compareTo(e2.getName());
            }
            if (cmp == 0) {
                cmp = creditComparison(e1.getCredits(), e2.getCredits());
            }
            if (cmp == 0) {
                cmp = e1.getFaculty().compareTo(e2.getFaculty());
            }
            return cmp;
        }
    };

    /**
     * compares two times
     *
     * @param t1 one time
     * @param t2 second time
     * @return for the comparator
     */
    public static int timeComparison(int t1, int t2) {
        if (t1 > t2) {
            return 1;
        } else if (t1 < t2) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * compares number of credits
     *
     * @param c1 credits from 1 class
     * @param c2 credits from another class
     * @return for the comparator
     */
    public static int creditComparison(int c1, int c2) {
        if (c1 < c2) {
            return -1;
        } else if (c1 > c2) {
            return 1;
        } else {
            return 0;
        }
    }

    /**
     * changes a text time to a integer
     *
     * @param time the string time read in
     * @return the integer time
     */
    public int convertTime(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        String meridiem = time.substring(5, 6);
        int actualtime = 0;
        if (hours == 12) {
            hours = 0;
        }
        if (meridiem.equals("P")) {
            actualtime += 720;
        }
        actualtime += hours * 60 + minutes;
        return actualtime;
    }

    /**
     * information about the classes
     *
     * @param i what number the entry is
     * @return the info to be output
     */
    public String outputInfo(int i) {
        return "Entry Number: " + (i + 1) + "\nID: " + _ID + "\nName: " + getName() + "\nCredits: " + getCredits()
                + "\nFaculty: " + getFaculty() + "\nStart Time: " + getStart() + "\nEnd Time: " + getEnd() + "\nDays: " + getDays();
    }

    /**
     * information about the classes without new lines for the fileIO
     *
     * @param i what number the entry is
     * @return the info to be output
     */
    public String outputInfoNoNewLine(int i) {
        return "Entry Number: " + (i + 1) + "ID: " + _ID + "Name: " + getName() + "Credits: " + getCredits()
                + "Faculty: " + getFaculty() + "Start Time: " + getStart() + "End Time: " + getEnd() + "Days: " + getDays();
    }

    /**
     * checks if two classes conflict in days
     *
     * @param c1 one class
     * @param c2 another class
     * @return true if there is a conflict; false if there's no conflict
     */
    public boolean dayConflict(Class c1, Class c2) {
        for (int i = 0; i < 5; i++) {
            if (c1._days[i] == true && c2._days[i] == true) {
                return timeConflict(c1, c2);
            }
        }
        return false;
    }

    /**
     * checks of two classes conflict in times
     *
     * @param c1 one class
     * @param c2 another class
     * @return false if there is a conflict; true if there is no conflict
     */
    public boolean timeConflict(Class c1, Class c2) {
        return (c2.convertedStart >= c1.convertedStart && c2.convertedStart <= c1.convertedEnd) || (c1.convertedStart >= c2.convertedStart && c1.convertedStart <= c2.convertedEnd)
                || (c2.convertedEnd >= c1.convertedStart && c2.convertedEnd <= c1.convertedEnd) || (c1.convertedEnd >= c2.convertedStart && c1.convertedEnd <= c2.convertedEnd);
    }
}
