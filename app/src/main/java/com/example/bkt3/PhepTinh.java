package com.example.bkt3;

public class PhepTinh {
    private String Ten;
    private int hinh;

    public PhepTinh(String ten, int hinh) {
        Ten = ten;
        this.hinh = hinh;
    }

    public String getTen() {
        return Ten;
    }

    public void setTen(String ten) {
        Ten = ten;
    }

    public int getHinh() {
        return hinh;
    }

    public void setHinh(int hinh) {
        this.hinh = hinh;
    }
}
