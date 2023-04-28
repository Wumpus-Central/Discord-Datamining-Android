package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGLineManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGLineManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGLineManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGLineManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
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
            case -729118945:
                if (str.equals("fillRule")) {
                    c = 6;
                    break;
                }
                break;
            case -416535885:
                if (str.equals("strokeOpacity")) {
                    c = 7;
                    break;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    c = '\b';
                    break;
                }
                break;
            case -53677816:
                if (str.equals("fillOpacity")) {
                    c = '\t';
                    break;
                }
                break;
            case -44578051:
                if (str.equals("strokeDashoffset")) {
                    c = '\n';
                    break;
                }
                break;
            case 3769:
                if (str.equals("x1")) {
                    c = 11;
                    break;
                }
                break;
            case 3770:
                if (str.equals("x2")) {
                    c = '\f';
                    break;
                }
                break;
            case 3800:
                if (str.equals("y1")) {
                    c = '\r';
                    break;
                }
                break;
            case 3801:
                if (str.equals("y2")) {
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
            case 217109576:
                if (str.equals("markerStart")) {
                    c = 20;
                    break;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    c = 21;
                    break;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    c = 22;
                    break;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    c = 23;
                    break;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    c = 24;
                    break;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c = 25;
                    break;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    c = 26;
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c = 27;
                    break;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    c = 28;
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
                ((RNSVGLineManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 2:
                ((RNSVGLineManagerInterface) this.mViewManager).setPropList(t, (ReadableArray) obj);
                return;
            case 3:
                RNSVGLineManagerInterface rNSVGLineManagerInterface = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLineManagerInterface.setMarkerEnd(t, str2);
                return;
            case 4:
                RNSVGLineManagerInterface rNSVGLineManagerInterface2 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLineManagerInterface2.setMarkerMid(t, str2);
                return;
            case 5:
                ((RNSVGLineManagerInterface) this.mViewManager).setStroke(t, (ReadableMap) obj);
                return;
            case 6:
                RNSVGLineManagerInterface rNSVGLineManagerInterface3 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGLineManagerInterface3.setFillRule(t, i);
                return;
            case 7:
                RNSVGLineManagerInterface rNSVGLineManagerInterface4 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGLineManagerInterface4.setStrokeOpacity(t, f2);
                return;
            case '\b':
                RNSVGLineManagerInterface rNSVGLineManagerInterface5 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLineManagerInterface5.setPointerEvents(t, str2);
                return;
            case '\t':
                RNSVGLineManagerInterface rNSVGLineManagerInterface6 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGLineManagerInterface6.setFillOpacity(t, f2);
                return;
            case '\n':
                RNSVGLineManagerInterface rNSVGLineManagerInterface7 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGLineManagerInterface7.setStrokeDashoffset(t, f);
                return;
            case 11:
                if (obj instanceof String) {
                    ((RNSVGLineManagerInterface) this.mViewManager).setX1((RNSVGLineManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGLineManagerInterface) this.mViewManager).setX1((RNSVGLineManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGLineManagerInterface) this.mViewManager).setX1((RNSVGLineManagerInterface) t, (Double) null);
                    return;
                }
            case '\f':
                if (obj instanceof String) {
                    ((RNSVGLineManagerInterface) this.mViewManager).setX2((RNSVGLineManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGLineManagerInterface) this.mViewManager).setX2((RNSVGLineManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGLineManagerInterface) this.mViewManager).setX2((RNSVGLineManagerInterface) t, (Double) null);
                    return;
                }
            case '\r':
                if (obj instanceof String) {
                    ((RNSVGLineManagerInterface) this.mViewManager).setY1((RNSVGLineManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGLineManagerInterface) this.mViewManager).setY1((RNSVGLineManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGLineManagerInterface) this.mViewManager).setY1((RNSVGLineManagerInterface) t, (Double) null);
                    return;
                }
            case 14:
                if (obj instanceof String) {
                    ((RNSVGLineManagerInterface) this.mViewManager).setY2((RNSVGLineManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGLineManagerInterface) this.mViewManager).setY2((RNSVGLineManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGLineManagerInterface) this.mViewManager).setY2((RNSVGLineManagerInterface) t, (Double) null);
                    return;
                }
            case 15:
                ((RNSVGLineManagerInterface) this.mViewManager).setFill(t, (ReadableMap) obj);
                return;
            case 16:
                RNSVGLineManagerInterface rNSVGLineManagerInterface8 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLineManagerInterface8.setMask(t, str2);
                return;
            case 17:
                RNSVGLineManagerInterface rNSVGLineManagerInterface9 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLineManagerInterface9.setName(t, str2);
                return;
            case 18:
                RNSVGLineManagerInterface rNSVGLineManagerInterface10 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGLineManagerInterface10.setStrokeMiterlimit(t, f);
                return;
            case 19:
                RNSVGLineManagerInterface rNSVGLineManagerInterface11 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGLineManagerInterface11.setVectorEffect(t, i2);
                return;
            case 20:
                RNSVGLineManagerInterface rNSVGLineManagerInterface12 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLineManagerInterface12.setMarkerStart(t, str2);
                return;
            case 21:
                ((RNSVGLineManagerInterface) this.mViewManager).setStrokeDasharray(t, (ReadableArray) obj);
                return;
            case 22:
                RNSVGLineManagerInterface rNSVGLineManagerInterface13 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLineManagerInterface13.setClipPath(t, str2);
                return;
            case 23:
                RNSVGLineManagerInterface rNSVGLineManagerInterface14 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGLineManagerInterface14.setClipRule(t, i5);
                return;
            case 24:
                RNSVGLineManagerInterface rNSVGLineManagerInterface15 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGLineManagerInterface15.setStrokeLinecap(t, i4);
                return;
            case 25:
                RNSVGLineManagerInterface rNSVGLineManagerInterface16 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGLineManagerInterface16.setDisplay(t, str2);
                return;
            case 26:
                RNSVGLineManagerInterface rNSVGLineManagerInterface17 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGLineManagerInterface17.setStrokeLinejoin(t, i3);
                return;
            case 27:
                RNSVGLineManagerInterface rNSVGLineManagerInterface18 = (RNSVGLineManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGLineManagerInterface18.setResponsible(t, z);
                return;
            case 28:
                if (obj instanceof String) {
                    ((RNSVGLineManagerInterface) this.mViewManager).setStrokeWidth((RNSVGLineManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGLineManagerInterface) this.mViewManager).setStrokeWidth((RNSVGLineManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGLineManagerInterface) this.mViewManager).setStrokeWidth((RNSVGLineManagerInterface) t, NearbyManager.PERMISSION_DENIED);
                    return;
                }
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
