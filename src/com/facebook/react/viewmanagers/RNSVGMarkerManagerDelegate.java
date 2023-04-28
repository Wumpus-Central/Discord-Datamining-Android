package com.facebook.react.viewmanagers;

import android.view.View;
import com.discord.nearby.NearbyManager;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGMarkerManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGMarkerManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGMarkerManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGMarkerManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
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
            case -1008621499:
                if (str.equals("orient")) {
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
            case 3143043:
                if (str.equals("fill")) {
                    c = 14;
                    break;
                }
                break;
            case 3148879:
                if (str.equals("font")) {
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
            case 3351622:
                if (str.equals("minX")) {
                    c = 17;
                    break;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
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
            case 3496485:
                if (str.equals("refX")) {
                    c = 20;
                    break;
                }
                break;
            case 3496486:
                if (str.equals("refY")) {
                    c = 21;
                    break;
                }
                break;
            case 78845486:
                if (str.equals("strokeMiterlimit")) {
                    c = 22;
                    break;
                }
                break;
            case 92903173:
                if (str.equals("align")) {
                    c = 23;
                    break;
                }
                break;
            case 104482996:
                if (str.equals("vectorEffect")) {
                    c = 24;
                    break;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    c = 25;
                    break;
                }
                break;
            case 218785621:
                if (str.equals("markerUnits")) {
                    c = 26;
                    break;
                }
                break;
            case 220478892:
                if (str.equals("markerWidth")) {
                    c = 27;
                    break;
                }
                break;
            case 240482938:
                if (str.equals("vbWidth")) {
                    c = 28;
                    break;
                }
                break;
            case 365601008:
                if (str.equals(ViewProps.FONT_SIZE)) {
                    c = 29;
                    break;
                }
                break;
            case 401643183:
                if (str.equals("strokeDasharray")) {
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
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c = '\"';
                    break;
                }
                break;
            case 1790285174:
                if (str.equals("strokeLinejoin")) {
                    c = '#';
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c = '$';
                    break;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
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
            case 2106883585:
                if (str.equals("markerHeight")) {
                    c = '\'';
                    break;
                }
                break;
        }
        float f = 1.0f;
        float f2 = 0.0f;
        String str2 = null;
        switch (c) {
            case 0:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGMarkerManagerInterface.setVbHeight(t, f2);
                return;
            case 1:
                U u = this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                u.setOpacity(t, f);
                return;
            case 2:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 3:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface2 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMarkerManagerInterface2.setOrient(t, str2);
                return;
            case 4:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setPropList(t, (ReadableArray) obj);
                return;
            case 5:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface3 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMarkerManagerInterface3.setMarkerEnd(t, str2);
                return;
            case 6:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface4 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMarkerManagerInterface4.setMarkerMid(t, str2);
                return;
            case 7:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setStroke(t, (ReadableMap) obj);
                return;
            case '\b':
                if (obj instanceof String) {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setFontWeight((RNSVGMarkerManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setFontWeight((RNSVGMarkerManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setFontWeight((RNSVGMarkerManagerInterface) t, (Double) null);
                    return;
                }
            case '\t':
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface5 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGMarkerManagerInterface5.setFillRule(t, i);
                return;
            case '\n':
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface6 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGMarkerManagerInterface6.setStrokeOpacity(t, f);
                return;
            case 11:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface7 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMarkerManagerInterface7.setPointerEvents(t, str2);
                return;
            case '\f':
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface8 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGMarkerManagerInterface8.setFillOpacity(t, f);
                return;
            case '\r':
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface9 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGMarkerManagerInterface9.setStrokeDashoffset(t, f2);
                return;
            case 14:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setFill(t, (ReadableMap) obj);
                return;
            case 15:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setFont(t, (ReadableMap) obj);
                return;
            case 16:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface10 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMarkerManagerInterface10.setMask(t, str2);
                return;
            case 17:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface11 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGMarkerManagerInterface11.setMinX(t, f2);
                return;
            case 18:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface12 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGMarkerManagerInterface12.setMinY(t, f2);
                return;
            case 19:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface13 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMarkerManagerInterface13.setName(t, str2);
                return;
            case 20:
                if (obj instanceof String) {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setRefX((RNSVGMarkerManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setRefX((RNSVGMarkerManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setRefX((RNSVGMarkerManagerInterface) t, (Double) null);
                    return;
                }
            case 21:
                if (obj instanceof String) {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setRefY((RNSVGMarkerManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setRefY((RNSVGMarkerManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setRefY((RNSVGMarkerManagerInterface) t, (Double) null);
                    return;
                }
            case 22:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface14 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGMarkerManagerInterface14.setStrokeMiterlimit(t, f2);
                return;
            case 23:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface15 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMarkerManagerInterface15.setAlign(t, str2);
                return;
            case 24:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface16 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGMarkerManagerInterface16.setVectorEffect(t, i2);
                return;
            case 25:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface17 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMarkerManagerInterface17.setMarkerStart(t, str2);
                return;
            case 26:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface18 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMarkerManagerInterface18.setMarkerUnits(t, str2);
                return;
            case 27:
                if (obj instanceof String) {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setMarkerWidth((RNSVGMarkerManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setMarkerWidth((RNSVGMarkerManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setMarkerWidth((RNSVGMarkerManagerInterface) t, (Double) null);
                    return;
                }
            case 28:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface19 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGMarkerManagerInterface19.setVbWidth(t, f2);
                return;
            case 29:
                if (obj instanceof String) {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setFontSize((RNSVGMarkerManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setFontSize((RNSVGMarkerManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setFontSize((RNSVGMarkerManagerInterface) t, (Double) null);
                    return;
                }
            case 30:
                ((RNSVGMarkerManagerInterface) this.mViewManager).setStrokeDasharray(t, (ReadableArray) obj);
                return;
            case 31:
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface20 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMarkerManagerInterface20.setClipPath(t, str2);
                return;
            case ' ':
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface21 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    i6 = ((Double) obj).intValue();
                }
                rNSVGMarkerManagerInterface21.setClipRule(t, i6);
                return;
            case '!':
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface22 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGMarkerManagerInterface22.setStrokeLinecap(t, i5);
                return;
            case '\"':
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface23 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGMarkerManagerInterface23.setDisplay(t, str2);
                return;
            case '#':
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface24 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGMarkerManagerInterface24.setStrokeLinejoin(t, i4);
                return;
            case '$':
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface25 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGMarkerManagerInterface25.setResponsible(t, z);
                return;
            case '%':
                RNSVGMarkerManagerInterface rNSVGMarkerManagerInterface26 = (RNSVGMarkerManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGMarkerManagerInterface26.setMeetOrSlice(t, i3);
                return;
            case '&':
                if (obj instanceof String) {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setStrokeWidth((RNSVGMarkerManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setStrokeWidth((RNSVGMarkerManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setStrokeWidth((RNSVGMarkerManagerInterface) t, NearbyManager.PERMISSION_DENIED);
                    return;
                }
            case '\'':
                if (obj instanceof String) {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setMarkerHeight((RNSVGMarkerManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setMarkerHeight((RNSVGMarkerManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGMarkerManagerInterface) this.mViewManager).setMarkerHeight((RNSVGMarkerManagerInterface) t, (Double) null);
                    return;
                }
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
