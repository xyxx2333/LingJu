package com.example.shequtest.shiti;

public class Allmeun {
    public String getPositiontext() {
        return positiontext;
    }

    public void setPositiontext(String positiontext) {
        this.positiontext = positiontext;
    }

    private String positiontext;
    private String allmeunname;
    private int allmeunimageId;


    public String getAllmeunname() {
        return allmeunname;
    }

    public void setAllmeunname(String allmeunname) {
        this.allmeunname = allmeunname;
    }

    public int getAllmeunimageId() {
        return allmeunimageId;
    }

    public void setAllmeunimageId(int allmeunimageId) {
        this.allmeunimageId = allmeunimageId;
    }

    public Allmeun(String allmeunname, int allmeunimageId,String positiontext){
        this.allmeunname = allmeunname;
        this.allmeunimageId = allmeunimageId;
        this.positiontext = positiontext;
    }

}
