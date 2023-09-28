package com.zyx.libsys.domain;

import java.util.Date;

public class BookStatus {

    private Integer book_id;
    private Integer status;  //0表示已借出，1表示可借，2表示处理中
    private String last_checked_out_date;

    @Override
    public String toString() {
        return "BookStatus{" +
                "book_id=" + book_id +
                ", status=" + status +
                ", last_checked_out_date=" + last_checked_out_date +
                '}';
    }

    public Integer getBook_id() {
        return book_id;
    }

    public void setBook_id(Integer book_id) {
        this.book_id = book_id;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getLast_checked_out_date() {
        return last_checked_out_date;
    }

    public void setLast_checked_out_date(String last_checked_out_date) {
        this.last_checked_out_date = last_checked_out_date;
    }
}
