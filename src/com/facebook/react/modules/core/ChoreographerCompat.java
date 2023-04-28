package com.facebook.react.modules.core;

import android.os.Handler;
import android.view.Choreographer;
import com.facebook.react.bridge.UiThreadUtil;

/* loaded from: classes7.dex */
public class ChoreographerCompat {
    private static final long ONE_FRAME_MILLIS = 17;
    private static ChoreographerCompat sInstance;
    private Choreographer mChoreographer = getChoreographer();
    private Handler mHandler;

    /* loaded from: classes7.dex */
    public static abstract class FrameCallback {
        private Choreographer.FrameCallback mFrameCallback;
        private Runnable mRunnable;

        public abstract void doFrame(long j);

        Choreographer.FrameCallback getFrameCallback() {
            if (this.mFrameCallback == null) {
                this.mFrameCallback = new Choreographer.FrameCallback() { // from class: com.facebook.react.modules.core.ChoreographerCompat.FrameCallback.1
                    @Override // android.view.Choreographer.FrameCallback
                    public void doFrame(long j) {
                        FrameCallback.this.doFrame(j);
                    }
                };
            }
            return this.mFrameCallback;
        }

        Runnable getRunnable() {
            if (this.mRunnable == null) {
                this.mRunnable = new Runnable() { // from class: com.facebook.react.modules.core.ChoreographerCompat.FrameCallback.2
                    @Override // java.lang.Runnable
                    public void run() {
                        FrameCallback.this.doFrame(System.nanoTime());
                    }
                };
            }
            return this.mRunnable;
        }
    }

    private ChoreographerCompat() {
    }

    private void choreographerPostFrameCallback(Choreographer.FrameCallback frameCallback) {
        this.mChoreographer.postFrameCallback(frameCallback);
    }

    private void choreographerPostFrameCallbackDelayed(Choreographer.FrameCallback frameCallback, long j) {
        this.mChoreographer.postFrameCallbackDelayed(frameCallback, j);
    }

    private void choreographerRemoveFrameCallback(Choreographer.FrameCallback frameCallback) {
        this.mChoreographer.removeFrameCallback(frameCallback);
    }

    private Choreographer getChoreographer() {
        return Choreographer.getInstance();
    }

    public static ChoreographerCompat getInstance() {
        UiThreadUtil.assertOnUiThread();
        if (sInstance == null) {
            sInstance = new ChoreographerCompat();
        }
        return sInstance;
    }

    public void postFrameCallback(FrameCallback frameCallback) {
        choreographerPostFrameCallback(frameCallback.getFrameCallback());
    }

    public void postFrameCallbackDelayed(FrameCallback frameCallback, long j) {
        choreographerPostFrameCallbackDelayed(frameCallback.getFrameCallback(), j);
    }

    public void removeFrameCallback(FrameCallback frameCallback) {
        choreographerRemoveFrameCallback(frameCallback.getFrameCallback());
    }
}
