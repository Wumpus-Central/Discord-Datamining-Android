package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGPathManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGPathManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGPathManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGPathManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
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
            case 100:
                if (str.equals("d")) {
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
            case 3344108:
                if (str.equals("mask")) {
                    c = '\r';
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 14;
                    break;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    c = 15;
                    break;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    c = 16;
                    break;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    c = 17;
                    break;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
                    c = 18;
                    break;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    c = 19;
                    break;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    c = 20;
                    break;
                }
                break;
            case 1027575302:
                if (str.equals("strokeLinecap")) {
                    c = 21;
                    break;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c = 22;
                    break;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    c = 23;
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c = 24;
                    break;
                }
                break;
            case 1924065902:
                if (str.equals("strokeWidth")) {
                    c = 25;
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
                ((RNSVGPathManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 2:
                ((RNSVGPathManagerInterface) this.mViewManager).setPropList(t, (ReadableArray) obj);
                return;
            case 3:
                RNSVGPathManagerInterface rNSVGPathManagerInterface = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPathManagerInterface.setMarkerEnd(t, str2);
                return;
            case 4:
                RNSVGPathManagerInterface rNSVGPathManagerInterface2 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPathManagerInterface2.setMarkerMid(t, str2);
                return;
            case 5:
                ((RNSVGPathManagerInterface) this.mViewManager).setStroke(t, (ReadableMap) obj);
                return;
            case 6:
                RNSVGPathManagerInterface rNSVGPathManagerInterface3 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGPathManagerInterface3.setFillRule(t, i);
                return;
            case 7:
                RNSVGPathManagerInterface rNSVGPathManagerInterface4 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGPathManagerInterface4.setStrokeOpacity(t, f2);
                return;
            case '\b':
                RNSVGPathManagerInterface rNSVGPathManagerInterface5 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPathManagerInterface5.setPointerEvents(t, str2);
                return;
            case '\t':
                RNSVGPathManagerInterface rNSVGPathManagerInterface6 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGPathManagerInterface6.setFillOpacity(t, f2);
                return;
            case '\n':
                RNSVGPathManagerInterface rNSVGPathManagerInterface7 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGPathManagerInterface7.setStrokeDashoffset(t, f);
                return;
            case 11:
                RNSVGPathManagerInterface rNSVGPathManagerInterface8 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPathManagerInterface8.setD(t, str2);
                return;
            case '\f':
                ((RNSVGPathManagerInterface) this.mViewManager).setFill(t, (ReadableMap) obj);
                return;
            case '\r':
                RNSVGPathManagerInterface rNSVGPathManagerInterface9 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPathManagerInterface9.setMask(t, str2);
                return;
            case 14:
                RNSVGPathManagerInterface rNSVGPathManagerInterface10 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPathManagerInterface10.setName(t, str2);
                return;
            case 15:
                RNSVGPathManagerInterface rNSVGPathManagerInterface11 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGPathManagerInterface11.setStrokeMiterlimit(t, f);
                return;
            case 16:
                RNSVGPathManagerInterface rNSVGPathManagerInterface12 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGPathManagerInterface12.setVectorEffect(t, i2);
                return;
            case 17:
                RNSVGPathManagerInterface rNSVGPathManagerInterface13 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPathManagerInterface13.setMarkerStart(t, str2);
                return;
            case 18:
                ((RNSVGPathManagerInterface) this.mViewManager).setStrokeDasharray(t, (ReadableArray) obj);
                return;
            case 19:
                RNSVGPathManagerInterface rNSVGPathManagerInterface14 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPathManagerInterface14.setClipPath(t, str2);
                return;
            case 20:
                RNSVGPathManagerInterface rNSVGPathManagerInterface15 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGPathManagerInterface15.setClipRule(t, i5);
                return;
            case 21:
                RNSVGPathManagerInterface rNSVGPathManagerInterface16 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGPathManagerInterface16.setStrokeLinecap(t, i4);
                return;
            case 22:
                RNSVGPathManagerInterface rNSVGPathManagerInterface17 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGPathManagerInterface17.setDisplay(t, str2);
                return;
            case 23:
                RNSVGPathManagerInterface rNSVGPathManagerInterface18 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGPathManagerInterface18.setStrokeLinejoin(t, i3);
                return;
            case 24:
                RNSVGPathManagerInterface rNSVGPathManagerInterface19 = (RNSVGPathManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGPathManagerInterface19.setResponsible(t, z);
                return;
            case 25:
                if (obj instanceof String) {
                    ((RNSVGPathManagerInterface) this.mViewManager).setStrokeWidth((RNSVGPathManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGPathManagerInterface) this.mViewManager).setStrokeWidth((RNSVGPathManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGPathManagerInterface) this.mViewManager).setStrokeWidth((RNSVGPathManagerInterface) t, NearbyManager.PERMISSION_DENIED);
                    return;
                }
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
