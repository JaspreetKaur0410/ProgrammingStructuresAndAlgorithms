/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qs5_user;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author jaspr_000
 */
public class Main {

    public static void main(String[] args) throws ParseException {
        
        String dateString = "1978-08-26";
        DateFormat dateFormat = new SimpleDateFormat("yyyyMMdd");
        Date date1 = dateFormat.parse(dateString);
        
        User usr1 = new User("user1", 1, date1);
        User usr2 = new User("user1", 1, date1);
        User usr3 = new User("user3", 2, date1);
        
        System.out.println("EQUALS");
        System.out.println(usr1.equals(usr2));
        System.out.println(usr1.equals(usr3));
        System.out.println("");
        
        System.out.println("COMPARETO");
        System.out.println(usr1.compareTo(usr3));
        System.out.println("");
        
        System.out.println("HASHCODE");
        System.out.println(usr1.hashCode());
        System.out.println(usr2.hashCode());
        System.out.println(usr3.hashCode());
        System.out.println("");
    }
}
