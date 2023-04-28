package p183jj;

import p143hj.AbstractC8046c;
import p143hj.AbstractC8048d;

/* renamed from: jj.p */
/* loaded from: classes8.dex */
final class C9671p implements AbstractC8048d {

    /* renamed from: a */
    private final AbstractC8048d f21488a;

    /* renamed from: b */
    private final AbstractC8048d f21489b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C9671p(AbstractC8048d dVar, AbstractC8048d dVar2) {
        this.f21488a = dVar;
        this.f21489b = dVar2;
    }

    @Override // p143hj.AbstractC8048d
    /* renamed from: a */
    public boolean mo15676a(AbstractC8046c<?> cVar) {
        return this.f21488a.mo15676a(cVar) || this.f21489b.mo15676a(cVar);
    }

    @Override // p143hj.AbstractC8048d
    /* renamed from: b */
    public <A> A mo15675b(AbstractC8046c<A> cVar) {
        if (this.f21488a.mo15676a(cVar)) {
            return (A) this.f21488a.mo15675b(cVar);
        }
        return (A) this.f21489b.mo15675b(cVar);
    }

    @Override // p143hj.AbstractC8048d
    /* renamed from: c */
    public <A> A mo15674c(AbstractC8046c<A> cVar, A a) {
        if (this.f21488a.mo15676a(cVar)) {
            return (A) this.f21488a.mo15675b(cVar);
        }
        return (A) this.f21489b.mo15674c(cVar, a);
    }
}
