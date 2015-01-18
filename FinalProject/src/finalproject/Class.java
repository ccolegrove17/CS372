/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Craig
 */
public class Class {

    ArrayList<Class> directory = new ArrayList<Class>();
    String _ID, _name, _faculty, _start, _end;
    int _credits, length, convertedStart, convertedEnd;
    String filename = new String("ClassInfo2.txt");

    public Class() {
    }

    public Class(String ID, String name, String start, String end, String faculty, int credits) {
        if (name.substring(0, 1).equals(" ")) {
            _name = name.substring(1, name.length());
        } else {
            _name = name;
        }
        _ID = ID;
        _credits = credits;
        _start = start;
        _end = end;
        convertedStart = convertTime(start);
        convertedEnd = convertTime(end);
        _faculty = faculty;
        length = convertedEnd - convertedStart;
    }

    public String getID() {
        return _ID;
    }

    public String getName() {
        return _name;
    }

    public String getStart() {
        return _start;
    }

    public String getEnd() {
        return _end;
    }

    public int getConvertedStart() {
        return convertedStart;
    }

    public int getConvertedEnd() {
        return convertedEnd;
    }

    public int getLength() {
        return length;
    }

    public String getFaculty() {
        return _faculty;
    }

    public int getCredits() {
        return _credits;
    }

    public void fillClass() {
        String[] patterns = {"javascript:webAdvisor.newTab\\(\"(.*?) \\(", "\\) (.*?)\",\"", "day (..:...)M - .*?<", " - (..:...)M,.*?<", "</label><input type=\"hidden\" name=\"SEC.FACULTY.INFO_.*?\" value=\"(.*)\">", "</label><input type=\"hidden\" name=\"SEC.MIN.CRED_.*?\" value=\"(.*?).00\">"};
        try {
            String[] info = {"", "", "", "", "", ""};
            BufferedReader rdr = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = rdr.readLine()) != null) {
                for (int i = 0; i < 6; i++) {
                    Pattern p = Pattern.compile(patterns[i]);
                    Matcher m = p.matcher(line);
                    while (m.find()) {
                        info[i] = m.group(1);
                        if (i == 5) {
                            Class newClass = new Class(info[0], info[1], info[2], info[3], info[4], Integer.parseInt(info[5]));
                            directory.add(newClass);
                        }
                    }
                }
            }
            rdr.close();
        } catch (Exception ex) {
            System.out.printf("You fail. %s", ex.getMessage());
        }
    }

    public void fillClass2() {
        String pattern = "(Monday|Tuesday|Wednesday|Thursday|Friday).*?<";
        String[] dayNames = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday"};
        boolean[] days = {false, false, false, false, false};
        try {
            BufferedReader rdr = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = rdr.readLine()) != null) {
                Pattern p = Pattern.compile(pattern);
                Matcher m = p.matcher(line);
                while (m.find()) {
                    System.out.print(m.group(1) + "\n");
                }
            }
            rdr.close();
        } catch (Exception ex) {
            System.out.printf("You fail. blah %s", ex.getMessage());
        }
    }
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

    public static int timeComparison(int t1, int t2) {
        if (t1 > t2) {
            return 1;
        } else if (t1 < t2) {
            return -1;
        } else {
            return 0;
        }
    }

    public static int creditComparison(int c1, int c2) {
        if (c1 < c2) {
            return -1;
        } else if (c1 > c2) {
            return 1;
        } else {
            return 0;
        }
    }

    public int convertTime(String time) {
        int hours = Integer.parseInt(time.substring(0, 2));
        int minutes = Integer.parseInt(time.substring(3, 5));
        String meridiem = time.substring(5, 6);
        //System.out.printf("%d %d %s", hours, minutes, meridiem);
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

    public String outputInfo(int i) {
        return "ID: " + directory.get(i).getID() + "\nName: " + directory.get(i).getName() + "\nCredits: " + directory.get(i).getCredits() + "\nFaculty: " + directory.get(i).getFaculty() + "\nStart Time: " + directory.get(i).getStart();
    }

}
