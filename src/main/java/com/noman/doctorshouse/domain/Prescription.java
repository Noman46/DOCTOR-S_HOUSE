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
public class Prescription {
    // Domain class is a class which represent the table of the database
    // Followings are the colomn name of the table
    // A variable represents a colomn in the table
    // a row represents an object
    
    private Integer preId;
    private String doctorId;
    private String studentId;
    private String studentName;
    private Integer age;
    private String disease;
    private String medicine;
    private String strength;
    private String route;
    private String frequency;
    private String startDate;
    private String endDate;
    private String remarks;
    
    
    // GETTER AND SETTER METHOD

    public Integer getPreId() {
        return preId;
    }

    public void setPreId(Integer preId) {
        this.preId = preId;
    }

    public String getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(String doctorId) {
        this.doctorId = doctorId;
    }

    public String getStudentId() {
        return studentId;
    }

    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getDisease() {
        return disease;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public String getStrength() {
        return strength;
    }

    public void setStrength(String strength) {
        this.strength = strength;
    }

    public String getRoute() {
        return route;
    }

    public void setRoute(String route) {
        this.route = route;
    }

    public String getFrequency() {
        return frequency;
    }

    public void setFrequency(String frequency) {
        this.frequency = frequency;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    @Override
    public String toString() {
        return "Prescription{" + "preId=" + preId + ", doctorId=" + doctorId + ", studentId=" + studentId + ", studentName=" + studentName + ", age=" + age + ", disease=" + disease + ", medicine=" + medicine + ", strength=" + strength + ", route=" + route + ", frequency=" + frequency + ", startDate=" + startDate + ", endDate=" + endDate + ", remarks=" + remarks + '}';
    }
    
    
    
    
}
