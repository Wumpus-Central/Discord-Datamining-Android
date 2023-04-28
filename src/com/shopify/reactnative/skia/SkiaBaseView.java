package com.shopify.reactnative.skia;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.TextureView;
import com.facebook.jni.annotations.DoNotStrip;
import com.facebook.react.views.view.ReactViewGroup;

/* loaded from: classes8.dex */
public abstract class SkiaBaseView extends ReactViewGroup implements TextureView.SurfaceTextureListener {
    @DoNotStrip
    private Surface mSurface;
    private TextureView mTexture;

    public SkiaBaseView(Context context) {
        super(context);
        TextureView textureView = new TextureView(context);
        this.mTexture = textureView;
        textureView.setSurfaceTextureListener(this);
        this.mTexture.setOpaque(false);
        addView(this.mTexture);
    }

    private static int motionActionToType(int i) {
        if (i != 0) {
            int i2 = 1;
            if (i == 1) {
                return 2;
            }
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    if (i != 5) {
                        if (i == 6) {
                            return 2;
                        }
                    }
                }
            }
            return i2;
        }
        return 0;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        this.mTexture.layout(0, 0, getMeasuredWidth(), getMeasuredHeight());
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        Surface surface = new Surface(surfaceTexture);
        this.mSurface = surface;
        surfaceAvailable(surface, i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceDestroyed();
        this.mSurface.release();
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        surfaceSizeChanged(i, i2);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    @Override // com.facebook.react.views.view.ReactViewGroup, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        int actionIndex;
        int actionMasked = motionEvent.getActionMasked();
        MotionEvent.PointerCoords pointerCoords = new MotionEvent.PointerCoords();
        int i = 0;
        if (actionMasked == 5 || actionMasked == 6) {
            motionEvent.getPointerCoords(motionEvent.getActionIndex(), pointerCoords);
            updateTouchPoints(new double[]{pointerCoords.x, pointerCoords.y, motionEvent.getPressure(actionIndex), motionActionToType(actionMasked), motionEvent.getPointerId(actionIndex)});
        } else {
            int pointerCount = motionEvent.getPointerCount();
            double[] dArr = new double[pointerCount * 5];
            int i2 = 0;
            while (i < pointerCount) {
                motionEvent.getPointerCoords(i, pointerCoords);
                int i3 = i2 + 1;
                dArr[i2] = pointerCoords.x;
                int i4 = i3 + 1;
                dArr[i3] = pointerCoords.y;
                int i5 = i4 + 1;
                dArr[i4] = motionEvent.getPressure(i);
                int i6 = i5 + 1;
                dArr[i5] = motionActionToType(actionMasked);
                dArr[i6] = motionEvent.getPointerId(i);
                i++;
                i2 = i6 + 1;
            }
            updateTouchPoints(dArr);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void registerView(int i);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void setDebugMode(boolean z);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void setMode(String str);

    protected abstract void surfaceAvailable(Object obj, int i, int i2);

    protected abstract void surfaceDestroyed();

    protected abstract void surfaceSizeChanged(int i, int i2);

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract void unregisterView();

    protected abstract void updateTouchPoints(double[] dArr);
}
