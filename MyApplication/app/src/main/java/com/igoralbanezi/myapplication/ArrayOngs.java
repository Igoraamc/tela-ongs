package com.igoralbanezi.myapplication;

import java.util.ArrayList;

public class ArrayOngs {
    private ArrayList<ObjOng> ongs;

    public ArrayOngs() {
        ongs = new ArrayList<ObjOng>();
    }

    public void add(ObjOng ong) {
        this.ongs.add(ong);
    }

    public ObjOng get(int i) {
        return this.ongs.get(i);
    }

    public int size() {
        return this.ongs.size();
    }
}
