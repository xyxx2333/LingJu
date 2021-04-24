package com.example.shequtest.shiti;

public class JOBa {
    public String getRecommendedname() {
        return recommendedname;
    }

    public void setRecommendedname(String recommendedname) {
        this.recommendedname = recommendedname;
    }

    public int getRecommendedimageId() {
        return recommendedimageId;
    }

    public void setRecommendedimageId(int recommendedimageId) {
        this.recommendedimageId = recommendedimageId;
    }



    public String getRecommendedtext() {
        return recommendedtext;
    }

    public void setRecommendedtext(String recommendedtext) {
        this.recommendedtext = recommendedtext;
    }

    private String recommendedname;
    private String recommendedtext;
    private  int recommendedimageId;



    public JOBa(String recommendedname,int recommendedimageId,String recommendedtext){
        this.recommendedname = recommendedname;
        this.recommendedimageId = recommendedimageId;
        this.recommendedtext = recommendedtext;
    }
}
