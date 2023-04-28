package fi;

import kotlin.jvm.internal.C9971q;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: fi.q0 */
/* loaded from: classes8.dex */
public final class C7315q0 extends AbstractC7320s {

    /* renamed from: m */
    private final C7232c1 f15798m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7315q0(AbstractC7304o0 delegate, C7232c1 attributes) {
        super(delegate);
        C9971q.m14633g(delegate, "delegate");
        C9971q.m14633g(attributes, "attributes");
        this.f15798m = attributes;
    }

    @Override // fi.AbstractC7317r, fi.AbstractC7267g0
    /* renamed from: M0 */
    public C7232c1 mo5173M0() {
        return this.f15798m;
    }

    /* renamed from: Z0 */
    public C7315q0 mo22921Y0(AbstractC7304o0 delegate) {
        C9971q.m14633g(delegate, "delegate");
        return new C7315q0(delegate, mo5173M0());
    }
}
