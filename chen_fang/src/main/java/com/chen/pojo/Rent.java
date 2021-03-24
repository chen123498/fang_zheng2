package com.chen.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "tb_rent")
public class Rent {

    @Id
    private Integer id;
    private String rName;
    private String rType;
    private int rSquare;
    private String rImg;

    public Rent(Integer id, String rName, String rType, int rSquare, String rImg) {
        this.id = id;
        this.rName = rName;
        this.rType = rType;
        this.rSquare = rSquare;
        this.rImg = rImg;
    }

    public Rent() {
    }

    @Override
    public String toString() {
        return "Rent{" +
                "id=" + id +
                ", rName='" + rName + '\'' +
                ", rType='" + rType + '\'' +
                ", rSquare=" + rSquare +
                ", rImg='" + rImg + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getrName() {
        return rName;
    }

    public void setrName(String rName) {
        this.rName = rName;
    }

    public String getrType() {
        return rType;
    }

    public void setrType(String rType) {
        this.rType = rType;
    }

    public int getrSquare() {
        return rSquare;
    }

    public void setrSquare(int rSquare) {
        this.rSquare = rSquare;
    }

    public String getrImg() {
        return rImg;
    }

    public void setrImg(String rImg) {
        this.rImg = rImg;
    }
}
