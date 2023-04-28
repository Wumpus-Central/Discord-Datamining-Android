package androidx.core.app;

import android.os.Bundle;
import android.os.IBinder;

/* renamed from: androidx.core.app.h */
/* loaded from: classes.dex */
public final class C2240h {

    /* renamed from: androidx.core.app.h$a */
    /* loaded from: classes.dex */
    static class C2241a {
        /* renamed from: a */
        static IBinder m38259a(Bundle bundle, String str) {
            return bundle.getBinder(str);
        }

        /* renamed from: b */
        static void m38258b(Bundle bundle, String str, IBinder iBinder) {
            bundle.putBinder(str, iBinder);
        }
    }

    /* renamed from: a */
    public static IBinder m38261a(Bundle bundle, String str) {
        return C2241a.m38259a(bundle, str);
    }

    /* renamed from: b */
    public static void m38260b(Bundle bundle, String str, IBinder iBinder) {
        C2241a.m38258b(bundle, str, iBinder);
    }
}
