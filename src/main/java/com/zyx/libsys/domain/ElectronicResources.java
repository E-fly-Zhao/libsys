package com.zyx.libsys.domain;

public class ElectronicResources {

    private Integer resource_id;
    private String resource_name;
    private String resource_type;
    private String url;
    private Integer category_id;

    @Override
    public String toString() {
        return "ElectronicResources{" +
                "resource_id=" + resource_id +
                ", resource_name='" + resource_name + '\'' +
                ", resource_type='" + resource_type + '\'' +
                ", url='" + url + '\'' +
                ", category_id=" + category_id +
                '}';
    }

    public Integer getResource_id() {
        return resource_id;
    }

    public void setResource_id(Integer resource_id) {
        this.resource_id = resource_id;
    }

    public String getResource_name() {
        return resource_name;
    }

    public void setResource_name(String resource_name) {
        this.resource_name = resource_name;
    }

    public String getResource_type() {
        return resource_type;
    }

    public void setResource_type(String resource_type) {
        this.resource_type = resource_type;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Integer getCategory_id() {
        return category_id;
    }

    public void setCategory_id(Integer category_id) {
        this.category_id = category_id;
    }
}
