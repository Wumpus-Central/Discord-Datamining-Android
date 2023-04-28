package p366ub;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Typeface;
import android.os.Build;
import com.reactnativecommunity.webview.RNCWebViewManager;
import p054d1.C6391a;

/* renamed from: ub.i */
/* loaded from: classes3.dex */
public class C13250i {
    /* renamed from: a */
    public static Typeface m4210a(Context context, Typeface typeface) {
        return m4209b(context.getResources().getConfiguration(), typeface);
    }

    /* renamed from: b */
    public static Typeface m4209b(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT < 31) {
            return null;
        }
        i = configuration.fontWeightAdjustment;
        if (i == Integer.MAX_VALUE) {
            return null;
        }
        i2 = configuration.fontWeightAdjustment;
        if (i2 == 0) {
            return null;
        }
        weight = typeface.getWeight();
        i3 = configuration.fontWeightAdjustment;
        create = Typeface.create(typeface, C6391a.m25632b(weight + i3, 1, RNCWebViewManager.COMMAND_CLEAR_FORM_DATA), typeface.isItalic());
        return create;
    }
}
