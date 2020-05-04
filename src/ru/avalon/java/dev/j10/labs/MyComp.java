package ru.avalon.java.dev.j10.labs;

import java.util.Comparator;

public class MyComp implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        if (o1 instanceof String && o2 instanceof String) {

            String o1_S = (String) o1;
            String o2_S = (String) o2;

            return o2_S.compareTo(o1_S);

        } else {
            return 0;
        }
    }
}
