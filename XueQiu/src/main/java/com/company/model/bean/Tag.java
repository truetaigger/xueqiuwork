package com.company.model.bean;

/**
 * @author **N4c1**
 * @create 2021-04-21 0:35
 */
public class Tag {
    public int id;
    int tagmanid;
    String tagcontent;
    String tagData;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getTagmanid() {
        return tagmanid;
    }

    public void setTagmanid(int tagmanid) {
        this.tagmanid = tagmanid;
    }

    public String getTagcontent() {
        return tagcontent;
    }

    public void setTagcontent(String tagcontent) {
        this.tagcontent = tagcontent;
    }

    public String getTagData() {
        return tagData;
    }

    public void setTagData(String tagData) {
        this.tagData = tagData;
    }
}
