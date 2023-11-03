package com.zgxt.demo.dao;


import org.springframework.context.annotation.Bean;


//orm 对象关系
public class UserSchool {
    private String SchoolID;
    private String SchoolName;
    private String SchoolAddress;
    private String SchoolBoos;
    private String SchoolEco;
    private String SchoolClass;

    public String getSchoolID() {
        return SchoolID;
    }

    public void setSchoolID(String schoolID) {
        SchoolID = schoolID;
    }

    public String getSchoolName() {
        return SchoolName;
    }

    public void setSchoolName(String schoolName) {
        SchoolName = schoolName;
    }

    public String getSchoolAddress() {
        return SchoolAddress;
    }

    public void setSchoolAddress(String schoolAddress) {
        SchoolAddress = schoolAddress;
    }

    public String getSchoolBoos() {
        return SchoolBoos;
    }

    public void setSchoolBoos(String schoolBoos) {
        SchoolBoos = schoolBoos;
    }

    public String getSchoolEco() {
        return SchoolEco;
    }

    public void setSchoolEco(String schoolEco) {
        SchoolEco = schoolEco;
    }

    public String getSchoolClass() {
        return SchoolClass;
    }

    public void setSchoolClass(String schoolClass) {
        SchoolClass = schoolClass;
    }
}
