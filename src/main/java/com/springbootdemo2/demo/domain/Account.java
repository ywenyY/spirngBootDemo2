package com.springbootdemo2.demo.domain;

public class Account {
    private Integer Id;
    private Integer money;

    @Override
    public String toString() {
        return "Account{" +
                "Id=" + Id +
                ", money=" + money +
                '}';
    }

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }
}
