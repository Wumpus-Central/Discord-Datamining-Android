package p315r6;

import android.content.Context;
import java.util.Collections;
import java.util.Set;
import p040c7.AbstractC3770a;
import p279p6.AbstractC11577g;
import p279p6.AbstractC11578h;
import p279p6.C11572b;
import p438y6.AbstractC14262e;
import p458z6.C14569r;
import p458z6.C14573v;

/* renamed from: r6.t */
/* loaded from: classes7.dex */
public class C12436t implements AbstractC12435s {

    /* renamed from: e */
    private static volatile AbstractC12437u f27979e;

    /* renamed from: a */
    private final AbstractC3770a f27980a;

    /* renamed from: b */
    private final AbstractC3770a f27981b;

    /* renamed from: c */
    private final AbstractC14262e f27982c;

    /* renamed from: d */
    private final C14569r f27983d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12436t(AbstractC3770a aVar, AbstractC3770a aVar2, AbstractC14262e eVar, C14569r rVar, C14573v vVar) {
        this.f27980a = aVar;
        this.f27981b = aVar2;
        this.f27982c = eVar;
        this.f27983d = rVar;
        vVar.m194c();
    }

    /* renamed from: b */
    private AbstractC12420i m6785b(AbstractC12428n nVar) {
        return AbstractC12420i.m6845a().mo6825i(this.f27980a.mo33601a()).mo6823k(this.f27981b.mo33601a()).mo6824j(nVar.mo6809g()).mo6826h(new C12419h(nVar.mo6814b(), nVar.m6812d())).mo6827g(nVar.mo6813c().mo9323a()).mo6830d();
    }

    /* renamed from: c */
    public static C12436t m6784c() {
        AbstractC12437u uVar = f27979e;
        if (uVar != null) {
            return uVar.mo6778g();
        }
        throw new IllegalStateException("Not initialized!");
    }

    /* renamed from: d */
    private static Set<C11572b> m6783d(AbstractC12417f fVar) {
        if (fVar instanceof AbstractC12418g) {
            return Collections.unmodifiableSet(((AbstractC12418g) fVar).mo6848a());
        }
        return Collections.singleton(C11572b.m9324b("proto"));
    }

    /* renamed from: f */
    public static void m6781f(Context context) {
        if (f27979e == null) {
            synchronized (C12436t.class) {
                if (f27979e == null) {
                    f27979e = C12414e.m6851h().mo6777a(context).build();
                }
            }
        }
    }

    @Override // p315r6.AbstractC12435s
    /* renamed from: a */
    public void mo6786a(AbstractC12428n nVar, AbstractC11578h hVar) {
        this.f27982c.mo1215a(nVar.mo6810f().m6797f(nVar.mo6813c().mo9321c()), m6785b(nVar), hVar);
    }

    /* renamed from: e */
    public C14569r m6782e() {
        return this.f27983d;
    }

    /* renamed from: g */
    public AbstractC11577g m6780g(AbstractC12417f fVar) {
        return new C12432p(m6783d(fVar), AbstractC12430o.m6802a().mo6795b(fVar.getName()).mo6794c(fVar.getExtras()).mo6796a(), this);
    }
}
