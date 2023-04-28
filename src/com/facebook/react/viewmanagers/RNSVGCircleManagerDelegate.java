package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGCircleManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGCircleManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGCircleManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGCircleManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
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
            case 114:
                if (str.equals("r")) {
                    c = 11;
                    break;
                }
                break;
            case 3189:
                if (str.equals("cx")) {
                    c = '\f';
                    break;
                }
                break;
            case 3190:
                if (str.equals("cy")) {
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
            case 3344108:
                if (str.equals("mask")) {
                    c = 15;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 16;
                    break;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    c = 17;
                    break;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    c = 18;
                    break;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
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
                ((RNSVGCircleManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 2:
                ((RNSVGCircleManagerInterface) this.mViewManager).setPropList(t, (ReadableArray) obj);
                return;
            case 3:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGCircleManagerInterface.setMarkerEnd(t, str2);
                return;
            case 4:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface2 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGCircleManagerInterface2.setMarkerMid(t, str2);
                return;
            case 5:
                ((RNSVGCircleManagerInterface) this.mViewManager).setStroke(t, (ReadableMap) obj);
                return;
            case 6:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface3 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGCircleManagerInterface3.setFillRule(t, i);
                return;
            case 7:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface4 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGCircleManagerInterface4.setStrokeOpacity(t, f2);
                return;
            case '\b':
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface5 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGCircleManagerInterface5.setPointerEvents(t, str2);
                return;
            case '\t':
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface6 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGCircleManagerInterface6.setFillOpacity(t, f2);
                return;
            case '\n':
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface7 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGCircleManagerInterface7.setStrokeDashoffset(t, f);
                return;
            case 11:
                if (obj instanceof String) {
                    ((RNSVGCircleManagerInterface) this.mViewManager).setR((RNSVGCircleManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGCircleManagerInterface) this.mViewManager).setR((RNSVGCircleManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGCircleManagerInterface) this.mViewManager).setR((RNSVGCircleManagerInterface) t, (Double) null);
                    return;
                }
            case '\f':
                if (obj instanceof String) {
                    ((RNSVGCircleManagerInterface) this.mViewManager).setCx((RNSVGCircleManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGCircleManagerInterface) this.mViewManager).setCx((RNSVGCircleManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGCircleManagerInterface) this.mViewManager).setCx((RNSVGCircleManagerInterface) t, (Double) null);
                    return;
                }
            case '\r':
                if (obj instanceof String) {
                    ((RNSVGCircleManagerInterface) this.mViewManager).setCy((RNSVGCircleManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGCircleManagerInterface) this.mViewManager).setCy((RNSVGCircleManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGCircleManagerInterface) this.mViewManager).setCy((RNSVGCircleManagerInterface) t, (Double) null);
                    return;
                }
            case 14:
                ((RNSVGCircleManagerInterface) this.mViewManager).setFill(t, (ReadableMap) obj);
                return;
            case 15:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface8 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGCircleManagerInterface8.setMask(t, str2);
                return;
            case 16:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface9 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGCircleManagerInterface9.setName(t, str2);
                return;
            case 17:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface10 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGCircleManagerInterface10.setStrokeMiterlimit(t, f);
                return;
            case 18:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface11 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGCircleManagerInterface11.setVectorEffect(t, i2);
                return;
            case 19:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface12 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGCircleManagerInterface12.setMarkerStart(t, str2);
                return;
            case 20:
                ((RNSVGCircleManagerInterface) this.mViewManager).setStrokeDasharray(t, (ReadableArray) obj);
                return;
            case 21:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface13 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGCircleManagerInterface13.setClipPath(t, str2);
                return;
            case 22:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface14 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGCircleManagerInterface14.setClipRule(t, i5);
                return;
            case 23:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface15 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGCircleManagerInterface15.setStrokeLinecap(t, i4);
                return;
            case 24:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface16 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGCircleManagerInterface16.setDisplay(t, str2);
                return;
            case 25:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface17 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGCircleManagerInterface17.setStrokeLinejoin(t, i3);
                return;
            case 26:
                RNSVGCircleManagerInterface rNSVGCircleManagerInterface18 = (RNSVGCircleManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGCircleManagerInterface18.setResponsible(t, z);
                return;
            case 27:
                if (obj instanceof String) {
                    ((RNSVGCircleManagerInterface) this.mViewManager).setStrokeWidth((RNSVGCircleManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGCircleManagerInterface) this.mViewManager).setStrokeWidth((RNSVGCircleManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGCircleManagerInterface) this.mViewManager).setStrokeWidth((RNSVGCircleManagerInterface) t, NearbyManager.PERMISSION_DENIED);
                    return;
                }
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
