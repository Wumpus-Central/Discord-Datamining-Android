package p315r6;

import android.content.Context;
import java.util.concurrent.Executor;
import javax.inject.Provider;
import p008a7.AbstractC1282d;
import p008a7.C1289g;
import p008a7.C1292h;
import p008a7.C1294i;
import p008a7.C1297j;
import p008a7.C1305m0;
import p008a7.C1311n0;
import p008a7.C1326u0;
import p040c7.C3772c;
import p040c7.C3774d;
import p315r6.AbstractC12437u;
import p335s6.C12799j;
import p335s6.C12802l;
import p362u6.AbstractC13194b;
import p362u6.C13193a;
import p362u6.C13195c;
import p362u6.C13196d;
import p438y6.C14260c;
import p438y6.C14261d;
import p438y6.C14264g;
import p438y6.C14266i;
import p458z6.AbstractC14553f;
import p458z6.AbstractC14575x;
import p458z6.C14569r;
import p458z6.C14570s;
import p458z6.C14573v;
import p458z6.C14574w;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r6.e */
/* loaded from: classes7.dex */
public final class C12414e extends AbstractC12437u {

    /* renamed from: k */
    private Provider<Executor> f27951k;

    /* renamed from: l */
    private Provider<Context> f27952l;

    /* renamed from: m */
    private Provider f27953m;

    /* renamed from: n */
    private Provider f27954n;

    /* renamed from: o */
    private Provider f27955o;

    /* renamed from: p */
    private Provider<String> f27956p;

    /* renamed from: q */
    private Provider<C1305m0> f27957q;

    /* renamed from: r */
    private Provider<AbstractC14553f> f27958r;

    /* renamed from: s */
    private Provider<AbstractC14575x> f27959s;

    /* renamed from: t */
    private Provider<C14260c> f27960t;

    /* renamed from: u */
    private Provider<C14569r> f27961u;

    /* renamed from: v */
    private Provider<C14573v> f27962v;

    /* renamed from: w */
    private Provider<C12436t> f27963w;

    /* renamed from: r6.e$b */
    /* loaded from: classes7.dex */
    private static final class C12416b implements AbstractC12437u.AbstractC12438a {

        /* renamed from: a */
        private Context f27964a;

        private C12416b() {
        }

        /* renamed from: b */
        public C12416b mo6777a(Context context) {
            this.f27964a = (Context) C13196d.m4361b(context);
            return this;
        }

        @Override // p315r6.AbstractC12437u.AbstractC12438a
        public AbstractC12437u build() {
            C13196d.m4362a(this.f27964a, Context.class);
            return new C12414e(this.f27964a);
        }
    }

    /* renamed from: h */
    public static AbstractC12437u.AbstractC12438a m6851h() {
        return new C12416b();
    }

    /* renamed from: i */
    private void m6850i(Context context) {
        this.f27951k = C13193a.m4365b(C12423k.m6821a());
        AbstractC13194b a = C13195c.m4363a(context);
        this.f27952l = a;
        C12799j a2 = C12799j.m5460a(a, C3772c.m33609a(), C3774d.m33605a());
        this.f27953m = a2;
        this.f27954n = C13193a.m4365b(C12802l.m5452a(this.f27952l, a2));
        this.f27955o = C1326u0.m41352a(this.f27952l, C1289g.m41472a(), C1294i.m41465a());
        this.f27956p = C1292h.m41468a(this.f27952l);
        this.f27957q = C13193a.m4365b(C1311n0.m41369a(C3772c.m33609a(), C3774d.m33605a(), C1297j.m41461a(), this.f27955o, this.f27956p));
        C14264g b = C14264g.m1212b(C3772c.m33609a());
        this.f27958r = b;
        C14266i a3 = C14266i.m1209a(this.f27952l, this.f27957q, b, C3774d.m33605a());
        this.f27959s = a3;
        Provider<Executor> provider = this.f27951k;
        Provider provider2 = this.f27954n;
        Provider<C1305m0> provider3 = this.f27957q;
        this.f27960t = C14261d.m1218a(provider, provider2, a3, provider3, provider3);
        Provider<Context> provider4 = this.f27952l;
        Provider provider5 = this.f27954n;
        Provider<C1305m0> provider6 = this.f27957q;
        this.f27961u = C14570s.m199a(provider4, provider5, provider6, this.f27959s, this.f27951k, provider6, C3772c.m33609a(), C3774d.m33605a(), this.f27957q);
        Provider<Executor> provider7 = this.f27951k;
        Provider<C1305m0> provider8 = this.f27957q;
        this.f27962v = C14574w.m191a(provider7, provider8, this.f27959s, provider8);
        this.f27963w = C13193a.m4365b(C12439v.m6776a(C3772c.m33609a(), C3774d.m33605a(), this.f27960t, this.f27961u, this.f27962v));
    }

    @Override // p315r6.AbstractC12437u
    /* renamed from: b */
    AbstractC1282d mo6779b() {
        return this.f27957q.get();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p315r6.AbstractC12437u
    /* renamed from: g */
    public C12436t mo6778g() {
        return this.f27963w.get();
    }

    private C12414e(Context context) {
        m6850i(context);
    }
}
