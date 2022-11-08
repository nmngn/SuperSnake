package com.example.snake;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;

public class Apple {
    private Bitmap bm;
    private int x, y;
    private Rect r;

    public Apple(Bitmap bm, int x, int y) {
        this.bm = bm;
        this.x = x;
        this.y = y;
    }

    public void draw(Canvas canvas){
        canvas.drawBitmap(bm, x, y, null);
    }

    public void reset(int nx, int ny){
        this.x = nx;
        this.y = ny;
    }

    public Rect getR() {
        return new Rect(this.x, this.y, this.x+GameView.sizeElementMap, this.y+GameView.sizeElementMap);
    }
}
