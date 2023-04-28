package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;

/* loaded from: classes7.dex */
public interface RNSVGTSpanManagerInterface<T extends View> {
    void setAlignmentBaseline(T t, String str);

    void setBaselineShift(T t, Double d);

    void setBaselineShift(T t, String str);

    void setClipPath(T t, String str);

    void setClipRule(T t, int i);

    void setContent(T t, String str);

    void setDisplay(T t, String str);

    void setDx(T t, ReadableArray readableArray);

    void setDy(T t, ReadableArray readableArray);

    void setFill(T t, ReadableMap readableMap);

    void setFillOpacity(T t, float f);

    void setFillRule(T t, int i);

    void setFont(T t, ReadableMap readableMap);

    void setFontSize(T t, Double d);

    void setFontSize(T t, String str);

    void setFontWeight(T t, Double d);

    void setFontWeight(T t, String str);

    void setInlineSize(T t, Double d);

    void setInlineSize(T t, String str);

    void setLengthAdjust(T t, String str);

    void setMarkerEnd(T t, String str);

    void setMarkerMid(T t, String str);

    void setMarkerStart(T t, String str);

    void setMask(T t, String str);

    void setMatrix(T t, ReadableArray readableArray);

    void setName(T t, String str);

    void setOpacity(T t, float f);

    void setPointerEvents(T t, String str);

    void setPropList(T t, ReadableArray readableArray);

    void setResponsible(T t, boolean z);

    void setRotate(T t, ReadableArray readableArray);

    void setStroke(T t, ReadableMap readableMap);

    void setStrokeDasharray(T t, ReadableArray readableArray);

    void setStrokeDashoffset(T t, float f);

    void setStrokeLinecap(T t, int i);

    void setStrokeLinejoin(T t, int i);

    void setStrokeMiterlimit(T t, float f);

    void setStrokeOpacity(T t, float f);

    void setStrokeWidth(T t, Double d);

    void setStrokeWidth(T t, String str);

    void setTextLength(T t, Double d);

    void setTextLength(T t, String str);

    void setVectorEffect(T t, int i);

    void setVerticalAlign(T t, String str);

    void setX(T t, ReadableArray readableArray);

    void setY(T t, ReadableArray readableArray);
}
