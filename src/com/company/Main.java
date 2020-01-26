package com.company;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) throws SQLException {

        TreeSet<User> set = new TreeSet<>(new AscUserComparator());
//        set.add(23);
//        set.add(57);
//        set.add(2);
//        set.add(16);
//        set.add(122);

        set.add(new User(23));
        set.add(new User(12));
        set.add(new User(231));
        set.add(new User(21));

        System.out.println(set);

        TreeSet<User> set2 = new TreeSet<>(new DescUserComparator());
//        set.add(23);
//        set.add(57);
//        set.add(2);
//        set.add(16);
//        set.add(122);

        set2.add(new User(23));
        set2.add(new User(12));
        set2.add(new User(231));
        set2.add(new User(21));

        System.out.println(set2);
        // write your code here
//        HashMap hashMap = new HashMap();
//
//        hashMap.put("auto", 3);
//        hashMap.put("gps", 0);
//
//
//    }
//
//    public void showCounter(HashMap map){
//        for (Entry o : map.entrySet()) {
//            System.out.println(o.getValue());
//        }
//        map.getIterator();
    }
}
