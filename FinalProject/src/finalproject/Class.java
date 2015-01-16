/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package finalproject;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Craig
 */
public class Class {

    String _ID, _name, _faculty;
    int _credits, _start, _end;
    String filename = new String("ClassInfo2.txt");

    public Class() {

    }

    public Class(String ID, String name, int start, int end, String faculty, int credits) {
        _ID = ID;
        _name = name;
        _credits = credits;
        _start = start;
        _end = end;
        _faculty = faculty;
    }

    public void fillClass() {
        String[] patterns = {"javascript:webAdvisor.newTab\\(\"(.*?) \\(", "\\) (.*?)\",\"", "day (.*?).M - .*?<", " - (..:..).M,.*?<", "</label><input type=\"hidden\" name=\"SEC.FACULTY.INFO_.*?\" value=\"(.*)\">", "</label><input type=\"hidden\" name=\"SEC.MIN.CRED_.*?\" value=\"(.*?)\">"};
        try {
            String[] info = {"", "", "", "", "", ""};
            BufferedReader rdr = new BufferedReader(new FileReader(filename));
            String line;
            while ((line = rdr.readLine()) != null) {
                for (int i = 0; i < 6; i++) {

                    Pattern p = Pattern.compile(patterns[i]);
                    Matcher m = p.matcher(line);
                    while (m.find()) {
//                        if (i == 0) {
//                            info[0] = "";
//                            info[1] = "";
//                            info[2] = "";
//                            info[3] = "";
//                            info[4] = "";
//                            info[5] = "";
//                        }
                        info[i] = m.group(1);
                        if (i == 5) {
                            System.out.printf(info[0] + " " + info[1] + " " + info[2] + " " + info[3] + " " + info[4] + " " + info[5] + "\n");
                        }
//                        System.out.print(m.group(1) + " ");
//                        if (i == 5) {
//                            System.out.println();
//                        }
                    }
                }
                //System.out.printf(info[0] + " " + info[5] + "\n");
            }
            rdr.close();
        } catch (Exception ex) {
            System.out.printf("You fail. %s", ex.getMessage());
        }
    }

}
