package com.chen.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "tb_broker")
public class Broker {

    @Id
    private Integer id;
    private String bName;
    private int daiNumber;
    private int chengNumber;
    private String phone;


    public Broker(Integer id, String bName, int daiNumber, int chengNumber, String phone) {
        this.id = id;
        this.bName = bName;
        this.daiNumber = daiNumber;
        this.chengNumber = chengNumber;
        this.phone = phone;
    }

    public Broker() {
    }

    @Override
    public String toString() {
        return "Broker{" +
                "id=" + id +
                ", bName='" + bName + '\'' +
                ", daiNumber=" + daiNumber +
                ", chengNumber=" + chengNumber +
                ", phone='" + phone + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getbName() {
        return bName;
    }

    public void setbName(String bName) {
        this.bName = bName;
    }

    public int getDaiNumber() {
        return daiNumber;
    }

    public void setDaiNumber(int daiNumber) {
        this.daiNumber = daiNumber;
    }

    public int getChengNumber() {
        return chengNumber;
    }

    public void setChengNumber(int chengNumber) {
        this.chengNumber = chengNumber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
