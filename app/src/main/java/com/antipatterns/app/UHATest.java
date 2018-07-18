package com.antipatterns.app;

import android.graphics.Canvas;
import android.graphics.Paint;

@SuppressWarnings({"unused", "ConstantConditions"})
public class UHATest {

    public void UHA_drawVertices(Canvas canvas) {
        canvas.drawVertices(Canvas.VertexMode.TRIANGLE_FAN, 5, new float[0], 5,
                new float[0], 6, new int[0], 0, null, 0, 0, null);
    }

    public void UHA_setMaskFilter(Paint paint) {
        paint.setMaskFilter(null);
    }

    public void UHA_setPathEffect(Paint paint) {
        paint.setPathEffect(null);
    }

    public void UHA_setSubPixelText(Paint paint) {
        paint.setSubpixelText(false);
    }

    public void UHA_drawPath(Canvas canvas) {
        canvas.drawPath(null, null);
    }

    public void UHA_drawPosText(Canvas canvas) {
        canvas.drawPosText(null, 0, 0, null, null);
    }

    public void UHA_drawTextOnPath(Canvas canvas) {
        canvas.drawTextOnPath(null, null, 0, 0, null);
    }

    public void UHA_setDrawFilter(Canvas canvas) {
        canvas.setDrawFilter(null);
    }

    public void UHA_setAntiAlias(Paint paint) {
        paint.setAntiAlias(true);
    }

    public void UHA_setFilterBitmap(Paint paint) {
        paint.setFilterBitmap(false);
    }

    public void UHA_drawBitmapMesh(Canvas canvas) {
        canvas.drawBitmapMesh(null, 0, 0, null, 0, null, 0, null);
    }

    public void UHA_setStrokeCap(Paint paint) {
        paint.setStrokeCap(null);
    }

    public void UHA_drawPicture(Canvas canvas) {
        canvas.drawPicture(null);
    }

}
