package com.alcedo.marty.e_lephant.activities;

/**
 * Created by Martin on 13/10/2018.
 */

public class MyObject {
    private String text;
    private int id;

    public MyObject(String text, int id) {
        this.text = text;
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public int getDrawableId() {
        return id;
    }

    public void setDrawableId(int id) {
        this.id = id;
    }
}
