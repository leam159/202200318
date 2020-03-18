package kr.co.tjoeun.a202200318.datas;

import java.io.Serializable;

public class Room implements Serializable {
    private int price;
    private String address;
    private int floor;
    private String decripton;

    public Room(int price, String address, int floor, String decripton) {
        this.price = price;
        this.address = address;
        this.floor = floor;
        this.decripton = decripton;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public String getDecripton() {
        return decripton;
    }

    public void setDecripton(String decripton) {
        this.decripton = decripton;
    }
}
