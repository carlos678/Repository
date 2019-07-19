package com.shenyue.exercise.entity;

/**
 * dep表的实体类
 */
public class Dep {
    private int did;
    private String name;
    private String address;
    private int num;

    @Override
    public String toString() {
        return "Dep{" +
                "did=" + did +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", num=" + num +
                '}';
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }
}
