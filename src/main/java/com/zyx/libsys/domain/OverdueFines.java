package com.zyx.libsys.domain;

import java.util.Date;

public class OverdueFines {

    private Integer fine_id;
    private Integer user_id;
    private Double fine_amount;
    private Date fine_date;

    @Override
    public String toString() {
        return "OverdueFines{" +
                "fine_id=" + fine_id +
                ", user_id=" + user_id +
                ", fine_amount=" + fine_amount +
                ", fine_date=" + fine_date +
                '}';
    }

    public Integer getFine_id() {
        return fine_id;
    }

    public void setFine_id(Integer fine_id) {
        this.fine_id = fine_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Double getFine_amount() {
        return fine_amount;
    }

    public void setFine_amount(Double fine_amount) {
        this.fine_amount = fine_amount;
    }

    public Date getFine_date() {
        return fine_date;
    }

    public void setFine_date(Date fine_date) {
        this.fine_date = fine_date;
    }
}
