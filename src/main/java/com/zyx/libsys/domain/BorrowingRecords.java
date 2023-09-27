package com.zyx.libsys.domain;

import java.util.Date;

public class BorrowingRecords {

    private Integer record_id;
    private Integer user_id;
    private Integer book_id;
    private Date borrow_date;
    private Date return_date;

    @Override
    public String toString() {
        return "BorrowingRecords{" +
                "record_id=" + record_id +
                ", user_id=" + user_id +
                ", book_id=" + book_id +
                ", borrow_date=" + borrow_date +
                ", return_date=" + return_date +
                '}';
    }

    public Integer getRecord_id() {
        return record_id;
    }

    public void setRecord_id(Integer record_id) {
        this.record_id = record_id;
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

    public Date getBorrow_date() {
        return borrow_date;
    }

    public void setBorrow_date(Date borrow_date) {
        this.borrow_date = borrow_date;
    }

    public Date getReturn_date() {
        return return_date;
    }

    public void setReturn_date(Date return_date) {
        this.return_date = return_date;
    }
}
