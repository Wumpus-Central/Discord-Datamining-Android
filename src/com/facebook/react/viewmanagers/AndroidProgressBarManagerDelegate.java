package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.bridge.ColorPropConverter;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.viewmanagers.AndroidProgressBarManagerInterface;

/* loaded from: classes7.dex */
public class AndroidProgressBarManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & AndroidProgressBarManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AndroidProgressBarManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        double d;
        String str2;
        str.hashCode();
        boolean z = true;
        boolean z2 = false;
        char c = 65535;
        switch (str.hashCode()) {
            case -1001078227:
                if (str.equals("progress")) {
                    c = 0;
                    break;
                }
                break;
            case -877170387:
                if (str.equals(ViewProps.TEST_ID)) {
                    c = 1;
                    break;
                }
                break;
            case -676876213:
                if (str.equals("typeAttr")) {
                    c = 2;
                    break;
                }
                break;
            case 94842723:
                if (str.equals(ViewProps.COLOR)) {
                    c = 3;
                    break;
                }
                break;
            case 633138363:
                if (str.equals("indeterminate")) {
                    c = 4;
                    break;
                }
                break;
            case 1118509918:
                if (str.equals("animating")) {
                    c = 5;
                    break;
                }
                break;
            case 1804741442:
                if (str.equals("styleAttr")) {
                    c = 6;
                    break;
                }
                break;
        }
        String str3 = null;
        switch (c) {
            case 0:
                AndroidProgressBarManagerInterface androidProgressBarManagerInterface = (AndroidProgressBarManagerInterface) this.mViewManager;
                if (obj == null) {
                    d = 0.0d;
                } else {
                    d = ((Double) obj).doubleValue();
                }
                androidProgressBarManagerInterface.setProgress(t, d);
                return;
            case 1:
                AndroidProgressBarManagerInterface androidProgressBarManagerInterface2 = (AndroidProgressBarManagerInterface) this.mViewManager;
                if (obj == null) {
                    str2 = "";
                } else {
                    str2 = (String) obj;
                }
                androidProgressBarManagerInterface2.setTestID(t, str2);
                return;
            case 2:
                AndroidProgressBarManagerInterface androidProgressBarManagerInterface3 = (AndroidProgressBarManagerInterface) this.mViewManager;
                if (obj != null) {
                    str3 = (String) obj;
                }
                androidProgressBarManagerInterface3.setTypeAttr(t, str3);
                return;
            case 3:
                ((AndroidProgressBarManagerInterface) this.mViewManager).setColor(t, ColorPropConverter.getColor(obj, t.getContext()));
                return;
            case 4:
                AndroidProgressBarManagerInterface androidProgressBarManagerInterface4 = (AndroidProgressBarManagerInterface) this.mViewManager;
                if (obj != null) {
                    z2 = ((Boolean) obj).booleanValue();
                }
                androidProgressBarManagerInterface4.setIndeterminate(t, z2);
                return;
            case 5:
                AndroidProgressBarManagerInterface androidProgressBarManagerInterface5 = (AndroidProgressBarManagerInterface) this.mViewManager;
                if (obj != null) {
                    z = ((Boolean) obj).booleanValue();
                }
                androidProgressBarManagerInterface5.setAnimating(t, z);
                return;
            case 6:
                AndroidProgressBarManagerInterface androidProgressBarManagerInterface6 = (AndroidProgressBarManagerInterface) this.mViewManager;
                if (obj != null) {
                    str3 = (String) obj;
                }
                androidProgressBarManagerInterface6.setStyleAttr(t, str3);
                return;
            default:
                super.setProperty(t, str, obj);
                return;
        }
    }
}
