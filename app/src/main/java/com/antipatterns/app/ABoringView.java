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
public class ABoringView extends View {

    public ABoringView(Context context) {
        super(context);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
    @Override
    public void onDraw(Canvas canvas){
        canvas.quickReject(1, 2, 3, 4, Canvas.EdgeType.AA);
        invalidate(1,2,3,4);
    }
}
