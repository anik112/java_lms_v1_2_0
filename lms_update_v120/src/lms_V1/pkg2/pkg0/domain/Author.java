/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lms_V1.pkg2.pkg0.domain;

/**
 *
 * @author anik
 */
public class Author {
    
    
    private int id;
    private String name;
    private String dateOfBirth;
    private String dateOfDead;
    private String about;

    
    // insert defult constructor
    public Author() {
    }

    // insert constructor with perametter
    public Author(String name, String dateOfBirth, String dateOfDead, String about) {
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.dateOfDead = dateOfDead;
        this.about = about;
    }
    

    // insert getter and setter
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getDateOfDead() {
        return dateOfDead;
    }

    public void setDateOfDead(String dateOfDead) {
        this.dateOfDead = dateOfDead;
    }

    public String getAbout() {
        return about;
    }

    public void setAbout(String about) {
        this.about = about;
    }
    
    
    
    
    
}
