package com.antipatterns.app.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import android.os.PowerManager;
import android.util.LruCache;
import android.view.View;

import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by geoffrey on 30/04/15.
 */
public class NotSoGoodView extends View {

    public NotSoGoodView(Context context) {
        super(context);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
    @Override
    public void onDraw(Canvas canvas) {
        canvas.drawLine(2, 3, 3, 2, new Paint());
        int cacheSize = 4 * 1024 * 1024; // 4MiB
        LruCache bitmapCache = new LruCache<String, Bitmap>(cacheSize);
        bitmapCache.get("url");
        // IWR
        invalidate();

        Paint pt = new Paint();
        // UHA
        pt.setLinearText(true);
    }

    // DW
    public void incorrectDW() {
        PowerManager pm = (PowerManager) getContext().getSystemService(Context.POWER_SERVICE);
        PowerManager.WakeLock wl = pm.newWakeLock(PowerManager.SCREEN_DIM_WAKE_LOCK, "My Tag");
        wl.acquire();
    }

    // PD
    public void unsafeReadable() throws IOException {
        FileOutputStream fos = getContext().openFileOutput(" ", Context.MODE_WORLD_READABLE);
        fos.write(" ".getBytes());
        fos.close();
    }

    // PD
    public void unsafeWritable() throws IOException {
        FileOutputStream fos = getContext().openFileOutput("", Context.MODE_WORLD_WRITEABLE);
        fos.write("".getBytes());
        fos.close();
    }

}
