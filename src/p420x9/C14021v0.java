package p420x9;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.util.Log;
import p082ea.C6801d;

/* renamed from: x9.v0 */
/* loaded from: classes5.dex */
public final class C14021v0 {

    /* renamed from: a */
    private static final Object f31604a = new Object();

    /* renamed from: b */
    private static boolean f31605b;

    /* renamed from: c */
    private static String f31606c;

    /* renamed from: d */
    private static int f31607d;

    /* renamed from: a */
    public static int m2020a(Context context) {
        m2019b(context);
        return f31607d;
    }

    /* renamed from: b */
    private static void m2019b(Context context) {
        Bundle bundle;
        synchronized (f31604a) {
            if (!f31605b) {
                f31605b = true;
                try {
                    bundle = C6801d.m24304a(context).m24308c(context.getPackageName(), 128).metaData;
                } catch (PackageManager.NameNotFoundException e) {
                    Log.wtf("MetadataValueReader", "This should never happen.", e);
                }
                if (bundle != null) {
                    f31606c = bundle.getString("com.google.app.id");
                    f31607d = bundle.getInt("com.google.android.gms.version");
                }
            }
        }
    }
}
