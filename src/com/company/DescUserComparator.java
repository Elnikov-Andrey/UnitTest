package com.company;

import java.util.Comparator;

public class DescUserComparator implements Comparator<User> {
    //по убыванию
    @Override
    public int compare(User o1, User o2) {
        return o2.getId() - o1.getId();
    }

}
