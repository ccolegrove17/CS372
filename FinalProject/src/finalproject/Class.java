/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Craig
 */
public class Class {

    ArrayList<Class> directory = new ArrayList<Class>();
    String _ID, _name, _faculty;
    int _credits, _start, _end, _length;
    String filename = new String("ClassInfo2.txt");

    public Class() {

    }

    public Class(String ID, String name, String start, String end, String faculty, int credits) {

        _ID = ID;
        _name = name;
        _credits = credits;
        _start = convertTime(start);
        _end = convertTime(end);
        _faculty = faculty;
        _length = _end - _start;
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
                            //System.out.printf(info[0] + " " + info[1] + " " + info[2] + " " + info[3] + " " + info[4] + " " + info[5] + "\n");
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

//    public int classLength() {
//        return 0;
//    }
    public void outputInfo(int i) {
        System.out.println(directory.get(i)._name);
        System.out.println(directory.get(i)._ID);
        System.out.println(directory.get(i)._start);
        System.out.println(directory.get(i)._faculty);
        System.out.println(directory.get(i)._credits);
    }

}
