package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNGestureHandlerButtonManagerInterface;

/* loaded from: classes7.dex */
public class RNGestureHandlerButtonManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNGestureHandlerButtonManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNGestureHandlerButtonManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -2143114526:
                if (str.equals("rippleRadius")) {
                    c = 0;
                    break;
                }
                break;
            case -1609594047:
                if (str.equals(ViewProps.ENABLED)) {
                    c = 1;
                    break;
                }
                break;
            case -775297261:
                if (str.equals("rippleColor")) {
                    c = 2;
                    break;
                }
                break;
            case 1387411372:
                if (str.equals("touchSoundDisabled")) {
                    c = 3;
                    break;
                }
                break;
            case 1686617758:
                if (str.equals("exclusive")) {
                    c = 4;
                    break;
                }
                break;
            case 1825644485:
                if (str.equals("borderless")) {
                    c = 5;
                    break;
                }
                break;
            case 1984457027:
                if (str.equals("foreground")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                RNGestureHandlerButtonManagerInterface rNGestureHandlerButtonManagerInterface = (RNGestureHandlerButtonManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNGestureHandlerButtonManagerInterface.setRippleRadius(t, i);
                return;
            case 1:
                RNGestureHandlerButtonManagerInterface rNGestureHandlerButtonManagerInterface2 = (RNGestureHandlerButtonManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNGestureHandlerButtonManagerInterface2.setEnabled(t, z);
                return;
            case 2:
                ((RNGestureHandlerButtonManagerInterface) this.mViewManager).setRippleColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 3:
                RNGestureHandlerButtonManagerInterface rNGestureHandlerButtonManagerInterface3 = (RNGestureHandlerButtonManagerInterface) this.mViewManager;
                if (obj != null) {
                    z4 = ((Boolean) obj).booleanValue();
                }
                rNGestureHandlerButtonManagerInterface3.setTouchSoundDisabled(t, z4);
                return;
            case 4:
                RNGestureHandlerButtonManagerInterface rNGestureHandlerButtonManagerInterface4 = (RNGestureHandlerButtonManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNGestureHandlerButtonManagerInterface4.setExclusive(t, z);
                return;
            case 5:
                RNGestureHandlerButtonManagerInterface rNGestureHandlerButtonManagerInterface5 = (RNGestureHandlerButtonManagerInterface) this.mViewManager;
                if (obj != null) {
                    z3 = ((Boolean) obj).booleanValue();
                }
                rNGestureHandlerButtonManagerInterface5.setBorderless(t, z3);
                return;
            case 6:
                RNGestureHandlerButtonManagerInterface rNGestureHandlerButtonManagerInterface6 = (RNGestureHandlerButtonManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNGestureHandlerButtonManagerInterface6.setForeground(t, z2);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
