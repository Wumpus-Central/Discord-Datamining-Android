package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGDefsManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGDefsManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGDefsManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGDefsManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        float f;
        str.hashCode();
        int i = 0;
        boolean z = false;
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
            case -933864895:
                if (str.equals("markerEnd")) {
                    c = 2;
                    break;
                }
                break;
            case -933857362:
                if (str.equals("markerMid")) {
                    c = 3;
                    break;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    c = 4;
                    break;
                }
                break;
            case 3344108:
                if (str.equals("mask")) {
                    c = 5;
                    break;
                }
                break;
            case 3373707:
                if (str.equals("name")) {
                    c = 6;
                    break;
                }
                break;
            case 217109576:
                if (str.equals("markerStart")) {
                    c = 7;
                    break;
                }
                break;
            case 917656469:
                if (str.equals("clipPath")) {
                    c = '\b';
                    break;
                }
                break;
            case 917735020:
                if (str.equals("clipRule")) {
                    c = '\t';
                    break;
                }
                break;
            case 1671764162:
                if (str.equals(ViewProps.DISPLAY)) {
                    c = '\n';
                    break;
                }
                break;
            case 1847674614:
                if (str.equals("responsible")) {
                    c = 11;
                    break;
                }
                break;
        }
        String str2 = null;
        switch (c) {
            case 0:
                U u = this.mViewManager;
                if (obj == null) {
                    f = 1.0f;
                } else {
                    f = ((Double) obj).floatValue();
                }
                u.setOpacity(t, f);
                return;
            case 1:
                ((RNSVGDefsManagerInterface) this.mViewManager).setMatrix(t, (ReadableArray) obj);
                return;
            case 2:
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface.setMarkerEnd(t, str2);
                return;
            case 3:
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface2 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface2.setMarkerMid(t, str2);
                return;
            case 4:
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface3 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface3.setPointerEvents(t, str2);
                return;
            case 5:
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface4 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface4.setMask(t, str2);
                return;
            case 6:
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface5 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface5.setName(t, str2);
                return;
            case 7:
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface6 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface6.setMarkerStart(t, str2);
                return;
            case '\b':
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface7 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface7.setClipPath(t, str2);
                return;
            case '\t':
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface8 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGDefsManagerInterface8.setClipRule(t, i);
                return;
            case '\n':
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface9 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGDefsManagerInterface9.setDisplay(t, str2);
                return;
            case 11:
                RNSVGDefsManagerInterface rNSVGDefsManagerInterface10 = (RNSVGDefsManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGDefsManagerInterface10.setResponsible(t, z);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
