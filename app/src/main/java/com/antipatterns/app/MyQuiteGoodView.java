package com.antipatterns.app;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by geoffrey on 30/04/15.
 */
public class MyQuiteGoodView extends View {

    public MyQuiteGoodView(Context context) {
        super(context);
    }

    @Override
    public void onDraw(Canvas canvas){
        canvas.clipRect(1,2,3,4);
        canvas.drawLine(2,3,3,2,new Paint());
    }
}
