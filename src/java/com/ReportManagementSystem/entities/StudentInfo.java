/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.ReportManagementSystem.entities;

/**
 *
 * @author Rozer
 */
public class StudentInfo {
    private int stdId;
    private String stdName;
    private String stdClass;
    private String stdRoll;

    public StudentInfo() {
    }

    public StudentInfo(int stdId, String stdName, String stdClass, String stdRoll) {
        this.stdId = stdId;
        this.stdName = stdName;
        this.stdClass = stdClass;
        this.stdRoll = stdRoll;
    }

    public int getStdId() {
        return stdId;
    }

    public String getStdName() {
        return stdName;
    }

    public String getStdClass() {
        return stdClass;
    }

    public String getStdRoll() {
        return stdRoll;
    }

    public void setStdId(int stdId) {
        this.stdId = stdId;
    }

    public void setStdName(String stdName) {
        this.stdName = stdName;
    }

    public void setStdClass(String stdClass) {
        this.stdClass = stdClass;
    }

    public void setStdRoll(String stdRoll) {
        this.stdRoll = stdRoll;
    }

    @Override
    public String toString() {
        return "StudentInfo{" + "stdId=" + stdId + ", stdName=" + stdName + ", stdClass=" + stdClass + ", stdRoll=" + stdRoll + '}';
    }
    
    
}
