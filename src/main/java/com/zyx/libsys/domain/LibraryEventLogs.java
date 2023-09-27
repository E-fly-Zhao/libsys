package com.zyx.libsys.domain;

import java.util.Date;

public class LibraryEventLogs {

    private Integer log_id;
    private String event_type;
    private String event_description;
    private String event_date;  //这里数据库用的是时间戳

    @Override
    public String toString() {
        return "LibraryEventLogs{" +
                "log_id=" + log_id +
                ", event_type='" + event_type + '\'' +
                ", event_description='" + event_description + '\'' +
                ", event_date='" + event_date + '\'' +
                '}';
    }

    public Integer getLog_id() {
        return log_id;
    }

    public void setLog_id(Integer log_id) {
        this.log_id = log_id;
    }

    public String getEvent_type() {
        return event_type;
    }

    public void setEvent_type(String event_type) {
        this.event_type = event_type;
    }

    public String getEvent_description() {
        return event_description;
    }

    public void setEvent_description(String event_description) {
        this.event_description = event_description;
    }

    public String getEvent_date() {
        return event_date;
    }

    public void setEvent_date(String event_date) {
        this.event_date = event_date;
    }
}
