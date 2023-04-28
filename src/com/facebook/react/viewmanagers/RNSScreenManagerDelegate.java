package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.RNSScreenManagerInterface;

/* loaded from: classes7.dex */
public class RNSScreenManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RNSScreenManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNSScreenManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        float f;
        int i;
        str.hashCode();
        boolean z = true;
        boolean z2 = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -1937389126:
                if (str.equals("homeIndicatorHidden")) {
                    c = 0;
                    break;
                }
                break;
            case -1853558344:
                if (str.equals("gestureEnabled")) {
                    c = 1;
                    break;
                }
                break;
            case -1734097646:
                if (str.equals("hideKeyboardOnSwipe")) {
                    c = 2;
                    break;
                }
                break;
            case -1322084375:
                if (str.equals("navigationBarHidden")) {
                    c = 3;
                    break;
                }
                break;
            case -1156137512:
                if (str.equals("statusBarTranslucent")) {
                    c = 4;
                    break;
                }
                break;
            case -1150711358:
                if (str.equals("stackPresentation")) {
                    c = 5;
                    break;
                }
                break;
            case -1047235902:
                if (str.equals("activityState")) {
                    c = 6;
                    break;
                }
                break;
            case -973702878:
                if (str.equals("statusBarColor")) {
                    c = 7;
                    break;
                }
                break;
            case -958765200:
                if (str.equals("statusBarStyle")) {
                    c = '\b';
                    break;
                }
                break;
            case -577711652:
                if (str.equals("stackAnimation")) {
                    c = '\t';
                    break;
                }
                break;
            case -462720700:
                if (str.equals("navigationBarColor")) {
                    c = '\n';
                    break;
                }
                break;
            case -257141968:
                if (str.equals("replaceAnimation")) {
                    c = 11;
                    break;
                }
                break;
            case -166356101:
                if (str.equals("preventNativeDismiss")) {
                    c = '\f';
                    break;
                }
                break;
            case 17337291:
                if (str.equals("statusBarHidden")) {
                    c = '\r';
                    break;
                }
                break;
            case 129956386:
                if (str.equals("fullScreenSwipeEnabled")) {
                    c = 14;
                    break;
                }
                break;
            case 187703999:
                if (str.equals("gestureResponseDistance")) {
                    c = 15;
                    break;
                }
                break;
            case 227582404:
                if (str.equals("screenOrientation")) {
                    c = 16;
                    break;
                }
                break;
            case 425064969:
                if (str.equals("transitionDuration")) {
                    c = 17;
                    break;
                }
                break;
            case 1082157413:
                if (str.equals("swipeDirection")) {
                    c = 18;
                    break;
                }
                break;
            case 1110843912:
                if (str.equals("customAnimationOnSwipe")) {
                    c = 19;
                    break;
                }
                break;
            case 1387359683:
                if (str.equals("statusBarAnimation")) {
                    c = 20;
                    break;
                }
                break;
            case 1729091548:
                if (str.equals("nativeBackButtonDismissalEnabled")) {
                    c = 21;
                    break;
                }
                break;
        }
        String str2 = null;
        switch (c) {
            case 0:
                RNSScreenManagerInterface rNSScreenManagerInterface = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface.setHomeIndicatorHidden(t, z2);
                return;
            case 1:
                RNSScreenManagerInterface rNSScreenManagerInterface2 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface2.setGestureEnabled(t, z);
                return;
            case 2:
                RNSScreenManagerInterface rNSScreenManagerInterface3 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface3.setHideKeyboardOnSwipe(t, z2);
                return;
            case 3:
                RNSScreenManagerInterface rNSScreenManagerInterface4 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface4.setNavigationBarHidden(t, z2);
                return;
            case 4:
                RNSScreenManagerInterface rNSScreenManagerInterface5 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface5.setStatusBarTranslucent(t, z2);
                return;
            case 5:
                ((RNSScreenManagerInterface) this.mViewManager).setStackPresentation(t, (String) obj);
                return;
            case 6:
                RNSScreenManagerInterface rNSScreenManagerInterface6 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj == null) {
                    f = -1.0f;
                } else {
                    f = ((Double) obj).floatValue();
                }
                rNSScreenManagerInterface6.setActivityState(t, f);
                return;
            case 7:
                ((RNSScreenManagerInterface) this.mViewManager).setStatusBarColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case '\b':
                RNSScreenManagerInterface rNSScreenManagerInterface7 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSScreenManagerInterface7.setStatusBarStyle(t, str2);
                return;
            case '\t':
                ((RNSScreenManagerInterface) this.mViewManager).setStackAnimation(t, (String) obj);
                return;
            case '\n':
                ((RNSScreenManagerInterface) this.mViewManager).setNavigationBarColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 11:
                ((RNSScreenManagerInterface) this.mViewManager).setReplaceAnimation(t, (String) obj);
                return;
            case '\f':
                RNSScreenManagerInterface rNSScreenManagerInterface8 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface8.setPreventNativeDismiss(t, z2);
                return;
            case '\r':
                RNSScreenManagerInterface rNSScreenManagerInterface9 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface9.setStatusBarHidden(t, z2);
                return;
            case 14:
                RNSScreenManagerInterface rNSScreenManagerInterface10 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface10.setFullScreenSwipeEnabled(t, z2);
                return;
            case 15:
                ((RNSScreenManagerInterface) this.mViewManager).setGestureResponseDistance(t, (ReadableMap) obj);
                return;
            case 16:
                RNSScreenManagerInterface rNSScreenManagerInterface11 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSScreenManagerInterface11.setScreenOrientation(t, str2);
                return;
            case 17:
                RNSScreenManagerInterface rNSScreenManagerInterface12 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj == null) {
                    i = 350;
                } else {
                    i = ((Double) obj).intValue();
                }
                rNSScreenManagerInterface12.setTransitionDuration(t, i);
                return;
            case 18:
                ((RNSScreenManagerInterface) this.mViewManager).setSwipeDirection(t, (String) obj);
                return;
            case 19:
                RNSScreenManagerInterface rNSScreenManagerInterface13 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface13.setCustomAnimationOnSwipe(t, z2);
                return;
            case 20:
                RNSScreenManagerInterface rNSScreenManagerInterface14 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    str2 = (String) obj;
                }
                rNSScreenManagerInterface14.setStatusBarAnimation(t, str2);
                return;
            case 21:
                RNSScreenManagerInterface rNSScreenManagerInterface15 = (RNSScreenManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                rNSScreenManagerInterface15.setNativeBackButtonDismissalEnabled(t, z2);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
