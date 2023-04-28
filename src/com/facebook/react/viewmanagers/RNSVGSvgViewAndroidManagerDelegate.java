package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.RNSVGSvgViewAndroidManagerInterface;

/* loaded from: classes7.dex */
public class RNSVGSvgViewAndroidManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSVGSvgViewAndroidManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSVGSvgViewAndroidManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        boolean z = false;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i3 = 0;
        int i4 = 0;
        boolean z4 = false;
        int i5 = 0;
        int i6 = 0;
        boolean z5 = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -2064426617:
                if (str.equals("bbHeight")) {
                    c = 0;
                    break;
                }
                break;
            case -1989576717:
                if (str.equals(ViewProps.BORDER_RIGHT_COLOR)) {
                    c = 1;
                    break;
                }
                break;
            case -1697814026:
                if (str.equals("backfaceVisibility")) {
                    c = 2;
                    break;
                }
                break;
            case -1567958285:
                if (str.equals("vbHeight")) {
                    c = 3;
                    break;
                }
                break;
            case -1470826662:
                if (str.equals(ViewProps.BORDER_TOP_COLOR)) {
                    c = 4;
                    break;
                }
                break;
            case -1308858324:
                if (str.equals(ViewProps.BORDER_BOTTOM_COLOR)) {
                    c = 5;
                    break;
                }
                break;
            case -1228066334:
                if (str.equals(ViewProps.BORDER_TOP_LEFT_RADIUS)) {
                    c = 6;
                    break;
                }
                break;
            case -1141400650:
                if (str.equals("accessible")) {
                    c = 7;
                    break;
                }
                break;
            case -1122140597:
                if (str.equals(ViewProps.BORDER_TOP_START_RADIUS)) {
                    c = '\b';
                    break;
                }
                break;
            case -867333731:
                if (str.equals(ViewProps.BORDER_BOTTOM_START_RADIUS)) {
                    c = '\t';
                    break;
                }
                break;
            case -679581037:
                if (str.equals("hasTVPreferredFocus")) {
                    c = '\n';
                    break;
                }
                break;
            case -631506969:
                if (str.equals("nextFocusDown")) {
                    c = 11;
                    break;
                }
                break;
            case -631278772:
                if (str.equals("nextFocusLeft")) {
                    c = '\f';
                    break;
                }
                break;
            case -483490364:
                if (str.equals(ViewProps.BORDER_TOP_END_RADIUS)) {
                    c = '\r';
                    break;
                }
                break;
            case -329721498:
                if (str.equals("bbWidth")) {
                    c = 14;
                    break;
                }
                break;
            case -293492298:
                if (str.equals(ViewProps.POINTER_EVENTS)) {
                    c = 15;
                    break;
                }
                break;
            case -252105751:
                if (str.equals(ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)) {
                    c = 16;
                    break;
                }
                break;
            case -242276144:
                if (str.equals(ViewProps.BORDER_LEFT_COLOR)) {
                    c = 17;
                    break;
                }
                break;
            case -148030058:
                if (str.equals(ViewProps.BORDER_BOTTOM_END_RADIUS)) {
                    c = 18;
                    break;
                }
                break;
            case -109689771:
                if (str.equals("nativeForegroundAndroid")) {
                    c = 19;
                    break;
                }
                break;
            case 3351622:
                if (str.equals("minX")) {
                    c = 20;
                    break;
                }
                break;
            case 3351623:
                if (str.equals("minY")) {
                    c = 21;
                    break;
                }
                break;
            case 92903173:
                if (str.equals("align")) {
                    c = 22;
                    break;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    c = 23;
                    break;
                }
                break;
            case 240482938:
                if (str.equals("vbWidth")) {
                    c = 24;
                    break;
                }
                break;
            case 333432965:
                if (str.equals(ViewProps.BORDER_TOP_RIGHT_RADIUS)) {
                    c = 25;
                    break;
                }
                break;
            case 503397728:
                if (str.equals("nextFocusForward")) {
                    c = 26;
                    break;
                }
                break;
            case 581268560:
                if (str.equals(ViewProps.BORDER_BOTTOM_LEFT_RADIUS)) {
                    c = 27;
                    break;
                }
                break;
            case 588239831:
                if (str.equals(ViewProps.BORDER_BOTTOM_RIGHT_RADIUS)) {
                    c = 28;
                    break;
                }
                break;
            case 660795168:
                if (str.equals("nextFocusUp")) {
                    c = 29;
                    break;
                }
                break;
            case 722830999:
                if (str.equals(ViewProps.BORDER_COLOR)) {
                    c = 30;
                    break;
                }
                break;
            case 737768677:
                if (str.equals("borderStyle")) {
                    c = 31;
                    break;
                }
                break;
            case 926871597:
                if (str.equals("hitSlop")) {
                    c = ' ';
                    break;
                }
                break;
            case 1220735892:
                if (str.equals(ViewProps.BORDER_END_COLOR)) {
                    c = '!';
                    break;
                }
                break;
            case 1327599912:
                if (str.equals("tintColor")) {
                    c = '\"';
                    break;
                }
                break;
            case 1349188574:
                if (str.equals(ViewProps.BORDER_RADIUS)) {
                    c = '#';
                    break;
                }
                break;
            case 1629011506:
                if (str.equals("focusable")) {
                    c = '$';
                    break;
                }
                break;
            case 1667773924:
                if (str.equals(ViewProps.NEEDS_OFFSCREEN_ALPHA_COMPOSITING)) {
                    c = '%';
                    break;
                }
                break;
            case 1747724810:
                if (str.equals("nativeBackgroundAndroid")) {
                    c = '&';
                    break;
                }
                break;
            case 1908075304:
                if (str.equals("meetOrSlice")) {
                    c = '\'';
                    break;
                }
                break;
            case 1910855543:
                if (str.equals("nextFocusRight")) {
                    c = '(';
                    break;
                }
                break;
            case 2119889261:
                if (str.equals(ViewProps.BORDER_START_COLOR)) {
                    c = ')';
                    break;
                }
                break;
        }
        float f = 0.0f;
        float f2 = Float.NaN;
        double d = 0.0d;
        String str2 = null;
        switch (c) {
            case 0:
                if (obj instanceof String) {
                    ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBbHeight((RNSVGSvgViewAndroidManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBbHeight((RNSVGSvgViewAndroidManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBbHeight((RNSVGSvgViewAndroidManagerInterface) t, (Double) null);
                    return;
                }
            case 1:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderRightColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 2:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSvgViewAndroidManagerInterface.setBackfaceVisibility(t, str2);
                return;
            case 3:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface2 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGSvgViewAndroidManagerInterface2.setVbHeight(t, f2);
                return;
            case 4:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderTopColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 5:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderBottomColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 6:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface3 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    d = ((Double) obj).doubleValue();
                }
                rNSVGSvgViewAndroidManagerInterface3.setBorderTopLeftRadius(t, d);
                return;
            case 7:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface4 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSVGSvgViewAndroidManagerInterface4.setAccessible(t, z);
                return;
            case '\b':
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface5 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGSvgViewAndroidManagerInterface5.setBorderTopStartRadius(t, f);
                return;
            case '\t':
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface6 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGSvgViewAndroidManagerInterface6.setBorderBottomStartRadius(t, f);
                return;
            case '\n':
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface7 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    z5 = ((Boolean) obj).booleanValue();
                }
                rNSVGSvgViewAndroidManagerInterface7.setHasTVPreferredFocus(t, z5);
                return;
            case 11:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface8 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    i6 = ((Double) obj).intValue();
                }
                rNSVGSvgViewAndroidManagerInterface8.setNextFocusDown(t, i6);
                return;
            case '\f':
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface9 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    i5 = ((Double) obj).intValue();
                }
                rNSVGSvgViewAndroidManagerInterface9.setNextFocusLeft(t, i5);
                return;
            case '\r':
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface10 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGSvgViewAndroidManagerInterface10.setBorderTopEndRadius(t, f);
                return;
            case 14:
                if (obj instanceof String) {
                    ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBbWidth((RNSVGSvgViewAndroidManagerInterface) t, (String) obj);
                    return;
                } else if (obj instanceof Double) {
                    ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBbWidth((RNSVGSvgViewAndroidManagerInterface) t, (Double) obj);
                    return;
                } else {
                    ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBbWidth((RNSVGSvgViewAndroidManagerInterface) t, (Double) null);
                    return;
                }
            case 15:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface11 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSvgViewAndroidManagerInterface11.setPointerEvents(t, str2);
                return;
            case 16:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface12 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    z4 = ((Boolean) obj).booleanValue();
                }
                rNSVGSvgViewAndroidManagerInterface12.setRemoveClippedSubviews(t, z4);
                return;
            case 17:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderLeftColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 18:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface13 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    f = ((Double) obj).floatValue();
                }
                rNSVGSvgViewAndroidManagerInterface13.setBorderBottomEndRadius(t, f);
                return;
            case 19:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNativeForegroundAndroid(t, (ReadableMap) obj);
                return;
            case 20:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface14 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGSvgViewAndroidManagerInterface14.setMinX(t, f2);
                return;
            case 21:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface15 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGSvgViewAndroidManagerInterface15.setMinY(t, f2);
                return;
            case 22:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface16 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSvgViewAndroidManagerInterface16.setAlign(t, str2);
                return;
            case 23:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 24:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface17 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    f2 = ((Double) obj).floatValue();
                }
                rNSVGSvgViewAndroidManagerInterface17.setVbWidth(t, f2);
                return;
            case 25:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface18 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    d = ((Double) obj).doubleValue();
                }
                rNSVGSvgViewAndroidManagerInterface18.setBorderTopRightRadius(t, d);
                return;
            case 26:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface19 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    i4 = ((Double) obj).intValue();
                }
                rNSVGSvgViewAndroidManagerInterface19.setNextFocusForward(t, i4);
                return;
            case 27:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface20 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    d = ((Double) obj).doubleValue();
                }
                rNSVGSvgViewAndroidManagerInterface20.setBorderBottomLeftRadius(t, d);
                return;
            case 28:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface21 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    d = ((Double) obj).doubleValue();
                }
                rNSVGSvgViewAndroidManagerInterface21.setBorderBottomRightRadius(t, d);
                return;
            case 29:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface22 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    i3 = ((Double) obj).intValue();
                }
                rNSVGSvgViewAndroidManagerInterface22.setNextFocusUp(t, i3);
                return;
            case 30:
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 31:
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface23 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSVGSvgViewAndroidManagerInterface23.setBorderStyle(t, str2);
                return;
            case ' ':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setHitSlop(t, (ReadableMap) obj);
                return;
            case '!':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderEndColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case '\"':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setTintColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case '#':
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface24 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    d = ((Double) obj).doubleValue();
                }
                rNSVGSvgViewAndroidManagerInterface24.setBorderRadius(t, d);
                return;
            case '$':
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface25 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    z3 = ((Boolean) obj).booleanValue();
                }
                rNSVGSvgViewAndroidManagerInterface25.setFocusable(t, z3);
                return;
            case '%':
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface26 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSVGSvgViewAndroidManagerInterface26.setNeedsOffscreenAlphaCompositing(t, z2);
                return;
            case '&':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setNativeBackgroundAndroid(t, (ReadableMap) obj);
                return;
            case '\'':
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface27 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    i2 = ((Double) obj).intValue();
                }
                rNSVGSvgViewAndroidManagerInterface27.setMeetOrSlice(t, i2);
                return;
            case '(':
                RNSVGSvgViewAndroidManagerInterface rNSVGSvgViewAndroidManagerInterface28 = (RNSVGSvgViewAndroidManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                rNSVGSvgViewAndroidManagerInterface28.setNextFocusRight(t, i);
                return;
            case ')':
                ((RNSVGSvgViewAndroidManagerInterface) this.mViewManager).setBorderStartColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
