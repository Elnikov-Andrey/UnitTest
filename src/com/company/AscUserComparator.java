package com.company;

import java.util.Comparator;

public class AscUserComparator implements Comparator<User> {
    //по возрастанию
    @Override
    public int compare(User o1, User o2) {
        return o1.getId() - o2.getId();
    }

}
