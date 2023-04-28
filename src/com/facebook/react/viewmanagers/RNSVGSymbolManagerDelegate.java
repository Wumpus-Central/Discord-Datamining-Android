package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGSymbolManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGSymbolManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGSymbolManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGSymbolManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
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
            case 3143043:
                if (str.equals("fill")) {
                    c = '\r';
                    break;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    c = 14;
                    break;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    c = 15;
                    break;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    c = 16;
                    break;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
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
            case 92903173:
                if (str.equals("align")) {
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
            case 217109576:
                if (str.equals("markerStart")) {
                    c = 22;
                    break;
                }
                break;
            case 240482938:
                if (str.equals("vbWidth")) {
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
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    c = ' ';
                    break;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    c = '!';
                    break;
                }
                break;
        }
        float f = 1.0f;
        float f2 = 0.0f;
        String str2 = null;
        switch (c) {
            case 0:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGSymbolManagerInterface.setVbHeight(t, f2);
                return;
            case 1:
                U u = this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                u.setOpacity(t, f);
                return;
            case 2:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 3:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setPropList(t, (ReadableArray) obj);
                return;
            case 4:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface2 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSymbolManagerInterface2.setMarkerEnd(t, str2);
                return;
            case 5:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface3 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSymbolManagerInterface3.setMarkerMid(t, str2);
                return;
            case 6:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setStroke(t, (ReadableMap) obj);
                return;
            case 7:
                if (obj instanceof String) {
                    ((RNSVGSymbolManagerInterface) this.mViewManager).setFontWeight((RNSVGSymbolManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGSymbolManagerInterface) this.mViewManager).setFontWeight((RNSVGSymbolManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGSymbolManagerInterface) this.mViewManager).setFontWeight((RNSVGSymbolManagerInterface) t, (Double) null);
                    return;
                }
            case '\b':
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface4 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGSymbolManagerInterface4.setFillRule(t, i);
                return;
            case '\t':
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface5 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGSymbolManagerInterface5.setStrokeOpacity(t, f);
                return;
            case '\n':
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface6 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSymbolManagerInterface6.setPointerEvents(t, str2);
                return;
            case 11:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface7 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGSymbolManagerInterface7.setFillOpacity(t, f);
                return;
            case '\f':
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface8 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGSymbolManagerInterface8.setStrokeDashoffset(t, f2);
                return;
            case '\r':
                ((RNSVGSymbolManagerInterface) this.mViewManager).setFill(t, (ReadableMap) obj);
                return;
            case 14:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setFont(t, (ReadableMap) obj);
                return;
            case 15:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface9 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSymbolManagerInterface9.setMask(t, str2);
                return;
            case 16:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface10 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGSymbolManagerInterface10.setMinX(t, f2);
                return;
            case 17:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface11 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGSymbolManagerInterface11.setMinY(t, f2);
                return;
            case 18:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface12 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSymbolManagerInterface12.setName(t, str2);
                return;
            case 19:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface13 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGSymbolManagerInterface13.setStrokeMiterlimit(t, f2);
                return;
            case 20:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface14 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSymbolManagerInterface14.setAlign(t, str2);
                return;
            case 21:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface15 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGSymbolManagerInterface15.setVectorEffect(t, i2);
                return;
            case 22:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface16 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSymbolManagerInterface16.setMarkerStart(t, str2);
                return;
            case 23:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface17 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGSymbolManagerInterface17.setVbWidth(t, f2);
                return;
            case 24:
                if (obj instanceof String) {
                    ((RNSVGSymbolManagerInterface) this.mViewManager).setFontSize((RNSVGSymbolManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGSymbolManagerInterface) this.mViewManager).setFontSize((RNSVGSymbolManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGSymbolManagerInterface) this.mViewManager).setFontSize((RNSVGSymbolManagerInterface) t, (Double) null);
                    return;
                }
            case 25:
                ((RNSVGSymbolManagerInterface) this.mViewManager).setStrokeDasharray(t, (ReadableArray) obj);
                return;
            case 26:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface18 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSymbolManagerInterface18.setClipPath(t, str2);
                return;
            case 27:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface19 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    i6 = ((Double) obj).intValue();
                }
                rNSVGSymbolManagerInterface19.setClipRule(t, i6);
                return;
            case 28:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface20 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGSymbolManagerInterface20.setStrokeLinecap(t, i5);
                return;
            case 29:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface21 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSymbolManagerInterface21.setDisplay(t, str2);
                return;
            case 30:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface22 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGSymbolManagerInterface22.setStrokeLinejoin(t, i4);
                return;
            case 31:
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface23 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGSymbolManagerInterface23.setResponsible(t, z);
                return;
            case ' ':
                RNSVGSymbolManagerInterface rNSVGSymbolManagerInterface24 = (RNSVGSymbolManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGSymbolManagerInterface24.setMeetOrSlice(t, i3);
                return;
            case '!':
                if (obj instanceof String) {
                    ((RNSVGSymbolManagerInterface) this.mViewManager).setStrokeWidth((RNSVGSymbolManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGSymbolManagerInterface) this.mViewManager).setStrokeWidth((RNSVGSymbolManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGSymbolManagerInterface) this.mViewManager).setStrokeWidth((RNSVGSymbolManagerInterface) t, NearbyManager.PERMISSION_DENIED);
                    return;
                }
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
