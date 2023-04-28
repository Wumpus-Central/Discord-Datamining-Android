package p365u9;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.Signature;
import android.util.Log;
import p420x9.C14004p;

/* renamed from: u9.j */
/* loaded from: classes5.dex */
public class C13224j {

    /* renamed from: b */
    private static C13224j f29697b;

    /* renamed from: a */
    private final Context f29698a;

    public C13224j(Context context) {
        this.f29698a = context.getApplicationContext();
    }

    /* renamed from: a */
    public static C13224j m4258a(Context context) {
        C14004p.m2051j(context);
        synchronized (C13224j.class) {
            if (f29697b == null) {
                C13238x.m4250a(context);
                f29697b = new C13224j(context);
            }
        }
        return f29697b;
    }

    /* renamed from: c */
    static final AbstractBinderC13234t m4256c(PackageInfo packageInfo, AbstractBinderC13234t... tVarArr) {
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null) {
            return null;
        }
        if (signatureArr.length != 1) {
            Log.w("GoogleSignatureVerifier", "Package has more than one signature.");
            return null;
        }
        BinderC13235u uVar = new BinderC13235u(packageInfo.signatures[0].toByteArray());
        for (int i = 0; i < tVarArr.length; i++) {
            if (tVarArr[i].equals(uVar)) {
                return tVarArr[i];
            }
        }
        return null;
    }

    /* renamed from: d */
    public static final boolean m4255d(PackageInfo packageInfo, boolean z) {
        AbstractBinderC13234t tVar;
        if (!(packageInfo == null || packageInfo.signatures == null)) {
            if (z) {
                tVar = m4256c(packageInfo, C13237w.f29709a);
            } else {
                tVar = m4256c(packageInfo, C13237w.f29709a[0]);
            }
            if (tVar != null) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m4257b(PackageInfo packageInfo) {
        if (packageInfo == null) {
            return false;
        }
        if (m4255d(packageInfo, false)) {
            return true;
        }
        if (m4255d(packageInfo, true)) {
            if (C13223i.m4264c(this.f29698a)) {
                return true;
            }
            Log.w("GoogleSignatureVerifier", "Test-keys aren't accepted on this build.");
        }
        return false;
    }
}
