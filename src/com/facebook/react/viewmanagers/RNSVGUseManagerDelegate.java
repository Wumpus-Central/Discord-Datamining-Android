package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGUseManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGUseManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGUseManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGUseManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
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
            case 3143043:
                if (str.equals("fill")) {
                    c = 14;
                    break;
                }
                break;
            case 3211051:
                if (str.equals("href")) {
                    c = 15;
                    break;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    c = 16;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 17;
                    break;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    c = 18;
                    break;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    c = 19;
                    break;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    c = 20;
                    break;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    c = 21;
                    break;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    c = 22;
                    break;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    c = 23;
                    break;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    c = 24;
                    break;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    c = 25;
                    break;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c = 26;
                    break;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    c = 27;
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c = 28;
                    break;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    c = 29;
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
                    ((RNSVGUseManagerInterface) this.mViewManager).setHeight((RNSVGUseManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGUseManagerInterface) this.mViewManager).setHeight((RNSVGUseManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGUseManagerInterface) this.mViewManager).setHeight((RNSVGUseManagerInterface) t, (Double) null);
                    return;
                }
            case 2:
                ((RNSVGUseManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 3:
                ((RNSVGUseManagerInterface) this.mViewManager).setPropList(t, (ReadableArray) obj);
                return;
            case 4:
                RNSVGUseManagerInterface rNSVGUseManagerInterface = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGUseManagerInterface.setMarkerEnd(t, str2);
                return;
            case 5:
                RNSVGUseManagerInterface rNSVGUseManagerInterface2 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGUseManagerInterface2.setMarkerMid(t, str2);
                return;
            case 6:
                ((RNSVGUseManagerInterface) this.mViewManager).setStroke(t, (ReadableMap) obj);
                return;
            case 7:
                RNSVGUseManagerInterface rNSVGUseManagerInterface3 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGUseManagerInterface3.setFillRule(t, i);
                return;
            case '\b':
                RNSVGUseManagerInterface rNSVGUseManagerInterface4 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGUseManagerInterface4.setStrokeOpacity(t, f2);
                return;
            case '\t':
                RNSVGUseManagerInterface rNSVGUseManagerInterface5 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGUseManagerInterface5.setPointerEvents(t, str2);
                return;
            case '\n':
                RNSVGUseManagerInterface rNSVGUseManagerInterface6 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGUseManagerInterface6.setFillOpacity(t, f2);
                return;
            case 11:
                RNSVGUseManagerInterface rNSVGUseManagerInterface7 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGUseManagerInterface7.setStrokeDashoffset(t, f);
                return;
            case '\f':
                if (obj instanceof String) {
                    ((RNSVGUseManagerInterface) this.mViewManager).setX((RNSVGUseManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGUseManagerInterface) this.mViewManager).setX((RNSVGUseManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGUseManagerInterface) this.mViewManager).setX((RNSVGUseManagerInterface) t, (Double) null);
                    return;
                }
            case '\r':
                if (obj instanceof String) {
                    ((RNSVGUseManagerInterface) this.mViewManager).setY((RNSVGUseManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGUseManagerInterface) this.mViewManager).setY((RNSVGUseManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGUseManagerInterface) this.mViewManager).setY((RNSVGUseManagerInterface) t, (Double) null);
                    return;
                }
            case 14:
                ((RNSVGUseManagerInterface) this.mViewManager).setFill(t, (ReadableMap) obj);
                return;
            case 15:
                RNSVGUseManagerInterface rNSVGUseManagerInterface8 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGUseManagerInterface8.setHref(t, str2);
                return;
            case 16:
                RNSVGUseManagerInterface rNSVGUseManagerInterface9 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGUseManagerInterface9.setMask(t, str2);
                return;
            case 17:
                RNSVGUseManagerInterface rNSVGUseManagerInterface10 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGUseManagerInterface10.setName(t, str2);
                return;
            case 18:
                RNSVGUseManagerInterface rNSVGUseManagerInterface11 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGUseManagerInterface11.setStrokeMiterlimit(t, f);
                return;
            case 19:
                RNSVGUseManagerInterface rNSVGUseManagerInterface12 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGUseManagerInterface12.setVectorEffect(t, i2);
                return;
            case 20:
                if (obj instanceof String) {
                    ((RNSVGUseManagerInterface) this.mViewManager).setWidth((RNSVGUseManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGUseManagerInterface) this.mViewManager).setWidth((RNSVGUseManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGUseManagerInterface) this.mViewManager).setWidth((RNSVGUseManagerInterface) t, (Double) null);
                    return;
                }
            case 21:
                RNSVGUseManagerInterface rNSVGUseManagerInterface13 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGUseManagerInterface13.setMarkerStart(t, str2);
                return;
            case 22:
                ((RNSVGUseManagerInterface) this.mViewManager).setStrokeDasharray(t, (ReadableArray) obj);
                return;
            case 23:
                RNSVGUseManagerInterface rNSVGUseManagerInterface14 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGUseManagerInterface14.setClipPath(t, str2);
                return;
            case 24:
                RNSVGUseManagerInterface rNSVGUseManagerInterface15 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGUseManagerInterface15.setClipRule(t, i5);
                return;
            case 25:
                RNSVGUseManagerInterface rNSVGUseManagerInterface16 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGUseManagerInterface16.setStrokeLinecap(t, i4);
                return;
            case 26:
                RNSVGUseManagerInterface rNSVGUseManagerInterface17 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGUseManagerInterface17.setDisplay(t, str2);
                return;
            case 27:
                RNSVGUseManagerInterface rNSVGUseManagerInterface18 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGUseManagerInterface18.setStrokeLinejoin(t, i3);
                return;
            case 28:
                RNSVGUseManagerInterface rNSVGUseManagerInterface19 = (RNSVGUseManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGUseManagerInterface19.setResponsible(t, z);
                return;
            case 29:
                if (obj instanceof String) {
                    ((RNSVGUseManagerInterface) this.mViewManager).setStrokeWidth((RNSVGUseManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGUseManagerInterface) this.mViewManager).setStrokeWidth((RNSVGUseManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGUseManagerInterface) this.mViewManager).setStrokeWidth((RNSVGUseManagerInterface) t, NearbyManager.PERMISSION_DENIED);
                    return;
                }
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
