/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.report.model;

/**
 *
 * @author Surachai
 */
public class ReportModel {
    
    private int id;  
    private String firstName;  
    private String lastName;  
    private String level;

    public String getLevel() {
        return level;
    }

    public void setLevel(String Level) {
        this.level = Level;
    }
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    
}
