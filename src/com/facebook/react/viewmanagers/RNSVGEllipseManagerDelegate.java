package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGEllipseManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGEllipseManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGEllipseManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGEllipseManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
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
            case 3189:
                if (str.equals("cx")) {
                    c = 11;
                    break;
                }
                break;
            case 3190:
                if (str.equals("cy")) {
                    c = '\f';
                    break;
                }
                break;
            case 3654:
                if (str.equals("rx")) {
                    c = '\r';
                    break;
                }
                break;
            case 3655:
                if (str.equals("ry")) {
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
                ((RNSVGEllipseManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 2:
                ((RNSVGEllipseManagerInterface) this.mViewManager).setPropList(t, (ReadableArray) obj);
                return;
            case 3:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGEllipseManagerInterface.setMarkerEnd(t, str2);
                return;
            case 4:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface2 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGEllipseManagerInterface2.setMarkerMid(t, str2);
                return;
            case 5:
                ((RNSVGEllipseManagerInterface) this.mViewManager).setStroke(t, (ReadableMap) obj);
                return;
            case 6:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface3 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGEllipseManagerInterface3.setFillRule(t, i);
                return;
            case 7:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface4 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGEllipseManagerInterface4.setStrokeOpacity(t, f2);
                return;
            case '\b':
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface5 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGEllipseManagerInterface5.setPointerEvents(t, str2);
                return;
            case '\t':
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface6 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGEllipseManagerInterface6.setFillOpacity(t, f2);
                return;
            case '\n':
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface7 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGEllipseManagerInterface7.setStrokeDashoffset(t, f);
                return;
            case 11:
                if (obj instanceof String) {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setCx((RNSVGEllipseManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setCx((RNSVGEllipseManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setCx((RNSVGEllipseManagerInterface) t, (Double) null);
                    return;
                }
            case '\f':
                if (obj instanceof String) {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setCy((RNSVGEllipseManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setCy((RNSVGEllipseManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setCy((RNSVGEllipseManagerInterface) t, (Double) null);
                    return;
                }
            case '\r':
                if (obj instanceof String) {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setRx((RNSVGEllipseManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setRx((RNSVGEllipseManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setRx((RNSVGEllipseManagerInterface) t, (Double) null);
                    return;
                }
            case 14:
                if (obj instanceof String) {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setRy((RNSVGEllipseManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setRy((RNSVGEllipseManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setRy((RNSVGEllipseManagerInterface) t, (Double) null);
                    return;
                }
            case 15:
                ((RNSVGEllipseManagerInterface) this.mViewManager).setFill(t, (ReadableMap) obj);
                return;
            case 16:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface8 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGEllipseManagerInterface8.setMask(t, str2);
                return;
            case 17:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface9 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGEllipseManagerInterface9.setName(t, str2);
                return;
            case 18:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface10 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGEllipseManagerInterface10.setStrokeMiterlimit(t, f);
                return;
            case 19:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface11 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGEllipseManagerInterface11.setVectorEffect(t, i2);
                return;
            case 20:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface12 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGEllipseManagerInterface12.setMarkerStart(t, str2);
                return;
            case 21:
                ((RNSVGEllipseManagerInterface) this.mViewManager).setStrokeDasharray(t, (ReadableArray) obj);
                return;
            case 22:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface13 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGEllipseManagerInterface13.setClipPath(t, str2);
                return;
            case 23:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface14 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGEllipseManagerInterface14.setClipRule(t, i5);
                return;
            case 24:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface15 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGEllipseManagerInterface15.setStrokeLinecap(t, i4);
                return;
            case 25:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface16 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGEllipseManagerInterface16.setDisplay(t, str2);
                return;
            case 26:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface17 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGEllipseManagerInterface17.setStrokeLinejoin(t, i3);
                return;
            case 27:
                RNSVGEllipseManagerInterface rNSVGEllipseManagerInterface18 = (RNSVGEllipseManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGEllipseManagerInterface18.setResponsible(t, z);
                return;
            case 28:
                if (obj instanceof String) {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setStrokeWidth((RNSVGEllipseManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setStrokeWidth((RNSVGEllipseManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGEllipseManagerInterface) this.mViewManager).setStrokeWidth((RNSVGEllipseManagerInterface) t, NearbyManager.PERMISSION_DENIED);
                    return;
                }
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
