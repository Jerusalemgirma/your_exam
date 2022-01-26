package net.javaguides.springboot.service;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import javax.persistence.Id;


@Entity
@Table(name="Teacher")
public class Teacher {
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private long id;

    @Column(name="first_name")
    private String firstName;

    @Column(name="last_name")
    private String lastName;
    public long getId(){
        return id;

    }
    public void setId(long id){
        this.id=id;

    }
    public String getFirstName(){
        return firstName;

    }
    public void setFirstName(String firstName){
        this.firstName=firstName;

    }
    public String getLastName(){
        return lastName;

    }
    public void setLastName(String lastName){
        this.lastName=lastName;

    }


}
