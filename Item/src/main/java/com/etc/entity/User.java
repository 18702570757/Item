package com.etc.entity;

public class User {
    private Integer userId;
    private String userPass;
    private String userName;
    private String userNum;
    private Integer age;
    private String sex;
    private String userTel;
    private Integer userGrade;
    private String userImg;

    public User() {
    }

    public User(Integer userId, String userPass, String userName, String userNum, Integer age, String sex, String userTel, Integer userGrade, String userImg) {
        this.userId = userId;
        this.userPass = userPass;
        this.userName = userName;
        this.userNum = userNum;
        this.age = age;
        this.sex = sex;
        this.userTel = userTel;
        this.userGrade = userGrade;
        this.userImg = userImg;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userPass='" + userPass + '\'' +
                ", userName='" + userName + '\'' +
                ", userNum='" + userNum + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", userTel='" + userTel + '\'' +
                ", userGrade=" + userGrade +
                ", userImg='" + userImg + '\'' +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNum() {
        return userNum;
    }

    public void setUserNum(String userNum) {
        this.userNum = userNum;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getUserTel() {
        return userTel;
    }

    public void setUserTel(String userTel) {
        this.userTel = userTel;
    }

    public Integer getUserGrade() {
        return userGrade;
    }

    public void setUserGrade(Integer userGrade) {
        this.userGrade = userGrade;
    }

    public String getUserImg() {
        return userImg;
    }

    public void setUserImg(String userImg) {
        this.userImg = userImg;
    }
}
