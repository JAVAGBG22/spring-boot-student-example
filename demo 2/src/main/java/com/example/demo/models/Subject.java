package com.example.demo.models;

import org.springframework.data.mongodb.core.mapping.Field;

public class Subject {

    @Field(name = "subject_name")
    private String subjectName;

    @Field(name = "points_obtained")
    private String pointsObtained;


    public Subject() {
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public String getPointsObtained() {
        return pointsObtained;
    }

    public void setPointsObtained(String pointsObtained) {
        this.pointsObtained = pointsObtained;
    }
}
