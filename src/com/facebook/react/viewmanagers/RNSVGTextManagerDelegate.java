package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGTextManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGTextManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGTextManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGTextManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
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
            case -1603134955:
                if (str.equals("lengthAdjust")) {
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
            case -1171891896:
                if (str.equals("alignmentBaseline")) {
                    c = 2;
                    break;
                }
                break;
            case -1139902161:
                if (str.equals("verticalAlign")) {
                    c = 3;
                    break;
                }
                break;
            case -1081239615:
                if (str.equals("matrix")) {
                    c = 4;
                    break;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
                    c = 5;
                    break;
                }
                break;
            case -933864895:
                if (str.equals("markerEnd")) {
                    c = 6;
                    break;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    c = 7;
                    break;
                }
                break;
            case -925180581:
                if (str.equals("rotate")) {
                    c = '\b';
                    break;
                }
                break;
            case -891980232:
                if (str.equals("stroke")) {
                    c = '\t';
                    break;
                }
                break;
            case -734428249:
                if (str.equals(ViewProps.FONT_WEIGHT)) {
                    c = '\n';
                    break;
                }
                break;
            case -729118945:
                if (str.equals("fillRule")) {
                    c = 11;
                    break;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    c = '\f';
                    break;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
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
            case 3220:
                if (str.equals("dx")) {
                    c = 18;
                    break;
                }
                break;
            case 3221:
                if (str.equals("dy")) {
                    c = 19;
                    break;
                }
                break;
            case 3143043:
                if (str.equals("fill")) {
                    c = 20;
                    break;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    c = 21;
                    break;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
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
            case 104482996:
                if (str.equals("vectorEffect")) {
                    c = 25;
                    break;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    c = 26;
                    break;
                }
                break;
            case 275888445:
                if (str.equals("baselineShift")) {
                    c = 27;
                    break;
                }
                break;
            case 365601008:
                if (str.equals(ViewProps.FONT_SIZE)) {
                    c = 28;
                    break;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    c = 29;
                    break;
                }
                break;
            case 778043962:
                if (str.equals("inlineSize")) {
                    c = 30;
                    break;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    c = 31;
                    break;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    c = ' ';
                    break;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    c = '!';
                    break;
                }
                break;
            case 1637488243:
                if (str.equals("textLength")) {
                    c = '\"';
                    break;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c = '#';
                    break;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    c = '$';
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c = '%';
                    break;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    c = '&';
                    break;
                }
                break;
        }
        float f = 0.0f;
        float f2 = 1.0f;
        String str2 = null;
        switch (c) {
            case 0:
                RNSVGTextManagerInterface rNSVGTextManagerInterface = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGTextManagerInterface.setLengthAdjust(t, str2);
                return;
            case 1:
                U u = this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                u.setOpacity(t, f2);
                return;
            case 2:
                RNSVGTextManagerInterface rNSVGTextManagerInterface2 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGTextManagerInterface2.setAlignmentBaseline(t, str2);
                return;
            case 3:
                RNSVGTextManagerInterface rNSVGTextManagerInterface3 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGTextManagerInterface3.setVerticalAlign(t, str2);
                return;
            case 4:
                ((RNSVGTextManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 5:
                ((RNSVGTextManagerInterface) this.mViewManager).setPropList(t, (ReadableArray) obj);
                return;
            case 6:
                RNSVGTextManagerInterface rNSVGTextManagerInterface4 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGTextManagerInterface4.setMarkerEnd(t, str2);
                return;
            case 7:
                RNSVGTextManagerInterface rNSVGTextManagerInterface5 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGTextManagerInterface5.setMarkerMid(t, str2);
                return;
            case '\b':
                ((RNSVGTextManagerInterface) this.mViewManager).setRotate(t, (ReadableArray) obj);
                return;
            case '\t':
                ((RNSVGTextManagerInterface) this.mViewManager).setStroke(t, (ReadableMap) obj);
                return;
            case '\n':
                if (obj instanceof String) {
                    ((RNSVGTextManagerInterface) this.mViewManager).setFontWeight((RNSVGTextManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGTextManagerInterface) this.mViewManager).setFontWeight((RNSVGTextManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGTextManagerInterface) this.mViewManager).setFontWeight((RNSVGTextManagerInterface) t, (Double) null);
                    return;
                }
            case 11:
                RNSVGTextManagerInterface rNSVGTextManagerInterface6 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGTextManagerInterface6.setFillRule(t, i);
                return;
            case '\f':
                RNSVGTextManagerInterface rNSVGTextManagerInterface7 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGTextManagerInterface7.setStrokeOpacity(t, f2);
                return;
            case '\r':
                RNSVGTextManagerInterface rNSVGTextManagerInterface8 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGTextManagerInterface8.setPointerEvents(t, str2);
                return;
            case 14:
                RNSVGTextManagerInterface rNSVGTextManagerInterface9 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGTextManagerInterface9.setFillOpacity(t, f2);
                return;
            case 15:
                RNSVGTextManagerInterface rNSVGTextManagerInterface10 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGTextManagerInterface10.setStrokeDashoffset(t, f);
                return;
            case 16:
                ((RNSVGTextManagerInterface) this.mViewManager).setX(t, (ReadableArray) obj);
                return;
            case 17:
                ((RNSVGTextManagerInterface) this.mViewManager).setY(t, (ReadableArray) obj);
                return;
            case 18:
                ((RNSVGTextManagerInterface) this.mViewManager).setDx(t, (ReadableArray) obj);
                return;
            case 19:
                ((RNSVGTextManagerInterface) this.mViewManager).setDy(t, (ReadableArray) obj);
                return;
            case 20:
                ((RNSVGTextManagerInterface) this.mViewManager).setFill(t, (ReadableMap) obj);
                return;
            case 21:
                ((RNSVGTextManagerInterface) this.mViewManager).setFont(t, (ReadableMap) obj);
                return;
            case 22:
                RNSVGTextManagerInterface rNSVGTextManagerInterface11 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGTextManagerInterface11.setMask(t, str2);
                return;
            case 23:
                RNSVGTextManagerInterface rNSVGTextManagerInterface12 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGTextManagerInterface12.setName(t, str2);
                return;
            case 24:
                RNSVGTextManagerInterface rNSVGTextManagerInterface13 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGTextManagerInterface13.setStrokeMiterlimit(t, f);
                return;
            case 25:
                RNSVGTextManagerInterface rNSVGTextManagerInterface14 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGTextManagerInterface14.setVectorEffect(t, i2);
                return;
            case 26:
                RNSVGTextManagerInterface rNSVGTextManagerInterface15 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGTextManagerInterface15.setMarkerStart(t, str2);
                return;
            case 27:
                if (obj instanceof String) {
                    ((RNSVGTextManagerInterface) this.mViewManager).setBaselineShift((RNSVGTextManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGTextManagerInterface) this.mViewManager).setBaselineShift((RNSVGTextManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGTextManagerInterface) this.mViewManager).setBaselineShift((RNSVGTextManagerInterface) t, (Double) null);
                    return;
                }
            case 28:
                if (obj instanceof String) {
                    ((RNSVGTextManagerInterface) this.mViewManager).setFontSize((RNSVGTextManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGTextManagerInterface) this.mViewManager).setFontSize((RNSVGTextManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGTextManagerInterface) this.mViewManager).setFontSize((RNSVGTextManagerInterface) t, (Double) null);
                    return;
                }
            case 29:
                ((RNSVGTextManagerInterface) this.mViewManager).setStrokeDasharray(t, (ReadableArray) obj);
                return;
            case 30:
                if (obj instanceof String) {
                    ((RNSVGTextManagerInterface) this.mViewManager).setInlineSize((RNSVGTextManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGTextManagerInterface) this.mViewManager).setInlineSize((RNSVGTextManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGTextManagerInterface) this.mViewManager).setInlineSize((RNSVGTextManagerInterface) t, (Double) null);
                    return;
                }
            case 31:
                RNSVGTextManagerInterface rNSVGTextManagerInterface16 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGTextManagerInterface16.setClipPath(t, str2);
                return;
            case ' ':
                RNSVGTextManagerInterface rNSVGTextManagerInterface17 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGTextManagerInterface17.setClipRule(t, i5);
                return;
            case '!':
                RNSVGTextManagerInterface rNSVGTextManagerInterface18 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGTextManagerInterface18.setStrokeLinecap(t, i4);
                return;
            case '\"':
                if (obj instanceof String) {
                    ((RNSVGTextManagerInterface) this.mViewManager).setTextLength((RNSVGTextManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGTextManagerInterface) this.mViewManager).setTextLength((RNSVGTextManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGTextManagerInterface) this.mViewManager).setTextLength((RNSVGTextManagerInterface) t, (Double) null);
                    return;
                }
            case '#':
                RNSVGTextManagerInterface rNSVGTextManagerInterface19 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGTextManagerInterface19.setDisplay(t, str2);
                return;
            case '$':
                RNSVGTextManagerInterface rNSVGTextManagerInterface20 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGTextManagerInterface20.setStrokeLinejoin(t, i3);
                return;
            case '%':
                RNSVGTextManagerInterface rNSVGTextManagerInterface21 = (RNSVGTextManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGTextManagerInterface21.setResponsible(t, z);
                return;
            case '&':
                if (obj instanceof String) {
                    ((RNSVGTextManagerInterface) this.mViewManager).setStrokeWidth((RNSVGTextManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGTextManagerInterface) this.mViewManager).setStrokeWidth((RNSVGTextManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGTextManagerInterface) this.mViewManager).setStrokeWidth((RNSVGTextManagerInterface) t, NearbyManager.PERMISSION_DENIED);
                    return;
                }
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
