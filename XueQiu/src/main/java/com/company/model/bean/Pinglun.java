package com.company.model.bean;

import java.util.List;

/**
 * @author **N4c1**
 * @create 2021-04-21 0:35
 */
public class Pinglun {
    int id;
    int manname;
    String pinglunContent;
    List<Tag> tagList;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getManname() {
        return manname;
    }

    public void setManname(int manname) {
        this.manname = manname;
    }

    public String getPinglunContent() {
        return pinglunContent;
    }

    public void setPinglunContent(String pinglunContent) {
        this.pinglunContent = pinglunContent;
    }

    public List<Tag> getTagList() {
        return tagList;
    }

    public void setTagList(List<Tag> tagList) {
        this.tagList = tagList;
    }
}
