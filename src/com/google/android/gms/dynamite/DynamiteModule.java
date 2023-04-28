package com.google.android.gms.dynamite;

import android.content.Context;
import android.util.Log;
import com.google.android.gms.common.util.DynamiteApi;
import java.lang.reflect.Field;
import p420x9.C13996n;

/* loaded from: classes5.dex */
public final class DynamiteModule {

    /* renamed from: g */
    private static final ThreadLocal<Object> f10242g = new ThreadLocal<>();

    /* renamed from: h */
    private static final ThreadLocal<Long> f10243h = new C5419a();

    /* renamed from: i */
    private static final AbstractC5418a.AbstractC0151a f10244i = new C5420b();

    /* renamed from: a */
    public static final AbstractC5418a f10236a = new C5421c();

    /* renamed from: b */
    public static final AbstractC5418a f10237b = new C5422d();

    /* renamed from: c */
    public static final AbstractC5418a f10238c = new C5423e();

    /* renamed from: d */
    public static final AbstractC5418a f10239d = new C5424f();

    /* renamed from: e */
    public static final AbstractC5418a f10240e = new C5425g();

    /* renamed from: f */
    public static final AbstractC5418a f10241f = new C5426h();

    /* renamed from: j */
    public static final AbstractC5418a f10245j = new C5427i();

    @DynamiteApi
    /* loaded from: classes5.dex */
    public static class DynamiteLoaderClassLoader {
        public static ClassLoader sClassLoader;
    }

    /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a */
    /* loaded from: classes5.dex */
    public interface AbstractC5418a {

        /* renamed from: com.google.android.gms.dynamite.DynamiteModule$a$a */
        /* loaded from: classes5.dex */
        public interface AbstractC0151a {
        }
    }

    /* renamed from: a */
    public static int m28940a(Context context, String str) {
        String str2;
        try {
            ClassLoader classLoader = context.getApplicationContext().getClassLoader();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 61);
            sb2.append("com.google.android.gms.dynamite.descriptors.");
            sb2.append(str);
            sb2.append(".");
            sb2.append("ModuleDescriptor");
            Class<?> loadClass = classLoader.loadClass(sb2.toString());
            Field declaredField = loadClass.getDeclaredField("MODULE_ID");
            Field declaredField2 = loadClass.getDeclaredField("MODULE_VERSION");
            if (C13996n.m2071b(declaredField.get(null), str)) {
                return declaredField2.getInt(null);
            }
            String valueOf = String.valueOf(declaredField.get(null));
            StringBuilder sb3 = new StringBuilder(valueOf.length() + 51 + String.valueOf(str).length());
            sb3.append("Module descriptor id '");
            sb3.append(valueOf);
            sb3.append("' didn't match expected id '");
            sb3.append(str);
            sb3.append("'");
            Log.e("DynamiteModule", sb3.toString());
            return 0;
        } catch (ClassNotFoundException unused) {
            StringBuilder sb4 = new StringBuilder(String.valueOf(str).length() + 45);
            sb4.append("Local module descriptor class for ");
            sb4.append(str);
            sb4.append(" not found.");
            Log.w("DynamiteModule", sb4.toString());
            return 0;
        } catch (Exception e) {
            String valueOf2 = String.valueOf(e.getMessage());
            if (valueOf2.length() != 0) {
                str2 = "Failed to load module descriptor class: ".concat(valueOf2);
            } else {
                str2 = new String("Failed to load module descriptor class: ");
            }
            Log.e("DynamiteModule", str2);
            return 0;
        }
    }
}
