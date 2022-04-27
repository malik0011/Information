package com.example.information;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Teacher {

    int id;
    String name;
    String[] subjects,qualification;
    String profileImage;

    public Teacher(int id, String name, String[] subjects, String[] qualification, String profileImage) {
        this.id = id;
        this.name = name;
        this.subjects = subjects;
        this.qualification = qualification;
        this.profileImage = profileImage;
    }

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

    public String[] getSubjects() {
        return subjects;
    }

    public void setSubjects(String[] subjects) {
        this.subjects = subjects;
    }

    public String[] getQualification() {
        return qualification;
    }

    public void setQualification(String[] qualification) {
        this.qualification = qualification;
    }

    public String getProfileImag() {
        return profileImage;
    }

    public void setProfileImag(String profileImag) {
        this.profileImage = profileImag;
    }
}
