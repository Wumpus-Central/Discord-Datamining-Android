package com.google.firebase.messaging;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.util.Log;
import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: com.google.firebase.messaging.q0 */
/* loaded from: classes3.dex */
public class C5853q0 {

    /* renamed from: e */
    private static C5853q0 f11606e;

    /* renamed from: a */
    private String f11607a = null;

    /* renamed from: b */
    private Boolean f11608b = null;

    /* renamed from: c */
    private Boolean f11609c = null;

    /* renamed from: d */
    private final Queue<Intent> f11610d = new ArrayDeque();

    private C5853q0() {
    }

    /* renamed from: a */
    private int m27089a(Context context, Intent intent) {
        ComponentName componentName;
        String f = m27084f(context, intent);
        if (f != null) {
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                Log.d("FirebaseMessaging", "Restricting intent to a specific service: " + f);
            }
            intent.setClassName(context.getPackageName(), f);
        }
        try {
            if (m27085e(context)) {
                componentName = C5811a1.m27237e(context, intent);
            } else {
                componentName = context.startService(intent);
                Log.d("FirebaseMessaging", "Missing wake lock permission, service start may be delayed");
            }
            if (componentName != null) {
                return -1;
            }
            Log.e("FirebaseMessaging", "Error while delivering the message: ServiceIntent not found.");
            return 404;
        } catch (IllegalStateException e) {
            Log.e("FirebaseMessaging", "Failed to start service while in background: " + e);
            return 402;
        } catch (SecurityException e2) {
            Log.e("FirebaseMessaging", "Error while delivering the message to the serviceIntent", e2);
            return 401;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public static synchronized C5853q0 m27088b() {
        C5853q0 q0Var;
        synchronized (C5853q0.class) {
            if (f11606e == null) {
                f11606e = new C5853q0();
            }
            q0Var = f11606e;
        }
        return q0Var;
    }

    /* renamed from: f */
    private synchronized String m27084f(Context context, Intent intent) {
        ServiceInfo serviceInfo;
        String str;
        String str2 = this.f11607a;
        if (str2 != null) {
            return str2;
        }
        ResolveInfo resolveService = context.getPackageManager().resolveService(intent, 0);
        if (!(resolveService == null || (serviceInfo = resolveService.serviceInfo) == null)) {
            if (context.getPackageName().equals(serviceInfo.packageName) && (str = serviceInfo.name) != null) {
                if (str.startsWith(".")) {
                    this.f11607a = context.getPackageName() + serviceInfo.name;
                } else {
                    this.f11607a = serviceInfo.name;
                }
                return this.f11607a;
            }
            Log.e("FirebaseMessaging", "Error resolving target intent service, skipping classname enforcement. Resolved service was: " + serviceInfo.packageName + "/" + serviceInfo.name);
            return null;
        }
        Log.e("FirebaseMessaging", "Failed to resolve target intent service, skipping classname enforcement");
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public Intent m27087c() {
        return this.f11610d.poll();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d */
    public boolean m27086d(Context context) {
        boolean z;
        if (this.f11609c == null) {
            if (context.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f11609c = Boolean.valueOf(z);
        }
        if (!this.f11608b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.ACCESS_NETWORK_STATE this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f11609c.booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: e */
    public boolean m27085e(Context context) {
        boolean z;
        if (this.f11608b == null) {
            if (context.checkCallingOrSelfPermission("android.permission.WAKE_LOCK") == 0) {
                z = true;
            } else {
                z = false;
            }
            this.f11608b = Boolean.valueOf(z);
        }
        if (!this.f11608b.booleanValue() && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: android.permission.WAKE_LOCK this should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return this.f11608b.booleanValue();
    }

    /* renamed from: g */
    public int m27083g(Context context, Intent intent) {
        if (Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Starting service");
        }
        this.f11610d.offer(intent);
        Intent intent2 = new Intent("com.google.firebase.MESSAGING_EVENT");
        intent2.setPackage(context.getPackageName());
        return m27089a(context, intent2);
    }
}
