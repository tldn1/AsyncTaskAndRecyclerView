package com.tldn1.asynctask;

/**
 * Created by X on 12/28/2016.
 */

public class ContactModel {
    private String name;
    private int number;

    public ContactModel(String name, int number) {
        this.setName(name);
        this.setNumber(number);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
