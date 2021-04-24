package com.example.shequtest.module;

import cn.bmob.v3.BmobUser;

public class MyUser extends BmobUser {

    private String sex;//性别
    private String name;//昵称
    private String identity;//身份标识
    private Integer days;//坚持天数
    private Integer point;//积分
    private Integer jinbi;//金币
    private String learn;//学习量
    private String studyTime;//学习时间
    private Integer view;//每日完成章节数
    private Boolean state;//打卡状态

    public Integer getDays() {
        return days;
    }

    public void setDays(Integer days) {
        this.days = days;
    }

    public String getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(String studyTime) {
        this.studyTime = studyTime;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIdentity() {
        return identity;
    }

    public void setIdentity(String identity) {
        this.identity = identity;
    }


    public Integer getPoint() {
        return point;
    }

    public void setPoint(Integer point) {
        this.point = point;
    }

    public String getLearn() {
        return learn;
    }

    public void setLearn(String learn) {
        this.learn = learn;
    }


    public Integer getView() {
        return view;
    }

    public void setView(Integer view) {
        this.view = view;
    }

    public Boolean getState() {
        return state;
    }

    public void setState(Boolean state) {
        this.state = state;
    }

    public Integer getJinbi() {
        return jinbi;
    }

    public void setJibi(Integer jinbi) {
        this.jinbi = jinbi;
    }
}
