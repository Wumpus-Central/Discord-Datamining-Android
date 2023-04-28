package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGRectManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGRectManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGRectManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGRectManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        int i = 1;
        int i2 = 0;
        boolean z = false;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -1267206133:
                if (str.equals(ViewProps.OPACITY)) {
                    c = 0;
                    break;
                }
                break;
            case -1221029593:
                if (str.equals("height")) {
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
            case -993894751:
                if (str.equals("propList")) {
                    c = 3;
                    break;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    c = 4;
                    break;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    c = 5;
                    break;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    c = 6;
                    break;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    c = 7;
                    break;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    c = '\b';
                    break;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    c = '\t';
                    break;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    c = '\n';
                    break;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    c = 11;
                    break;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    c = '\f';
                    break;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    c = '\r';
                    break;
                }
                break;
            case 3654:
                if (str.equals("rx")) {
                    c = 14;
                    break;
                }
                break;
            case 3655:
                if (str.equals("ry")) {
                    c = 15;
                    break;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    c = 16;
                    break;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    c = 17;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 18;
                    break;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    c = 19;
                    break;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    c = 20;
                    break;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    c = 21;
                    break;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    c = 22;
                    break;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    c = 23;
                    break;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    c = 24;
                    break;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    c = 25;
                    break;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    c = 26;
                    break;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c = 27;
                    break;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    c = 28;
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c = 29;
                    break;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    c = 30;
                    break;
                }
                break;
        }
        float f = 0.0f;
        float f2 = 1.0f;
        String str2 = null;
        switch (c) {
            case 0:
                U u = this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u.setOpacity(t, f2);
                return;
            case 1:
                if (obj instanceof String) {
                    ((RNSVGRectManagerInterface) this.mViewManager).setHeight((RNSVGRectManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGRectManagerInterface) this.mViewManager).setHeight((RNSVGRectManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGRectManagerInterface) this.mViewManager).setHeight((RNSVGRectManagerInterface) t, (Double) null);
                    return;
                }
            case 2:
                ((RNSVGRectManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 3:
                ((RNSVGRectManagerInterface) this.mViewManager).setPropList(t, (ReadableArray) obj);
                return;
            case 4:
                RNSVGRectManagerInterface rNSVGRectManagerInterface = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRectManagerInterface.setMarkerEnd(t, str2);
                return;
            case 5:
                RNSVGRectManagerInterface rNSVGRectManagerInterface2 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRectManagerInterface2.setMarkerMid(t, str2);
                return;
            case 6:
                ((RNSVGRectManagerInterface) this.mViewManager).setStroke(t, (ReadableMap) obj);
                return;
            case 7:
                RNSVGRectManagerInterface rNSVGRectManagerInterface3 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGRectManagerInterface3.setFillRule(t, i);
                return;
            case '\b':
                RNSVGRectManagerInterface rNSVGRectManagerInterface4 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGRectManagerInterface4.setStrokeOpacity(t, f2);
                return;
            case '\t':
                RNSVGRectManagerInterface rNSVGRectManagerInterface5 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRectManagerInterface5.setPointerEvents(t, str2);
                return;
            case '\n':
                RNSVGRectManagerInterface rNSVGRectManagerInterface6 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGRectManagerInterface6.setFillOpacity(t, f2);
                return;
            case 11:
                RNSVGRectManagerInterface rNSVGRectManagerInterface7 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGRectManagerInterface7.setStrokeDashoffset(t, f);
                return;
            case '\f':
                if (obj instanceof String) {
                    ((RNSVGRectManagerInterface) this.mViewManager).setX((RNSVGRectManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGRectManagerInterface) this.mViewManager).setX((RNSVGRectManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGRectManagerInterface) this.mViewManager).setX((RNSVGRectManagerInterface) t, (Double) null);
                    return;
                }
            case '\r':
                if (obj instanceof String) {
                    ((RNSVGRectManagerInterface) this.mViewManager).setY((RNSVGRectManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGRectManagerInterface) this.mViewManager).setY((RNSVGRectManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGRectManagerInterface) this.mViewManager).setY((RNSVGRectManagerInterface) t, (Double) null);
                    return;
                }
            case 14:
                if (obj instanceof String) {
                    ((RNSVGRectManagerInterface) this.mViewManager).setRx((RNSVGRectManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGRectManagerInterface) this.mViewManager).setRx((RNSVGRectManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGRectManagerInterface) this.mViewManager).setRx((RNSVGRectManagerInterface) t, (Double) null);
                    return;
                }
            case 15:
                if (obj instanceof String) {
                    ((RNSVGRectManagerInterface) this.mViewManager).setRy((RNSVGRectManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGRectManagerInterface) this.mViewManager).setRy((RNSVGRectManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGRectManagerInterface) this.mViewManager).setRy((RNSVGRectManagerInterface) t, (Double) null);
                    return;
                }
            case 16:
                ((RNSVGRectManagerInterface) this.mViewManager).setFill(t, (ReadableMap) obj);
                return;
            case 17:
                RNSVGRectManagerInterface rNSVGRectManagerInterface8 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRectManagerInterface8.setMask(t, str2);
                return;
            case 18:
                RNSVGRectManagerInterface rNSVGRectManagerInterface9 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRectManagerInterface9.setName(t, str2);
                return;
            case 19:
                RNSVGRectManagerInterface rNSVGRectManagerInterface10 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGRectManagerInterface10.setStrokeMiterlimit(t, f);
                return;
            case 20:
                RNSVGRectManagerInterface rNSVGRectManagerInterface11 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGRectManagerInterface11.setVectorEffect(t, i2);
                return;
            case 21:
                if (obj instanceof String) {
                    ((RNSVGRectManagerInterface) this.mViewManager).setWidth((RNSVGRectManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGRectManagerInterface) this.mViewManager).setWidth((RNSVGRectManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGRectManagerInterface) this.mViewManager).setWidth((RNSVGRectManagerInterface) t, (Double) null);
                    return;
                }
            case 22:
                RNSVGRectManagerInterface rNSVGRectManagerInterface12 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRectManagerInterface12.setMarkerStart(t, str2);
                return;
            case 23:
                ((RNSVGRectManagerInterface) this.mViewManager).setStrokeDasharray(t, (ReadableArray) obj);
                return;
            case 24:
                RNSVGRectManagerInterface rNSVGRectManagerInterface13 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRectManagerInterface13.setClipPath(t, str2);
                return;
            case 25:
                RNSVGRectManagerInterface rNSVGRectManagerInterface14 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGRectManagerInterface14.setClipRule(t, i5);
                return;
            case 26:
                RNSVGRectManagerInterface rNSVGRectManagerInterface15 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGRectManagerInterface15.setStrokeLinecap(t, i4);
                return;
            case 27:
                RNSVGRectManagerInterface rNSVGRectManagerInterface16 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGRectManagerInterface16.setDisplay(t, str2);
                return;
            case 28:
                RNSVGRectManagerInterface rNSVGRectManagerInterface17 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGRectManagerInterface17.setStrokeLinejoin(t, i3);
                return;
            case 29:
                RNSVGRectManagerInterface rNSVGRectManagerInterface18 = (RNSVGRectManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGRectManagerInterface18.setResponsible(t, z);
                return;
            case 30:
                if (obj instanceof String) {
                    ((RNSVGRectManagerInterface) this.mViewManager).setStrokeWidth((RNSVGRectManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGRectManagerInterface) this.mViewManager).setStrokeWidth((RNSVGRectManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGRectManagerInterface) this.mViewManager).setStrokeWidth((RNSVGRectManagerInterface) t, NearbyManager.PERMISSION_DENIED);
                    return;
                }
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
