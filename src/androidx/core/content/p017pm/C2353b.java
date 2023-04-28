package androidx.core.content.p017pm;

import android.content.Context;
import android.content.pm.ShortcutInfo;
import android.content.pm.ShortcutManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import androidx.core.content.p017pm.AbstractC2352a;
import androidx.core.graphics.drawable.IconCompat;
import androidx.core.util.C2517g;
import java.io.InputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import p021b1.AbstractC3342a;

/* renamed from: androidx.core.content.pm.b */
/* loaded from: classes.dex */
public class C2353b {

    /* renamed from: a */
    private static volatile AbstractC2352a<?> f3267a;

    /* renamed from: b */
    private static volatile List<AbstractC3342a> f3268b;

    /* renamed from: androidx.core.content.pm.b$a */
    /* loaded from: classes.dex */
    private static class C2354a {
        /* renamed from: a */
        static String m38061a(List<ShortcutInfo> list) {
            int rank;
            String id2;
            int rank2;
            int i = -1;
            String str = null;
            for (ShortcutInfo shortcutInfo : list) {
                rank = shortcutInfo.getRank();
                if (rank > i) {
                    id2 = shortcutInfo.getId();
                    rank2 = shortcutInfo.getRank();
                    str = id2;
                    i = rank2;
                }
            }
            return str;
        }
    }

    private C2353b() {
    }

    /* renamed from: a */
    static boolean m38069a(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        Bitmap decodeStream;
        IconCompat iconCompat;
        IconCompat iconCompat2 = shortcutInfoCompat.f3244i;
        if (iconCompat2 == null) {
            return false;
        }
        int i = iconCompat2.f3339a;
        if (i != 6 && i != 4) {
            return true;
        }
        InputStream s = iconCompat2.m37864s(context);
        if (s == null || (decodeStream = BitmapFactory.decodeStream(s)) == null) {
            return false;
        }
        if (i == 6) {
            iconCompat = IconCompat.m37878e(decodeStream);
        } else {
            iconCompat = IconCompat.m37875h(decodeStream);
        }
        shortcutInfoCompat.f3244i = iconCompat;
        return true;
    }

    /* renamed from: b */
    public static int m38068b(Context context) {
        int maxShortcutCountPerActivity;
        C2517g.m37588g(context);
        if (Build.VERSION.SDK_INT < 25) {
            return 5;
        }
        maxShortcutCountPerActivity = ((ShortcutManager) context.getSystemService(ShortcutManager.class)).getMaxShortcutCountPerActivity();
        return maxShortcutCountPerActivity;
    }

    /* renamed from: c */
    private static String m38067c(List<ShortcutInfoCompat> list) {
        int i = -1;
        String str = null;
        for (ShortcutInfoCompat shortcutInfoCompat : list) {
            if (shortcutInfoCompat.m38089i() > i) {
                str = shortcutInfoCompat.m38092f();
                i = shortcutInfoCompat.m38089i();
            }
        }
        return str;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x002b  */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.List<p021b1.AbstractC3342a> m38066d(android.content.Context r8) {
        /*
            java.util.List<b1.a> r0 = androidx.core.content.p017pm.C2353b.f3268b
            if (r0 != 0) goto L_0x0071
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            android.content.pm.PackageManager r1 = r8.getPackageManager()
            android.content.Intent r2 = new android.content.Intent
            java.lang.String r3 = "androidx.core.content.pm.SHORTCUT_LISTENER"
            r2.<init>(r3)
            java.lang.String r3 = r8.getPackageName()
            r2.setPackage(r3)
            r3 = 128(0x80, float:1.794E-43)
            java.util.List r1 = r1.queryIntentActivities(r2, r3)
            java.util.Iterator r1 = r1.iterator()
        L_0x0025:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x006b
            java.lang.Object r2 = r1.next()
            android.content.pm.ResolveInfo r2 = (android.content.pm.ResolveInfo) r2
            android.content.pm.ActivityInfo r2 = r2.activityInfo
            if (r2 != 0) goto L_0x0036
            goto L_0x0025
        L_0x0036:
            android.os.Bundle r2 = r2.metaData
            if (r2 != 0) goto L_0x003b
            goto L_0x0025
        L_0x003b:
            java.lang.String r3 = "androidx.core.content.pm.shortcut_listener_impl"
            java.lang.String r2 = r2.getString(r3)
            if (r2 != 0) goto L_0x0044
            goto L_0x0025
        L_0x0044:
            java.lang.Class<androidx.core.content.pm.b> r3 = androidx.core.content.p017pm.C2353b.class
            java.lang.ClassLoader r3 = r3.getClassLoader()     // Catch: Exception -> 0x0025
            r4 = 0
            java.lang.Class r2 = java.lang.Class.forName(r2, r4, r3)     // Catch: Exception -> 0x0025
            java.lang.String r3 = "getInstance"
            r5 = 1
            java.lang.Class[] r6 = new java.lang.Class[r5]     // Catch: Exception -> 0x0025
            java.lang.Class<android.content.Context> r7 = android.content.Context.class
            r6[r4] = r7     // Catch: Exception -> 0x0025
            java.lang.reflect.Method r2 = r2.getMethod(r3, r6)     // Catch: Exception -> 0x0025
            java.lang.Object[] r3 = new java.lang.Object[r5]     // Catch: Exception -> 0x0025
            r3[r4] = r8     // Catch: Exception -> 0x0025
            r4 = 0
            java.lang.Object r2 = r2.invoke(r4, r3)     // Catch: Exception -> 0x0025
            b1.a r2 = (p021b1.AbstractC3342a) r2     // Catch: Exception -> 0x0025
            r0.add(r2)     // Catch: Exception -> 0x0025
            goto L_0x0025
        L_0x006b:
            java.util.List<b1.a> r8 = androidx.core.content.p017pm.C2353b.f3268b
            if (r8 != 0) goto L_0x0071
            androidx.core.content.p017pm.C2353b.f3268b = r0
        L_0x0071:
            java.util.List<b1.a> r8 = androidx.core.content.p017pm.C2353b.f3268b
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.core.content.p017pm.C2353b.m38066d(android.content.Context):java.util.List");
    }

    /* renamed from: e */
    private static AbstractC2352a<?> m38065e(Context context) {
        if (f3267a == null) {
            try {
                f3267a = (AbstractC2352a) Class.forName("s1.a", false, C2353b.class.getClassLoader()).getMethod("getInstance", Context.class).invoke(null, context);
            } catch (Exception unused) {
            }
            if (f3267a == null) {
                f3267a = new AbstractC2352a.C0036a();
            }
        }
        return f3267a;
    }

    /* renamed from: f */
    public static boolean m38064f(Context context, ShortcutInfoCompat shortcutInfoCompat) {
        boolean isRateLimitingActive;
        List dynamicShortcuts;
        C2517g.m37588g(context);
        C2517g.m37588g(shortcutInfoCompat);
        int i = Build.VERSION.SDK_INT;
        if (i > 31 || !shortcutInfoCompat.m38087k(1)) {
            int b = m38068b(context);
            if (b == 0) {
                return false;
            }
            if (i <= 29) {
                m38069a(context, shortcutInfoCompat);
            }
            if (i >= 30) {
                ((ShortcutManager) context.getSystemService(ShortcutManager.class)).pushDynamicShortcut(shortcutInfoCompat.m38086l());
            } else if (i >= 25) {
                ShortcutManager shortcutManager = (ShortcutManager) context.getSystemService(ShortcutManager.class);
                isRateLimitingActive = shortcutManager.isRateLimitingActive();
                if (isRateLimitingActive) {
                    return false;
                }
                dynamicShortcuts = shortcutManager.getDynamicShortcuts();
                if (dynamicShortcuts.size() >= b) {
                    shortcutManager.removeDynamicShortcuts(Arrays.asList(C2354a.m38061a(dynamicShortcuts)));
                }
                shortcutManager.addDynamicShortcuts(Arrays.asList(shortcutInfoCompat.m38086l()));
            }
            AbstractC2352a<?> e = m38065e(context);
            try {
                List<ShortcutInfoCompat> b2 = e.mo5546b();
                if (b2.size() >= b) {
                    e.mo5544d(Arrays.asList(m38067c(b2)));
                }
                e.mo5547a(Arrays.asList(shortcutInfoCompat));
                for (AbstractC3342a aVar : m38066d(context)) {
                    aVar.m34614b(Collections.singletonList(shortcutInfoCompat));
                }
                m38062h(context, shortcutInfoCompat.m38092f());
                return true;
            } catch (Exception unused) {
                for (AbstractC3342a aVar2 : m38066d(context)) {
                    aVar2.m34614b(Collections.singletonList(shortcutInfoCompat));
                }
                m38062h(context, shortcutInfoCompat.m38092f());
                return false;
            } catch (Throwable th2) {
                for (AbstractC3342a aVar3 : m38066d(context)) {
                    aVar3.m34614b(Collections.singletonList(shortcutInfoCompat));
                }
                m38062h(context, shortcutInfoCompat.m38092f());
                throw th2;
            }
        } else {
            for (AbstractC3342a aVar4 : m38066d(context)) {
                aVar4.m34614b(Collections.singletonList(shortcutInfoCompat));
            }
            return true;
        }
    }

    /* renamed from: g */
    public static void m38063g(Context context) {
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).removeAllDynamicShortcuts();
        }
        m38065e(context).mo5545c();
        for (AbstractC3342a aVar : m38066d(context)) {
            aVar.m34615a();
        }
    }

    /* renamed from: h */
    public static void m38062h(Context context, String str) {
        C2517g.m37588g(context);
        C2517g.m37588g(str);
        if (Build.VERSION.SDK_INT >= 25) {
            ((ShortcutManager) context.getSystemService(ShortcutManager.class)).reportShortcutUsed(str);
        }
        for (AbstractC3342a aVar : m38066d(context)) {
            aVar.m34613c(Collections.singletonList(str));
        }
    }
}
