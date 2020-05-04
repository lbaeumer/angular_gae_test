package de.lui.dto;

import java.io.Serializable;

public class User implements Serializable {

    private static final long serialVersionUID = 1L;

    public long id;
    public String firstname, name;

    public User() {
    }

    public User(String firstname, String name) {
        this.firstname = firstname;
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
