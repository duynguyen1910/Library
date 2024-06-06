package com.duynguyen.sample_project.Models;

import java.io.Serializable;

public class Member implements Serializable {
    private int memberID;
    private String fullname, phoneNumber, address, password;
    private int role;

    public Member() {
    }

    public Member(String fullname, String phoneNumber, int role) {
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
        this.role = role;
    }

    public Member(String fullname, String phoneNumber, String address, String password, int role) {
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;
        this.role = role;
    }

    public Member(int memberID, String fullname, String phoneNumber, String address, String password, int role) {
        this.memberID = memberID;
        this.fullname = fullname;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.password = password;
        this.role = role;
    }

    public int getMemberID() {
        return memberID;
    }

    public void setMemberID(int memberID) {
        this.memberID = memberID;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public int getRole() {
        return role;
    }

    public void setRole(int role) {
        this.role = role;
    }
}
