package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.ModalHostViewManagerInterface;

/* loaded from: classes7.dex */
public class ModalHostViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & ModalHostViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public ModalHostViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        str.hashCode();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        int i = 0;
        char c = 65535;
        switch (str.hashCode()) {
            case -1851617609:
                if (str.equals("presentationStyle")) {
                    c = 0;
                    break;
                }
                break;
            case -1850124175:
                if (str.equals("supportedOrientations")) {
                    c = 1;
                    break;
                }
                break;
            case -1726194350:
                if (str.equals("transparent")) {
                    c = 2;
                    break;
                }
                break;
            case -1618432855:
                if (str.equals("identifier")) {
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
            case -795203165:
                if (str.equals("animated")) {
                    c = 5;
                    break;
                }
                break;
            case 466743410:
                if (str.equals(ViewProps.VISIBLE)) {
                    c = 6;
                    break;
                }
                break;
            case 1195991583:
                if (str.equals("hardwareAccelerated")) {
                    c = 7;
                    break;
                }
                break;
            case 2031205598:
                if (str.equals("animationType")) {
                    c = '\b';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                ((ModalHostViewManagerInterface) this.mViewManager).setPresentationStyle(t, (String) obj);
                return;
            case 1:
                ((ModalHostViewManagerInterface) this.mViewManager).setSupportedOrientations(t, (ReadableArray) obj);
                return;
            case 2:
                ModalHostViewManagerInterface modalHostViewManagerInterface = (ModalHostViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                modalHostViewManagerInterface.setTransparent(t, z);
                return;
            case 3:
                ModalHostViewManagerInterface modalHostViewManagerInterface2 = (ModalHostViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    i = ((Double) obj).intValue();
                }
                modalHostViewManagerInterface2.setIdentifier(t, i);
                return;
            case 4:
                ModalHostViewManagerInterface modalHostViewManagerInterface3 = (ModalHostViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    z5 = ((Boolean) obj).booleanValue();
                }
                modalHostViewManagerInterface3.setStatusBarTranslucent(t, z5);
                return;
            case 5:
                ModalHostViewManagerInterface modalHostViewManagerInterface4 = (ModalHostViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    z4 = ((Boolean) obj).booleanValue();
                }
                modalHostViewManagerInterface4.setAnimated(t, z4);
                return;
            case 6:
                ModalHostViewManagerInterface modalHostViewManagerInterface5 = (ModalHostViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    z3 = ((Boolean) obj).booleanValue();
                }
                modalHostViewManagerInterface5.setVisible(t, z3);
                return;
            case 7:
                ModalHostViewManagerInterface modalHostViewManagerInterface6 = (ModalHostViewManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                modalHostViewManagerInterface6.setHardwareAccelerated(t, z2);
                return;
            case '\b':
                ((ModalHostViewManagerInterface) this.mViewManager).setAnimationType(t, (String) obj);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
