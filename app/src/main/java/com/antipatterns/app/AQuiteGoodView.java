package com.antipatterns.app;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.LruCache;
import android.view.View;

/**
 * Created by geoffrey on 30/04/15.
 */
public class AQuiteGoodView extends View {

    public AQuiteGoodView(Context context) {
        super(context);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
    @Override
    public void onDraw(Canvas canvas){
        canvas.quickReject(1, 2, 3, 4, Canvas.EdgeType.AA);
        canvas.drawLine(2, 3, 3, 2, new Paint());
        // Get memory class of this device, exceeding this amount will throw an
        // OutOfMemory exception.
        final int memClass = ((ActivityManager) this.getContext().getSystemService(
                Context.ACTIVITY_SERVICE)).getMemoryClass();
        final int cacheSize = 1024 * 1024 * memClass / 8;
        LruCache bitmapCache = new LruCache<String, Bitmap>(cacheSize);
        bitmapCache.get("url");
        invalidate(1,2,3,4);
    }
}
