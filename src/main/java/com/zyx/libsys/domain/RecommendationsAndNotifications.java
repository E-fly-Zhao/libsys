package com.zyx.libsys.domain;

import java.util.Date;

public class RecommendationsAndNotifications {

    private Integer notification_id;
    private Integer user_id;
    private String notification_type;
    private String notification_content;
    private String notification_date;  //此处数据库中为时间戳

    @Override
    public String toString() {
        return "RecommendationsAndNotifications{" +
                "notification_id=" + notification_id +
                ", user_id=" + user_id +
                ", notification_type='" + notification_type + '\'' +
                ", notification_content='" + notification_content + '\'' +
                ", notification_date='" + notification_date + '\'' +
                '}';
    }

    public Integer getNotification_id() {
        return notification_id;
    }

    public void setNotification_id(Integer notification_id) {
        this.notification_id = notification_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getNotification_type() {
        return notification_type;
    }

    public void setNotification_type(String notification_type) {
        this.notification_type = notification_type;
    }

    public String getNotification_content() {
        return notification_content;
    }

    public void setNotification_content(String notification_content) {
        this.notification_content = notification_content;
    }

    public String getNotification_date() {
        return notification_date;
    }

    public void setNotification_date(String notification_date) {
        this.notification_date = notification_date;
    }
}
