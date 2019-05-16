package com.example.myapplication;

public class busCompanyModel {
    private  int img_id;
    private  String company_name;

    public busCompanyModel(int img_id, String company_name) {
        this.img_id = img_id;
        this.company_name = company_name;
    }

    public int getImg_id() {
        return img_id;
    }

    public void setImg_id(int img_id) {
        this.img_id = img_id;
    }

    public String getCompany_name() {
        return company_name;
    }

    public void setCompany_name(String company_name) {
        this.company_name = company_name;
    }
}