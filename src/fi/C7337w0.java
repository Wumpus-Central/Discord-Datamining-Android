package fi;

import gi.AbstractC7677n;
import kotlin.jvm.internal.C9971q;
import p448yh.AbstractC14411h;

/* renamed from: fi.w0 */
/* loaded from: classes8.dex */
public final class C7337w0 extends AbstractC7237e {

    /* renamed from: p */
    private final AbstractC7268g1 f15819p;

    /* renamed from: q */
    private final AbstractC14411h f15820q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C7337w0(AbstractC7677n originalTypeVariable, boolean z, AbstractC7268g1 constructor) {
        super(originalTypeVariable, z);
        C9971q.m14633g(originalTypeVariable, "originalTypeVariable");
        C9971q.m14633g(constructor, "constructor");
        this.f15819p = constructor;
        this.f15820q = originalTypeVariable.mo4567n().m13387i().mo5161o();
    }

    @Override // fi.AbstractC7267g0
    /* renamed from: N0 */
    public AbstractC7268g1 mo5172N0() {
        return this.f15819p;
    }

    @Override // fi.AbstractC7237e
    /* renamed from: X0 */
    public AbstractC7237e mo22889X0(boolean z) {
        return new C7337w0(m23139W0(), z, mo5172N0());
    }

    @Override // fi.AbstractC7237e, fi.AbstractC7267g0
    /* renamed from: o */
    public AbstractC14411h mo5161o() {
        return this.f15820q;
    }

    @Override // fi.AbstractC7304o0
    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Stub (BI): ");
        sb2.append(m23139W0());
        sb2.append(mo5171O0() ? "?" : "");
        return sb2.toString();
    }
}
