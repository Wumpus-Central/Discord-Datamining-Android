package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGPatternManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGPatternManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGPatternManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGPatternManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
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
        int i8 = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -1567958285:
                if (str.equals("vbHeight")) {
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
            case -1221029593:
                if (str.equals("height")) {
                    c = 2;
                    break;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    c = 3;
                    break;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    c = 4;
                    break;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    c = 5;
                    break;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    c = 6;
                    break;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    c = 7;
                    break;
                }
                break;
            case -734428249:
                if (str.equals(ViewProps.FONT_WEIGHT)) {
                    c = '\b';
                    break;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    c = '\t';
                    break;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    c = '\n';
                    break;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    c = 11;
                    break;
                }
                break;
            case -207800897:
                if (str.equals("patternUnits")) {
                    c = '\f';
                    break;
                }
                break;
            case -128680410:
                if (str.equals("patternContentUnits")) {
                    c = '\r';
                    break;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    c = 14;
                    break;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    c = 15;
                    break;
                }
                break;
            case 120:
                if (str.equals("x")) {
                    c = 16;
                    break;
                }
                break;
            case 121:
                if (str.equals("y")) {
                    c = 17;
                    break;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    c = 18;
                    break;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    c = 19;
                    break;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    c = 20;
                    break;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    c = 21;
                    break;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
                    c = 22;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 23;
                    break;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    c = 24;
                    break;
                }
                break;
            case 92903173:
                if (str.equals("align")) {
                    c = 25;
                    break;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    c = 26;
                    break;
                }
                break;
            case 113126854:
                if (str.equals("width")) {
                    c = 27;
                    break;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    c = 28;
                    break;
                }
                break;
            case 240482938:
                if (str.equals("vbWidth")) {
                    c = 29;
                    break;
                }
                break;
            case 365601008:
                if (str.equals(ViewProps.FONT_SIZE)) {
                    c = 30;
                    break;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    c = 31;
                    break;
                }
                break;
            case 746561980:
                if (str.equals("patternTransform")) {
                    c = ' ';
                    break;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    c = '!';
                    break;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    c = '\"';
                    break;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    c = '#';
                    break;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c = '$';
                    break;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    c = '%';
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c = '&';
                    break;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    c = '\'';
                    break;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    c = '(';
                    break;
                }
                break;
        }
        float f = 1.0f;
        float f2 = 0.0f;
        String str2 = null;
        switch (c) {
            case 0:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGPatternManagerInterface.setVbHeight(t, f2);
                return;
            case 1:
                U u = this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                u.setOpacity(t, f);
                return;
            case 2:
                if (obj instanceof String) {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setHeight((RNSVGPatternManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setHeight((RNSVGPatternManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setHeight((RNSVGPatternManagerInterface) t, (Double) null);
                    return;
                }
            case 3:
                ((RNSVGPatternManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 4:
                ((RNSVGPatternManagerInterface) this.mViewManager).setPropList(t, (ReadableArray) obj);
                return;
            case 5:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface2 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPatternManagerInterface2.setMarkerEnd(t, str2);
                return;
            case 6:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface3 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPatternManagerInterface3.setMarkerMid(t, str2);
                return;
            case 7:
                ((RNSVGPatternManagerInterface) this.mViewManager).setStroke(t, (ReadableMap) obj);
                return;
            case '\b':
                if (obj instanceof String) {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setFontWeight((RNSVGPatternManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setFontWeight((RNSVGPatternManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setFontWeight((RNSVGPatternManagerInterface) t, (Double) null);
                    return;
                }
            case '\t':
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface4 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGPatternManagerInterface4.setFillRule(t, i);
                return;
            case '\n':
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface5 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGPatternManagerInterface5.setStrokeOpacity(t, f);
                return;
            case 11:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface6 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPatternManagerInterface6.setPointerEvents(t, str2);
                return;
            case '\f':
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface7 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGPatternManagerInterface7.setPatternUnits(t, i2);
                return;
            case '\r':
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface8 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    i8 = ((Double) obj).intValue();
                }
                rNSVGPatternManagerInterface8.setPatternContentUnits(t, i8);
                return;
            case 14:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface9 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGPatternManagerInterface9.setFillOpacity(t, f);
                return;
            case 15:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface10 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGPatternManagerInterface10.setStrokeDashoffset(t, f2);
                return;
            case 16:
                if (obj instanceof String) {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setX((RNSVGPatternManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setX((RNSVGPatternManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setX((RNSVGPatternManagerInterface) t, (Double) null);
                    return;
                }
            case 17:
                if (obj instanceof String) {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setY((RNSVGPatternManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setY((RNSVGPatternManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setY((RNSVGPatternManagerInterface) t, (Double) null);
                    return;
                }
            case 18:
                ((RNSVGPatternManagerInterface) this.mViewManager).setFill(t, (ReadableMap) obj);
                return;
            case 19:
                ((RNSVGPatternManagerInterface) this.mViewManager).setFont(t, (ReadableMap) obj);
                return;
            case 20:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface11 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPatternManagerInterface11.setMask(t, str2);
                return;
            case 21:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface12 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGPatternManagerInterface12.setMinX(t, f2);
                return;
            case 22:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface13 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGPatternManagerInterface13.setMinY(t, f2);
                return;
            case 23:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface14 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPatternManagerInterface14.setName(t, str2);
                return;
            case 24:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface15 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGPatternManagerInterface15.setStrokeMiterlimit(t, f2);
                return;
            case 25:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface16 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPatternManagerInterface16.setAlign(t, str2);
                return;
            case 26:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface17 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    i7 = ((Double) obj).intValue();
                }
                rNSVGPatternManagerInterface17.setVectorEffect(t, i7);
                return;
            case 27:
                if (obj instanceof String) {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setWidth((RNSVGPatternManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setWidth((RNSVGPatternManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setWidth((RNSVGPatternManagerInterface) t, (Double) null);
                    return;
                }
            case 28:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface18 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPatternManagerInterface18.setMarkerStart(t, str2);
                return;
            case 29:
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface19 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGPatternManagerInterface19.setVbWidth(t, f2);
                return;
            case 30:
                if (obj instanceof String) {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setFontSize((RNSVGPatternManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setFontSize((RNSVGPatternManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setFontSize((RNSVGPatternManagerInterface) t, (Double) null);
                    return;
                }
            case 31:
                ((RNSVGPatternManagerInterface) this.mViewManager).setStrokeDasharray(t, (ReadableArray) obj);
                return;
            case ' ':
                ((RNSVGPatternManagerInterface) this.mViewManager).setPatternTransform(t, (ReadableArray) obj);
                return;
            case '!':
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface20 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPatternManagerInterface20.setClipPath(t, str2);
                return;
            case '\"':
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface21 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    i6 = ((Double) obj).intValue();
                }
                rNSVGPatternManagerInterface21.setClipRule(t, i6);
                return;
            case '#':
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface22 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGPatternManagerInterface22.setStrokeLinecap(t, i5);
                return;
            case '$':
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface23 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPatternManagerInterface23.setDisplay(t, str2);
                return;
            case '%':
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface24 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGPatternManagerInterface24.setStrokeLinejoin(t, i4);
                return;
            case '&':
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface25 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGPatternManagerInterface25.setResponsible(t, z);
                return;
            case '\'':
                RNSVGPatternManagerInterface rNSVGPatternManagerInterface26 = (RNSVGPatternManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGPatternManagerInterface26.setMeetOrSlice(t, i3);
                return;
            case '(':
                if (obj instanceof String) {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setStrokeWidth((RNSVGPatternManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setStrokeWidth((RNSVGPatternManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGPatternManagerInterface) this.mViewManager).setStrokeWidth((RNSVGPatternManagerInterface) t, NearbyManager.PERMISSION_DENIED);
                    return;
                }
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
