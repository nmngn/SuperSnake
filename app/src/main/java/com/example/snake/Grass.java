package com.example.snake;

import android.graphics.Bitmap;

public class Grass {
    private Bitmap bm;
    private int x, y, width, height;

    public Grass(Bitmap bm, int x, int y, int width, int height) {
        this.bm = bm;
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Bitmap getBm() {
        return bm;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
