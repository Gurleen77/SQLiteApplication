package com.example.sqliteapplication;

import java.io.Serializable;

class ViewList implements Serializable {
    private String Name;
    private String Contact;
    private String date_of_birth;

    public ViewList (String name, String contact, String date_of_birth) {
        this.Name = name;
        this.Contact = contact;
        this.date_of_birth = date_of_birth;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        this.Name = name;
    }

    public String getContact() {
        return Contact;
    }

    public void setContact(String contact) {
        this.Contact = contact;
    }

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }
}
