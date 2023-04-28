package fi;

import gi.AbstractC7664g;
import ki.C9883a;
import kotlin.jvm.internal.C9971q;
import p182ji.AbstractC9615f;
import p305qh.AbstractC12137c;
import p305qh.AbstractC12161f;

/* renamed from: fi.v */
/* loaded from: classes8.dex */
public final class C7332v extends AbstractC7223a0 implements AbstractC9615f {

    /* renamed from: n */
    private final C7232c1 f15817n;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C7332v(p217lg.AbstractC10420h r3, fi.C7232c1 r4) {
        /*
            r2 = this;
            java.lang.String r0 = "builtIns"
            kotlin.jvm.internal.C9971q.m14633g(r3, r0)
            java.lang.String r0 = "attributes"
            kotlin.jvm.internal.C9971q.m14633g(r4, r0)
            fi.o0 r0 = r3.m13420H()
            java.lang.String r1 = "builtIns.nothingType"
            kotlin.jvm.internal.C9971q.m14634f(r0, r1)
            fi.o0 r3 = r3.m13419I()
            java.lang.String r1 = "builtIns.nullableAnyType"
            kotlin.jvm.internal.C9971q.m14634f(r3, r1)
            r2.<init>(r0, r3)
            r2.f15817n = r4
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: fi.C7332v.<init>(lg.h, fi.c1):void");
    }

    @Override // fi.AbstractC7223a0, fi.AbstractC7267g0
    /* renamed from: M0 */
    public C7232c1 mo5173M0() {
        return this.f15817n;
    }

    @Override // fi.AbstractC7223a0, fi.AbstractC7267g0
    /* renamed from: O0 */
    public boolean mo5171O0() {
        return false;
    }

    @Override // fi.AbstractC7223a0
    /* renamed from: U0 */
    public AbstractC7304o0 mo22897U0() {
        return m23169W0();
    }

    @Override // fi.AbstractC7223a0
    /* renamed from: X0 */
    public String mo22896X0(AbstractC12137c renderer, AbstractC12161f options) {
        C9971q.m14633g(renderer, "renderer");
        C9971q.m14633g(options, "options");
        return "dynamic";
    }

    /* renamed from: Y0 */
    public C7332v mo5169R0(boolean z) {
        return this;
    }

    /* renamed from: Z0 */
    public C7332v mo5168S0(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: a1 */
    public C7332v mo5167T0(C7232c1 newAttributes) {
        C9971q.m14633g(newAttributes, "newAttributes");
        return new C7332v(C9883a.m15096i(mo22897U0()), newAttributes);
    }
}
