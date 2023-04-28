package p463zc;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import androidx.core.content.C2337a;
import p300qc.AbstractC12105c;

/* renamed from: zc.a */
/* loaded from: classes3.dex */
public class C14616a {

    /* renamed from: a */
    private final Context f33082a;

    /* renamed from: b */
    private final SharedPreferences f33083b;

    /* renamed from: c */
    private final AbstractC12105c f33084c;

    /* renamed from: d */
    private boolean f33085d = m123c();

    public C14616a(Context context, String str, AbstractC12105c cVar) {
        Context a = m125a(context);
        this.f33082a = a;
        this.f33083b = a.getSharedPreferences("com.google.firebase.common.prefs:" + str, 0);
        this.f33084c = cVar;
    }

    /* renamed from: a */
    private static Context m125a(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return context;
        }
        return C2337a.m38136b(context);
    }

    /* renamed from: c */
    private boolean m123c() {
        if (this.f33083b.contains("firebase_data_collection_default_enabled")) {
            return this.f33083b.getBoolean("firebase_data_collection_default_enabled", true);
        }
        return m122d();
    }

    /* renamed from: d */
    private boolean m122d() {
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            PackageManager packageManager = this.f33082a.getPackageManager();
            if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(this.f33082a.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_data_collection_default_enabled")) {
                return true;
            }
            return applicationInfo.metaData.getBoolean("firebase_data_collection_default_enabled");
        } catch (PackageManager.NameNotFoundException unused) {
            return true;
        }
    }

    /* renamed from: b */
    public synchronized boolean m124b() {
        return this.f33085d;
    }
}
