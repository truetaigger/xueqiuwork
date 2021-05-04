package com.company.model.bean;

import java.util.HashMap;
import java.util.List;

/**
 * @author **N4c1**
 * @create 2021-04-21 0:42
 */
public class Stock {
    int id;
    HashMap<Integer, List<Pinglun>> pinglunlist;
    String downloaddate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public HashMap<Integer, List<Pinglun>> getPinglunlist() {
        return pinglunlist;
    }

    public void setPinglunlist(HashMap<Integer, List<Pinglun>> pinglunlist) {
        this.pinglunlist = pinglunlist;
    }

    public String getDownloaddate() {
        return downloaddate;
    }

    public void setDownloaddate(String downloaddate) {
        this.downloaddate = downloaddate;
    }
}
