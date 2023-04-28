package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGForeignObjectManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGForeignObjectManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGForeignObjectManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGForeignObjectManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
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
            case -734428249:
                if (str.equals(ViewProps.FONT_WEIGHT)) {
                    c = 7;
                    break;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    c = '\b';
                    break;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    c = '\t';
                    break;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    c = '\n';
                    break;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    c = 11;
                    break;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    c = '\f';
                    break;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    c = '\r';
                    break;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    c = 14;
                    break;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    c = 15;
                    break;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
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
            case 365601008:
                if (str.equals(ViewProps.FONT_SIZE)) {
                    c = 23;
                    break;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    c = 24;
                    break;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    c = 25;
                    break;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    c = 26;
                    break;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    c = 27;
                    break;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c = 28;
                    break;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    c = 29;
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c = 30;
                    break;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    c = 31;
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
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setHeight((RNSVGForeignObjectManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setHeight((RNSVGForeignObjectManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setHeight((RNSVGForeignObjectManagerInterface) t, (Double) null);
                    return;
                }
            case 2:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 3:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setPropList(t, (ReadableArray) obj);
                return;
            case 4:
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGForeignObjectManagerInterface.setMarkerEnd(t, str2);
                return;
            case 5:
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface2 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGForeignObjectManagerInterface2.setMarkerMid(t, str2);
                return;
            case 6:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setStroke(t, (ReadableMap) obj);
                return;
            case 7:
                if (obj instanceof String) {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFontWeight((RNSVGForeignObjectManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFontWeight((RNSVGForeignObjectManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFontWeight((RNSVGForeignObjectManagerInterface) t, (Double) null);
                    return;
                }
            case '\b':
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface3 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGForeignObjectManagerInterface3.setFillRule(t, i);
                return;
            case '\t':
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface4 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGForeignObjectManagerInterface4.setStrokeOpacity(t, f2);
                return;
            case '\n':
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface5 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGForeignObjectManagerInterface5.setPointerEvents(t, str2);
                return;
            case 11:
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface6 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGForeignObjectManagerInterface6.setFillOpacity(t, f2);
                return;
            case '\f':
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface7 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGForeignObjectManagerInterface7.setStrokeDashoffset(t, f);
                return;
            case '\r':
                if (obj instanceof String) {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setX((RNSVGForeignObjectManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setX((RNSVGForeignObjectManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setX((RNSVGForeignObjectManagerInterface) t, (Double) null);
                    return;
                }
            case 14:
                if (obj instanceof String) {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setY((RNSVGForeignObjectManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setY((RNSVGForeignObjectManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setY((RNSVGForeignObjectManagerInterface) t, (Double) null);
                    return;
                }
            case 15:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFill(t, (ReadableMap) obj);
                return;
            case 16:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFont(t, (ReadableMap) obj);
                return;
            case 17:
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface8 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGForeignObjectManagerInterface8.setMask(t, str2);
                return;
            case 18:
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface9 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGForeignObjectManagerInterface9.setName(t, str2);
                return;
            case 19:
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface10 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGForeignObjectManagerInterface10.setStrokeMiterlimit(t, f);
                return;
            case 20:
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface11 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGForeignObjectManagerInterface11.setVectorEffect(t, i2);
                return;
            case 21:
                if (obj instanceof String) {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setWidth((RNSVGForeignObjectManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setWidth((RNSVGForeignObjectManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setWidth((RNSVGForeignObjectManagerInterface) t, (Double) null);
                    return;
                }
            case 22:
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface12 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGForeignObjectManagerInterface12.setMarkerStart(t, str2);
                return;
            case 23:
                if (obj instanceof String) {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFontSize((RNSVGForeignObjectManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFontSize((RNSVGForeignObjectManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setFontSize((RNSVGForeignObjectManagerInterface) t, (Double) null);
                    return;
                }
            case 24:
                ((RNSVGForeignObjectManagerInterface) this.mViewManager).setStrokeDasharray(t, (ReadableArray) obj);
                return;
            case 25:
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface13 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGForeignObjectManagerInterface13.setClipPath(t, str2);
                return;
            case 26:
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface14 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGForeignObjectManagerInterface14.setClipRule(t, i5);
                return;
            case 27:
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface15 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGForeignObjectManagerInterface15.setStrokeLinecap(t, i4);
                return;
            case 28:
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface16 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGForeignObjectManagerInterface16.setDisplay(t, str2);
                return;
            case 29:
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface17 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGForeignObjectManagerInterface17.setStrokeLinejoin(t, i3);
                return;
            case 30:
                RNSVGForeignObjectManagerInterface rNSVGForeignObjectManagerInterface18 = (RNSVGForeignObjectManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGForeignObjectManagerInterface18.setResponsible(t, z);
                return;
            case 31:
                if (obj instanceof String) {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setStrokeWidth((RNSVGForeignObjectManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setStrokeWidth((RNSVGForeignObjectManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGForeignObjectManagerInterface) this.mViewManager).setStrokeWidth((RNSVGForeignObjectManagerInterface) t, NearbyManager.PERMISSION_DENIED);
                    return;
                }
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
