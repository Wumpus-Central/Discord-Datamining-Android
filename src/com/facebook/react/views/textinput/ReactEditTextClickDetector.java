package com.facebook.react.views.textinput;

import android.os.Build;
import android.view.MotionEvent;

/* loaded from: classes7.dex */
class ReactEditTextClickDetector {
    private static final int MAX_CLICK_DISTANCE_DP = 12;
    private static final long MAX_CLICK_DURATION_MS = 250;
    private TimestampedMotionEvent currentDownEvent;
    private final ReactEditText reactEditText;
    private final float screenDensity;

    /* loaded from: classes7.dex */
    private static class TimestampedMotionEvent {
        final MotionEvent motionEvent;
        final long timestamp;

        TimestampedMotionEvent(long j, MotionEvent motionEvent) {
            this.timestamp = j;
            this.motionEvent = motionEvent;
        }
    }

    public ReactEditTextClickDetector(ReactEditText reactEditText) {
        this.reactEditText = reactEditText;
        this.screenDensity = reactEditText.getResources().getDisplayMetrics().density;
    }

    private static boolean forceShowKeyboardOnClicks() {
        return Build.VERSION.SDK_INT <= 28;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void cancelPress() {
        this.currentDownEvent = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void handleDown(MotionEvent motionEvent) {
        this.currentDownEvent = new TimestampedMotionEvent(System.currentTimeMillis(), motionEvent);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void handleUp(MotionEvent motionEvent) {
        TimestampedMotionEvent timestampedMotionEvent = this.currentDownEvent;
        if (timestampedMotionEvent != null) {
            this.currentDownEvent = null;
            if (forceShowKeyboardOnClicks() && this.reactEditText.isEnabled() && System.currentTimeMillis() - timestampedMotionEvent.timestamp <= MAX_CLICK_DURATION_MS) {
                float rawX = timestampedMotionEvent.motionEvent.getRawX();
                float rawY = timestampedMotionEvent.motionEvent.getRawY();
                if (Math.sqrt(Math.pow(motionEvent.getRawX() - rawX, 2.0d) + Math.pow(motionEvent.getRawY() - rawY, 2.0d)) / this.screenDensity <= 12.0d) {
                    this.reactEditText.showSoftKeyboard();
                }
            }
        }
    }
}
