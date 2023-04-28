package p213l9;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.internal.gtm.zzav;
import java.lang.Thread;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import p420x9.C14004p;

@SuppressLint({"StaticFieldLeak"})
/* renamed from: l9.n */
/* loaded from: classes5.dex */
public final class C10373n {

    /* renamed from: g */
    private static volatile C10373n f22759g;

    /* renamed from: a */
    private final Context f22760a;

    /* renamed from: e */
    private volatile zzav f22764e;

    /* renamed from: f */
    private Thread.UncaughtExceptionHandler f22765f;

    /* renamed from: d */
    private final C10369j f22763d = new C10369j(this);

    /* renamed from: b */
    private final List<Object> f22761b = new CopyOnWriteArrayList();

    /* renamed from: c */
    private final C10364e f22762c = new C10364e();

    C10373n(Context context) {
        Context applicationContext = context.getApplicationContext();
        C14004p.m2051j(applicationContext);
        this.f22760a = applicationContext;
    }

    /* renamed from: a */
    public static C10373n m13540a(Context context) {
        C14004p.m2051j(context);
        if (f22759g == null) {
            synchronized (C10373n.class) {
                if (f22759g == null) {
                    f22759g = new C10373n(context);
                }
            }
        }
        return f22759g;
    }

    /* renamed from: d */
    public static void m13537d() {
        if (!(Thread.currentThread() instanceof C10372m)) {
            throw new IllegalStateException("Call expected from worker thread");
        }
    }

    /* renamed from: b */
    public final zzav m13539b() {
        String str;
        if (this.f22764e == null) {
            synchronized (this) {
                if (this.f22764e == null) {
                    zzav zzavVar = new zzav();
                    PackageManager packageManager = this.f22760a.getPackageManager();
                    String packageName = this.f22760a.getPackageName();
                    zzavVar.zzi(packageName);
                    zzavVar.zzj(packageManager.getInstallerPackageName(packageName));
                    String str2 = null;
                    try {
                        PackageInfo packageInfo = packageManager.getPackageInfo(this.f22760a.getPackageName(), 0);
                        if (packageInfo != null) {
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfo.applicationInfo);
                            if (!TextUtils.isEmpty(applicationLabel)) {
                                packageName = applicationLabel.toString();
                            }
                            str2 = packageInfo.versionName;
                        }
                    } catch (PackageManager.NameNotFoundException unused) {
                        String valueOf = String.valueOf(packageName);
                        if (valueOf.length() != 0) {
                            str = "Error retrieving package info: appName set to ".concat(valueOf);
                        } else {
                            str = new String("Error retrieving package info: appName set to ");
                        }
                        Log.e("GAv4", str);
                    }
                    zzavVar.zzk(packageName);
                    zzavVar.zzl(str2);
                    this.f22764e = zzavVar;
                }
            }
        }
        return this.f22764e;
    }

    /* renamed from: e */
    public final void m13536e(Runnable runnable) {
        C14004p.m2051j(runnable);
        this.f22763d.submit(runnable);
    }

    /* renamed from: f */
    public final void m13535f(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f22765f = uncaughtExceptionHandler;
    }
}
