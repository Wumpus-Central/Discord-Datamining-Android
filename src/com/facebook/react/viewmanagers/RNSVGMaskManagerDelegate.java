package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGMaskManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGMaskManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGMaskManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGMaskManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        int i = 1;
        int i2 = 0;
        int i3 = 0;
        boolean z = false;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
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
            case -61221917:
                if (str.equals("maskUnits")) {
                    c = 11;
                    break;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    c = '\f';
                    break;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    c = '\r';
                    break;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    c = 14;
                    break;
                }
                break;
            case 121:
                if (str.equals("y")) {
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
            case 3148879:
                if (str.equals("font")) {
                    c = 17;
                    break;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    c = 18;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 19;
                    break;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    c = 20;
                    break;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    c = 21;
                    break;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    c = 22;
                    break;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    c = 23;
                    break;
                }
                break;
            case 365601008:
                if (str.equals(ViewProps.FONT_SIZE)) {
                    c = 24;
                    break;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    c = 25;
                    break;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    c = 26;
                    break;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    c = 27;
                    break;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    c = 28;
                    break;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c = 29;
                    break;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    c = 30;
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c = 31;
                    break;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    c = ' ';
                    break;
                }
                break;
            case 2037673858:
                if (str.equals("maskContentUnits")) {
                    c = '!';
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
                    ((RNSVGMaskManagerInterface) this.mViewManager).setHeight((RNSVGMaskManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setHeight((RNSVGMaskManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setHeight((RNSVGMaskManagerInterface) t, (Double) null);
                    return;
                }
            case 2:
                ((RNSVGMaskManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 3:
                ((RNSVGMaskManagerInterface) this.mViewManager).setPropList(t, (ReadableArray) obj);
                return;
            case 4:
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMaskManagerInterface.setMarkerEnd(t, str2);
                return;
            case 5:
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface2 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMaskManagerInterface2.setMarkerMid(t, str2);
                return;
            case 6:
                ((RNSVGMaskManagerInterface) this.mViewManager).setStroke(t, (ReadableMap) obj);
                return;
            case 7:
                if (obj instanceof String) {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setFontWeight((RNSVGMaskManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setFontWeight((RNSVGMaskManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setFontWeight((RNSVGMaskManagerInterface) t, (Double) null);
                    return;
                }
            case '\b':
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface3 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGMaskManagerInterface3.setFillRule(t, i);
                return;
            case '\t':
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface4 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGMaskManagerInterface4.setStrokeOpacity(t, f2);
                return;
            case '\n':
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface5 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMaskManagerInterface5.setPointerEvents(t, str2);
                return;
            case 11:
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface6 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGMaskManagerInterface6.setMaskUnits(t, i2);
                return;
            case '\f':
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface7 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGMaskManagerInterface7.setFillOpacity(t, f2);
                return;
            case '\r':
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface8 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGMaskManagerInterface8.setStrokeDashoffset(t, f);
                return;
            case 14:
                if (obj instanceof String) {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setX((RNSVGMaskManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setX((RNSVGMaskManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setX((RNSVGMaskManagerInterface) t, (Double) null);
                    return;
                }
            case 15:
                if (obj instanceof String) {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setY((RNSVGMaskManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setY((RNSVGMaskManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setY((RNSVGMaskManagerInterface) t, (Double) null);
                    return;
                }
            case 16:
                ((RNSVGMaskManagerInterface) this.mViewManager).setFill(t, (ReadableMap) obj);
                return;
            case 17:
                ((RNSVGMaskManagerInterface) this.mViewManager).setFont(t, (ReadableMap) obj);
                return;
            case 18:
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface9 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMaskManagerInterface9.setMask(t, str2);
                return;
            case 19:
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface10 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMaskManagerInterface10.setName(t, str2);
                return;
            case 20:
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface11 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGMaskManagerInterface11.setStrokeMiterlimit(t, f);
                return;
            case 21:
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface12 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    i7 = ((Double) obj).intValue();
                }
                rNSVGMaskManagerInterface12.setVectorEffect(t, i7);
                return;
            case 22:
                if (obj instanceof String) {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setWidth((RNSVGMaskManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setWidth((RNSVGMaskManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setWidth((RNSVGMaskManagerInterface) t, (Double) null);
                    return;
                }
            case 23:
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface13 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMaskManagerInterface13.setMarkerStart(t, str2);
                return;
            case 24:
                if (obj instanceof String) {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setFontSize((RNSVGMaskManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setFontSize((RNSVGMaskManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setFontSize((RNSVGMaskManagerInterface) t, (Double) null);
                    return;
                }
            case 25:
                ((RNSVGMaskManagerInterface) this.mViewManager).setStrokeDasharray(t, (ReadableArray) obj);
                return;
            case 26:
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface14 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMaskManagerInterface14.setClipPath(t, str2);
                return;
            case 27:
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface15 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    i6 = ((Double) obj).intValue();
                }
                rNSVGMaskManagerInterface15.setClipRule(t, i6);
                return;
            case 28:
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface16 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGMaskManagerInterface16.setStrokeLinecap(t, i5);
                return;
            case 29:
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface17 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMaskManagerInterface17.setDisplay(t, str2);
                return;
            case 30:
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface18 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGMaskManagerInterface18.setStrokeLinejoin(t, i4);
                return;
            case 31:
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface19 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGMaskManagerInterface19.setResponsible(t, z);
                return;
            case ' ':
                if (obj instanceof String) {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setStrokeWidth((RNSVGMaskManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setStrokeWidth((RNSVGMaskManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGMaskManagerInterface) this.mViewManager).setStrokeWidth((RNSVGMaskManagerInterface) t, NearbyManager.PERMISSION_DENIED);
                    return;
                }
            case '!':
                RNSVGMaskManagerInterface rNSVGMaskManagerInterface20 = (RNSVGMaskManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGMaskManagerInterface20.setMaskContentUnits(t, i3);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
