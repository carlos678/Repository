package com.shenyue.exercise.entity;

/**
 * emp表的实体类
 */
public class Emp {
    private int eid;
    private String username;
    private String password;
    private String gender;
    private String age;
    private String phone;
    private String email;
    private int did;

    public Emp() {

    }

    public Emp(String username, String password, String gender, String age, String phone, String email, int did) {
        this.username = username;
        this.password = password;
        this.gender = gender;
        this.age = age;
        this.phone = phone;
        this.email = email;
        this.did = did;
    }

    @Override
    public String toString() {
        return "Emp{" +
                "eid=" + eid +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", gender='" + gender + '\'' +
                ", age='" + age + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", did=" + did +
                '}';
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getDid() {
        return did;
    }

    public void setDid(int did) {
        this.did = did;
    }
}
