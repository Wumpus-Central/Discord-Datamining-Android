package com.facebook.imagepipeline.core;

import android.content.Context;
import android.os.Build;
import com.facebook.cache.common.CacheKey;
import com.facebook.common.internal.Supplier;
import com.facebook.common.references.CloseableReference;
import com.facebook.imagepipeline.bitmaps.PlatformBitmapFactory;
import com.facebook.imagepipeline.listener.RequestListener;
import com.facebook.imagepipeline.platform.AbstractC4945g;
import com.facebook.imagepipeline.platform.C4946h;
import com.facebook.imagepipeline.producers.AbstractC5041v0;
import com.facebook.imagepipeline.producers.C5033u;
import com.facebook.imagepipeline.producers.C5043w0;
import java.util.Set;
import p007a6.C1271b;
import p026b6.AbstractC3388d;
import p026b6.C3390f;
import p026b6.C3392h;
import p209l5.AbstractC10341a;
import p209l5.C10342b;
import p257o5.C11201d;
import p278p5.AbstractC11543f;
import p278p5.AbstractC11547i;
import p278p5.AbstractC11564s;
import p278p5.C11538e;
import p278p5.C11553m;
import p278p5.C11555n;
import p278p5.C11558p;
import p278p5.C11559q;
import p312r3.AbstractC12384h;
import p314r5.AbstractC12393g;
import p314r5.C12387a;
import p314r5.C12397j;
import p314r5.C12398k;
import p346t5.AbstractC12962c;
import p346t5.C12960b;
import p361u5.AbstractC13192a;
import p380v5.AbstractC13432c;
import p394w3.C13740j;
import p414x3.C13925a;
import p416x5.AbstractC13937d;
import p455z3.AbstractC14535g;

/* renamed from: com.facebook.imagepipeline.core.b */
/* loaded from: classes7.dex */
public class C4908b {

    /* renamed from: t */
    private static final Class<?> f8280t = C4908b.class;

    /* renamed from: u */
    private static C4908b f8281u;

    /* renamed from: v */
    private static boolean f8282v;

    /* renamed from: w */
    private static ImagePipeline f8283w;

    /* renamed from: a */
    private final AbstractC5041v0 f8284a;

    /* renamed from: b */
    private final AbstractC12393g f8285b;

    /* renamed from: c */
    private final C12387a f8286c;

    /* renamed from: d */
    private AbstractC11547i<CacheKey, AbstractC13432c> f8287d;

    /* renamed from: e */
    private C11558p<CacheKey, AbstractC13432c> f8288e;

    /* renamed from: f */
    private AbstractC11547i<CacheKey, AbstractC14535g> f8289f;

    /* renamed from: g */
    private C11558p<CacheKey, AbstractC14535g> f8290g;

    /* renamed from: h */
    private C11538e f8291h;

    /* renamed from: i */
    private AbstractC12384h f8292i;

    /* renamed from: j */
    private AbstractC12962c f8293j;

    /* renamed from: k */
    private ImagePipeline f8294k;

    /* renamed from: l */
    private AbstractC3388d f8295l;

    /* renamed from: m */
    private C12397j f8296m;

    /* renamed from: n */
    private C12398k f8297n;

    /* renamed from: o */
    private C11538e f8298o;

    /* renamed from: p */
    private AbstractC12384h f8299p;

    /* renamed from: q */
    private PlatformBitmapFactory f8300q;

    /* renamed from: r */
    private AbstractC4945g f8301r;

    /* renamed from: s */
    private AbstractC10341a f8302s;

    public C4908b(AbstractC12393g gVar) {
        AbstractC5041v0 v0Var;
        if (C1271b.m41491d()) {
            C1271b.m41494a("ImagePipelineConfig()");
        }
        AbstractC12393g gVar2 = (AbstractC12393g) C13740j.m2834g(gVar);
        this.f8285b = gVar2;
        if (gVar2.mo6954D().m31390t()) {
            v0Var = new C5033u(gVar.mo6953E().mo6965a());
        } else {
            v0Var = new C5043w0(gVar.mo6953E().mo6965a());
        }
        this.f8284a = v0Var;
        CloseableReference.m32029j0(gVar.mo6954D().m31408b());
        this.f8286c = new C12387a(gVar.mo6930w());
        if (C1271b.m41491d()) {
            C1271b.m41493b();
        }
    }

    /* renamed from: a */
    private ImagePipeline m31362a() {
        C12398k r = m31345r();
        Set<RequestListener> f = this.f8285b.mo6947f();
        Set<AbstractC13937d> a = this.f8285b.mo6952a();
        Supplier<Boolean> b = this.f8285b.mo6951b();
        C11558p<CacheKey, AbstractC13432c> e = m31358e();
        C11558p<CacheKey, AbstractC14535g> h = m31355h();
        C11538e m = m31350m();
        C11538e s = m31344s();
        AbstractC11543f y = this.f8285b.mo6928y();
        AbstractC5041v0 v0Var = this.f8284a;
        Supplier<Boolean> i = this.f8285b.mo6954D().m31401i();
        Supplier<Boolean> v = this.f8285b.mo6954D().m31388v();
        this.f8285b.mo6955C();
        return new ImagePipeline(r, f, a, b, e, h, m, s, y, v0Var, i, v, null, this.f8285b);
    }

    /* renamed from: c */
    private AbstractC10341a m31360c() {
        if (this.f8302s == null) {
            this.f8302s = C10342b.m13575a(m31348o(), this.f8285b.mo6953E(), m31359d(), this.f8285b.mo6954D().m31412A(), this.f8285b.mo6941l());
        }
        return this.f8302s;
    }

    /* renamed from: i */
    private AbstractC12962c m31354i() {
        AbstractC12962c cVar;
        AbstractC12962c cVar2;
        if (this.f8293j == null) {
            if (this.f8285b.mo6935r() != null) {
                this.f8293j = this.f8285b.mo6935r();
            } else {
                AbstractC10341a c = m31360c();
                if (c != null) {
                    cVar = c.mo13576c();
                    cVar2 = c.mo13577b();
                } else {
                    cVar = null;
                    cVar2 = null;
                }
                this.f8285b.mo6938o();
                this.f8293j = new C12960b(cVar, cVar2, m31347p());
            }
        }
        return this.f8293j;
    }

    /* renamed from: k */
    private AbstractC3388d m31352k() {
        if (this.f8295l == null) {
            if (this.f8285b.mo6939n() == null && this.f8285b.mo6940m() == null && this.f8285b.mo6954D().m31387w()) {
                this.f8295l = new C3392h(this.f8285b.mo6954D().m31404f());
            } else {
                this.f8295l = new C3390f(this.f8285b.mo6954D().m31404f(), this.f8285b.mo6954D().m31398l(), this.f8285b.mo6939n(), this.f8285b.mo6940m(), this.f8285b.mo6954D().m31391s());
            }
        }
        return this.f8295l;
    }

    /* renamed from: l */
    public static C4908b m31351l() {
        return (C4908b) C13740j.m2833h(f8281u, "ImagePipelineFactory was not initialized!");
    }

    /* renamed from: q */
    private C12397j m31346q() {
        if (this.f8296m == null) {
            this.f8296m = this.f8285b.mo6954D().m31402h().mo31363a(this.f8285b.getContext(), this.f8285b.mo6933t().m1223k(), m31354i(), this.f8285b.mo6945h(), this.f8285b.mo6942k(), this.f8285b.mo6927z(), this.f8285b.mo6954D().m31395o(), this.f8285b.mo6953E(), this.f8285b.mo6933t().m1225i(this.f8285b.mo6932u()), this.f8285b.mo6933t().m1224j(), m31358e(), m31355h(), m31350m(), m31344s(), this.f8285b.mo6928y(), m31348o(), this.f8285b.mo6954D().m31405e(), this.f8285b.mo6954D().m31406d(), this.f8285b.mo6954D().m31407c(), this.f8285b.mo6954D().m31404f(), m31357f(), this.f8285b.mo6954D().m31411B(), this.f8285b.mo6954D().m31400j());
        }
        return this.f8296m;
    }

    /* renamed from: r */
    private C12398k m31345r() {
        boolean z;
        if (Build.VERSION.SDK_INT < 24 || !this.f8285b.mo6954D().m31399k()) {
            z = false;
        } else {
            z = true;
        }
        if (this.f8297n == null) {
            this.f8297n = new C12398k(this.f8285b.getContext().getApplicationContext().getContentResolver(), m31346q(), this.f8285b.mo6950c(), this.f8285b.mo6927z(), this.f8285b.mo6954D().m31385y(), this.f8284a, this.f8285b.mo6942k(), z, this.f8285b.mo6954D().m31386x(), this.f8285b.mo6937p(), m31352k(), this.f8285b.mo6954D().m31392r(), this.f8285b.mo6954D().m31394p(), this.f8285b.mo6954D().m31410C(), this.f8285b.mo6954D().m31409a());
        }
        return this.f8297n;
    }

    /* renamed from: s */
    private C11538e m31344s() {
        if (this.f8298o == null) {
            this.f8298o = new C11538e(m31343t(), this.f8285b.mo6933t().m1225i(this.f8285b.mo6932u()), this.f8285b.mo6933t().m1224j(), this.f8285b.mo6953E().mo6960f(), this.f8285b.mo6953E().mo6964b(), this.f8285b.mo6957A());
        }
        return this.f8298o;
    }

    /* renamed from: u */
    public static synchronized void m31342u(Context context) {
        synchronized (C4908b.class) {
            if (C1271b.m41491d()) {
                C1271b.m41494a("ImagePipelineFactory#initialize");
            }
            m31341v(ImagePipelineConfig.m31461J(context).m31449K());
            if (C1271b.m41491d()) {
                C1271b.m41493b();
            }
        }
    }

    /* renamed from: v */
    public static synchronized void m31341v(AbstractC12393g gVar) {
        synchronized (C4908b.class) {
            if (f8281u != null) {
                C13925a.m2308D(f8280t, "ImagePipelineFactory has already been initialized! `ImagePipelineFactory.initialize(...)` should only be called once to avoid unexpected behavior.");
            }
            f8281u = new C4908b(gVar);
        }
    }

    /* renamed from: b */
    public AbstractC13192a m31361b(Context context) {
        AbstractC10341a c = m31360c();
        if (c == null) {
            return null;
        }
        return c.mo13578a(context);
    }

    /* renamed from: d */
    public AbstractC11547i<CacheKey, AbstractC13432c> m31359d() {
        if (this.f8287d == null) {
            this.f8287d = this.f8285b.mo6929x().mo9411a(this.f8285b.mo6936q(), this.f8285b.mo6956B(), this.f8285b.mo6946g(), this.f8285b.mo6943j());
        }
        return this.f8287d;
    }

    /* renamed from: e */
    public C11558p<CacheKey, AbstractC13432c> m31358e() {
        if (this.f8288e == null) {
            this.f8288e = C11559q.m9383a(m31359d(), this.f8285b.mo6957A());
        }
        return this.f8288e;
    }

    /* renamed from: f */
    public C12387a m31357f() {
        return this.f8286c;
    }

    /* renamed from: g */
    public AbstractC11547i<CacheKey, AbstractC14535g> m31356g() {
        if (this.f8289f == null) {
            this.f8289f = C11553m.m9389a(this.f8285b.mo6934s(), this.f8285b.mo6956B());
        }
        return this.f8289f;
    }

    /* renamed from: h */
    public C11558p<CacheKey, AbstractC14535g> m31355h() {
        AbstractC11564s<CacheKey, AbstractC14535g> sVar;
        if (this.f8290g == null) {
            if (this.f8285b.mo6949d() != null) {
                sVar = this.f8285b.mo6949d();
            } else {
                sVar = m31356g();
            }
            this.f8290g = C11555n.m9387a(sVar, this.f8285b.mo6957A());
        }
        return this.f8290g;
    }

    /* renamed from: j */
    public ImagePipeline m31353j() {
        if (f8282v) {
            if (f8283w == null) {
                ImagePipeline a = m31362a();
                f8283w = a;
                this.f8294k = a;
            }
            return f8283w;
        }
        if (this.f8294k == null) {
            this.f8294k = m31362a();
        }
        return this.f8294k;
    }

    /* renamed from: m */
    public C11538e m31350m() {
        if (this.f8291h == null) {
            this.f8291h = new C11538e(m31349n(), this.f8285b.mo6933t().m1225i(this.f8285b.mo6932u()), this.f8285b.mo6933t().m1224j(), this.f8285b.mo6953E().mo6960f(), this.f8285b.mo6953E().mo6964b(), this.f8285b.mo6957A());
        }
        return this.f8291h;
    }

    /* renamed from: n */
    public AbstractC12384h m31349n() {
        if (this.f8292i == null) {
            this.f8292i = this.f8285b.mo6931v().mo6958a(this.f8285b.mo6948e());
        }
        return this.f8292i;
    }

    /* renamed from: o */
    public PlatformBitmapFactory m31348o() {
        if (this.f8300q == null) {
            this.f8300q = C11201d.m10500a(this.f8285b.mo6933t(), m31347p(), m31357f());
        }
        return this.f8300q;
    }

    /* renamed from: p */
    public AbstractC4945g m31347p() {
        if (this.f8301r == null) {
            this.f8301r = C4946h.m31227a(this.f8285b.mo6933t(), this.f8285b.mo6954D().m31389u());
        }
        return this.f8301r;
    }

    /* renamed from: t */
    public AbstractC12384h m31343t() {
        if (this.f8299p == null) {
            this.f8299p = this.f8285b.mo6931v().mo6958a(this.f8285b.mo6944i());
        }
        return this.f8299p;
    }
}
