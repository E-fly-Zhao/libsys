package com.zyx.libsys.domain;

import java.util.Date;

public class Reservations {

    private Integer reservation_id;
    private Integer user_id;
    private Integer book_id;
    private Date reservation_date;

    @Override
    public String toString() {
        return "Reservations{" +
                "reservation_id=" + reservation_id +
                ", user_id=" + user_id +
                ", book_id=" + book_id +
                ", reservation_date=" + reservation_date +
                '}';
    }

    public Integer getReservation_id() {
        return reservation_id;
    }

    public void setReservation_id(Integer reservation_id) {
        this.reservation_id = reservation_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public Date getReservation_date() {
        return reservation_date;
    }

    public void setReservation_date(Date reservation_date) {
        this.reservation_date = reservation_date;
    }
}
