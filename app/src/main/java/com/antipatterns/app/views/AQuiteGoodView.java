package com.antipatterns.app.views;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.util.LruCache;
import android.view.View;

import java.io.FileOutputStream;
import java.io.IOException;

import static android.content.Context.ACTIVITY_SERVICE;

/**
 * This view should not trigger UCS.
 */
public class AQuiteGoodView extends View {

    public AQuiteGoodView(Context context) {
        super(context);
    }

    // NO UIO
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
    @Override
    public void onDraw(Canvas canvas) {
        canvas.quickReject(1, 2, 3, 4, Canvas.EdgeType.AA);
        canvas.drawLine(2, 3, 3, 2, new Paint());
        // Get memory class of this device, exceeding this amount will throw an
        // OutOfMemory exception.
        final int memClass = ((ActivityManager) this.getContext().getSystemService(
                ACTIVITY_SERVICE)).getMemoryClass();
        final int cacheSize = 1024 * 1024 * memClass / 8;
        LruCache bitmapCache = new LruCache<String, Bitmap>(cacheSize);
        bitmapCache.get("url");
        // NO IWR
        invalidate(1, 2, 3, 4);
    }

    // NO LRU
    public void correctLRU() {
        ActivityManager activityManager = (ActivityManager) this.getContext().getSystemService(ACTIVITY_SERVICE);
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        LruCache bitmapCache = new LruCache<String, Bitmap>(3);
        bitmapCache.get("url");
    }

    // NO LRU
    public void anotherCorrectLRU() {
        Runtime.getRuntime().maxMemory();
        LruCache bitmapCache = new LruCache<String, Bitmap>(3);
        bitmapCache.get("url");
    }

    // NO PD
    public void noPD() throws IOException {
        FileOutputStream fos = getContext().openFileOutput("", Context.MODE_PRIVATE);
        fos.write("".getBytes());
        fos.close();
    }

}
