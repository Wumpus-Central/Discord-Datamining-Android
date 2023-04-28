package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGRadialGradientManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGRadialGradientManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGRadialGradientManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGRadialGradientManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        float f;
        str.hashCode();
        int i = 0;
        boolean z = false;
        int i2 = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -1932235233:
                if (str.equals("gradientUnits")) {
                    c = 0;
                    break;
                }
                break;
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    c = 1;
                    break;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    c = 2;
                    break;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    c = 3;
                    break;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    c = 4;
                    break;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    c = 5;
                    break;
                }
                break;
            case 3189:
                if (str.equals("cx")) {
                    c = 6;
                    break;
                }
                break;
            case 3190:
                if (str.equals("cy")) {
                    c = 7;
                    break;
                }
                break;
            case 3282:
                if (str.equals("fx")) {
                    c = '\b';
                    break;
                }
                break;
            case 3283:
                if (str.equals("fy")) {
                    c = '\t';
                    break;
                }
                break;
            case 3654:
                if (str.equals("rx")) {
                    c = '\n';
                    break;
                }
                break;
            case 3655:
                if (str.equals("ry")) {
                    c = 11;
                    break;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    c = '\f';
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = '\r';
                    break;
                }
                break;
            case 89650992:
                if (str.equals("gradient")) {
                    c = 14;
                    break;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    c = 15;
                    break;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    c = 16;
                    break;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    c = 17;
                    break;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c = 18;
                    break;
                }
                break;
            case 1822665244:
                if (str.equals("gradientTransform")) {
                    c = 19;
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c = 20;
                    break;
                }
                break;
        }
        String str2 = null;
        switch (c) {
            case 0:
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGRadialGradientManagerInterface.setGradientUnits(t, i);
                return;
            case 1:
                U u = this.mViewManager;
                if (obj == null) {
                    f = 1.0f;
                } else {
                    f = ((Double) obj).floatValue();
                }
                u.setOpacity(t, f);
                return;
            case 2:
                ((RNSVGRadialGradientManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 3:
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface2 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface2.setMarkerEnd(t, str2);
                return;
            case 4:
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface3 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface3.setMarkerMid(t, str2);
                return;
            case 5:
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface4 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface4.setPointerEvents(t, str2);
                return;
            case 6:
                if (obj instanceof String) {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setCx((RNSVGRadialGradientManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setCx((RNSVGRadialGradientManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setCx((RNSVGRadialGradientManagerInterface) t, (Double) null);
                    return;
                }
            case 7:
                if (obj instanceof String) {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setCy((RNSVGRadialGradientManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setCy((RNSVGRadialGradientManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setCy((RNSVGRadialGradientManagerInterface) t, (Double) null);
                    return;
                }
            case '\b':
                if (obj instanceof String) {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setFx((RNSVGRadialGradientManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setFx((RNSVGRadialGradientManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setFx((RNSVGRadialGradientManagerInterface) t, (Double) null);
                    return;
                }
            case '\t':
                if (obj instanceof String) {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setFy((RNSVGRadialGradientManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setFy((RNSVGRadialGradientManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setFy((RNSVGRadialGradientManagerInterface) t, (Double) null);
                    return;
                }
            case '\n':
                if (obj instanceof String) {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setRx((RNSVGRadialGradientManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setRx((RNSVGRadialGradientManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setRx((RNSVGRadialGradientManagerInterface) t, (Double) null);
                    return;
                }
            case 11:
                if (obj instanceof String) {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setRy((RNSVGRadialGradientManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setRy((RNSVGRadialGradientManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGRadialGradientManagerInterface) this.mViewManager).setRy((RNSVGRadialGradientManagerInterface) t, (Double) null);
                    return;
                }
            case '\f':
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface5 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface5.setMask(t, str2);
                return;
            case '\r':
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface6 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface6.setName(t, str2);
                return;
            case 14:
                ((RNSVGRadialGradientManagerInterface) this.mViewManager).setGradient(t, (ReadableArray) obj);
                return;
            case 15:
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface7 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface7.setMarkerStart(t, str2);
                return;
            case 16:
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface8 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface8.setClipPath(t, str2);
                return;
            case 17:
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface9 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGRadialGradientManagerInterface9.setClipRule(t, i2);
                return;
            case 18:
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface10 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRadialGradientManagerInterface10.setDisplay(t, str2);
                return;
            case 19:
                ((RNSVGRadialGradientManagerInterface) this.mViewManager).setGradientTransform(t, (ReadableArray) obj);
                return;
            case 20:
                RNSVGRadialGradientManagerInterface rNSVGRadialGradientManagerInterface11 = (RNSVGRadialGradientManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGRadialGradientManagerInterface11.setResponsible(t, z);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
