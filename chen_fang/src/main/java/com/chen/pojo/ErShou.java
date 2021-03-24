package com.chen.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Table
@Entity(name = "tb_ershou")
public class ErShou {

    @Id
    private Integer id;
    private String erName;
    private String erType;
    private int erSquare;
    private String erImg;


    public ErShou(Integer id, String erName, String erType, int erSquare, String erImg) {
        this.id = id;
        this.erName = erName;
        this.erType = erType;
        this.erSquare = erSquare;
        this.erImg = erImg;
    }

    public ErShou() {
    }

    @Override
    public String toString() {
        return "ErShou{" +
                "id=" + id +
                ", erName='" + erName + '\'' +
                ", erType='" + erType + '\'' +
                ", erSquare=" + erSquare +
                ", erImg='" + erImg + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getErName() {
        return erName;
    }

    public void setErName(String erName) {
        this.erName = erName;
    }

    public String getErType() {
        return erType;
    }

    public void setErType(String erType) {
        this.erType = erType;
    }

    public int getErSquare() {
        return erSquare;
    }

    public void setErSquare(int erSquare) {
        this.erSquare = erSquare;
    }

    public String getErImg() {
        return erImg;
    }

    public void setErImg(String erImg) {
        this.erImg = erImg;
    }
}
