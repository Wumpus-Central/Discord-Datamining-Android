package com.facebook.react.uimanager.events;

import android.view.MotionEvent;
import android.view.View;
import com.facebook.react.uimanager.RootView;
import com.facebook.react.uimanager.RootViewUtil;

/* loaded from: classes7.dex */
public class NativeGestureUtil {
    public static void notifyNativeGestureEnded(View view, MotionEvent motionEvent) {
        RootView rootView = RootViewUtil.getRootView(view);
        if (rootView != null) {
            rootView.onChildEndedNativeGesture(view, motionEvent);
        }
    }

    public static void notifyNativeGestureStarted(View view, MotionEvent motionEvent) {
        RootViewUtil.getRootView(view).onChildStartedNativeGesture(view, motionEvent);
    }
}
