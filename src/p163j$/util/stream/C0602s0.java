package p163j$.util.stream;

import java.util.concurrent.atomic.AtomicReference;
import p163j$.util.Spliterator;

/* renamed from: j$.util.stream.s0 */
/* loaded from: classes2.dex */
final class C0602s0 extends AbstractC0538d {

    /* renamed from: j */
    private final C0598r0 f20745j;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0602s0(C0598r0 r0Var, AbstractC0606t0 t0Var, Spliterator spliterator) {
        super(t0Var, spliterator);
        this.f20745j = r0Var;
    }

    C0602s0(C0602s0 s0Var, Spliterator spliterator) {
        super(s0Var, spliterator);
        this.f20745j = s0Var.f20745j;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p163j$.util.stream.AbstractC0548f
    /* renamed from: a */
    public final Object mo16305a() {
        boolean z;
        Boolean valueOf;
        AbstractC0606t0 t0Var = this.f20649a;
        AbstractC0591p0 p0Var = (AbstractC0591p0) this.f20745j.f20740b.get();
        t0Var.mo16294J0(this.f20650b, p0Var);
        boolean z2 = p0Var.f20725b;
        z = this.f20745j.f20739a.f20730b;
        if (z2 == z && (valueOf = Boolean.valueOf(z2)) != null) {
            AtomicReference atomicReference = this.f20636h;
            while (!atomicReference.compareAndSet(null, valueOf) && atomicReference.get() == null) {
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p163j$.util.stream.AbstractC0548f
    /* renamed from: d */
    public final AbstractC0548f mo16304d(Spliterator spliterator) {
        return new C0602s0(this, spliterator);
    }

    @Override // p163j$.util.stream.AbstractC0538d
    /* renamed from: i */
    protected final Object mo16303i() {
        boolean z;
        z = this.f20745j.f20739a.f20730b;
        return Boolean.valueOf(!z);
    }
}
