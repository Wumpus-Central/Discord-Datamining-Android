package com.google.firebase.messaging;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.util.Log;
import ca.C3803j;
import java.util.List;
import p136hc.C7984d;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.firebase.messaging.e0 */
/* loaded from: classes3.dex */
public class C5825e0 {

    /* renamed from: a */
    private final Context f11567a;

    /* renamed from: b */
    private String f11568b;

    /* renamed from: c */
    private String f11569c;

    /* renamed from: d */
    private int f11570d;

    /* renamed from: e */
    private int f11571e = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C5825e0(Context context) {
        this.f11567a = context;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static String m27172c(C7984d dVar) {
        String d = dVar.m20964m().m20940d();
        if (d != null) {
            return d;
        }
        String c = dVar.m20964m().m20941c();
        if (!c.startsWith("1:")) {
            return c;
        }
        String[] split = c.split(":");
        if (split.length < 2) {
            return null;
        }
        String str = split[1];
        if (str.isEmpty()) {
            return null;
        }
        return str;
    }

    /* renamed from: f */
    private PackageInfo m27169f(String str) {
        try {
            return this.f11567a.getPackageManager().getPackageInfo(str, 0);
        } catch (PackageManager.NameNotFoundException e) {
            Log.w("FirebaseMessaging", "Failed to find package " + e);
            return null;
        }
    }

    /* renamed from: h */
    private synchronized void m27167h() {
        PackageInfo f = m27169f(this.f11567a.getPackageName());
        if (f != null) {
            this.f11568b = Integer.toString(f.versionCode);
            this.f11569c = f.versionName;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public synchronized String m27174a() {
        if (this.f11568b == null) {
            m27167h();
        }
        return this.f11568b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public synchronized String m27173b() {
        if (this.f11569c == null) {
            m27167h();
        }
        return this.f11569c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public synchronized int m27171d() {
        PackageInfo f;
        if (this.f11570d == 0 && (f = m27169f("com.google.android.gms")) != null) {
            this.f11570d = f.versionCode;
        }
        return this.f11570d;
    }

    /* renamed from: e */
    synchronized int m27170e() {
        int i = this.f11571e;
        if (i != 0) {
            return i;
        }
        PackageManager packageManager = this.f11567a.getPackageManager();
        if (packageManager.checkPermission("com.google.android.c2dm.permission.SEND", "com.google.android.gms") == -1) {
            Log.e("FirebaseMessaging", "Google Play services missing or without correct permission.");
            return 0;
        }
        if (!C3803j.m33559h()) {
            Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
            intent.setPackage("com.google.android.gms");
            List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 0);
            if (queryIntentServices != null && queryIntentServices.size() > 0) {
                this.f11571e = 1;
                return 1;
            }
        }
        Intent intent2 = new Intent("com.google.iid.TOKEN_REQUEST");
        intent2.setPackage("com.google.android.gms");
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent2, 0);
        if (queryBroadcastReceivers == null || queryBroadcastReceivers.size() <= 0) {
            Log.w("FirebaseMessaging", "Failed to resolve IID implementation package, falling back");
            if (C3803j.m33559h()) {
                this.f11571e = 2;
            } else {
                this.f11571e = 1;
            }
            return this.f11571e;
        }
        this.f11571e = 2;
        return 2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g */
    public boolean m27168g() {
        return m27170e() != 0;
    }
}
