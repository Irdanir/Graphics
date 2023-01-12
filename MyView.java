package com.example.myapplication39;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;

public class MyView extends View {
    public MyView(Context context) {
        super(context);
    }
    @Override
    protected void onDraw(Canvas canvas) {
        Paint paint = new Paint();
        paint.setColor(Color.RED);
        paint.setStyle(Paint.Style.FILL); // заливка
        paint.setAntiAlias(true); // сглаживание
        paint.setTextSize(100); // размер текста
        paint.setStrokeWidth(10); // толщина маркера
        int y = getHeight()/2;
        int x = getWidth()/2;
        canvas.drawColor(Color.WHITE); // цвет фона
        paint.setColor(Color.YELLOW);
        canvas.drawCircle(0, 0, 200, paint);
        float rotate_center_x = 150;
        float rotate_center_y = 150;
        float rotate_angle = 10;
        float sum = 0;
        canvas.rotate(60, rotate_center_x, rotate_center_y);
        for (int i = 0; i < 25; ++i) {
            canvas.rotate(rotate_angle, rotate_center_x, rotate_center_y);
            sum += rotate_angle;
            canvas.drawLine(0,0,200,200, paint);
        }
        canvas.rotate((-sum) - 60, rotate_center_x, rotate_center_y);
        paint.setColor(Color.rgb(0, 154, 23));
        Rect floor = new Rect(10,1300, 1070, 1930);
        canvas.drawRect(floor, paint);
        paint.setColor(Color.rgb(175, 75, 0));
        Rect house = new Rect(100, 1200, 600, 1700);
        canvas.drawRect(house, paint);
        Path path = new Path();
        path.moveTo(100,1200);
        path.lineTo(350,1000);
        path.lineTo(600,1200);
        paint.setColor(Color.BLACK);
        Rect border1 = new Rect(100, 1190, 600, 1210);
        canvas.drawRect(border1, paint);
        paint.setColor(Color.rgb(175, 75, 0));
        canvas.drawPath(path, paint);
        paint.setColor(Color.rgb(180, 90, 15));
        Rect door = new Rect(400, 1400, 550, 1700);
        canvas.drawRect(door, paint);
        paint.setColor(Color.rgb(192, 192, 192));
        Rect window = new Rect(175, 1400, 325, 1550);
        canvas.drawRect(window, paint);
        paint.setColor(Color.rgb(160, 80, 20));
        Rect tree1 = new Rect(800, 700, 900, 1800);
        canvas.drawRect(tree1, paint);
        paint.setColor(Color.rgb(0, 240, 26 ));
        RectF tree2 = new RectF(650, 600, 1050, 1200);
        canvas.drawOval(tree2, paint);
    }
}