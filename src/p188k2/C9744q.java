package p188k2;

import java.util.Collections;
import p358u2.C13178a;
import p358u2.C13180c;

/* renamed from: k2.q */
/* loaded from: classes.dex */
public class C9744q<K, A> extends AbstractC9721a<K, A> {

    /* renamed from: i */
    private final A f21668i;

    public C9744q(C13180c<A> cVar) {
        this(cVar, null);
    }

    @Override // p188k2.AbstractC9721a
    /* renamed from: c */
    float mo15450c() {
        return 1.0f;
    }

    @Override // p188k2.AbstractC9721a
    /* renamed from: h */
    public A mo15449h() {
        C13180c<A> cVar = this.f21610e;
        A a = this.f21668i;
        return cVar.m4402b(0.0f, 0.0f, a, a, m15507f(), m15507f(), m15507f());
    }

    @Override // p188k2.AbstractC9721a
    /* renamed from: i */
    A mo15448i(C13178a<K> aVar, float f) {
        return mo15449h();
    }

    @Override // p188k2.AbstractC9721a
    /* renamed from: k */
    public void mo15447k() {
        if (this.f21610e != null) {
            super.mo15447k();
        }
    }

    @Override // p188k2.AbstractC9721a
    /* renamed from: m */
    public void mo15446m(float f) {
        this.f21609d = f;
    }

    public C9744q(C13180c<A> cVar, A a) {
        super(Collections.emptyList());
        m15504n(cVar);
        this.f21668i = a;
    }
}
