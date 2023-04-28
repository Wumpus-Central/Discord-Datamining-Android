package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGImageManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGImageManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGImageManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGImageManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
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
            case 114148:
                if (str.equals("src")) {
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
            case 92903173:
                if (str.equals("align")) {
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
            case 1908075304:
                if (str.equals("meetOrSlice")) {
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
                    ((RNSVGImageManagerInterface) this.mViewManager).setHeight((RNSVGImageManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGImageManagerInterface) this.mViewManager).setHeight((RNSVGImageManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGImageManagerInterface) this.mViewManager).setHeight((RNSVGImageManagerInterface) t, (Double) null);
                    return;
                }
            case 2:
                ((RNSVGImageManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 3:
                ((RNSVGImageManagerInterface) this.mViewManager).setPropList(t, (ReadableArray) obj);
                return;
            case 4:
                RNSVGImageManagerInterface rNSVGImageManagerInterface = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGImageManagerInterface.setMarkerEnd(t, str2);
                return;
            case 5:
                RNSVGImageManagerInterface rNSVGImageManagerInterface2 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGImageManagerInterface2.setMarkerMid(t, str2);
                return;
            case 6:
                ((RNSVGImageManagerInterface) this.mViewManager).setStroke(t, (ReadableMap) obj);
                return;
            case 7:
                RNSVGImageManagerInterface rNSVGImageManagerInterface3 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGImageManagerInterface3.setFillRule(t, i);
                return;
            case '\b':
                RNSVGImageManagerInterface rNSVGImageManagerInterface4 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGImageManagerInterface4.setStrokeOpacity(t, f2);
                return;
            case '\t':
                RNSVGImageManagerInterface rNSVGImageManagerInterface5 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGImageManagerInterface5.setPointerEvents(t, str2);
                return;
            case '\n':
                RNSVGImageManagerInterface rNSVGImageManagerInterface6 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGImageManagerInterface6.setFillOpacity(t, f2);
                return;
            case 11:
                RNSVGImageManagerInterface rNSVGImageManagerInterface7 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGImageManagerInterface7.setStrokeDashoffset(t, f);
                return;
            case '\f':
                if (obj instanceof String) {
                    ((RNSVGImageManagerInterface) this.mViewManager).setX((RNSVGImageManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGImageManagerInterface) this.mViewManager).setX((RNSVGImageManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGImageManagerInterface) this.mViewManager).setX((RNSVGImageManagerInterface) t, (Double) null);
                    return;
                }
            case '\r':
                if (obj instanceof String) {
                    ((RNSVGImageManagerInterface) this.mViewManager).setY((RNSVGImageManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGImageManagerInterface) this.mViewManager).setY((RNSVGImageManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGImageManagerInterface) this.mViewManager).setY((RNSVGImageManagerInterface) t, (Double) null);
                    return;
                }
            case 14:
                ((RNSVGImageManagerInterface) this.mViewManager).setSrc(t, (ReadableMap) obj);
                return;
            case 15:
                ((RNSVGImageManagerInterface) this.mViewManager).setFill(t, (ReadableMap) obj);
                return;
            case 16:
                RNSVGImageManagerInterface rNSVGImageManagerInterface8 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGImageManagerInterface8.setMask(t, str2);
                return;
            case 17:
                RNSVGImageManagerInterface rNSVGImageManagerInterface9 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGImageManagerInterface9.setName(t, str2);
                return;
            case 18:
                RNSVGImageManagerInterface rNSVGImageManagerInterface10 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGImageManagerInterface10.setStrokeMiterlimit(t, f);
                return;
            case 19:
                RNSVGImageManagerInterface rNSVGImageManagerInterface11 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGImageManagerInterface11.setAlign(t, str2);
                return;
            case 20:
                RNSVGImageManagerInterface rNSVGImageManagerInterface12 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGImageManagerInterface12.setVectorEffect(t, i2);
                return;
            case 21:
                if (obj instanceof String) {
                    ((RNSVGImageManagerInterface) this.mViewManager).setWidth((RNSVGImageManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGImageManagerInterface) this.mViewManager).setWidth((RNSVGImageManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGImageManagerInterface) this.mViewManager).setWidth((RNSVGImageManagerInterface) t, (Double) null);
                    return;
                }
            case 22:
                RNSVGImageManagerInterface rNSVGImageManagerInterface13 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGImageManagerInterface13.setMarkerStart(t, str2);
                return;
            case 23:
                ((RNSVGImageManagerInterface) this.mViewManager).setStrokeDasharray(t, (ReadableArray) obj);
                return;
            case 24:
                RNSVGImageManagerInterface rNSVGImageManagerInterface14 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGImageManagerInterface14.setClipPath(t, str2);
                return;
            case 25:
                RNSVGImageManagerInterface rNSVGImageManagerInterface15 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    i6 = ((Double) obj).intValue();
                }
                rNSVGImageManagerInterface15.setClipRule(t, i6);
                return;
            case 26:
                RNSVGImageManagerInterface rNSVGImageManagerInterface16 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGImageManagerInterface16.setStrokeLinecap(t, i5);
                return;
            case 27:
                RNSVGImageManagerInterface rNSVGImageManagerInterface17 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGImageManagerInterface17.setDisplay(t, str2);
                return;
            case 28:
                RNSVGImageManagerInterface rNSVGImageManagerInterface18 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGImageManagerInterface18.setStrokeLinejoin(t, i4);
                return;
            case 29:
                RNSVGImageManagerInterface rNSVGImageManagerInterface19 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGImageManagerInterface19.setResponsible(t, z);
                return;
            case 30:
                RNSVGImageManagerInterface rNSVGImageManagerInterface20 = (RNSVGImageManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGImageManagerInterface20.setMeetOrSlice(t, i3);
                return;
            case 31:
                if (obj instanceof String) {
                    ((RNSVGImageManagerInterface) this.mViewManager).setStrokeWidth((RNSVGImageManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGImageManagerInterface) this.mViewManager).setStrokeWidth((RNSVGImageManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGImageManagerInterface) this.mViewManager).setStrokeWidth((RNSVGImageManagerInterface) t, NearbyManager.PERMISSION_DENIED);
                    return;
                }
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
