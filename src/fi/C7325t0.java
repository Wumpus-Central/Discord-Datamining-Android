package fi;

import gi.AbstractC7664g;
import kotlin.jvm.internal.C9971q;
import p217lg.AbstractC10420h;

/* renamed from: fi.t0 */
/* loaded from: classes8.dex */
public final class C7325t0 extends AbstractC7293l1 {

    /* renamed from: a */
    private final AbstractC7267g0 f15810a;

    public C7325t0(AbstractC10420h kotlinBuiltIns) {
        C9971q.m14633g(kotlinBuiltIns, "kotlinBuiltIns");
        AbstractC7304o0 I = kotlinBuiltIns.m13419I();
        C9971q.m14634f(I, "kotlinBuiltIns.nullableAnyType");
        this.f15810a = I;
    }

    @Override // fi.AbstractC7290k1
    /* renamed from: a */
    public boolean mo22907a() {
        return true;
    }

    @Override // fi.AbstractC7290k1
    /* renamed from: b */
    public EnumC7338w1 mo22906b() {
        return EnumC7338w1.OUT_VARIANCE;
    }

    @Override // fi.AbstractC7290k1
    public AbstractC7267g0 getType() {
        return this.f15810a;
    }

    @Override // fi.AbstractC7290k1
    /* renamed from: o */
    public AbstractC7290k1 mo22903o(AbstractC7664g kotlinTypeRefiner) {
        C9971q.m14633g(kotlinTypeRefiner, "kotlinTypeRefiner");
        return this;
    }
}
