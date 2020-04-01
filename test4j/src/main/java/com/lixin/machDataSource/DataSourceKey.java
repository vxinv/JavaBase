package com.lixin.machDataSource;

public enum  DataSourceKey {
    master("master"),
    slave("slave");

    DataSourceKey(String name) {
        this.name = name;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
