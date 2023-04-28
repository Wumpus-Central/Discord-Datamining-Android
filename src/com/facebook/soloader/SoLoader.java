package com.facebook.soloader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Bundle;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.facebook.soloader.SysUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import p116g6.C7420a;
import p116g6.C7422c;
import p163j$.util.Spliterator;
import p163j$.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class SoLoader {

    /* renamed from: b */
    static AbstractC5110p f8723b;

    /* renamed from: f */
    private static AbstractC5112r[] f8727f;

    /* renamed from: g */
    private static C5086b f8728g;

    /* renamed from: m */
    private static int f8734m;

    /* renamed from: c */
    private static final ReentrantReadWriteLock f8724c = new ReentrantReadWriteLock();

    /* renamed from: d */
    private static volatile AbstractC5111q[] f8725d = null;

    /* renamed from: e */
    private static final AtomicInteger f8726e = new AtomicInteger(0);

    /* renamed from: h */
    private static final HashSet<String> f8729h = new HashSet<>();

    /* renamed from: i */
    private static final Map<String, Object> f8730i = new HashMap();

    /* renamed from: j */
    private static final Set<String> f8731j = Collections.newSetFromMap(new ConcurrentHashMap());

    /* renamed from: k */
    private static boolean f8732k = true;

    /* renamed from: l */
    private static final String[] f8733l = {System.mapLibraryName("breakpad")};

    /* renamed from: n */
    private static int f8735n = 0;

    /* renamed from: a */
    static final boolean f8722a = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.soloader.SoLoader$a */
    /* loaded from: classes7.dex */
    public class C5083a implements AbstractC5110p {

        /* renamed from: a */
        final /* synthetic */ boolean f8736a;

        /* renamed from: b */
        final /* synthetic */ String f8737b;

        /* renamed from: c */
        final /* synthetic */ String f8738c;

        /* renamed from: d */
        final /* synthetic */ Runtime f8739d;

        /* renamed from: e */
        final /* synthetic */ Method f8740e;

        C5083a(boolean z, String str, String str2, Runtime runtime, Method method) {
            this.f8736a = z;
            this.f8737b = str;
            this.f8738c = str2;
            this.f8739d = runtime;
            this.f8740e = method;
        }

        /* renamed from: c */
        private String m30778c(String str) {
            try {
                File file = new File(str);
                MessageDigest instance = MessageDigest.getInstance("MD5");
                FileInputStream fileInputStream = new FileInputStream(file);
                try {
                    byte[] bArr = new byte[4096];
                    while (true) {
                        int read = fileInputStream.read(bArr);
                        if (read > 0) {
                            instance.update(bArr, 0, read);
                        } else {
                            String format = String.format("%32x", new BigInteger(1, instance.digest()));
                            fileInputStream.close();
                            return format;
                        }
                    }
                } catch (Throwable th2) {
                    try {
                        fileInputStream.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            } catch (IOException | SecurityException | NoSuchAlgorithmException e) {
                return e.toString();
            }
        }

        /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
            if (r1 == null) goto L_?;
         */
        /* JADX WARN: Code restructure failed: missing block: B:18:0x0037, code lost:
            android.util.Log.e("SoLoader", "Error when loading lib: " + r1 + " lib hash: " + m30778c(r9) + " search path is " + r10);
         */
        /* JADX WARN: Code restructure failed: missing block: B:50:?, code lost:
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
            return;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:39:0x009e  */
        /* JADX WARN: Type inference failed for: r1v0 */
        /* JADX WARN: Type inference failed for: r1v10 */
        @Override // com.facebook.soloader.AbstractC5110p
        /* renamed from: a */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public void mo30713a(java.lang.String r9, int r10) {
            /*
                Method dump skipped, instructions count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.soloader.SoLoader.C5083a.mo30713a(java.lang.String, int):void");
        }

        @Override // com.facebook.soloader.AbstractC5110p
        /* renamed from: b */
        public void mo30712b(String str, AbstractC5090f fVar, int i) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.facebook.soloader.SoLoader$b */
    /* loaded from: classes7.dex */
    public static final class C5084b extends UnsatisfiedLinkError {
        C5084b(Throwable th2, String str) {
            super("APK was built for a different platform. Supported ABIs: " + Arrays.toString(SysUtil.m30767k()) + " error: " + str);
            initCause(th2);
        }
    }

    /* renamed from: A */
    static File m30805A(String str) {
        f8724c.readLock().lock();
        try {
            for (AbstractC5111q qVar : f8725d) {
                File c = qVar.mo30711c(str);
                if (c != null) {
                    return c;
                }
            }
            f8724c.readLock().unlock();
            throw new FileNotFoundException(str);
        } finally {
            f8724c.readLock().unlock();
        }
    }

    /* renamed from: a */
    private static void m30804a(Context context, ArrayList<AbstractC5111q> arrayList, int i) {
        if ((f8734m & 8) != 0) {
            f8727f = null;
            File s = AbstractC5112r.m30698s(context, "lib-main");
            try {
                SysUtil.m30775c(s);
            } catch (IOException e) {
                Log.w("SoLoader", "Failed to delete " + s.getCanonicalPath(), e);
            }
        } else {
            File file = new File(context.getApplicationInfo().sourceDir);
            ArrayList arrayList2 = new ArrayList();
            C5085a aVar = new C5085a(context, file, "lib-main", i);
            arrayList2.add(aVar);
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "adding backup source from : " + aVar.toString());
            }
            m30801d(context, i, arrayList2);
            f8727f = (AbstractC5112r[]) arrayList2.toArray(new AbstractC5112r[arrayList2.size()]);
            arrayList.addAll(0, arrayList2);
        }
    }

    /* renamed from: b */
    private static void m30803b(ArrayList<AbstractC5111q> arrayList, String[] strArr) {
        String str;
        if (SysUtil.m30766l()) {
            str = "/system/lib64:/vendor/lib64";
        } else {
            str = "/system/lib:/vendor/lib";
        }
        String str2 = System.getenv("LD_LIBRARY_PATH");
        if (str2 != null && !str2.equals("")) {
            str = str + ":" + str2;
        }
        for (String str3 : new HashSet(Arrays.asList(str.split(":")))) {
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "adding system library source: " + str3);
            }
            arrayList.add(new C5088d(new File(str3), 2, strArr));
        }
    }

    /* renamed from: c */
    private static void m30802c(Context context, ArrayList<AbstractC5111q> arrayList, int i) {
        f8728g = new C5086b(context, i);
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", "adding application source: " + f8728g.toString());
        }
        arrayList.add(0, f8728g);
    }

    /* renamed from: d */
    private static void m30801d(Context context, int i, ArrayList<AbstractC5112r> arrayList) {
        if (context.getApplicationInfo().splitSourceDirs != null) {
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "adding backup sources from split apks");
            }
            String[] strArr = context.getApplicationInfo().splitSourceDirs;
            int length = strArr.length;
            int i2 = 0;
            int i3 = 0;
            while (i2 < length) {
                File file = new File(strArr[i2]);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("lib-");
                int i4 = i3 + 1;
                sb2.append(i3);
                C5085a aVar = new C5085a(context, file, sb2.toString(), i);
                if (Log.isLoggable("SoLoader", 3)) {
                    Log.d("SoLoader", "adding backup source: " + aVar.toString());
                }
                arrayList.add(aVar);
                i2++;
                i3 = i4;
            }
        }
    }

    /* renamed from: e */
    private static void m30800e(Context context, ArrayList<AbstractC5111q> arrayList) {
        if (context.getApplicationInfo().splitSourceDirs != null) {
            for (String str : context.getApplicationInfo().splitSourceDirs) {
                C5087c cVar = new C5087c(new File(str));
                if (Log.isLoggable("SoLoader", 3)) {
                    Log.d("SoLoader", "validating/adding directApk source from splitApk: " + cVar.toString());
                }
                if (cVar.m30751h()) {
                    arrayList.add(0, cVar);
                }
            }
        }
        C5087c cVar2 = new C5087c(context);
        if (Log.isLoggable("SoLoader", 3)) {
            Log.d("SoLoader", "validating/adding directApk source: " + cVar2.toString());
        }
        if (cVar2.m30751h()) {
            arrayList.add(0, cVar2);
        }
    }

    /* renamed from: f */
    private static void m30799f() {
        if (!m30788q()) {
            throw new IllegalStateException("SoLoader.init() not yet called");
        }
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: g */
    private static void m30798g(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        Throwable th2;
        AbstractC5112r[] rVarArr;
        ReentrantReadWriteLock reentrantReadWriteLock = f8724c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f8725d != null) {
                reentrantReadWriteLock.readLock().unlock();
                int i2 = 0;
                if (threadPolicy == null) {
                    threadPolicy = StrictMode.allowThreadDiskReads();
                    z = true;
                } else {
                    z = false;
                }
                if (f8722a) {
                    Api18TraceUtils.m30807a("SoLoader.loadLibrary[", str, "]");
                }
                try {
                    reentrantReadWriteLock.readLock().lock();
                    int i3 = 0;
                    for (int i4 = 0; i3 == 0 && i4 < f8725d.length; i4++) {
                        i3 = f8725d[i4].mo30710a(str, i, threadPolicy);
                        if (i3 == 3 && f8727f != null) {
                            if (Log.isLoggable("SoLoader", 3)) {
                                Log.d("SoLoader", "Trying backup SoSource for " + str);
                            }
                            for (AbstractC5112r rVar : f8727f) {
                                rVar.m30696u(str);
                                int a = rVar.mo30710a(str, i, threadPolicy);
                                if (a == 1) {
                                    i3 = a;
                                    break;
                                }
                            }
                        }
                    }
                    try {
                        ReentrantReadWriteLock reentrantReadWriteLock2 = f8724c;
                        reentrantReadWriteLock2.readLock().unlock();
                        if (f8722a) {
                            Api18TraceUtils.m30806b();
                        }
                        if (z) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        if (i3 == 0 || i3 == 3) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append("couldn't find DSO to load: ");
                            sb2.append(str);
                            reentrantReadWriteLock2.readLock().lock();
                            while (i2 < f8725d.length) {
                                sb2.append("\n\tSoSource ");
                                sb2.append(i2);
                                sb2.append(": ");
                                sb2.append(f8725d[i2].toString());
                                i2++;
                            }
                            C5086b bVar = f8728g;
                            if (bVar != null) {
                                File e = C5086b.m30757e(bVar.m30756f());
                                sb2.append("\n\tNative lib dir: ");
                                sb2.append(e.getAbsolutePath());
                                sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                            }
                            f8724c.readLock().unlock();
                            sb2.append(" result: ");
                            sb2.append(i3);
                            String sb3 = sb2.toString();
                            Log.e("SoLoader", sb3);
                            throw new UnsatisfiedLinkError(sb3);
                        }
                    } catch (Throwable th3) {
                        th2 = th3;
                        i2 = i3;
                        if (f8722a) {
                            Api18TraceUtils.m30806b();
                        }
                        if (z) {
                            StrictMode.setThreadPolicy(threadPolicy);
                        }
                        if (i2 == 0 || i2 == 3) {
                            StringBuilder sb4 = new StringBuilder();
                            sb4.append("couldn't find DSO to load: ");
                            sb4.append(str);
                            String message = th2.getMessage();
                            if (message == null) {
                                message = th2.toString();
                            }
                            sb4.append(" caused by: ");
                            sb4.append(message);
                            th2.printStackTrace();
                            sb4.append(" result: ");
                            sb4.append(i2);
                            String sb5 = sb4.toString();
                            Log.e("SoLoader", sb5);
                            UnsatisfiedLinkError unsatisfiedLinkError = new UnsatisfiedLinkError(sb5);
                            unsatisfiedLinkError.initCause(th2);
                            throw unsatisfiedLinkError;
                        }
                    }
                } catch (Throwable th4) {
                    th2 = th4;
                }
            } else {
                Log.e("SoLoader", "Could not load: " + str + " because no SO source exists");
                throw new UnsatisfiedLinkError("couldn't find DSO to load: " + str);
            }
        } catch (Throwable th5) {
            f8724c.readLock().unlock();
            throw th5;
        }
    }

    /* renamed from: h */
    private static int m30797h(Context context, int i) {
        ApplicationInfo applicationInfo;
        int i2 = f8735n;
        if (i2 != 0) {
            return i2;
        }
        int i3 = 1;
        if ((i & 32) == 0 && context != null) {
            int i4 = context.getApplicationInfo().flags;
            if ((i4 & 1) != 0) {
                if ((i4 & 128) != 0) {
                    i3 = 3;
                } else {
                    i3 = 2;
                }
            }
            if (Log.isLoggable("SoLoader", 3)) {
                Log.d("SoLoader", "ApplicationInfo.flags is: " + applicationInfo.flags + " appType is: " + i3);
            }
        }
        return i3;
    }

    /* renamed from: i */
    private static int m30796i() {
        int i = f8735n;
        if (i == 1) {
            return 0;
        }
        if (i == 2 || i == 3) {
            return 1;
        }
        throw new RuntimeException("Unsupported app type, we should not reach here");
    }

    public static void init(Context context, int i) {
        m30794k(context, i, null, f8733l);
    }

    /* renamed from: j */
    private static Method m30795j() {
        if (Build.VERSION.SDK_INT > 27) {
            return null;
        }
        try {
            Method declaredMethod = Runtime.class.getDeclaredMethod("nativeLoad", String.class, ClassLoader.class, String.class);
            declaredMethod.setAccessible(true);
            return declaredMethod;
        } catch (NoSuchMethodException | SecurityException e) {
            Log.w("SoLoader", "Cannot get nativeLoad method", e);
            return null;
        }
    }

    /* renamed from: k */
    public static void m30794k(Context context, int i, AbstractC5110p pVar, String[] strArr) {
        if (!m30788q()) {
            StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
            try {
                boolean n = m30791n(context);
                f8732k = n;
                if (n) {
                    int h = m30797h(context, i);
                    f8735n = h;
                    if ((i & 128) == 0 && SysUtil.m30765m(context, h)) {
                        i |= 72;
                    }
                    m30790o(pVar);
                    m30789p(context, i, strArr);
                    Log.v("SoLoader", "Init SoLoader delegate");
                    C7420a.m22711b(new C5109o());
                } else {
                    m30792m();
                    Log.v("SoLoader", "Init System Loader delegate");
                    C7420a.m22711b(new C7422c());
                }
            } finally {
                StrictMode.setThreadPolicy(allowThreadDiskWrites);
            }
        }
    }

    /* renamed from: l */
    public static void m30793l(Context context, boolean z) {
        int i;
        if (z) {
            i = 1;
        } else {
            i = 0;
        }
        try {
            m30794k(context, i, null, f8733l);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: m */
    private static void m30792m() {
        if (f8725d == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = f8724c;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (f8725d != null) {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
                f8725d = new AbstractC5111q[0];
                reentrantReadWriteLock.writeLock().unlock();
            } catch (Throwable th2) {
                f8724c.writeLock().unlock();
                throw th2;
            }
        }
    }

    /* renamed from: n */
    private static boolean m30791n(Context context) {
        Exception e;
        String str;
        Bundle bundle = null;
        try {
            str = context.getPackageName();
        } catch (Exception e2) {
            e = e2;
            str = null;
        }
        try {
            bundle = context.getPackageManager().getApplicationInfo(str, 128).metaData;
        } catch (Exception e3) {
            e = e3;
            Log.w("SoLoader", "Unexpected issue with package manager (" + str + ")", e);
            return bundle == null ? true : true;
        }
        if (bundle == null && !bundle.getBoolean("com.facebook.soloader.enabled", true)) {
            return false;
        }
    }

    /* renamed from: o */
    private static synchronized void m30790o(AbstractC5110p pVar) {
        boolean z;
        String str;
        synchronized (SoLoader.class) {
            if (pVar == null) {
                if (f8723b != null) {
                    return;
                }
            }
            if (pVar != null) {
                f8723b = pVar;
                return;
            }
            Runtime runtime = Runtime.getRuntime();
            Method j = m30795j();
            if (j != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str = SysUtil.Api14Utils.m30763a();
            } else {
                str = null;
            }
            f8723b = new C5083a(z, str, m30781x(str), runtime, j);
        }
    }

    /* renamed from: p */
    private static void m30789p(Context context, int i, String[] strArr) {
        if (f8725d == null) {
            ReentrantReadWriteLock reentrantReadWriteLock = f8724c;
            reentrantReadWriteLock.writeLock().lock();
            try {
                if (f8725d != null) {
                    reentrantReadWriteLock.writeLock().unlock();
                    return;
                }
                f8734m = i;
                ArrayList arrayList = new ArrayList();
                m30803b(arrayList, strArr);
                if (context != null) {
                    if ((i & 1) != 0) {
                        m30802c(context, arrayList, m30796i());
                        f8727f = null;
                        if (Log.isLoggable("SoLoader", 3)) {
                            Log.d("SoLoader", "adding exo package source: lib-main");
                        }
                        arrayList.add(0, new C5093i(context, "lib-main"));
                    } else {
                        if ((i & 64) != 0) {
                            m30800e(context, arrayList);
                        }
                        m30802c(context, arrayList, m30796i());
                        m30804a(context, arrayList, 1);
                    }
                }
                AbstractC5111q[] qVarArr = (AbstractC5111q[]) arrayList.toArray(new AbstractC5111q[arrayList.size()]);
                int y = m30780y();
                int length = qVarArr.length;
                while (true) {
                    int i2 = length - 1;
                    if (length <= 0) {
                        break;
                    }
                    if (Log.isLoggable("SoLoader", 3)) {
                        Log.d("SoLoader", "Preparing SO source: " + qVarArr[i2]);
                    }
                    boolean z = f8722a;
                    if (z) {
                        Api18TraceUtils.m30807a("SoLoader", "_", qVarArr[i2].getClass().getSimpleName());
                    }
                    qVarArr[i2].mo30709b(y);
                    if (z) {
                        Api18TraceUtils.m30806b();
                    }
                    length = i2;
                }
                f8725d = qVarArr;
                f8726e.getAndIncrement();
                if (Log.isLoggable("SoLoader", 3)) {
                    Log.d("SoLoader", "init finish: " + f8725d.length + " SO sources prepared");
                }
            } finally {
                f8724c.writeLock().unlock();
            }
        }
    }

    /* renamed from: q */
    public static boolean m30788q() {
        boolean z = true;
        if (f8725d != null) {
            return true;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f8724c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f8725d == null) {
                z = false;
            }
            reentrantReadWriteLock.readLock().unlock();
            return z;
        } catch (Throwable th2) {
            f8724c.readLock().unlock();
            throw th2;
        }
    }

    /* renamed from: r */
    public static boolean m30787r(String str) {
        return f8732k ? m30786s(str, 0) : C7420a.m22709d(str);
    }

    /* renamed from: s */
    public static boolean m30786s(String str, int i) {
        String str2;
        Boolean w = m30782w(str);
        if (w != null) {
            return w.booleanValue();
        }
        if (!f8732k) {
            return C7420a.m22709d(str);
        }
        if (f8735n != 2) {
        }
        String b = C5104l.m30731b(str);
        if (b != null) {
            str2 = b;
        } else {
            str2 = str;
        }
        return m30784u(System.mapLibraryName(str2), str, b, i, null);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: t */
    public static void m30785t(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        m30783v(str, null, null, i, threadPolicy);
    }

    /* JADX WARN: Finally extract failed */
    /* renamed from: u */
    private static boolean m30784u(String str, String str2, String str3, int i, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        boolean z2 = false;
        do {
            try {
                z2 = m30783v(str, str2, str3, i, threadPolicy);
                z = false;
                continue;
            } catch (UnsatisfiedLinkError e) {
                int i2 = f8726e.get();
                f8724c.writeLock().lock();
                try {
                    try {
                        if (f8728g == null || !f8728g.m30758d()) {
                            z = false;
                        } else {
                            Log.w("SoLoader", "sApplicationSoSource updated during load: " + str + ", attempting load again.");
                            f8726e.getAndIncrement();
                            z = true;
                        }
                        f8724c.writeLock().unlock();
                        if (f8726e.get() == i2) {
                            throw e;
                        }
                    } catch (IOException e2) {
                        throw new RuntimeException(e2);
                    }
                } catch (Throwable th2) {
                    f8724c.writeLock().unlock();
                    throw th2;
                }
            }
        } while (z);
        return z2;
    }

    /* renamed from: v */
    private static boolean m30783v(String str, String str2, String str3, int i, StrictMode.ThreadPolicy threadPolicy) {
        boolean z;
        Object obj;
        boolean z2 = false;
        if (!TextUtils.isEmpty(str2) && f8731j.contains(str2)) {
            return false;
        }
        synchronized (SoLoader.class) {
            HashSet<String> hashSet = f8729h;
            if (!hashSet.contains(str)) {
                z = false;
            } else if (str3 == null) {
                return false;
            } else {
                z = true;
            }
            Map<String, Object> map = f8730i;
            if (map.containsKey(str)) {
                obj = map.get(str);
            } else {
                Object obj2 = new Object();
                map.put(str, obj2);
                obj = obj2;
            }
            ReentrantReadWriteLock reentrantReadWriteLock = f8724c;
            reentrantReadWriteLock.readLock().lock();
            try {
                synchronized (obj) {
                    if (!z) {
                        synchronized (SoLoader.class) {
                            if (hashSet.contains(str)) {
                                if (str3 == null) {
                                    reentrantReadWriteLock.readLock().unlock();
                                    return false;
                                }
                                z = true;
                            }
                            if (!z) {
                                try {
                                    if (Log.isLoggable("SoLoader", 3)) {
                                        Log.d("SoLoader", "About to load: " + str);
                                    }
                                    m30798g(str, i, threadPolicy);
                                    if (Log.isLoggable("SoLoader", 3)) {
                                        Log.d("SoLoader", "Loaded: " + str);
                                    }
                                    synchronized (SoLoader.class) {
                                        hashSet.add(str);
                                    }
                                } catch (UnsatisfiedLinkError e) {
                                    String message = e.getMessage();
                                    if (message == null || !message.contains("unexpected e_machine:")) {
                                        throw e;
                                    }
                                    throw new C5084b(e, message.substring(message.lastIndexOf("unexpected e_machine:")));
                                }
                            }
                        }
                    }
                    if ((i & 16) == 0) {
                        if (!TextUtils.isEmpty(str2) && f8731j.contains(str2)) {
                            z2 = true;
                        }
                        if (str3 != null && !z2) {
                            boolean z3 = f8722a;
                            if (z3) {
                                Api18TraceUtils.m30807a("MergedSoMapping.invokeJniOnload[", str2, "]");
                            }
                            try {
                                try {
                                    if (Log.isLoggable("SoLoader", 3)) {
                                        Log.d("SoLoader", "About to merge: " + str2 + " / " + str);
                                    }
                                    C5104l.m30732a(str2);
                                    f8731j.add(str2);
                                    if (z3) {
                                        Api18TraceUtils.m30806b();
                                    }
                                } catch (Throwable th2) {
                                    if (f8722a) {
                                        Api18TraceUtils.m30806b();
                                    }
                                    throw th2;
                                }
                            } catch (UnsatisfiedLinkError e2) {
                                throw new RuntimeException("Failed to call JNI_OnLoad from '" + str2 + "', which has been merged into '" + str + "'.  See comment for details.", e2);
                            }
                        }
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return !z;
                }
            } catch (Throwable th3) {
                f8724c.readLock().unlock();
                throw th3;
            }
        }
    }

    /* renamed from: w */
    private static Boolean m30782w(String str) {
        Boolean valueOf;
        if (f8725d != null) {
            return null;
        }
        ReentrantReadWriteLock reentrantReadWriteLock = f8724c;
        reentrantReadWriteLock.readLock().lock();
        try {
            if (f8725d == null) {
                if ("http://www.android.com/".equals(System.getProperty("java.vendor.url"))) {
                    m30799f();
                } else {
                    synchronized (SoLoader.class) {
                        boolean z = !f8729h.contains(str);
                        if (z) {
                            System.loadLibrary(str);
                        }
                        valueOf = Boolean.valueOf(z);
                    }
                    reentrantReadWriteLock.readLock().unlock();
                    return valueOf;
                }
            }
            reentrantReadWriteLock.readLock().unlock();
            return null;
        } catch (Throwable th2) {
            f8724c.readLock().unlock();
            throw th2;
        }
    }

    /* renamed from: x */
    public static String m30781x(String str) {
        if (str == null) {
            return null;
        }
        String[] split = str.split(":");
        ArrayList arrayList = new ArrayList(split.length);
        for (String str2 : split) {
            if (!str2.contains("!")) {
                arrayList.add(str2);
            }
        }
        return TextUtils.join(":", arrayList);
    }

    /* renamed from: y */
    private static int m30780y() {
        int i;
        ReentrantReadWriteLock reentrantReadWriteLock = f8724c;
        reentrantReadWriteLock.writeLock().lock();
        try {
            int i2 = f8734m;
            if ((i2 & 2) != 0) {
                i = 1;
            } else {
                i = 0;
            }
            if ((i2 & Spliterator.NONNULL) != 0) {
                i |= 4;
            }
            reentrantReadWriteLock.writeLock().unlock();
            return i;
        } catch (Throwable th2) {
            f8724c.writeLock().unlock();
            throw th2;
        }
    }

    /* renamed from: z */
    public static File m30779z(String str) {
        m30799f();
        try {
            return m30805A(System.mapLibraryName(str));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
