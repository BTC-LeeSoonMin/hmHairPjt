package com.btc.hair.admin.services.hairmanage;

public class HairManageDto {
    private int hm_no;
    private String u_id;
    private String as_type;
    private int as_price;
    private String u_grade;
    private String hm_reg_date;
    private String hm_mod_date;



    public int getHm_no() {
        return hm_no;
    }

    public void setHm_no(int hm_no) {
        this.hm_no = hm_no;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getAs_type() {
        return as_type;
    }

    public void setAs_type(String as_type) {
        this.as_type = as_type;
    }

    public int getAs_price() {
        return as_price;
    }

    public void setAs_price(int as_price) {
        this.as_price = as_price;
    }

    public String getU_grade() {
        return u_grade;
    }

    public void setU_grade(String u_grade) {
        this.u_grade = u_grade;
    }

    public String getHm_reg_date() {
        return hm_reg_date;
    }

    public void setHm_reg_date(String hm_reg_date) {
        this.hm_reg_date = hm_reg_date;
    }

    public String getHm_mod_date() {
        return hm_mod_date;
    }

    public void setHm_mod_date(String hm_mod_date) {
        this.hm_mod_date = hm_mod_date;
    }
}
