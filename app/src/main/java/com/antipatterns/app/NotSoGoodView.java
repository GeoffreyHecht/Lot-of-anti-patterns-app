package com.antipatterns.app;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Picture;
import android.os.Build;
import android.os.PowerManager;
import android.util.LruCache;
import android.view.View;

/**
 * Created by geoffrey on 30/04/15.
 */
public class NotSoGoodView extends View {

    public NotSoGoodView(Context context) {
        super(context);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
    @Override
    public void onDraw(Canvas canvas){
        canvas.drawLine(2,3,3,2,new Paint());
        int cacheSize = 4 * 1024 * 1024; // 4MiB
        LruCache bitmapCache = new LruCache<String, Bitmap>(cacheSize);
        bitmapCache.get("url");
        invalidate();
        canvas.drawPicture(new Picture());

        Paint pt = new Paint();
        pt.setLinearText(true);
    }


}
