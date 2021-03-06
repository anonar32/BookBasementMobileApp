package com.example.bookbasement_02.Models;

public class Appointment extends Book{
    private String user_id;
    private String date;
    private String time;
    private String purpose;
    private String status;
    private String location;


    public Appointment ( ) {
        this.user_id = "";
        this.date = "";
        this.time = "";
        this.purpose = "";
        this.status = "";
        this.location = "";
    }

    public Appointment (String user_id, String date, String time, String purpose, String status, String location) {
        this.user_id = user_id;
        this.date = date;
        this.time = time;
        this.purpose = purpose;
        this.status = status;
        this.location = location;
    }


    public String getLocation ( ) {
        return location;
    }

    public void setLocation (String location) {
        this.location = location;
    }


    public String getUser_id ( ) {
        return user_id;
    }

    public void setUser_id (String user_id) {
        this.user_id = user_id;
    }

    public String getDate ( ) {
        return date;
    }

    public void setDate (String date) {
        this.date = date;
    }

    public String getTime ( ) {
        return time;
    }

    public void setTime (String time) {
        this.time = time;
    }

    public String getPurpose ( ) {
        return purpose;
    }

    public void setPurpose (String purpose) {
        this.purpose = purpose;
    }

    public String getStatus ( ) {
        return status;
    }

    public void setStatus (String status) {
        this.status = status;
    }


}
