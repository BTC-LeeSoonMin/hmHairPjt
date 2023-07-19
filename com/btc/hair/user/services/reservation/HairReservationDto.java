package com.btc.hair.user.services.reservation;

public class HairReservationDto {
    private int ur_no;
    private String u_id;
    private String u_phone;
    private String ur_res_date;
    private String as_type;
    private int as_price;
    private String ur_reg_date;
    private String ur_mod_date;

    public int getUr_no() {
        return ur_no;
    }

    public void setUr_no(int ur_no) {
        this.ur_no = ur_no;
    }

    public String getU_id() {
        return u_id;
    }

    public void setU_id(String u_id) {
        this.u_id = u_id;
    }

    public String getU_phone() {
        return u_phone;
    }

    public void setU_phone(String u_phone) {
        this.u_phone = u_phone;
    }

    public String getUr_res_date() {
        return ur_res_date;
    }

    public void setUr_res_date(String ur_res_date) {
        this.ur_res_date = ur_res_date;
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

    public String getUr_reg_date() {
        return ur_reg_date;
    }

    public void setUr_reg_date(String ur_reg_date) {
        this.ur_reg_date = ur_reg_date;
    }

    public String getUr_mod_date() {
        return ur_mod_date;
    }

    public void setUr_mod_date(String ur_mod_date) {
        this.ur_mod_date = ur_mod_date;
    }
}
