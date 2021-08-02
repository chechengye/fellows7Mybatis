package com.lovecoding.pojo;

import java.io.Serializable;

/**
 * 推荐的
 */
public class OrderAndUser implements Serializable {

    private Integer id;//用户ID主键
    private Long oid;// 数据库中bigint与Long型对应
    private String ono;
    private String totalAmount;
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OrderAndUser{" +
                "id=" + id +
                ", oid=" + oid +
                ", ono='" + ono + '\'' +
                ", totalAmount='" + totalAmount + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
