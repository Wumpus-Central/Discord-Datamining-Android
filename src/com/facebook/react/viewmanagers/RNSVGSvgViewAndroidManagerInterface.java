package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes7.dex */
public interface RNSVGSvgViewAndroidManagerInterface<T extends View> {
    void setAccessible(T t, boolean z);

    void setAlign(T t, String str);

    void setBackfaceVisibility(T t, String str);

    void setBbHeight(T t, Double d);

    void setBbHeight(T t, String str);

    void setBbWidth(T t, Double d);

    void setBbWidth(T t, String str);

    void setBorderBottomColor(T t, Integer num);

    void setBorderBottomEndRadius(T t, float f);

    void setBorderBottomLeftRadius(T t, double d);

    void setBorderBottomRightRadius(T t, double d);

    void setBorderBottomStartRadius(T t, float f);

    void setBorderColor(T t, Integer num);

    void setBorderEndColor(T t, Integer num);

    void setBorderLeftColor(T t, Integer num);

    void setBorderRadius(T t, double d);

    void setBorderRightColor(T t, Integer num);

    void setBorderStartColor(T t, Integer num);

    void setBorderStyle(T t, String str);

    void setBorderTopColor(T t, Integer num);

    void setBorderTopEndRadius(T t, float f);

    void setBorderTopLeftRadius(T t, double d);

    void setBorderTopRightRadius(T t, double d);

    void setBorderTopStartRadius(T t, float f);

    void setColor(T t, Integer num);

    void setFocusable(T t, boolean z);

    void setHasTVPreferredFocus(T t, boolean z);

    void setHitSlop(T t, ReadableMap readableMap);

    void setMeetOrSlice(T t, int i);

    void setMinX(T t, float f);

    void setMinY(T t, float f);

    void setNativeBackgroundAndroid(T t, ReadableMap readableMap);

    void setNativeForegroundAndroid(T t, ReadableMap readableMap);

    void setNeedsOffscreenAlphaCompositing(T t, boolean z);

    void setNextFocusDown(T t, int i);

    void setNextFocusForward(T t, int i);

    void setNextFocusLeft(T t, int i);

    void setNextFocusRight(T t, int i);

    void setNextFocusUp(T t, int i);

    void setPointerEvents(T t, String str);

    void setRemoveClippedSubviews(T t, boolean z);

    void setTintColor(T t, Integer num);

    void setVbHeight(T t, float f);

    void setVbWidth(T t, float f);
}
