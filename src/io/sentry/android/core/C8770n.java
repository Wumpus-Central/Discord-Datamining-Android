package io.sentry.android.core;

import android.util.Log;
import io.sentry.AbstractC8869g0;
import io.sentry.EnumC8942n3;

/* renamed from: io.sentry.android.core.n */
/* loaded from: classes8.dex */
public final class C8770n implements AbstractC8869g0 {

    /* renamed from: a */
    private final String f19384a;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: io.sentry.android.core.n$a */
    /* loaded from: classes8.dex */
    public static /* synthetic */ class C8771a {

        /* renamed from: a */
        static final /* synthetic */ int[] f19385a;

        static {
            int[] iArr = new int[EnumC8942n3.values().length];
            f19385a = iArr;
            try {
                iArr[EnumC8942n3.INFO.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f19385a[EnumC8942n3.WARNING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f19385a[EnumC8942n3.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f19385a[EnumC8942n3.FATAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f19385a[EnumC8942n3.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C8770n() {
        this("Sentry");
    }

    /* renamed from: e */
    private int m18118e(EnumC8942n3 n3Var) {
        int i = C8771a.f19385a[n3Var.ordinal()];
        if (i == 1) {
            return 4;
        }
        if (i != 2) {
            return i != 4 ? 3 : 7;
        }
        return 5;
    }

    @Override // io.sentry.AbstractC8869g0
    /* renamed from: a */
    public void mo17724a(EnumC8942n3 n3Var, Throwable th2, String str, Object... objArr) {
        mo17723b(n3Var, String.format(str, objArr), th2);
    }

    @Override // io.sentry.AbstractC8869g0
    /* renamed from: b */
    public void mo17723b(EnumC8942n3 n3Var, String str, Throwable th2) {
        int i = C8771a.f19385a[n3Var.ordinal()];
        if (i == 1) {
            Log.i(this.f19384a, str, th2);
        } else if (i == 2) {
            Log.w(this.f19384a, str, th2);
        } else if (i == 3) {
            Log.e(this.f19384a, str, th2);
        } else if (i != 4) {
            Log.d(this.f19384a, str, th2);
        } else {
            Log.wtf(this.f19384a, str, th2);
        }
    }

    @Override // io.sentry.AbstractC8869g0
    /* renamed from: c */
    public void mo17722c(EnumC8942n3 n3Var, String str, Object... objArr) {
        Log.println(m18118e(n3Var), this.f19384a, String.format(str, objArr));
    }

    @Override // io.sentry.AbstractC8869g0
    /* renamed from: d */
    public boolean mo17721d(EnumC8942n3 n3Var) {
        return true;
    }

    public C8770n(String str) {
        this.f19384a = str;
    }
}
