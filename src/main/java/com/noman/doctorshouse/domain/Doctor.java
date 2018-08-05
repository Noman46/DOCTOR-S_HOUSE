/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.noman.doctorshouse.domain;

/**
 *
 * @author Noman Ibrahim
 */
public class Doctor {

    // Domain class is a class which represent the table of the database
    // Followings are the colomn name of the table
    // A variable represents a colomn in the table
    // a row represents an object
   
    private String doctorId;
    private String name;
    private String phone;
    private String email;
    private String address;
    private String password;

    // Getter and Setter method for the variables
    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    // toString() method for print an object of this class
    // It can be usefull while testing
    
    @Override
    public String toString() {
        return "Doctor{" + "doctorId=" + doctorId + ", name=" + name + ", phone=" + phone + ", email=" + email + ", address=" + address + ", password=" + password + '}';
    }

}
