package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ActivityManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Environment;
import android.os.LocaleList;
import android.os.StatFs;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.DisplayMetrics;
import io.sentry.AbstractC8926l2;
import io.sentry.AbstractC9053t;
import io.sentry.C8875h;
import io.sentry.C8908j3;
import io.sentry.C9116v;
import io.sentry.EnumC8942n3;
import io.sentry.android.core.internal.util.C8743b;
import io.sentry.android.core.internal.util.C8746d;
import io.sentry.android.core.internal.util.C8747e;
import io.sentry.android.core.internal.util.C8749g;
import io.sentry.protocol.C8970a;
import io.sentry.protocol.C8977e;
import io.sentry.protocol.C8989j;
import io.sentry.protocol.C9013v;
import io.sentry.protocol.C9015w;
import io.sentry.protocol.C9020z;
import io.sentry.util.C9105h;
import io.sentry.util.C9111k;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: io.sentry.android.core.k0 */
/* loaded from: classes8.dex */
public final class C8761k0 implements AbstractC9053t {

    /* renamed from: k */
    final Context f19353k;

    /* renamed from: l */
    final Future<Map<String, Object>> f19354l;

    /* renamed from: m */
    private final C8715f0 f19355m;

    /* renamed from: n */
    private final C8749g f19356n;

    /* renamed from: o */
    private final SentryAndroidOptions f19357o;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.android.core.k0$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C8762a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19358a;

        static {
            int[] iArr = new int[C8743b.EnumC8744a.values().length];
            f19358a = iArr;
            try {
                iArr[C8743b.EnumC8744a.NOT_CONNECTED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19358a[C8743b.EnumC8744a.CONNECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public C8761k0(Context context, C8715f0 f0Var, SentryAndroidOptions sentryAndroidOptions) {
        this(context, f0Var, new C8749g(context, f0Var, sentryAndroidOptions.getLogger()), sentryAndroidOptions);
    }

    /* renamed from: A */
    private TimeZone m18191A() {
        LocaleList locales;
        boolean isEmpty;
        Locale locale;
        if (Build.VERSION.SDK_INT >= 24) {
            locales = this.f19353k.getResources().getConfiguration().getLocales();
            isEmpty = locales.isEmpty();
            if (!isEmpty) {
                locale = locales.get(0);
                return Calendar.getInstance(locale).getTimeZone();
            }
        }
        return Calendar.getInstance().getTimeZone();
    }

    /* renamed from: B */
    private Long m18190B(StatFs statFs) {
        try {
            return Long.valueOf(m18162i(statFs) * m18161j(statFs));
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting total external storage amount.", th2);
            return null;
        }
    }

    /* renamed from: C */
    private Long m18189C(StatFs statFs) {
        try {
            return Long.valueOf(m18162i(statFs) * m18161j(statFs));
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting total internal storage amount.", th2);
            return null;
        }
    }

    /* renamed from: D */
    private Long m18188D(StatFs statFs) {
        try {
            return Long.valueOf(m18166d(statFs) * m18161j(statFs));
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting unused external storage amount.", th2);
            return null;
        }
    }

    /* renamed from: E */
    private Long m18187E(StatFs statFs) {
        try {
            return Long.valueOf(m18166d(statFs) * m18161j(statFs));
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting unused internal storage amount.", th2);
            return null;
        }
    }

    /* renamed from: F */
    private Boolean m18186F(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("plugged", -1);
            boolean z = true;
            if (!(intExtra == 1 || intExtra == 2)) {
                z = false;
            }
            return Boolean.valueOf(z);
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting device charging state.", th2);
            return null;
        }
    }

    /* renamed from: G */
    private boolean m18185G() {
        String externalStorageState = Environment.getExternalStorageState();
        if (("mounted".equals(externalStorageState) || "mounted_ro".equals(externalStorageState)) && !Environment.isExternalStorageEmulated()) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: I */
    public Map<String, Object> m18184H() {
        HashMap hashMap = new HashMap();
        hashMap.put("rooted", Boolean.valueOf(this.f19356n.m18207e()));
        String u = m18150u();
        if (u != null) {
            hashMap.put("kernelVersion", u);
        }
        hashMap.put("emulator", this.f19355m.m18301f());
        Map<String, String> z = m18145z();
        if (z != null) {
            hashMap.put("sideLoaded", z);
        }
        return hashMap;
    }

    /* renamed from: J */
    private void m18182J(AbstractC8926l2 l2Var) {
        String str;
        C8989j c = l2Var.m17668B().m17503c();
        l2Var.m17668B().m17496k(m18147x());
        if (c != null) {
            String g = c.m17379g();
            if (g == null || g.isEmpty()) {
                str = "os_1";
            } else {
                str = "os_" + g.trim().toLowerCase(Locale.ROOT);
            }
            l2Var.m17668B().put(str, c);
        }
    }

    /* renamed from: K */
    private void m18181K(AbstractC8926l2 l2Var) {
        C9020z O = l2Var.m17655O();
        if (O == null) {
            l2Var.m17640b0(m18159l());
        } else if (O.m17222j() == null) {
            O.m17216p(m18157n());
        }
    }

    /* renamed from: L */
    private void m18180L(AbstractC8926l2 l2Var) {
        C8970a a = l2Var.m17668B().m17505a();
        if (a == null) {
            a = new C8970a();
        }
        m18179M(a);
        m18172T(l2Var, a);
        l2Var.m17668B().m17500g(a);
    }

    /* renamed from: M */
    private void m18179M(C8970a aVar) {
        aVar.m17515k(m18167c());
        aVar.m17514l(C8709d0.m18315d().m18316c());
    }

    @SuppressLint({"NewApi"})
    /* renamed from: N */
    private void m18178N(C8970a aVar, PackageInfo packageInfo) {
        String str;
        aVar.m17516j(packageInfo.packageName);
        aVar.m17513m(packageInfo.versionName);
        aVar.m17517i(C8721h0.m18276d(packageInfo, this.f19355m));
        if (this.f19355m.m18303d() >= 16) {
            HashMap hashMap = new HashMap();
            String[] strArr = packageInfo.requestedPermissions;
            int[] iArr = packageInfo.requestedPermissionsFlags;
            if (strArr != null && strArr.length > 0 && iArr != null && iArr.length > 0) {
                for (int i = 0; i < strArr.length; i++) {
                    String str2 = strArr[i];
                    boolean z = true;
                    String substring = str2.substring(str2.lastIndexOf(46) + 1);
                    if ((iArr[i] & 2) != 2) {
                        z = false;
                    }
                    if (z) {
                        str = "granted";
                    } else {
                        str = "not_granted";
                    }
                    hashMap.put(substring, str);
                }
            }
            aVar.m17512n(hashMap);
        }
    }

    /* renamed from: O */
    private void m18177O(C8977e eVar) {
        eVar.m17475J(Build.SUPPORTED_ABIS);
    }

    /* renamed from: P */
    private void m18176P(AbstractC8926l2 l2Var, boolean z, boolean z2) {
        m18181K(l2Var);
        m18175Q(l2Var, z, z2);
        m18182J(l2Var);
        m18171U(l2Var);
    }

    /* renamed from: Q */
    private void m18175Q(AbstractC8926l2 l2Var, boolean z, boolean z2) {
        if (l2Var.m17668B().m17504b() == null) {
            l2Var.m17668B().m17498i(m18158m(z, z2));
        }
    }

    /* renamed from: R */
    private void m18174R(C8977e eVar, boolean z) {
        Boolean bool;
        Intent e = m18165e();
        if (e != null) {
            eVar.m17474K(m18164f(e));
            eVar.m17470O(m18186F(e));
            eVar.m17473L(m18163h(e));
        }
        int i = C8762a.f19358a[C8743b.m18223b(this.f19353k, this.f19357o.getLogger()).ordinal()];
        if (i == 1) {
            bool = Boolean.FALSE;
        } else if (i != 2) {
            bool = null;
        } else {
            bool = Boolean.TRUE;
        }
        eVar.m17449e0(bool);
        ActivityManager.MemoryInfo v = m18149v();
        if (v != null) {
            eVar.m17457a0(m18148w(v));
            if (z) {
                eVar.m17465T(Long.valueOf(v.availMem));
                eVar.m17460Y(Boolean.valueOf(v.lowMemory));
            }
        }
        File externalFilesDir = this.f19353k.getExternalFilesDir(null);
        if (externalFilesDir != null) {
            StatFs statFs = new StatFs(externalFilesDir.getPath());
            eVar.m17435l0(m18189C(statFs));
            eVar.m17464U(m18187E(statFs));
        }
        StatFs s = m18152s(externalFilesDir);
        if (s != null) {
            eVar.m17467R(m18190B(s));
            eVar.m17468Q(m18188D(s));
        }
        if (eVar.m17479F() == null) {
            eVar.m17469P(C8743b.m18222c(this.f19353k, this.f19357o.getLogger(), this.f19355m));
        }
    }

    /* renamed from: S */
    private void m18173S(AbstractC8926l2 l2Var, String str) {
        if (l2Var.m17667C() == null) {
            l2Var.m17653Q(str);
        }
    }

    /* renamed from: T */
    private void m18172T(AbstractC8926l2 l2Var, C8970a aVar) {
        PackageInfo b = C8721h0.m18278b(this.f19353k, 4096, this.f19357o.getLogger(), this.f19355m);
        if (b != null) {
            m18173S(l2Var, C8721h0.m18276d(b, this.f19355m));
            m18178N(aVar, b);
        }
    }

    /* renamed from: U */
    private void m18171U(AbstractC8926l2 l2Var) {
        try {
            Object obj = this.f19354l.get().get("sideLoaded");
            if (obj instanceof Map) {
                for (Map.Entry entry : ((Map) obj).entrySet()) {
                    l2Var.m17644Z((String) entry.getKey(), (String) entry.getValue());
                }
            }
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting side loaded info.", th2);
        }
    }

    /* renamed from: V */
    private void m18170V(C8908j3 j3Var) {
        if (j3Var.m17735q0() != null) {
            for (C9013v vVar : j3Var.m17735q0()) {
                if (vVar.m17258j() == null) {
                    vVar.m17256l(Boolean.valueOf(C8747e.m18214c(vVar)));
                }
            }
        }
    }

    /* renamed from: W */
    private boolean m18169W(AbstractC8926l2 l2Var, C9116v vVar) {
        if (C9105h.m17000s(vVar)) {
            return true;
        }
        this.f19357o.getLogger().mo17722c(EnumC8942n3.DEBUG, "Event was cached so not applying data relevant to the current app execution/version: %s", l2Var.m17665E());
        return false;
    }

    /* renamed from: c */
    private String m18167c() {
        try {
            ApplicationInfo applicationInfo = this.f19353k.getApplicationInfo();
            int i = applicationInfo.labelRes;
            if (i != 0) {
                return this.f19353k.getString(i);
            }
            CharSequence charSequence = applicationInfo.nonLocalizedLabel;
            if (charSequence != null) {
                return charSequence.toString();
            }
            return this.f19353k.getPackageManager().getApplicationLabel(applicationInfo).toString();
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting application name.", th2);
            return null;
        }
    }

    /* renamed from: d */
    private long m18166d(StatFs statFs) {
        return statFs.getAvailableBlocksLong();
    }

    /* renamed from: e */
    private Intent m18165e() {
        return this.f19353k.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
    }

    /* renamed from: f */
    private Float m18164f(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("level", -1);
            int intExtra2 = intent.getIntExtra("scale", -1);
            if (!(intExtra == -1 || intExtra2 == -1)) {
                return Float.valueOf((intExtra / intExtra2) * 100.0f);
            }
            return null;
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting device battery level.", th2);
            return null;
        }
    }

    /* renamed from: h */
    private Float m18163h(Intent intent) {
        try {
            int intExtra = intent.getIntExtra("temperature", -1);
            if (intExtra != -1) {
                return Float.valueOf(intExtra / 10.0f);
            }
            return null;
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting battery temperature.", th2);
            return null;
        }
    }

    /* renamed from: i */
    private long m18162i(StatFs statFs) {
        return statFs.getBlockCountLong();
    }

    /* renamed from: j */
    private long m18161j(StatFs statFs) {
        return statFs.getBlockSizeLong();
    }

    /* renamed from: k */
    private Date m18160k() {
        try {
            return C8875h.m17845c(System.currentTimeMillis() - SystemClock.elapsedRealtime());
        } catch (IllegalArgumentException e) {
            this.f19357o.getLogger().mo17724a(EnumC8942n3.ERROR, e, "Error getting the device's boot time.", new Object[0]);
            return null;
        }
    }

    /* renamed from: m */
    private C8977e m18158m(boolean z, boolean z2) {
        C8977e eVar = new C8977e();
        if (this.f19357o.isSendDefaultPii()) {
            eVar.m17451d0(m18156o());
        }
        eVar.m17459Z(Build.MANUFACTURER);
        eVar.m17471N(Build.BRAND);
        eVar.m17466S(m18151t());
        eVar.m17455b0(Build.MODEL);
        eVar.m17453c0(Build.ID);
        m18177O(eVar);
        if (z && this.f19357o.isCollectAdditionalContext()) {
            m18174R(eVar, z2);
        }
        eVar.m17447f0(m18146y());
        try {
            Object obj = this.f19354l.get().get("emulator");
            if (obj != null) {
                eVar.m17437k0((Boolean) obj);
            }
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting emulator.", th2);
        }
        DisplayMetrics p = m18155p();
        if (p != null) {
            eVar.m17439j0(Integer.valueOf(p.widthPixels));
            eVar.m17441i0(Integer.valueOf(p.heightPixels));
            eVar.m17445g0(Float.valueOf(p.density));
            eVar.m17443h0(Integer.valueOf(p.densityDpi));
        }
        eVar.m17472M(m18160k());
        eVar.m17433m0(m18191A());
        if (eVar.m17478G() == null) {
            eVar.m17463V(m18157n());
        }
        Locale locale = Locale.getDefault();
        if (eVar.m17477H() == null) {
            eVar.m17462W(locale.getLanguage());
        }
        if (eVar.m17476I() == null) {
            eVar.m17461X(locale.toString());
        }
        return eVar;
    }

    /* renamed from: n */
    private String m18157n() {
        try {
            return C8774o0.m18117a(this.f19353k);
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting installationId.", th2);
            return null;
        }
    }

    /* renamed from: o */
    private String m18156o() {
        return Settings.Global.getString(this.f19353k.getContentResolver(), "device_name");
    }

    /* renamed from: p */
    private DisplayMetrics m18155p() {
        try {
            return this.f19353k.getResources().getDisplayMetrics();
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting DisplayMetrics.", th2);
            return null;
        }
    }

    /* renamed from: q */
    private File[] m18154q() {
        return this.f19353k.getExternalFilesDirs(null);
    }

    /* renamed from: r */
    private File m18153r(File file) {
        String str;
        File[] q = m18154q();
        if (q != null) {
            if (file != null) {
                str = file.getAbsolutePath();
            } else {
                str = null;
            }
            for (File file2 : q) {
                if (file2 != null && (str == null || str.isEmpty() || !file2.getAbsolutePath().contains(str))) {
                    return file2;
                }
            }
        } else {
            this.f19357o.getLogger().mo17722c(EnumC8942n3.INFO, "Not possible to read getExternalFilesDirs", new Object[0]);
        }
        return null;
    }

    /* renamed from: s */
    private StatFs m18152s(File file) {
        if (!m18185G()) {
            File r = m18153r(file);
            if (r != null) {
                return new StatFs(r.getPath());
            }
            this.f19357o.getLogger().mo17722c(EnumC8942n3.INFO, "Not possible to read external files directory", new Object[0]);
            return null;
        }
        this.f19357o.getLogger().mo17722c(EnumC8942n3.INFO, "External storage is not mounted or emulated.", new Object[0]);
        return null;
    }

    /* renamed from: t */
    private String m18151t() {
        try {
            return Build.MODEL.split(" ", -1)[0];
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting device family.", th2);
            return null;
        }
    }

    /* renamed from: u */
    private String m18150u() {
        String property = System.getProperty("os.version");
        File file = new File("/proc/version");
        if (!file.canRead()) {
            return property;
        }
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            return readLine;
        } catch (IOException e) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Exception while attempting to read kernel information", e);
            return property;
        }
    }

    /* renamed from: v */
    private ActivityManager.MemoryInfo m18149v() {
        try {
            ActivityManager activityManager = (ActivityManager) this.f19353k.getSystemService("activity");
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            if (activityManager != null) {
                activityManager.getMemoryInfo(memoryInfo);
                return memoryInfo;
            }
            this.f19357o.getLogger().mo17722c(EnumC8942n3.INFO, "Error getting MemoryInfo.", new Object[0]);
            return null;
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting MemoryInfo.", th2);
            return null;
        }
    }

    /* renamed from: w */
    private Long m18148w(ActivityManager.MemoryInfo memoryInfo) {
        return Long.valueOf(memoryInfo.totalMem);
    }

    /* renamed from: x */
    private C8989j m18147x() {
        C8989j jVar = new C8989j();
        jVar.m17376j("Android");
        jVar.m17373m(Build.VERSION.RELEASE);
        jVar.m17378h(Build.DISPLAY);
        try {
            Object obj = this.f19354l.get().get("kernelVersion");
            if (obj != null) {
                jVar.m17377i((String) obj);
            }
            Object obj2 = this.f19354l.get().get("rooted");
            if (obj2 != null) {
                jVar.m17375k((Boolean) obj2);
            }
        } catch (Throwable th2) {
            this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting OperatingSystem.", th2);
        }
        return jVar;
    }

    /* renamed from: y */
    private C8977e.EnumC8979b m18146y() {
        C8977e.EnumC8979b bVar;
        Throwable th2;
        try {
            bVar = C8746d.m18217a(this.f19353k.getResources().getConfiguration().orientation);
            if (bVar == null) {
                try {
                    this.f19357o.getLogger().mo17722c(EnumC8942n3.INFO, "No device orientation available (ORIENTATION_SQUARE|ORIENTATION_UNDEFINED)", new Object[0]);
                    return null;
                } catch (Throwable th3) {
                    th2 = th3;
                    this.f19357o.getLogger().mo17723b(EnumC8942n3.ERROR, "Error getting device orientation.", th2);
                    return bVar;
                }
            }
        } catch (Throwable th4) {
            bVar = null;
            th2 = th4;
        }
        return bVar;
    }

    /* renamed from: z */
    private Map<String, String> m18145z() {
        String str;
        try {
            PackageInfo c = C8721h0.m18277c(this.f19353k, this.f19357o.getLogger(), this.f19355m);
            PackageManager packageManager = this.f19353k.getPackageManager();
            if (!(c == null || packageManager == null)) {
                str = c.packageName;
                try {
                    String installerPackageName = packageManager.getInstallerPackageName(str);
                    HashMap hashMap = new HashMap();
                    if (installerPackageName != null) {
                        hashMap.put("isSideLoaded", "false");
                        hashMap.put("installerStore", installerPackageName);
                    } else {
                        hashMap.put("isSideLoaded", "true");
                    }
                    return hashMap;
                } catch (IllegalArgumentException unused) {
                    this.f19357o.getLogger().mo17722c(EnumC8942n3.DEBUG, "%s package isn't installed.", str);
                    return null;
                }
            }
        } catch (IllegalArgumentException unused2) {
            str = null;
        }
        return null;
    }

    @Override // io.sentry.AbstractC9053t
    /* renamed from: b */
    public C8908j3 mo17164b(C8908j3 j3Var, C9116v vVar) {
        boolean W = m18169W(j3Var, vVar);
        if (W) {
            m18180L(j3Var);
            m18170V(j3Var);
        }
        m18176P(j3Var, true, W);
        return j3Var;
    }

    @Override // io.sentry.AbstractC9053t
    /* renamed from: g */
    public C9015w mo17163g(C9015w wVar, C9116v vVar) {
        boolean W = m18169W(wVar, vVar);
        if (W) {
            m18180L(wVar);
        }
        m18176P(wVar, false, W);
        return wVar;
    }

    /* renamed from: l */
    public C9020z m18159l() {
        C9020z zVar = new C9020z();
        zVar.m17216p(m18157n());
        return zVar;
    }

    C8761k0(Context context, C8715f0 f0Var, C8749g gVar, SentryAndroidOptions sentryAndroidOptions) {
        this.f19353k = (Context) C9111k.m16995a(context, "The application context is required.");
        this.f19355m = (C8715f0) C9111k.m16995a(f0Var, "The BuildInfoProvider is required.");
        this.f19356n = (C8749g) C9111k.m16995a(gVar, "The RootChecker is required.");
        this.f19357o = (SentryAndroidOptions) C9111k.m16995a(sentryAndroidOptions, "The options object is required.");
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.f19354l = newSingleThreadExecutor.submit(new Callable() { // from class: io.sentry.android.core.j0
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Map H;
                H = C8761k0.this.m18184H();
                return H;
            }
        });
        newSingleThreadExecutor.shutdown();
    }
}
