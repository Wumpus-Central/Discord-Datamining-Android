package com.th3rdwave.safeareacontext;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.WritableMap;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.ViewProps;
import java.util.Map;

/* renamed from: com.th3rdwave.safeareacontext.i */
/* loaded from: classes8.dex */
class C6358i {
    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static Map<String, Float> m25768a(EdgeInsets edgeInsets) {
        return MapBuilder.m30828of(ViewProps.TOP, Float.valueOf(PixelUtil.toDIPFromPixel(edgeInsets.f12939a)), ViewProps.RIGHT, Float.valueOf(PixelUtil.toDIPFromPixel(edgeInsets.f12940b)), ViewProps.BOTTOM, Float.valueOf(PixelUtil.toDIPFromPixel(edgeInsets.f12941c)), ViewProps.LEFT, Float.valueOf(PixelUtil.toDIPFromPixel(edgeInsets.f12942d)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static WritableMap m25767b(EdgeInsets edgeInsets) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble(ViewProps.TOP, PixelUtil.toDIPFromPixel(edgeInsets.f12939a));
        createMap.putDouble(ViewProps.RIGHT, PixelUtil.toDIPFromPixel(edgeInsets.f12940b));
        createMap.putDouble(ViewProps.BOTTOM, PixelUtil.toDIPFromPixel(edgeInsets.f12941c));
        createMap.putDouble(ViewProps.LEFT, PixelUtil.toDIPFromPixel(edgeInsets.f12942d));
        return createMap;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static Map<String, Float> m25766c(Rect rect) {
        return MapBuilder.m30828of("x", Float.valueOf(PixelUtil.toDIPFromPixel(rect.f12943a)), "y", Float.valueOf(PixelUtil.toDIPFromPixel(rect.f12944b)), "width", Float.valueOf(PixelUtil.toDIPFromPixel(rect.f12945c)), "height", Float.valueOf(PixelUtil.toDIPFromPixel(rect.f12946d)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public static WritableMap m25765d(Rect rect) {
        WritableMap createMap = Arguments.createMap();
        createMap.putDouble("x", PixelUtil.toDIPFromPixel(rect.f12943a));
        createMap.putDouble("y", PixelUtil.toDIPFromPixel(rect.f12944b));
        createMap.putDouble("width", PixelUtil.toDIPFromPixel(rect.f12945c));
        createMap.putDouble("height", PixelUtil.toDIPFromPixel(rect.f12946d));
        return createMap;
    }
}
