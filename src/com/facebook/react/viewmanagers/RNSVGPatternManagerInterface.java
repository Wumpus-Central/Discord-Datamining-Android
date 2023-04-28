package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes7.dex */
public interface RNSVGPatternManagerInterface<T extends View> {
    void setAlign(T t, String str);

    void setClipPath(T t, String str);

    void setClipRule(T t, int i);

    void setDisplay(T t, String str);

    void setFill(T t, ReadableMap readableMap);

    void setFillOpacity(T t, float f);

    void setFillRule(T t, int i);

    void setFont(T t, ReadableMap readableMap);

    void setFontSize(T t, Double d);

    void setFontSize(T t, String str);

    void setFontWeight(T t, Double d);

    void setFontWeight(T t, String str);

    void setHeight(T t, Double d);

    void setHeight(T t, String str);

    void setMarkerEnd(T t, String str);

    void setMarkerMid(T t, String str);

    void setMarkerStart(T t, String str);

    void setMask(T t, String str);

    void setMatrix(T t, ReadableArray readableArray);

    void setMeetOrSlice(T t, int i);

    void setMinX(T t, float f);

    void setMinY(T t, float f);

    void setName(T t, String str);

    void setOpacity(T t, float f);

    void setPatternContentUnits(T t, int i);

    void setPatternTransform(T t, ReadableArray readableArray);

    void setPatternUnits(T t, int i);

    void setPointerEvents(T t, String str);

    void setPropList(T t, ReadableArray readableArray);

    void setResponsible(T t, boolean z);

    void setStroke(T t, ReadableMap readableMap);

    void setStrokeDasharray(T t, ReadableArray readableArray);

    void setStrokeDashoffset(T t, float f);

    void setStrokeLinecap(T t, int i);

    void setStrokeLinejoin(T t, int i);

    void setStrokeMiterlimit(T t, float f);

    void setStrokeOpacity(T t, float f);

    void setStrokeWidth(T t, Double d);

    void setStrokeWidth(T t, String str);

    void setVbHeight(T t, float f);

    void setVbWidth(T t, float f);

    void setVectorEffect(T t, int i);

    void setWidth(T t, Double d);

    void setWidth(T t, String str);

    void setX(T t, Double d);

    void setX(T t, String str);

    void setY(T t, Double d);

    void setY(T t, String str);
}
