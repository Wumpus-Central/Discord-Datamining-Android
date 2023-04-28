package p163j$.util.stream;

import p163j$.util.C0514j;

/* renamed from: j$.util.stream.F */
/* loaded from: classes2.dex */
final class C9338F extends AbstractC9356J implements AbstractC0531b2 {
    @Override // p163j$.util.stream.AbstractC9356J, p163j$.util.stream.AbstractC0546e2, p163j$.util.stream.AbstractC0531b2, p163j$.util.function.AbstractC0494i
    public final void accept(double d) {
        m16465k(Double.valueOf(d));
    }

    @Override // p163j$.util.function.Supplier
    public final Object get() {
        if (this.f20508a) {
            return C0514j.m16498d(((Double) this.f20509b).doubleValue());
        }
        return null;
    }
}
