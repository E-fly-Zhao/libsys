package com.zyx.libsys.domain;

public class Publishers {

    private Integer publisher_id;
    private String publisher_name;
    private String address;
    private String contact_info;

    @Override
    public String toString() {
        return "Publishers{" +
                "publisher_id=" + publisher_id +
                ", publisher_name='" + publisher_name + '\'' +
                ", address='" + address + '\'' +
                ", contact_info='" + contact_info + '\'' +
                '}';
    }

    public Integer getPublisher_id() {
        return publisher_id;
    }

    public void setPublisher_id(Integer publisher_id) {
        this.publisher_id = publisher_id;
    }

    public String getPublisher_name() {
        return publisher_name;
    }

    public void setPublisher_name(String publisher_name) {
        this.publisher_name = publisher_name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact_info() {
        return contact_info;
    }

    public void setContact_info(String contact_info) {
        this.contact_info = contact_info;
    }
}
