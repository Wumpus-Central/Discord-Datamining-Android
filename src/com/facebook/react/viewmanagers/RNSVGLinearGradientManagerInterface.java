package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* loaded from: classes7.dex */
public interface RNSVGLinearGradientManagerInterface<T extends View> {
    void setClipPath(T t, String str);

    void setClipRule(T t, int i);

    void setDisplay(T t, String str);

    void setGradient(T t, ReadableArray readableArray);

    void setGradientTransform(T t, ReadableArray readableArray);

    void setGradientUnits(T t, int i);

    void setMarkerEnd(T t, String str);

    void setMarkerMid(T t, String str);

    void setMarkerStart(T t, String str);

    void setMask(T t, String str);

    void setMatrix(T t, ReadableArray readableArray);

    void setName(T t, String str);

    void setOpacity(T t, float f);

    void setPointerEvents(T t, String str);

    void setResponsible(T t, boolean z);

    void setX1(T t, Double d);

    void setX1(T t, String str);

    void setX2(T t, Double d);

    void setX2(T t, String str);

    void setY1(T t, Double d);

    void setY1(T t, String str);

    void setY2(T t, Double d);

    void setY2(T t, String str);
}
