package com.lovecoding.pojo;

import java.io.Serializable;

public class Order implements Serializable{

    private Long oid;// 数据库中bigint与Long型对应
    private String ono;
    private String totalAmount;

    private UmsUser umsUser;

    public Long getOid() {
        return oid;
    }

    public void setOid(Long oid) {
        this.oid = oid;
    }

    public String getOno() {
        return ono;
    }

    public void setOno(String ono) {
        this.ono = ono;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public UmsUser getUmsUser() {
        return umsUser;
    }

    public void setUmsUser(UmsUser umsUser) {
        this.umsUser = umsUser;
    }

    @Override
    public String toString() {
        return "Order{" +
                "oid=" + oid +
                ", ono='" + ono + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", umsUser=" + umsUser +
                '}';
    }
}
