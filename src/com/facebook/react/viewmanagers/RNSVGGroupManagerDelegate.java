package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGGroupManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGGroupManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGGroupManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGGroupManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
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
            case -1081239615:
                if (str.equals("matrix")) {
                    c = 1;
                    break;
                }
                break;
            case -993894751:
                if (str.equals("propList")) {
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
            case -891980232:
                if (str.equals("stroke")) {
                    c = 5;
                    break;
                }
                break;
            case -734428249:
                if (str.equals(ViewProps.FONT_WEIGHT)) {
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
            case 3143043:
                if (str.equals("fill")) {
                    c = '\f';
                    break;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
                    c = '\r';
                    break;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    c = 14;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 15;
                    break;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    c = 16;
                    break;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    c = 17;
                    break;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    c = 18;
                    break;
                }
                break;
            case 365601008:
                if (str.equals(ViewProps.FONT_SIZE)) {
                    c = 19;
                    break;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    c = 20;
                    break;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    c = 21;
                    break;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    c = 22;
                    break;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    c = 23;
                    break;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c = 24;
                    break;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    c = 25;
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c = 26;
                    break;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    c = 27;
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
                ((RNSVGGroupManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 2:
                ((RNSVGGroupManagerInterface) this.mViewManager).setPropList(t, (ReadableArray) obj);
                return;
            case 3:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGGroupManagerInterface.setMarkerEnd(t, str2);
                return;
            case 4:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface2 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGGroupManagerInterface2.setMarkerMid(t, str2);
                return;
            case 5:
                ((RNSVGGroupManagerInterface) this.mViewManager).setStroke(t, (ReadableMap) obj);
                return;
            case 6:
                if (obj instanceof String) {
                    ((RNSVGGroupManagerInterface) this.mViewManager).setFontWeight((RNSVGGroupManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGGroupManagerInterface) this.mViewManager).setFontWeight((RNSVGGroupManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGGroupManagerInterface) this.mViewManager).setFontWeight((RNSVGGroupManagerInterface) t, (Double) null);
                    return;
                }
            case 7:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface3 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGGroupManagerInterface3.setFillRule(t, i);
                return;
            case '\b':
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface4 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGGroupManagerInterface4.setStrokeOpacity(t, f2);
                return;
            case '\t':
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface5 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGGroupManagerInterface5.setPointerEvents(t, str2);
                return;
            case '\n':
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface6 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGGroupManagerInterface6.setFillOpacity(t, f2);
                return;
            case 11:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface7 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGGroupManagerInterface7.setStrokeDashoffset(t, f);
                return;
            case '\f':
                ((RNSVGGroupManagerInterface) this.mViewManager).setFill(t, (ReadableMap) obj);
                return;
            case '\r':
                ((RNSVGGroupManagerInterface) this.mViewManager).setFont(t, (ReadableMap) obj);
                return;
            case 14:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface8 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGGroupManagerInterface8.setMask(t, str2);
                return;
            case 15:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface9 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGGroupManagerInterface9.setName(t, str2);
                return;
            case 16:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface10 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGGroupManagerInterface10.setStrokeMiterlimit(t, f);
                return;
            case 17:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface11 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGGroupManagerInterface11.setVectorEffect(t, i2);
                return;
            case 18:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface12 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGGroupManagerInterface12.setMarkerStart(t, str2);
                return;
            case 19:
                if (obj instanceof String) {
                    ((RNSVGGroupManagerInterface) this.mViewManager).setFontSize((RNSVGGroupManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGGroupManagerInterface) this.mViewManager).setFontSize((RNSVGGroupManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGGroupManagerInterface) this.mViewManager).setFontSize((RNSVGGroupManagerInterface) t, (Double) null);
                    return;
                }
            case 20:
                ((RNSVGGroupManagerInterface) this.mViewManager).setStrokeDasharray(t, (ReadableArray) obj);
                return;
            case 21:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface13 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGGroupManagerInterface13.setClipPath(t, str2);
                return;
            case 22:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface14 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGGroupManagerInterface14.setClipRule(t, i5);
                return;
            case 23:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface15 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGGroupManagerInterface15.setStrokeLinecap(t, i4);
                return;
            case 24:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface16 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGGroupManagerInterface16.setDisplay(t, str2);
                return;
            case 25:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface17 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGGroupManagerInterface17.setStrokeLinejoin(t, i3);
                return;
            case 26:
                RNSVGGroupManagerInterface rNSVGGroupManagerInterface18 = (RNSVGGroupManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGGroupManagerInterface18.setResponsible(t, z);
                return;
            case 27:
                if (obj instanceof String) {
                    ((RNSVGGroupManagerInterface) this.mViewManager).setStrokeWidth((RNSVGGroupManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGGroupManagerInterface) this.mViewManager).setStrokeWidth((RNSVGGroupManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGGroupManagerInterface) this.mViewManager).setStrokeWidth((RNSVGGroupManagerInterface) t, NearbyManager.PERMISSION_DENIED);
                    return;
                }
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
