/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs5_user;

import java.util.Date;

/**
 *
 * @author jaspr_000
 */
public class User implements Comparable<User> {

    private String name;
    private int id;
    private Date birth;

    public User(String name, int id, Date birth) {
        this.name = name;
        this.id = id;
        this.birth = birth;
    }

    @Override
    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || (this.getClass() != other.getClass())) {
            return false;
        }

        User guest = (User) other;
        return (this.id == guest.id)
                && (this.name == null && name.equals(guest.name))
                && (this.birth != null && birth.equals(guest.birth));
    }

    @Override
    public int hashCode() {
        int result = 0;
        result = 31 * result + id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (birth != null ? birth.hashCode() : 0);
        return result;
    }

    @Override
    public int compareTo(User o) {
        return this.id - o.id;
    }
}
