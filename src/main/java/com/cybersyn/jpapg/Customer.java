package com.cybersyn.jpapg;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Customer {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    private String firstName;
    private String lastName;

    protected Customer(){}

    public Customer(String firstName,String lastName){
        this.firstName=firstName;
        this.lastName=lastName;
    }
    @Override
    public String toString() {
        return String.format(
                "Customer[id=%d, firstName='%s', lastName='%s']",
                id, firstName, lastName);
    }

    public Long getId() {
        return id;
    }

// --Commented out by Inspection START (1/2/20, 12:14 a. m.):
//    public String getFirstName() {
//        return firstName;
//    }
// --Commented out by Inspection STOP (1/2/20, 12:14 a. m.)

    public String getLastName() {
        return lastName;
    }
}
