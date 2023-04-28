package p163j$.util.stream;

import p163j$.util.C0516l;

/* renamed from: j$.util.stream.H */
/* loaded from: classes2.dex */
final class C9348H extends AbstractC9356J implements AbstractC0541d2 {
    @Override // p163j$.util.stream.AbstractC9356J, p163j$.util.stream.AbstractC0546e2
    public final void accept(long j) {
        m16465k(Long.valueOf(j));
    }

    @Override // p163j$.util.function.Supplier
    public final Object get() {
        if (this.f20508a) {
            return C0516l.m16490d(((Long) this.f20509b).longValue());
        }
        return null;
    }
}
