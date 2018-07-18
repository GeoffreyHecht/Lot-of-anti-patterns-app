package com.antipatterns.app.views;

import android.annotation.TargetApi;
import android.content.Context;
import android.graphics.Canvas;
import android.os.Build;
import android.view.View;

/**
 * Created by geoffrey on 30/04/15.
 */
public class ABoringView extends View {

    public ABoringView(Context context) {
        super(context);
    }

    /**
     * NO UIO
     */
    @TargetApi(Build.VERSION_CODES.HONEYCOMB_MR1)
    @Override
    public void onDraw(Canvas canvas) {
        canvas.quickReject(1, 2, 3, 4, Canvas.EdgeType.AA);
        // NO IWR
        invalidate(1, 2, 3, 4);
    }
}
