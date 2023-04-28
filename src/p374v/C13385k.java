package p374v;

import androidx.camera.core.AbstractC1807f0;
import java.util.Set;
import p374v.C13385k;
import p390w.AbstractC13608i2;
import p390w.AbstractC13662r0;
import p390w.AbstractC13692w1;
import p390w.C13582c2;
import p390w.C13604h2;
import p390w.C13696x1;

/* renamed from: v.k */
/* loaded from: classes.dex */
public class C13385k implements AbstractC13608i2 {

    /* renamed from: w */
    private final AbstractC13662r0 f29966w;

    /* renamed from: v.k$a */
    /* loaded from: classes.dex */
    public static final class C13386a implements AbstractC1807f0<C13385k> {

        /* renamed from: a */
        private final C13696x1 f29967a = C13696x1.m3002J();

        /* renamed from: e */
        public static C13386a m3778e(final AbstractC13662r0 r0Var) {
            final C13386a aVar = new C13386a();
            r0Var.mo2967l("camera2.captureRequest.option.", new AbstractC13662r0.AbstractC13664b() { // from class: v.j
                @Override // p390w.AbstractC13662r0.AbstractC13664b
                /* renamed from: a */
                public final boolean mo3097a(AbstractC13662r0.AbstractC13663a aVar2) {
                    boolean f;
                    f = C13385k.C13386a.m3777f(C13385k.C13386a.this, r0Var, aVar2);
                    return f;
                }
            });
            return aVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: f */
        public static /* synthetic */ boolean m3777f(C13386a aVar, AbstractC13662r0 r0Var, AbstractC13662r0.AbstractC13663a aVar2) {
            aVar.mo3781a().mo3003E(aVar2, r0Var.mo2974d(aVar2), r0Var.mo2976b(aVar2));
            return true;
        }

        @Override // androidx.camera.core.AbstractC1807f0
        /* renamed from: a */
        public AbstractC13692w1 mo3781a() {
            return this.f29967a;
        }

        /* renamed from: c */
        public C13385k m3779c() {
            return new C13385k(C13582c2.m3310H(this.f29967a));
        }
    }

    public C13385k(AbstractC13662r0 r0Var) {
        this.f29966w = r0Var;
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: A */
    public /* synthetic */ Object mo2987A(AbstractC13662r0.AbstractC13663a aVar, AbstractC13662r0.EnumC13665c cVar) {
        return C13604h2.m3249h(this, aVar, cVar);
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: a */
    public /* synthetic */ Object mo2977a(AbstractC13662r0.AbstractC13663a aVar, Object obj) {
        return C13604h2.m3250g(this, aVar, obj);
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: b */
    public /* synthetic */ Object mo2976b(AbstractC13662r0.AbstractC13663a aVar) {
        return C13604h2.m3251f(this, aVar);
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: c */
    public /* synthetic */ Set mo2975c() {
        return C13604h2.m3252e(this);
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: d */
    public /* synthetic */ AbstractC13662r0.EnumC13665c mo2974d(AbstractC13662r0.AbstractC13663a aVar) {
        return C13604h2.m3254c(this, aVar);
    }

    @Override // p390w.AbstractC13608i2, p390w.AbstractC13662r0
    /* renamed from: e */
    public /* synthetic */ boolean mo2973e(AbstractC13662r0.AbstractC13663a aVar) {
        return C13604h2.m3256a(this, aVar);
    }

    @Override // p390w.AbstractC13608i2
    /* renamed from: i */
    public AbstractC13662r0 mo2970i() {
        return this.f29966w;
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: l */
    public /* synthetic */ void mo2967l(String str, AbstractC13662r0.AbstractC13664b bVar) {
        C13604h2.m3255b(this, str, bVar);
    }

    @Override // p390w.AbstractC13662r0
    /* renamed from: x */
    public /* synthetic */ Set mo2959x(AbstractC13662r0.AbstractC13663a aVar) {
        return C13604h2.m3253d(this, aVar);
    }
}
