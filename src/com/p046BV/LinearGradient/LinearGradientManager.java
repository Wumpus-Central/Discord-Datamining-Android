package com.p046BV.LinearGradient;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.annotations.ReactProp;

/* renamed from: com.BV.LinearGradient.LinearGradientManager */
/* loaded from: classes.dex */
public class LinearGradientManager extends SimpleViewManager<C4085b> {
    public static final String PROP_ANGLE = "angle";
    public static final String PROP_ANGLE_CENTER = "angleCenter";
    public static final String PROP_BORDER_RADII = "borderRadii";
    public static final String PROP_COLORS = "colors";
    public static final String PROP_END_POS = "endPoint";
    public static final String PROP_LOCATIONS = "locations";
    public static final String PROP_START_POS = "startPoint";
    public static final String PROP_USE_ANGLE = "useAngle";
    public static final String REACT_CLASS = "BVLinearGradient";

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @ReactProp(defaultFloat = 45.0f, name = PROP_ANGLE)
    public void setAngle(C4085b bVar, float f) {
        bVar.setAngle(f);
    }

    @ReactProp(name = PROP_ANGLE_CENTER)
    public void setAngleCenter(C4085b bVar, ReadableArray readableArray) {
        bVar.setAngleCenter(readableArray);
    }

    @ReactProp(name = PROP_BORDER_RADII)
    public void setBorderRadii(C4085b bVar, ReadableArray readableArray) {
        bVar.setBorderRadii(readableArray);
    }

    @ReactProp(name = PROP_COLORS)
    public void setColors(C4085b bVar, ReadableArray readableArray) {
        bVar.setColors(readableArray);
    }

    @ReactProp(name = PROP_END_POS)
    public void setEndPosition(C4085b bVar, ReadableArray readableArray) {
        bVar.setEndPosition(readableArray);
    }

    @ReactProp(name = PROP_LOCATIONS)
    public void setLocations(C4085b bVar, ReadableArray readableArray) {
        if (readableArray != null) {
            bVar.setLocations(readableArray);
        }
    }

    @ReactProp(name = PROP_START_POS)
    public void setStartPosition(C4085b bVar, ReadableArray readableArray) {
        bVar.setStartPosition(readableArray);
    }

    @ReactProp(defaultBoolean = false, name = PROP_USE_ANGLE)
    public void setUseAngle(C4085b bVar, boolean z) {
        bVar.setUseAngle(z);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C4085b createViewInstance(ThemedReactContext themedReactContext) {
        return new C4085b(themedReactContext);
    }
}
