package p350t9;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import ca.C3803j;
import java.util.List;
import p082ea.C6801d;

/* renamed from: t9.x */
/* loaded from: classes5.dex */
public final class C13039x {

    /* renamed from: a */
    private final Context f29339a;

    /* renamed from: b */
    private int f29340b;

    /* renamed from: c */
    private int f29341c = 0;

    public C13039x(Context context) {
        this.f29339a = context;
    }

    /* renamed from: a */
    public final synchronized int m4704a() {
        PackageInfo packageInfo;
        if (this.f29340b == 0) {
            try {
                packageInfo = C6801d.m24304a(this.f29339a).m24306e("com.google.android.gms", 0);
            } catch (PackageManager.NameNotFoundException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb2 = new StringBuilder(valueOf.length() + 23);
                sb2.append("Failed to find package ");
                sb2.append(valueOf);
                Log.w("Metadata", sb2.toString());
                packageInfo = null;
            }
            if (packageInfo != null) {
                this.f29340b = packageInfo.versionCode;
            }
        }
        return this.f29340b;
    }

    /* renamed from: b */
    public final synchronized int m4703b() {
        int i = this.f29341c;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f29339a.getPackageManager();
        if (C6801d.m24304a(this.f29339a).m24309b("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("Metadata", "Google Play services missing or without correct permission.");
            return 0;
        }
        int i2 = 1;
        if (!C3803j.m33559h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f29341c = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers != null && queryBroadcastReceivers.size() > 0) {
            this.f29341c = 2;
            return 2;
        }
        Log.w("Metadata", "Failed to resolve IID implementation package, falling back");
        if (C3803j.m33559h()) {
            this.f29341c = 2;
            i2 = 2;
        } else {
            this.f29341c = 1;
        }
        return i2;
    }
}
