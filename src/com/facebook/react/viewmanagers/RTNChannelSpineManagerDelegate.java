package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.viewmanagers.RTNChannelSpineManagerInterface;

/* loaded from: classes7.dex */
public class RTNChannelSpineManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & RTNChannelSpineManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RTNChannelSpineManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        int i;
        float f;
        str.hashCode();
        if (str.equals("numRows")) {
            RTNChannelSpineManagerInterface rTNChannelSpineManagerInterface = (RTNChannelSpineManagerInterface) this.mViewManager;
            if (obj == null) {
                i = 0;
            } else {
                i = ((Double) obj).intValue();
            }
            rTNChannelSpineManagerInterface.setNumRows(t, i);
        } else if (!str.equals("rowHeight")) {
            super.setProperty(t, str, obj);
        } else {
            RTNChannelSpineManagerInterface rTNChannelSpineManagerInterface2 = (RTNChannelSpineManagerInterface) this.mViewManager;
            if (obj == null) {
                f = Float.NaN;
            } else {
                f = ((Double) obj).floatValue();
            }
            rTNChannelSpineManagerInterface2.setRowHeight(t, f);
        }
    }
}
