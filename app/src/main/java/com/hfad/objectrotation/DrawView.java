package com.hfad.objectrotation;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.View;
import android.widget.Scroller;

public class DrawView extends View {
    private Paint paint;
    private Scroller mScroller;
    public DrawView(Context context) {
        super( context );
        paint = new Paint();
        paint.setColor( Color.GREEN );
    }

    @Override
    public void onDraw(Canvas canvas) {
        int canvasW = getWidth();
        int canvasH = getHeight();
        Point centerOfCanvas = new Point(canvasW / 2, canvasH / 2);
        int rectW = 200;
        int rectH = 200;
        int left = centerOfCanvas.x - (rectW / 2);
        int top = centerOfCanvas.y - (rectH / 2);
        int right = centerOfCanvas.x + (rectW / 2);
        int bottom = centerOfCanvas.y + (rectH / 2);
        Rect rect = new Rect(left, top, right, bottom);
        canvas.drawRect(rect, paint);
    }
}