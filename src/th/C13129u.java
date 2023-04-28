package th;

import fi.AbstractC7304o0;
import kotlin.jvm.internal.C9971q;
import p268og.AbstractC11327h0;

/* renamed from: th.u */
/* loaded from: classes8.dex */
public final class C13129u extends AbstractC13120o<Short> {
    public C13129u(short s) {
        super(Short.valueOf(s));
    }

    /* renamed from: c */
    public AbstractC7304o0 mo4552a(AbstractC11327h0 module) {
        C9971q.m14633g(module, "module");
        AbstractC7304o0 T = module.mo6136n().m13409T();
        C9971q.m14634f(T, "module.builtIns.shortType");
        return T;
    }

    @Override // th.AbstractC13104g
    public String toString() {
        return mo4590b().intValue() + ".toShort()";
    }
}
