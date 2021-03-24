package com.chen.pojo;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table
@Entity(name = "tb_xin")
public class Xin {

    @Id
    private Integer id;
    private String houseName;
    private Double housePrice;
    private Date startTime;
    private Date endTime;
    private String houseAddress;
    private int houseSquare;
    private String houseImg;
    private String houseType;


    public Xin(Integer id, String houseName, Double housePrice, Date startTime, Date endTime, String houseAddress, int houseSquare, String houseImg, String houseType) {
        this.id = id;
        this.houseName = houseName;
        this.housePrice = housePrice;
        this.startTime = startTime;
        this.endTime = endTime;
        this.houseAddress = houseAddress;
        this.houseSquare = houseSquare;
        this.houseImg = houseImg;
        this.houseType = houseType;
    }

    public Xin() {
    }

    @Override
    public String toString() {
        return "Xin{" +
                "id=" + id +
                ", houseName='" + houseName + '\'' +
                ", housePrice=" + housePrice +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", houseAddress='" + houseAddress + '\'' +
                ", houseSquare=" + houseSquare +
                ", houseImg='" + houseImg + '\'' +
                ", houseType='" + houseType + '\'' +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getHouseName() {
        return houseName;
    }

    public void setHouseName(String houseName) {
        this.houseName = houseName;
    }

    public Double getHousePrice() {
        return housePrice;
    }

    public void setHousePrice(Double housePrice) {
        this.housePrice = housePrice;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public String getHouseAddress() {
        return houseAddress;
    }

    public void setHouseAddress(String houseAddress) {
        this.houseAddress = houseAddress;
    }

    public int getHouseSquare() {
        return houseSquare;
    }

    public void setHouseSquare(int houseSquare) {
        this.houseSquare = houseSquare;
    }

    public String getHouseImg() {
        return houseImg;
    }

    public void setHouseImg(String houseImg) {
        this.houseImg = houseImg;
    }

    public String getHouseType() {
        return houseType;
    }

    public void setHouseType(String houseType) {
        this.houseType = houseType;
    }
}
