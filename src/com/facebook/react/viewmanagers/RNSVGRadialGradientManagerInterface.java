package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;

/* loaded from: classes7.dex */
public interface RNSVGRadialGradientManagerInterface<T extends View> {
    void setClipPath(T t, String str);

    void setClipRule(T t, int i);

    void setCx(T t, Double d);

    void setCx(T t, String str);

    void setCy(T t, Double d);

    void setCy(T t, String str);

    void setDisplay(T t, String str);

    void setFx(T t, Double d);

    void setFx(T t, String str);

    void setFy(T t, Double d);

    void setFy(T t, String str);

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

    void setRx(T t, Double d);

    void setRx(T t, String str);

    void setRy(T t, Double d);

    void setRy(T t, String str);
}
