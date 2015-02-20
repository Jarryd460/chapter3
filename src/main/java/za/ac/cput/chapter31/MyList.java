package za.ac.cput.chapter31;

import java.util.ArrayList;

/**
 * Created by student on 2015/02/19.
 */
public class MyList {

    private ArrayList<Integer> termMarks = new ArrayList<Integer>();

    public MyList() {

    }

    public MyList(int t1) {

        termMarks.add(t1);
    }

    public MyList(int t1, int t2) {

        termMarks.add(t1);
        termMarks.add(t2);
    }

    public MyList(int t1, int t2, int t3) {

        termMarks.add(t1);
        termMarks.add(t2);
        termMarks.add(t3);
    }

    public MyList(int t1, int t2, int t3, int t4) {

        termMarks.add(t1);
        termMarks.add(t2);
        termMarks.add(t3);
        termMarks.add(t4);
    }

    public void addMark(int m) {

        if(termMarks.size() < 4) {

            termMarks.add(m);
        }
    }

    public boolean removeMark(int term) {

        if(!termMarks.isEmpty()) {

            termMarks.remove(term - 1);
            return true;
        }
        return false;
    }

    public int getMark(int t) {

        return Integer.parseInt(termMarks.get(t - 1).toString());
    }

    public String toString() {

        String marks = "";

        for(int i = 0; i < termMarks.size(); i++) {

            marks = marks + termMarks.get(i).toString();
        }
        return marks;
    }
}
