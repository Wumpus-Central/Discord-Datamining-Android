package p400w9;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import bb.BinderC3433d;
import bb.C3441l;
import com.google.android.gms.common.api.Scope;
import java.util.Set;
import p012ab.AbstractC1356f;
import p012ab.C1351a;
import p012ab.C1355e;
import p365u9.C13215a;
import p384v9.AbstractC13470f;
import p384v9.C13456a;
import p420x9.C13964d;
import p420x9.C14004p;
import p420x9.C14008q0;

/* renamed from: w9.e0 */
/* loaded from: classes5.dex */
public final class BinderC13820e0 extends BinderC3433d implements AbstractC13470f.AbstractC13471a, AbstractC13470f.AbstractC13472b {

    /* renamed from: h */
    private static final C13456a.AbstractC0437a<? extends AbstractC1356f, C1351a> f31116h = C1355e.f296c;

    /* renamed from: a */
    private final Context f31117a;

    /* renamed from: b */
    private final Handler f31118b;

    /* renamed from: c */
    private final C13456a.AbstractC0437a<? extends AbstractC1356f, C1351a> f31119c;

    /* renamed from: d */
    private final Set<Scope> f31120d;

    /* renamed from: e */
    private final C13964d f31121e;

    /* renamed from: f */
    private AbstractC1356f f31122f;

    /* renamed from: g */
    private AbstractC13818d0 f31123g;

    public BinderC13820e0(Context context, Handler handler, C13964d dVar) {
        C13456a.AbstractC0437a<? extends AbstractC1356f, C1351a> aVar = f31116h;
        this.f31117a = context;
        this.f31118b = handler;
        this.f31121e = (C13964d) C14004p.m2050k(dVar, "ClientSettings must not be null");
        this.f31120d = dVar.m2136g();
        this.f31119c = aVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: g0 */
    public static /* bridge */ /* synthetic */ void m2579g0(BinderC13820e0 e0Var, C3441l lVar) {
        C13215a p = lVar.m34383p();
        if (p.m4294z()) {
            C14008q0 q0Var = (C14008q0) C14004p.m2051j(lVar.m34382r());
            C13215a p2 = q0Var.m2040p();
            if (!p2.m4294z()) {
                String valueOf = String.valueOf(p2);
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(valueOf), new Exception());
                e0Var.f31123g.mo2588b(p2);
                e0Var.f31122f.mo2152l();
                return;
            }
            e0Var.f31123g.mo2589a(q0Var.m2039r(), e0Var.f31120d);
        } else {
            e0Var.f31123g.mo2588b(p);
        }
        e0Var.f31122f.mo2152l();
    }

    @Override // bb.AbstractC3435f
    /* renamed from: E */
    public final void mo2583E(C3441l lVar) {
        this.f31118b.post(new RunnableC13816c0(this, lVar));
    }

    @Override // p400w9.AbstractC13825h
    /* renamed from: b */
    public final void mo2560b(C13215a aVar) {
        this.f31123g.mo2588b(aVar);
    }

    @Override // p400w9.AbstractC13817d
    /* renamed from: c */
    public final void mo2582c(Bundle bundle) {
        this.f31122f.mo34385m(this);
    }

    @Override // p400w9.AbstractC13817d
    /* renamed from: e */
    public final void mo2581e(int i) {
        this.f31122f.mo2152l();
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [ab.f, v9.a$f] */
    /* renamed from: h0 */
    public final void m2578h0(AbstractC13818d0 d0Var) {
        AbstractC1356f fVar = this.f31122f;
        if (fVar != null) {
            fVar.mo2152l();
        }
        this.f31121e.m2132k(Integer.valueOf(System.identityHashCode(this)));
        C13456a.AbstractC0437a<? extends AbstractC1356f, C1351a> aVar = this.f31119c;
        Context context = this.f31117a;
        Looper looper = this.f31118b.getLooper();
        C13964d dVar = this.f31121e;
        this.f31122f = aVar.mo3644a(context, looper, dVar, dVar.m2135h(), this, this);
        this.f31123g = d0Var;
        Set<Scope> set = this.f31120d;
        if (set == null || set.isEmpty()) {
            this.f31118b.post(new RunnableC13814b0(this));
        } else {
            this.f31122f.mo34387h();
        }
    }

    /* renamed from: i0 */
    public final void m2577i0() {
        AbstractC1356f fVar = this.f31122f;
        if (fVar != null) {
            fVar.mo2152l();
        }
    }
}
