package com.google.firebase;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import cd.C3980c;
import cd.C3982e;
import cd.C3985h;
import com.google.firebase.FirebaseCommonRegistrar;
import java.util.ArrayList;
import java.util.List;
import p177jc.AbstractC9535i;
import p177jc.C9523d;
import p321rc.C12559g;

/* loaded from: classes3.dex */
public class FirebaseCommonRegistrar implements AbstractC9535i {
    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public static /* synthetic */ String m27339e(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo != null) {
            return String.valueOf(applicationInfo.targetSdkVersion);
        }
        return "";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static /* synthetic */ String m27338f(Context context) {
        int i;
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        if (applicationInfo == null || Build.VERSION.SDK_INT < 24) {
            return "";
        }
        i = applicationInfo.minSdkVersion;
        return String.valueOf(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: g */
    public static /* synthetic */ String m27337g(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.television")) {
            return "tv";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.watch")) {
            return "watch";
        }
        if (context.getPackageManager().hasSystemFeature("android.hardware.type.automotive")) {
            return "auto";
        }
        if (i < 26 || !context.getPackageManager().hasSystemFeature("android.hardware.type.embedded")) {
            return "";
        }
        return "embedded";
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static /* synthetic */ String m27336h(Context context) {
        String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
        if (installerPackageName != null) {
            return m27335i(installerPackageName);
        }
        return "";
    }

    /* renamed from: i */
    private static String m27335i(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // p177jc.AbstractC9535i
    public List<C9523d<?>> getComponents() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(C3980c.m33208c());
        arrayList.add(C12559g.m6558h());
        arrayList.add(C3985h.m33198b("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C3985h.m33198b("fire-core", "20.1.0"));
        arrayList.add(C3985h.m33198b("device-name", m27335i(Build.PRODUCT)));
        arrayList.add(C3985h.m33198b("device-model", m27335i(Build.DEVICE)));
        arrayList.add(C3985h.m33198b("device-brand", m27335i(Build.BRAND)));
        arrayList.add(C3985h.m33197c("android-target-sdk", new C3985h.AbstractC3986a() { // from class: hc.f
            @Override // cd.C3985h.AbstractC3986a
            /* renamed from: a */
            public final String mo20944a(Object obj) {
                String e;
                e = FirebaseCommonRegistrar.m27339e((Context) obj);
                return e;
            }
        }));
        arrayList.add(C3985h.m33197c("android-min-sdk", new C3985h.AbstractC3986a() { // from class: hc.g
            @Override // cd.C3985h.AbstractC3986a
            /* renamed from: a */
            public final String mo20944a(Object obj) {
                String f;
                f = FirebaseCommonRegistrar.m27338f((Context) obj);
                return f;
            }
        }));
        arrayList.add(C3985h.m33197c("android-platform", new C3985h.AbstractC3986a() { // from class: hc.h
            @Override // cd.C3985h.AbstractC3986a
            /* renamed from: a */
            public final String mo20944a(Object obj) {
                String g;
                g = FirebaseCommonRegistrar.m27337g((Context) obj);
                return g;
            }
        }));
        arrayList.add(C3985h.m33197c("android-installer", new C3985h.AbstractC3986a() { // from class: hc.i
            @Override // cd.C3985h.AbstractC3986a
            /* renamed from: a */
            public final String mo20944a(Object obj) {
                String h;
                h = FirebaseCommonRegistrar.m27336h((Context) obj);
                return h;
            }
        }));
        String a = C3982e.m33203a();
        if (a != null) {
            arrayList.add(C3985h.m33198b("kotlin", a));
        }
        return arrayList;
    }
}
