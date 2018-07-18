package com.antipatterns.app.views;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.view.View;

/**
 * Created by geoffrey on 30/04/15.
 */
public class MyQuiteGoodView extends View {

    public MyQuiteGoodView(Context context) {
        super(context);
    }

    /**
     * Should not trigger UIO
     */
    @Override
    public void onDraw(Canvas canvas) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            canvas.clipOutRect(1, 2, 3, 4);
        }
        canvas.drawLine(2, 3, 3, 2, new Paint());
    }
}
