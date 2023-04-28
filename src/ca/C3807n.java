package ca;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Process;
import android.os.WorkSource;
import android.util.Log;
import java.lang.reflect.Method;
import p082ea.C6801d;

/* renamed from: ca.n */
/* loaded from: classes5.dex */
public class C3807n {

    /* renamed from: a */
    private static final int f6301a = Process.myUid();

    /* renamed from: b */
    private static final Method f6302b;

    /* renamed from: c */
    private static final Method f6303c;

    /* renamed from: d */
    private static final Method f6304d;

    /* renamed from: e */
    private static final Method f6305e;

    /* renamed from: f */
    private static final Method f6306f;

    /* renamed from: g */
    private static final Method f6307g;

    /* renamed from: h */
    private static final Method f6308h;

    /* renamed from: i */
    private static final Method f6309i;

    /* JADX WARN: Can't wrap try/catch for region: R(24:2|(2:45|3)|5|(21:53|7|9|41|10|12|39|13|15|(12:51|17|19|(9:47|21|25|(6:43|27|31|(2:49|33)|34|35)|30|31|(0)|34|35)|24|25|(0)|30|31|(0)|34|35)|18|19|(0)|24|25|(0)|30|31|(0)|34|35)|8|9|41|10|12|39|13|15|(0)|18|19|(0)|24|25|(0)|30|31|(0)|34|35) */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x003d, code lost:
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004d, code lost:
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0086 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x006e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00aa A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0056 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    static {
        /*
            java.lang.String r0 = "add"
            java.lang.Class<android.os.WorkSource> r1 = android.os.WorkSource.class
            int r2 = android.os.Process.myUid()
            ca.C3807n.f6301a = r2
            r2 = 1
            r3 = 0
            r4 = 0
            java.lang.Class[] r5 = new java.lang.Class[r2]     // Catch: Exception -> 0x0018
            java.lang.Class r6 = java.lang.Integer.TYPE     // Catch: Exception -> 0x0018
            r5[r3] = r6     // Catch: Exception -> 0x0018
            java.lang.reflect.Method r5 = r1.getMethod(r0, r5)     // Catch: Exception -> 0x0018
            goto L_0x0019
        L_0x0018:
            r5 = r4
        L_0x0019:
            ca.C3807n.f6302b = r5
            boolean r5 = ca.C3803j.m33564c()
            java.lang.Class<java.lang.String> r6 = java.lang.String.class
            r7 = 2
            if (r5 == 0) goto L_0x0031
            java.lang.Class[] r5 = new java.lang.Class[r7]     // Catch: Exception -> 0x0031
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: Exception -> 0x0031
            r5[r3] = r8     // Catch: Exception -> 0x0031
            r5[r2] = r6     // Catch: Exception -> 0x0031
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: Exception -> 0x0031
            goto L_0x0032
        L_0x0031:
            r0 = r4
        L_0x0032:
            ca.C3807n.f6303c = r0
            java.lang.String r0 = "size"
            java.lang.Class[] r5 = new java.lang.Class[r3]     // Catch: Exception -> 0x003d
            java.lang.reflect.Method r0 = r1.getMethod(r0, r5)     // Catch: Exception -> 0x003d
            goto L_0x003e
        L_0x003d:
            r0 = r4
        L_0x003e:
            ca.C3807n.f6304d = r0
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: Exception -> 0x004d
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: Exception -> 0x004d
            r0[r3] = r5     // Catch: Exception -> 0x004d
            java.lang.String r5 = "get"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch: Exception -> 0x004d
            goto L_0x004e
        L_0x004d:
            r0 = r4
        L_0x004e:
            ca.C3807n.f6305e = r0
            boolean r0 = ca.C3803j.m33564c()
            if (r0 == 0) goto L_0x0063
            java.lang.Class[] r0 = new java.lang.Class[r2]     // Catch: Exception -> 0x0063
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: Exception -> 0x0063
            r0[r3] = r5     // Catch: Exception -> 0x0063
            java.lang.String r5 = "getName"
            java.lang.reflect.Method r0 = r1.getMethod(r5, r0)     // Catch: Exception -> 0x0063
            goto L_0x0064
        L_0x0063:
            r0 = r4
        L_0x0064:
            ca.C3807n.f6306f = r0
            boolean r0 = ca.C3803j.m33558i()
            java.lang.String r5 = "WorkSourceUtil"
            if (r0 == 0) goto L_0x007d
            java.lang.String r0 = "createWorkChain"
            java.lang.Class[] r8 = new java.lang.Class[r3]     // Catch: Exception -> 0x0077
            java.lang.reflect.Method r0 = r1.getMethod(r0, r8)     // Catch: Exception -> 0x0077
            goto L_0x007e
        L_0x0077:
            r0 = move-exception
            java.lang.String r8 = "Missing WorkChain API createWorkChain"
            android.util.Log.w(r5, r8, r0)
        L_0x007d:
            r0 = r4
        L_0x007e:
            ca.C3807n.f6307g = r0
            boolean r0 = ca.C3803j.m33558i()
            if (r0 == 0) goto L_0x00a1
            java.lang.String r0 = "android.os.WorkSource$WorkChain"
            java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: Exception -> 0x009b
            java.lang.Class[] r7 = new java.lang.Class[r7]     // Catch: Exception -> 0x009b
            java.lang.Class r8 = java.lang.Integer.TYPE     // Catch: Exception -> 0x009b
            r7[r3] = r8     // Catch: Exception -> 0x009b
            r7[r2] = r6     // Catch: Exception -> 0x009b
            java.lang.String r6 = "addNode"
            java.lang.reflect.Method r0 = r0.getMethod(r6, r7)     // Catch: Exception -> 0x009b
            goto L_0x00a2
        L_0x009b:
            r0 = move-exception
            java.lang.String r6 = "Missing WorkChain class"
            android.util.Log.w(r5, r6, r0)
        L_0x00a1:
            r0 = r4
        L_0x00a2:
            ca.C3807n.f6308h = r0
            boolean r0 = ca.C3803j.m33558i()
            if (r0 == 0) goto L_0x00b5
            java.lang.String r0 = "isEmpty"
            java.lang.Class[] r3 = new java.lang.Class[r3]     // Catch: Exception -> 0x00b5
            java.lang.reflect.Method r4 = r1.getMethod(r0, r3)     // Catch: Exception -> 0x00b5
            r4.setAccessible(r2)     // Catch: Exception -> 0x00b5
        L_0x00b5:
            ca.C3807n.f6309i = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: ca.C3807n.<clinit>():void");
    }

    /* renamed from: a */
    public static void m33551a(WorkSource workSource, int i, String str) {
        Method method = f6303c;
        if (method != null) {
            if (str == null) {
                str = "";
            }
            try {
                method.invoke(workSource, Integer.valueOf(i), str);
            } catch (Exception e) {
                Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e);
            }
        } else {
            Method method2 = f6302b;
            if (method2 != null) {
                try {
                    method2.invoke(workSource, Integer.valueOf(i));
                } catch (Exception e2) {
                    Log.wtf("WorkSourceUtil", "Unable to assign blame through WorkSource", e2);
                }
            }
        }
    }

    /* renamed from: b */
    public static WorkSource m33550b(Context context, String str) {
        String str2;
        String str3;
        if (!(context == null || context.getPackageManager() == null || str == null)) {
            try {
                ApplicationInfo c = C6801d.m24304a(context).m24308c(str, 0);
                if (c == null) {
                    if (str.length() != 0) {
                        str3 = "Could not get applicationInfo from package: ".concat(str);
                    } else {
                        str3 = new String("Could not get applicationInfo from package: ");
                    }
                    Log.e("WorkSourceUtil", str3);
                    return null;
                }
                int i = c.uid;
                WorkSource workSource = new WorkSource();
                m33551a(workSource, i, str);
                return workSource;
            } catch (PackageManager.NameNotFoundException unused) {
                if (str.length() != 0) {
                    str2 = "Could not find package: ".concat(str);
                } else {
                    str2 = new String("Could not find package: ");
                }
                Log.e("WorkSourceUtil", str2);
            }
        }
        return null;
    }

    /* renamed from: c */
    public static boolean m33549c(Context context) {
        if (context == null || context.getPackageManager() == null || C6801d.m24304a(context).m24309b("android.permission.UPDATE_DEVICE_STATS", context.getPackageName()) != 0) {
            return false;
        }
        return true;
    }
}
