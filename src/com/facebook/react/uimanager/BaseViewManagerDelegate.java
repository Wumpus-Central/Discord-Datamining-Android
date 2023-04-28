package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.Dynamic;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerInterface;

/* loaded from: classes7.dex */
public abstract class BaseViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T>> implements ViewManagerDelegate<T> {
    protected final U mViewManager;

    public BaseViewManagerDelegate(U u) {
        this.mViewManager = u;
    }

    @Override // com.facebook.react.uimanager.ViewManagerDelegate
    public void receiveCommand(T t, String str, ReadableArray readableArray) {
    }

    @Override // com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        int i = 0;
        int i2 = 0;
        boolean z = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -1721943862:
                if (str.equals(ViewProps.TRANSLATE_X)) {
                    c = 0;
                    break;
                }
                break;
            case -1721943861:
                if (str.equals(ViewProps.TRANSLATE_Y)) {
                    c = 1;
                    break;
                }
                break;
            case -1589741021:
                if (str.equals(ViewProps.SHADOW_COLOR)) {
                    c = 2;
                    break;
                }
                break;
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    c = 3;
                    break;
                }
                break;
            case -1228066334:
                if (str.equals(ViewProps.BORDER_TOP_LEFT_RADIUS)) {
                    c = 4;
                    break;
                }
                break;
            case -908189618:
                if (str.equals(ViewProps.SCALE_X)) {
                    c = 5;
                    break;
                }
                break;
            case -908189617:
                if (str.equals(ViewProps.SCALE_Y)) {
                    c = 6;
                    break;
                }
                break;
            case -877170387:
                if (str.equals(ViewProps.TEST_ID)) {
                    c = 7;
                    break;
                }
                break;
            case -731417480:
                if (str.equals(ViewProps.Z_INDEX)) {
                    c = '\b';
                    break;
                }
                break;
            case -101663499:
                if (str.equals(ViewProps.ACCESSIBILITY_HINT)) {
                    c = '\t';
                    break;
                }
                break;
            case -101359900:
                if (str.equals(ViewProps.ACCESSIBILITY_ROLE)) {
                    c = '\n';
                    break;
                }
                break;
            case -80891667:
                if (str.equals(ViewProps.RENDER_TO_HARDWARE_TEXTURE)) {
                    c = 11;
                    break;
                }
                break;
            case -40300674:
                if (str.equals(ViewProps.ROTATION)) {
                    c = '\f';
                    break;
                }
                break;
            case -4379043:
                if (str.equals(ViewProps.ELEVATION)) {
                    c = '\r';
                    break;
                }
                break;
            case 36255470:
                if (str.equals(ViewProps.ACCESSIBILITY_LIVE_REGION)) {
                    c = 14;
                    break;
                }
                break;
            case 333432965:
                if (str.equals(ViewProps.BORDER_TOP_RIGHT_RADIUS)) {
                    c = 15;
                    break;
                }
                break;
            case 581268560:
                if (str.equals(ViewProps.BORDER_BOTTOM_LEFT_RADIUS)) {
                    c = 16;
                    break;
                }
                break;
            case 588239831:
                if (str.equals(ViewProps.BORDER_BOTTOM_RIGHT_RADIUS)) {
                    c = 17;
                    break;
                }
                break;
            case 746986311:
                if (str.equals(ViewProps.IMPORTANT_FOR_ACCESSIBILITY)) {
                    c = 18;
                    break;
                }
                break;
            case 1052666732:
                if (str.equals(ViewProps.TRANSFORM)) {
                    c = 19;
                    break;
                }
                break;
            case 1146842694:
                if (str.equals(ViewProps.ACCESSIBILITY_LABEL)) {
                    c = 20;
                    break;
                }
                break;
            case 1153872867:
                if (str.equals(ViewProps.ACCESSIBILITY_STATE)) {
                    c = 21;
                    break;
                }
                break;
            case 1287124693:
                if (str.equals(ViewProps.BACKGROUND_COLOR)) {
                    c = 22;
                    break;
                }
                break;
            case 1349188574:
                if (str.equals(ViewProps.BORDER_RADIUS)) {
                    c = 23;
                    break;
                }
                break;
            case 1505602511:
                if (str.equals(ViewProps.ACCESSIBILITY_ACTIONS)) {
                    c = 24;
                    break;
                }
                break;
            case 1761903244:
                if (str.equals(ViewProps.ACCESSIBILITY_COLLECTION)) {
                    c = 25;
                    break;
                }
                break;
            case 1865277756:
                if (str.equals(ViewProps.ACCESSIBILITY_LABELLED_BY)) {
                    c = 26;
                    break;
                }
                break;
            case 1993034687:
                if (str.equals(ViewProps.ACCESSIBILITY_COLLECTION_ITEM)) {
                    c = 27;
                    break;
                }
                break;
            case 2045685618:
                if (str.equals(ViewProps.NATIVE_ID)) {
                    c = 28;
                    break;
                }
                break;
        }
        float f = 1.0f;
        float f2 = 0.0f;
        float f3 = Float.NaN;
        switch (c) {
            case 0:
                U u = this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u.setTranslateX(t, f2);
                return;
            case 1:
                U u2 = this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u2.setTranslateY(t, f2);
                return;
            case 2:
                U u3 = this.mViewManager;
                if (obj != null) {
                    i = ColorPropConverter.getColor(obj, t.getContext()).intValue();
                }
                u3.setShadowColor(t, i);
                return;
            case 3:
                U u4 = this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                u4.setOpacity(t, f);
                return;
            case 4:
                U u5 = this.mViewManager;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u5.setBorderTopLeftRadius(t, f3);
                return;
            case 5:
                U u6 = this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                u6.setScaleX(t, f);
                return;
            case 6:
                U u7 = this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                u7.setScaleY(t, f);
                return;
            case 7:
                this.mViewManager.setTestId(t, (String) obj);
                return;
            case '\b':
                U u8 = this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u8.setZIndex(t, f2);
                return;
            case '\t':
                this.mViewManager.setAccessibilityHint(t, (String) obj);
                return;
            case '\n':
                this.mViewManager.setAccessibilityRole(t, (String) obj);
                return;
            case 11:
                U u9 = this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                u9.setRenderToHardwareTexture(t, z);
                return;
            case '\f':
                U u10 = this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u10.setRotation(t, f2);
                return;
            case '\r':
                U u11 = this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u11.setElevation(t, f2);
                return;
            case 14:
                this.mViewManager.setAccessibilityLiveRegion(t, (String) obj);
                return;
            case 15:
                U u12 = this.mViewManager;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u12.setBorderTopRightRadius(t, f3);
                return;
            case 16:
                U u13 = this.mViewManager;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u13.setBorderBottomLeftRadius(t, f3);
                return;
            case 17:
                U u14 = this.mViewManager;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u14.setBorderBottomRightRadius(t, f3);
                return;
            case 18:
                this.mViewManager.setImportantForAccessibility(t, (String) obj);
                return;
            case 19:
                this.mViewManager.setTransform(t, (ReadableArray) obj);
                return;
            case 20:
                this.mViewManager.setAccessibilityLabel(t, (String) obj);
                return;
            case 21:
                this.mViewManager.setViewState(t, (ReadableMap) obj);
                return;
            case 22:
                U u15 = this.mViewManager;
                if (obj != null) {
                    i2 = ColorPropConverter.getColor(obj, t.getContext()).intValue();
                }
                u15.setBackgroundColor(t, i2);
                return;
            case 23:
                U u16 = this.mViewManager;
                if (obj != null) {
                    f3 = ((Double) obj).floatValue();
                }
                u16.setBorderRadius(t, f3);
                return;
            case 24:
                this.mViewManager.setAccessibilityActions(t, (ReadableArray) obj);
                return;
            case 25:
                this.mViewManager.setAccessibilityCollection(t, (ReadableMap) obj);
                return;
            case 26:
                this.mViewManager.setAccessibilityLabelledBy(t, (Dynamic) obj);
                return;
            case 27:
                this.mViewManager.setAccessibilityCollectionItem(t, (ReadableMap) obj);
                return;
            case 28:
                this.mViewManager.setNativeId(t, (String) obj);
                return;
            default:
                return;
        }
    }
}
