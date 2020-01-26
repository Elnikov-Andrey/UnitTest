package com.company;

public class User implements Comparable<User>{
    @Override
    public int compareTo(User o) {
        return this.id - o.getId();
    }

    private  int id;

    public User(int id){
        this.id=id;
    }

    public int getId() {
        return id;
    }

    @Override
    public String toString() {
        return ""+ this.id;
    }
}
