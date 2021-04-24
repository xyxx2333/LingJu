package com.example.shequtest.shiti;

public class JOB {
    private String name;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    private String text;
    private int imageId;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public JOB(String naem, int imageId,String text){
        this.name = naem;
        this.imageId = imageId;
        this.text = text;
    }

}
