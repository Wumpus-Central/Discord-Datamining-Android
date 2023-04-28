package p074e2;

import android.util.Log;
import java.util.Arrays;

/* renamed from: e2.k0 */
/* loaded from: classes.dex */
public class C6638k0 implements AbstractC6608c0 {

    /* renamed from: d */
    private static String f14019d = "Error formating log message: %s, with params: %s";

    /* renamed from: a */
    private EnumC6636j0 f14020a;

    /* renamed from: c */
    private boolean f14022c = false;

    /* renamed from: b */
    private boolean f14021b = false;

    public C6638k0() {
        mo24882e(EnumC6636j0.INFO, false);
    }

    @Override // p074e2.AbstractC6608c0
    /* renamed from: a */
    public void mo24886a(String str, Object... objArr) {
        if (!this.f14022c && this.f14020a.f14012k <= 5) {
            try {
                Log.w("Adjust", C6629i1.m24906l(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", C6629i1.m24906l(f14019d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p074e2.AbstractC6608c0
    /* renamed from: b */
    public void mo24885b(String str, Object... objArr) {
        if (!this.f14022c && this.f14020a.f14012k <= 6) {
            try {
                Log.e("Adjust", C6629i1.m24906l(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", C6629i1.m24906l(f14019d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p074e2.AbstractC6608c0
    /* renamed from: c */
    public void mo24884c(String str, Object... objArr) {
        if (!this.f14022c && this.f14020a.f14012k <= 3) {
            try {
                Log.d("Adjust", C6629i1.m24906l(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", C6629i1.m24906l(f14019d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p074e2.AbstractC6608c0
    /* renamed from: d */
    public void mo24883d() {
        this.f14021b = true;
    }

    @Override // p074e2.AbstractC6608c0
    /* renamed from: e */
    public void mo24882e(EnumC6636j0 j0Var, boolean z) {
        if (!this.f14021b) {
            this.f14020a = j0Var;
            this.f14022c = z;
        }
    }

    @Override // p074e2.AbstractC6608c0
    /* renamed from: f */
    public void mo24881f(String str, Object... objArr) {
        if (this.f14020a.f14012k <= 5) {
            try {
                Log.w("Adjust", C6629i1.m24906l(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", C6629i1.m24906l(f14019d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p074e2.AbstractC6608c0
    /* renamed from: g */
    public void mo24880g(String str, Object... objArr) {
        if (!this.f14022c && this.f14020a.f14012k <= 2) {
            try {
                Log.v("Adjust", C6629i1.m24906l(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", C6629i1.m24906l(f14019d, str, Arrays.toString(objArr)));
            }
        }
    }

    @Override // p074e2.AbstractC6608c0
    /* renamed from: h */
    public void mo24879h(String str, Object... objArr) {
        if (!this.f14022c && this.f14020a.f14012k <= 4) {
            try {
                Log.i("Adjust", C6629i1.m24906l(str, objArr));
            } catch (Exception unused) {
                Log.e("Adjust", C6629i1.m24906l(f14019d, str, Arrays.toString(objArr)));
            }
        }
    }
}
