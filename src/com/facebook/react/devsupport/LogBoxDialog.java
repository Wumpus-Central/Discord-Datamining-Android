package com.facebook.react.devsupport;

import android.app.Activity;
import android.app.Dialog;
import android.view.View;
import com.facebook.react.C5072R;

/* loaded from: classes7.dex */
public class LogBoxDialog extends Dialog {
    public LogBoxDialog(Activity activity, View view) {
        super(activity, C5072R.style.Theme_Catalyst_LogBox);
        requestWindowFeature(1);
        setContentView(view);
    }
}
