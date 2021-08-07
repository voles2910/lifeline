package com.voles.lifeline.component;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.Nullable;

import com.orhanobut.logger.Logger;

public class LifeLine_Time extends View {
    private Paint timer_shaft_paint; //时间轴画笔
    private int screen_width; //屏幕宽度1
    private int screen_height; //屏幕高度
    private float timer_shaft_startx; //时间轴起始X坐标轴
    private float timer_shaft_starty; //时间轴起始Y坐标轴
    private float timer_shaft_endx; //时间轴结束X坐标轴
    private float timer_shaft_endy; //时间轴结束Y坐标轴
    public LifeLine_Time(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        Logger.d("timer shaft - 时间轴构造函数");
    }
    private void init(){
        timer_shaft_paint = new Paint();
        timer_shaft_paint.setColor(Color.BLACK);
        timer_shaft_paint.setStyle(Paint.Style.FILL); //设置填充样式
        timer_shaft_paint.setStrokeWidth(5); //设置画笔宽度
        screen_width = getWidth();
        screen_height = getHeight();
        timer_shaft_startx = this.screen_width / 8;
        timer_shaft_starty = 0;
        timer_shaft_endx = this.screen_width / 8;
        timer_shaft_endy = screen_height;
    }
    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Logger.d("onDraw");
        init();
        canvas.drawLine(this.timer_shaft_startx,this.timer_shaft_starty,this.timer_shaft_endx,
                this.timer_shaft_endy,this.timer_shaft_paint);

    }

    
    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        Logger.d("onMeasure");

    }
}
