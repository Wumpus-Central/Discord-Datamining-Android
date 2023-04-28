package p315r6;

import p279p6.AbstractC11573c;
import p279p6.AbstractC11575e;
import p279p6.AbstractC11576f;
import p279p6.AbstractC11578h;
import p279p6.C11572b;

/* renamed from: r6.r */
/* loaded from: classes7.dex */
final class C12434r<T> implements AbstractC11576f<T> {

    /* renamed from: a */
    private final AbstractC12430o f27974a;

    /* renamed from: b */
    private final String f27975b;

    /* renamed from: c */
    private final C11572b f27976c;

    /* renamed from: d */
    private final AbstractC11575e<T, byte[]> f27977d;

    /* renamed from: e */
    private final AbstractC12435s f27978e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C12434r(AbstractC12430o oVar, String str, C11572b bVar, AbstractC11575e<T, byte[]> eVar, AbstractC12435s sVar) {
        this.f27974a = oVar;
        this.f27975b = str;
        this.f27976c = bVar;
        this.f27977d = eVar;
        this.f27978e = sVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static /* synthetic */ void m6788c(Exception exc) {
    }

    @Override // p279p6.AbstractC11576f
    /* renamed from: a */
    public void mo6790a(AbstractC11573c<T> cVar) {
        m6787d(cVar, new AbstractC11578h() { // from class: r6.q
            @Override // p279p6.AbstractC11578h
            /* renamed from: a */
            public final void mo6791a(Exception exc) {
                C12434r.m6788c(exc);
            }
        });
    }

    /* renamed from: d */
    public void m6787d(AbstractC11573c<T> cVar, AbstractC11578h hVar) {
        this.f27978e.mo6786a(AbstractC12428n.m6815a().mo6804e(this.f27974a).mo6806c(cVar).mo6803f(this.f27975b).mo6805d(this.f27977d).mo6807b(this.f27976c).mo6808a(), hVar);
    }
}
