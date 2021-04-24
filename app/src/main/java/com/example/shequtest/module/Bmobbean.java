package com.example.shequtest.module;

import cn.bmob.v3.BmobObject;

public class Bmobbean extends BmobObject {
    private String content;//反馈内容
    private MyUser author;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public MyUser getAuthor() {
        return author;
    }

    public void setAuthor(MyUser author) {
        this.author = author;
    }
}

