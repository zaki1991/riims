package com.hkntv.riims.core.entity;

import java.util.Date;

public class Person {
    private String guid;

    private String password;

    private String workId;

    private String name;

    private String identityCardId;

    private String literacy;

    private String teamId;

    private Date birthday;

    private String phoneNumber;

    private Date enteringDate;

    private String enteringPerson;

    private String enteringPersonPhoneNumber;

    private String departmentId;

    private String sex;

    private String job;

    public String getGuid() {
        return guid;
    }

    public void setGuid(String guid) {
        this.guid = guid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getWorkId() {
        return workId;
    }

    public void setWorkId(String workId) {
        this.workId = workId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentityCardId() {
        return identityCardId;
    }

    public void setIdentityCardId(String identityCardId) {
        this.identityCardId = identityCardId;
    }

    public String getLiteracy() {
        return literacy;
    }

    public void setLiteracy(String literacy) {
        this.literacy = literacy;
    }

    public String getTeamId() {
        return teamId;
    }

    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public Date getEnteringDate() {
        return enteringDate;
    }

    public void setEnteringDate(Date enteringDate) {
        this.enteringDate = enteringDate;
    }

    public String getEnteringPerson() {
        return enteringPerson;
    }

    public void setEnteringPerson(String enteringPerson) {
        this.enteringPerson = enteringPerson;
    }

    public String getEnteringPersonPhoneNumber() {
        return enteringPersonPhoneNumber;
    }

    public void setEnteringPersonPhoneNumber(String enteringPersonPhoneNumber) {
        this.enteringPersonPhoneNumber = enteringPersonPhoneNumber;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }
}