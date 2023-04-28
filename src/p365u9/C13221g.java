package p365u9;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import ca.C3799f;
import p082ea.C6801d;
import p420x9.C14003o1;
import pa.C11592d;

/* renamed from: u9.g */
/* loaded from: classes5.dex */
public class C13221g {

    /* renamed from: a */
    public static final int f29689a = C13223i.f29692a;

    /* renamed from: b */
    private static final C13221g f29690b = new C13221g();

    /* renamed from: a */
    public Intent mo4275a(Context context, int i, String str) {
        if (i == 1 || i == 2) {
            if (context != null && C3799f.m33575d(context)) {
                return C14003o1.m2063a();
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append("gcore_");
            sb2.append(f29689a);
            sb2.append("-");
            if (!TextUtils.isEmpty(str)) {
                sb2.append(str);
            }
            sb2.append("-");
            if (context != null) {
                sb2.append(context.getPackageName());
            }
            sb2.append("-");
            if (context != null) {
                try {
                    sb2.append(C6801d.m24304a(context).m24306e(context.getPackageName(), 0).versionCode);
                } catch (PackageManager.NameNotFoundException unused) {
                }
            }
            return C14003o1.m2062b("com.google.android.gms", sb2.toString());
        } else if (i != 3) {
            return null;
        } else {
            return C14003o1.m2061c("com.google.android.gms");
        }
    }

    /* renamed from: b */
    public PendingIntent mo4274b(Context context, int i, int i2) {
        return m4273c(context, i, i2, null);
    }

    /* renamed from: c */
    public PendingIntent m4273c(Context context, int i, int i2, String str) {
        Intent a = mo4275a(context, i, str);
        if (a == null) {
            return null;
        }
        return C11592d.m9290a(context, i2, a, C11592d.f25857a | 134217728);
    }

    /* renamed from: d */
    public String mo4272d(int i) {
        return C13223i.m4266a(i);
    }

    /* renamed from: e */
    public int mo4271e(Context context) {
        return mo4270f(context, f29689a);
    }

    /* renamed from: f */
    public int mo4270f(Context context, int i) {
        int d = C13223i.m4263d(context, i);
        if (C13223i.m4262e(context, d)) {
            return 18;
        }
        return d;
    }

    /* renamed from: g */
    public boolean m4269g(Context context, String str) {
        return C13223i.m4259h(context, str);
    }

    /* renamed from: h */
    public boolean mo4268h(int i) {
        return C13223i.m4260g(i);
    }
}
