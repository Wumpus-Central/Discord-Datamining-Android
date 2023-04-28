package com.facebook.react.uimanager;

import android.view.View;
import com.facebook.react.bridge.JSApplicationCausedNativeException;

/* loaded from: classes7.dex */
public class IllegalViewOperationException extends JSApplicationCausedNativeException {
    private View mView;

    public IllegalViewOperationException(String str) {
        super(str);
    }

    public View getView() {
        return this.mView;
    }

    public IllegalViewOperationException(String str, View view, Throwable th2) {
        super(str, th2);
        this.mView = view;
    }
}
