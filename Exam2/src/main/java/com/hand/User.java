package com.hand;

public class User {
    String name;
    double sumMoney;
    double shuiMoney;

    public User(String name, double sumMoney) {
        this.name = name;
        this.sumMoney = sumMoney;
        this.shuiMoney=0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSumMoney() {
        return sumMoney;
    }

    public void setSumMoney(double sumMoney) {
        this.sumMoney = sumMoney;
    }

    public void setShuiMoney(double shuiMoney) {
        this.shuiMoney = shuiMoney;
    }

    public double getShuiMoney() {
        return shuiMoney;
    }
}
