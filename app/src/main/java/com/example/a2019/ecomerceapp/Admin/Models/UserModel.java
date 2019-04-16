package com.example.a2019.ecomerceapp.Admin.Models;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.Ignore;
import android.arch.persistence.room.PrimaryKey;

@Entity
public class UserModel {
    @PrimaryKey
    String Uid;
    @ColumnInfo
    String name;
    @ColumnInfo
    String Phone;
    @ColumnInfo
    String Adrees;

    public String getUid() {
        return Uid;
    }

    public void setUid(String uid) {
        Uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return Phone;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getAdrees() {
        return Adrees;
    }

    public void setAdrees(String adrees) {
        Adrees = adrees;
    }

    public UserModel() {
    }
@Ignore
    public UserModel(String uid, String name, String phone, String adrees) {
        Uid = uid;
        this.name = name;
        Phone = phone;
        Adrees = adrees;
    }
}
