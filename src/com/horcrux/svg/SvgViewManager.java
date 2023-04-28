package com.horcrux.svg;

import android.graphics.Rect;
import android.util.SparseArray;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.PointerEvents;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerDelegate;
import com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface;
import com.facebook.react.views.view.ReactViewGroup;
import com.facebook.react.views.view.ReactViewManager;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Locale;

/* loaded from: classes6.dex */
class SvgViewManager extends ReactViewManager implements RNSVGSvgViewAndroidManagerInterface<SvgView> {
    public static final String REACT_CLASS = "RNSVGSvgViewAndroid";
    private final ViewManagerDelegate<SvgView> mDelegate = new RNSVGSvgViewAndroidManagerDelegate(this);
    private static final SparseArray<SvgView> mTagToSvgView = new SparseArray<>();
    private static final SparseArray<Runnable> mTagToRunnable = new SparseArray<>();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static SvgView getSvgViewByTag(int i) {
        return mTagToSvgView.get(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void runWhenViewIsAvailable(int i, Runnable runnable) {
        mTagToRunnable.put(i, runnable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void setSvgView(int i, SvgView svgView) {
        mTagToSvgView.put(i, svgView);
        SparseArray<Runnable> sparseArray = mTagToRunnable;
        Runnable runnable = sparseArray.get(i);
        if (runnable != null) {
            runnable.run();
            sparseArray.delete(i);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    @Override // com.facebook.react.uimanager.ViewGroupManager, com.facebook.react.uimanager.IViewManagerWithChildren
    public boolean needsCustomLayoutForChildren() {
        return true;
    }

    @Override // com.facebook.react.views.view.ReactViewManager, com.facebook.react.uimanager.ViewManager
    public ReactViewGroup createViewInstance(ThemedReactContext themedReactContext) {
        return new SvgView(themedReactContext);
    }

    public void onDropViewInstance(ReactViewGroup reactViewGroup) {
        super.onDropViewInstance((SvgViewManager) reactViewGroup);
        mTagToSvgView.remove(reactViewGroup.getId());
    }

    public void setAccessible(SvgView svgView, boolean z) {
        super.setAccessible((ReactViewGroup) svgView, z);
    }

    @ReactProp(name = "align")
    public void setAlign(SvgView svgView, String str) {
        svgView.setAlign(str);
    }

    public void setBackfaceVisibility(SvgView svgView, String str) {
        super.setBackfaceVisibility((ReactViewGroup) svgView, str);
    }

    public void setBorderBottomColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 4, num);
    }

    public void setBorderBottomEndRadius(SvgView svgView, float f) {
        super.setBorderRadius(svgView, 8, f);
    }

    public void setBorderBottomLeftRadius(SvgView svgView, double d) {
        super.setBorderRadius(svgView, 4, (float) d);
    }

    public void setBorderBottomRightRadius(SvgView svgView, double d) {
        super.setBorderRadius(svgView, 3, (float) d);
    }

    public void setBorderBottomStartRadius(SvgView svgView, float f) {
        super.setBorderRadius(svgView, 7, f);
    }

    public void setBorderColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 0, num);
    }

    public void setBorderEndColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 6, num);
    }

    public void setBorderLeftColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 1, num);
    }

    public void setBorderRadius(SvgView svgView, double d) {
        super.setBorderRadius(svgView, 0, (float) d);
    }

    public void setBorderRightColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 2, num);
    }

    public void setBorderStartColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 5, num);
    }

    public void setBorderStyle(SvgView svgView, String str) {
        super.setBorderStyle((ReactViewGroup) svgView, str);
    }

    public void setBorderTopColor(SvgView svgView, Integer num) {
        super.setBorderColor(svgView, 3, num);
    }

    public void setBorderTopEndRadius(SvgView svgView, float f) {
        super.setBorderRadius(svgView, 6, f);
    }

    public void setBorderTopLeftRadius(SvgView svgView, double d) {
        super.setBorderRadius(svgView, 1, (float) d);
    }

    public void setBorderTopRightRadius(SvgView svgView, double d) {
        super.setBorderRadius(svgView, 2, (float) d);
    }

    public void setBorderTopStartRadius(SvgView svgView, float f) {
        super.setBorderRadius(svgView, 5, f);
    }

    @ReactProp(customType = "Color", name = ViewProps.COLOR)
    public void setColor(SvgView svgView, Integer num) {
        svgView.setTintColor(num);
    }

    public void setFocusable(SvgView svgView, boolean z) {
        super.setFocusable((ReactViewGroup) svgView, z);
    }

    public void setHasTVPreferredFocus(SvgView svgView, boolean z) {
        super.setTVPreferredFocus(svgView, z);
    }

    public void setHitSlop(SvgView svgView, ReadableMap readableMap) {
        if (readableMap != null) {
            int i = 0;
            int pixelFromDIP = readableMap.hasKey(ViewProps.LEFT) ? (int) PixelUtil.toPixelFromDIP(readableMap.getDouble(ViewProps.LEFT)) : 0;
            int pixelFromDIP2 = readableMap.hasKey(ViewProps.TOP) ? (int) PixelUtil.toPixelFromDIP(readableMap.getDouble(ViewProps.TOP)) : 0;
            int pixelFromDIP3 = readableMap.hasKey(ViewProps.RIGHT) ? (int) PixelUtil.toPixelFromDIP(readableMap.getDouble(ViewProps.RIGHT)) : 0;
            if (readableMap.hasKey(ViewProps.BOTTOM)) {
                i = (int) PixelUtil.toPixelFromDIP(readableMap.getDouble(ViewProps.BOTTOM));
            }
            svgView.setHitSlopRect(new Rect(pixelFromDIP, pixelFromDIP2, pixelFromDIP3, i));
        }
    }

    @ReactProp(name = "meetOrSlice")
    public void setMeetOrSlice(SvgView svgView, int i) {
        svgView.setMeetOrSlice(i);
    }

    @ReactProp(name = "minX")
    public void setMinX(SvgView svgView, float f) {
        svgView.setMinX(f);
    }

    @ReactProp(name = "minY")
    public void setMinY(SvgView svgView, float f) {
        svgView.setMinY(f);
    }

    public void setNativeBackgroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeBackground(svgView, readableMap);
    }

    public void setNativeForegroundAndroid(SvgView svgView, ReadableMap readableMap) {
        super.setNativeForeground(svgView, readableMap);
    }

    public void setNeedsOffscreenAlphaCompositing(SvgView svgView, boolean z) {
        super.setNeedsOffscreenAlphaCompositing((ReactViewGroup) svgView, z);
    }

    public void setNextFocusDown(SvgView svgView, int i) {
        super.nextFocusDown(svgView, i);
    }

    public void setNextFocusForward(SvgView svgView, int i) {
        super.nextFocusForward(svgView, i);
    }

    public void setNextFocusLeft(SvgView svgView, int i) {
        super.nextFocusLeft(svgView, i);
    }

    public void setNextFocusRight(SvgView svgView, int i) {
        super.nextFocusRight(svgView, i);
    }

    public void setNextFocusUp(SvgView svgView, int i) {
        super.nextFocusUp(svgView, i);
    }

    @ReactProp(name = ViewProps.POINTER_EVENTS)
    public void setPointerEvents(SvgView svgView, String str) {
        try {
            Class<? super Object> superclass = svgView.getClass().getSuperclass();
            if (superclass != null) {
                Method declaredMethod = superclass.getDeclaredMethod("setPointerEvents", PointerEvents.class);
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(svgView, PointerEvents.valueOf(str.toUpperCase(Locale.US).replace("-", "_")));
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    public void setRemoveClippedSubviews(SvgView svgView, boolean z) {
        super.setRemoveClippedSubviews((SvgViewManager) svgView, z);
    }

    @ReactProp(customType = "Color", name = "tintColor")
    public void setTintColor(SvgView svgView, Integer num) {
        svgView.setTintColor(num);
    }

    @ReactProp(name = "vbHeight")
    public void setVbHeight(SvgView svgView, float f) {
        svgView.setVbHeight(f);
    }

    @ReactProp(name = "vbWidth")
    public void setVbWidth(SvgView svgView, float f) {
        svgView.setVbWidth(f);
    }

    @ReactProp(name = "bbHeight")
    public void setBbHeight(SvgView svgView, Dynamic dynamic) {
        svgView.setBbHeight(dynamic);
    }

    @ReactProp(name = "bbWidth")
    public void setBbWidth(SvgView svgView, Dynamic dynamic) {
        svgView.setBbWidth(dynamic);
    }

    public void updateExtraData(ReactViewGroup reactViewGroup, Object obj) {
        super.updateExtraData((SvgViewManager) reactViewGroup, obj);
        reactViewGroup.invalidate();
    }

    public void setBbHeight(SvgView svgView, String str) {
        svgView.setBbHeight(str);
    }

    public void setBbWidth(SvgView svgView, String str) {
        svgView.setBbWidth(str);
    }

    public void setBbHeight(SvgView svgView, Double d) {
        svgView.setBbHeight(d);
    }

    public void setBbWidth(SvgView svgView, Double d) {
        svgView.setBbWidth(d);
    }
}
