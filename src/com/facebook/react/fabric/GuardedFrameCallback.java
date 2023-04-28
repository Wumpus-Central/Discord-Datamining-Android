package com.facebook.react.fabric;

import com.facebook.react.bridge.JSExceptionHandler;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.modules.core.ChoreographerCompat;

/* loaded from: classes7.dex */
public abstract class GuardedFrameCallback extends ChoreographerCompat.FrameCallback {
    private final JSExceptionHandler mExceptionHandler;

    /* JADX INFO: Access modifiers changed from: protected */
    @Deprecated
    public GuardedFrameCallback(ReactContext reactContext) {
        this(reactContext.getExceptionHandler());
    }

    @Override // com.facebook.react.modules.core.ChoreographerCompat.FrameCallback
    public final void doFrame(long j) {
        try {
            doFrameGuarded(j);
        } catch (RuntimeException e) {
            this.mExceptionHandler.handleException(e);
        }
    }

    protected abstract void doFrameGuarded(long j);

    protected GuardedFrameCallback(JSExceptionHandler jSExceptionHandler) {
        this.mExceptionHandler = jSExceptionHandler;
    }
}
