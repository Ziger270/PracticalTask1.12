/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.task1_12;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 *
 * @author aleksandrbisirov
 */
public class Doctor implements Externalizable {

    public Doctor(String specialization,
            String firstname,
            String middlename,
            String lastname,
            int kab){
    this.Specialization = specialization;
    this.Firstname = firstname;
    this.Middlename = middlename;
    this.Lastname = lastname;
    this.Kab = kab;
    }
    
    private String Specialization;
    private String Firstname;
    private String Middlename;
    private String Lastname;
    private int Kab;
    
    public String getData() {
        return Firstname + " " + 
                Middlename + " " +
                Lastname + " - " +
                Specialization + ", kab №" + 
                String.valueOf(Kab);
    }
    
    public void setSpecalization(String spec) {
        this.Specialization = spec;
    }
    public void setFirstname(String firstname) {
        this.Firstname = firstname;
    }
    public void setMiddlename(String middlename) {
        this.Middlename = middlename;
    }
    public void setLastname(String lastname) {
        this.Lastname = lastname;
    }
    public void setKab(int kab) {
        this.Kab = kab;
    }
    
    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(this.Firstname);
        out.writeObject(this.Middlename);
        out.writeObject(this.Lastname);
        out.writeObject(this.Specialization);
        out.writeObject(this.Kab);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.Firstname = (String)in.readObject();
        this.Middlename = (String)in.readObject();
        this.Lastname = (String)in.readObject();
        this.Specialization = (String)in.readObject();
        this.Kab = (int)in.readObject();
    }
    
}
