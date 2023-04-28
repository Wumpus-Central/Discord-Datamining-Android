package p074e2;

import android.content.Context;
import android.provider.Settings;

/* renamed from: e2.t */
/* loaded from: classes.dex */
public class C6667t {
    /* renamed from: a */
    public static String m24782a(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }
}
