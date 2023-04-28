package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.BaseViewManagerInterface;
import com.facebook.react.uimanager.ReactClippingViewGroupHelper;
import com.facebook.react.viewmanagers.AndroidHorizontalScrollContentViewManagerInterface;

/* loaded from: classes7.dex */
public class AndroidHorizontalScrollContentViewManagerDelegate<T extends View, U extends BaseViewManagerInterface<T> & AndroidHorizontalScrollContentViewManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public AndroidHorizontalScrollContentViewManagerDelegate(BaseViewManagerInterface baseViewManagerInterface) {
        super(baseViewManagerInterface);
    }

    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    public void setProperty(T t, String str, Object obj) {
        boolean z;
        str.hashCode();
        if (!str.equals(ReactClippingViewGroupHelper.PROP_REMOVE_CLIPPED_SUBVIEWS)) {
            super.setProperty(t, str, obj);
            return;
        }
        AndroidHorizontalScrollContentViewManagerInterface androidHorizontalScrollContentViewManagerInterface = (AndroidHorizontalScrollContentViewManagerInterface) this.mViewManager;
        if (obj == null) {
            z = false;
        } else {
            z = ((Boolean) obj).booleanValue();
        }
        androidHorizontalScrollContentViewManagerInterface.setRemoveClippedSubviews(t, z);
    }
}
